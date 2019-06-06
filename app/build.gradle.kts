plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(App.targetSdk)

    defaultConfig {
        applicationId = "com.gmail.intellect.logos.vkapp"
        minSdkVersion(App.minApi)
        targetSdkVersion(App.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}



dependencies {
    implementation(Dependencies.kotlin)
    implementation(Dependencies.appCompat)
    implementation("androidx.core:core-ktx:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("ru.terrakok.cicerone:cicerone:5.0.0")
    implementation("com.google.android.material:material:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("com.github.bumptech.glide:glide:4.9.0")
    implementation("com.arello-mobile:moxy:1.5.5")
    implementation("com.arello-mobile:moxy-app-compat:1.5.5")
    implementation("com.jakewharton.timber:timber:4.7.1")
    implementation("com.squareup.okhttp3:logging-interceptor:3.14.2")

    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomRx)
    kapt(Dependencies.roomCompiler)

    kapt("com.arello-mobile:moxy-compiler:1.5.5")
    kapt("com.github.bumptech.glide:compiler:4.9.0")

    implementation("com.google.dagger:dagger:2.22.1")
    kapt("com.google.dagger:dagger-compiler:2.22.1")

    implementation("com.google.dagger:dagger-android-support:2.22.1")
    kapt("com.google.dagger:dagger-android-processor:2.22.1")

    implementation("com.squareup.retrofit2:retrofit:2.5.0")
    implementation("com.squareup.retrofit2:converter-gson:2.5.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.5.0")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.2.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
}
