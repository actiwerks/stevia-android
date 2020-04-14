# stevia-android
[![Language: Kotlin](https://img.shields.io/badge/language-kotlin-7963FE.svg?style=flat)](https://kotlinlang.org)
![Platform: Android 8+](https://img.shields.io/badge/platform-Android-68b846.svg?style=flat)
[![codebeat badge](https://codebeat.co/badges/96edea1a-ed9d-4753-935b-a30d892e8b61)](https://codebeat.co/projects/github-com-yummypets-stevia-kt-master)
[![License: MIT](http://img.shields.io/badge/license-MIT-lightgrey.svg?style=flat)](https://github.com/Yummypets/Stevia.kt/blob/master/LICENSE)
[![](https://jitpack.io/v/actiwerks/stevia-android.svg)](https://jitpack.io/#actiwerks/stevia-android)

[This is a fork of original Stevia Android project, which appears abandoned now](https://github.com/Yummypets/Stevia.kt) 
It was updated to use new AndroidX components instead of Support library ones and packaged in Jitpack for easy adoption into your project

All the credit for Android port to the original author, as well as Stevia iOS author for the idea.

Here is small excerpt from the original documentation:

With `Stevia.kt`, you build concise views in code using `ConstraintLayout`.

```kotlin
detail.top(35).left(12)
nameLabel.centerInParent()
backgroundImage.fillParent()
I-20-firstname-20-latname-20-I
```
This is all **native** `ConstraintLayout` under the hood 🎉

Read the rest in the [Original README.md](https://github.com/Yummypets/Stevia.kt) 

## ⚙️ Installation
Gradle

In your top project `.gradle` file add `maven { url 'https://jitpack.io' }` like so
```gradle
...
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
...

```

then in your app `.gradle` file add `implementation 'com.github.actiwerks:stevia-android:v1.0.7'`

like so
```gradle
dependencies {
    ...
    implementation 'com.github.actiwerks:stevia-android:v1.0.7'
  }
```
