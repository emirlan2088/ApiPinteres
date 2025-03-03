plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    // Plugin for serialization
    kotlin("plugin.serialization") version "2.1.10"

    // Hilt plugin
    id("com.google.dagger.hilt.android")

    //KSP must be declared at the bottom of hilt
    // Ksp plugin
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.apipinteres"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.apipinteres"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    hilt {
        enableAggregatingTask = true
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    // Navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    // Hilt
    implementation(libs.hilt.android)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.fragment.ktx)
    ksp(libs.hilt.android.compiler)

    // Glide
    implementation(libs.glide)
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.logging.interceptor)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.retrofit2.kotlinx.serialization.converter)
    //Live Data & View Model
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}