plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.pawsitivehabits"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pawsitivehabits"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx
    runtimeOnly("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-ktx
    runtimeOnly("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    // https://mvnrepository.com/artifact/androidx.datastore/datastore-preferences
    runtimeOnly("androidx.datastore:datastore-preferences:1.0.0")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}