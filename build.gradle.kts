buildscript {
    val kotlinVersion: String by project

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", kotlinVersion))
    }
}

plugins {
    base
}

allprojects {
    repositories {
        mavenCentral()
    }
}

tasks.clean {
    delete(buildDir)
}