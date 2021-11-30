/**
 * Created by Ahmet Bozyurt on 30.11.2021
 */

object Builds {
    const val minSdk = 23
    const val compileSdk = 31
    const val targetSdk = 31
    const val buildTools = "30.0.3"
    val id = "com.example.usecase"
    const val versionCode = 1
    const val versionName = "1.0"

}
object Modules {
    val app = ":app"
    val domain = ":domain"
    val presentation = ":presentation"
    val data = ":data"
    val common = ":common"
    val user = ":user"
}

object Versions {

    const val androidTools = "4.2.2"
    const val kotlinPlugin = "1.5.21"
    const val navigation = "2.3.5"
    const val navigationCompose = "2.4.0-alpha08"
    const val navigationHiltCompose = "1.0.0-alpha03"
    const val composeVersion = "1.0.1"
    const val appCompat = "1.4.0"
    const val coreKtx = "1.7.0"
    const val constraintLayout = "2.1.2"
    const val kotlinGradle = "1.5.21"
    const val material = "1.4.0"

    const val coroutines = "1.5.1"
    const val gson = "2.9.0"
    const val retrofit = "2.9.0"
    const val okhttp = "5.0.0-alpha.2"

    const val lifecycle = "1.0.0-alpha03"
    const val lifecycleKtx = "2.3.1"
    const val lifecycleViewModel = "1.0.0-alpha07"
    const val liveData = "1.1.0-alpha03"

    const val coil = "0.12.0"

    const val hilt = "2.38.1"
    const val hiltAndroidCompiler = "2.37"
    const val hiltCompiler = "1.0.0"

    const val accompanist = "0.17.0"

    const val junit = "4.+"
    const val junitExt = "1.1.3"
    const val espresso = "3.4.0"

    const val room = "2.3.0"


}

object Libs {

    //core
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout ="androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinPlugin}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.navigationCompose}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationHiltCompose ="androidx.hilt:hilt-navigation-compose:${Versions.navigationHiltCompose}"
    const val companist = "com.google.accompanist:accompanist-flowlayout:${Versions.accompanist}"


    //lifecycle
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleViewModel}"
    const val lifecycleViewModelKtx ="androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleKtx}"
    const val lifecycleKxt = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
    const val lifecycleHiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.lifecycle}"
    const val liveData = "androidx.compose.runtime:runtime-livedata:${Versions.liveData}"

    //retrofit

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.gson}"
    const val http = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val httpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"


    //coroutines

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    //coil

    const val coil = "com.google.accompanist:accompanist-coil:${Versions.coil}"

    //hilt

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"

    //test

    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    //compose

    const val composeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val composeJunit = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"

    //room

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"




}

object ClassPath {
    const val androidTools = "com.android.tools.build:gradle:${Versions.androidTools}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin${Versions.kotlinGradle}"
    const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}