package com.example.apipinteres.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apipinteres.models.core.Either
import com.example.apipinteres.models.model.ApiResponse
import com.example.apipinteres.models.repository.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val apiRepository: ApiRepository
) : ViewModel() {
    private val _images = MutableLiveData<ApiResponse>()
    val images: LiveData<ApiResponse> = _images

    private val _event = MutableLiveData<Event>()

     fun getImages(key: String, query: String ) {
        viewModelScope.launch {
            when (val response = apiRepository.getImages(key, query)) {
                is Either.Error -> {
                    _event.postValue(Event.Error(response.value))
                }
                is Either.Success -> {
                    _images.postValue(response.value)
                }
            }
        }
    }
    sealed class Event {
        data class Error(val error: Throwable) : Event()
    }
}
