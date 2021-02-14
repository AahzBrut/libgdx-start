package io.github.aahzbrut

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration

object DesktopLauncher {

    @JvmStatic
    fun main(args: Array<String>) {
        val config = Lwjgl3ApplicationConfiguration().apply {
            setTitle("LibGDX")
            setWindowSizeLimits(960, 540, -1, -1)
        }

        Lwjgl3Application(GameApp(), config)
    }
}