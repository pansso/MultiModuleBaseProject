// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id("com.android.application") version "8.1.0" apply false
//    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
//    id("com.android.library") version "8.1.0" apply false
//}

buildscript{
    repositories{
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https/jitpack.io")
    }

    dependencies{
        classpath(com.example.buildsrc.Dep.androidGradlePlugin)
        classpath(com.example.buildsrc.Dep.androidGradleApiPlugin)
        classpath(com.example.buildsrc.Dep.Kotlin.gradlePlugin)
        classpath(com.example.buildsrc.Dep.Hilt.plugin)
    }
}
//
//subprojects {
//    afterEvaluate {
//        project.apply("$rootDir/gradle/common.gradle")
//    }
//}
//
//tasks.register("clean", Delete::class) {
//    delete(rootProject.buildDir)
//}