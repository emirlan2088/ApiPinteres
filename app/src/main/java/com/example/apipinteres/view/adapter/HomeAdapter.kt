package com.example.apipinteres.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apipinteres.databinding.ImageListBinding
import com.example.apipinteres.models.model.Hit

class HomeAdapter : ListAdapter<Hit, HomeAdapter.HomeViewHolder>(DifUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ImageListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.binding.apply {
            val item = getItem(position)
            Glide.with(holder.itemView).load(item.largeImageURL)
                .into(image)
        }

    }

    class DifUtil : DiffUtil.ItemCallback<Hit>() {
        override fun areItemsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Hit, newItem: Hit): Boolean {
            return oldItem == newItem
        }
    }

    inner class HomeViewHolder(val binding: ImageListBinding) :
        RecyclerView.ViewHolder(binding.root)
}
