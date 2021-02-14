plugins {
    kotlin("jvm")
}

val assetsDir = file("../assets")
val mainClassName = "io.github.aahzbrut.DesktopLauncher"

dependencies {
    val gdxVersion: String by project
    val ktxVersion: String by project

    implementation(project(":core"))

    implementation(kotlin("stdlib"))

    implementation("io.github.libktx:ktx-app:$ktxVersion")

    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
}

// Use this task to create a fat jar.
tasks.register<Jar>("dist") {
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
    from(files(sourceSets.main.get().output.classesDirs))
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    from(assetsDir)

    manifest {
        attributes["Main-Class"] = mainClassName
    }
}