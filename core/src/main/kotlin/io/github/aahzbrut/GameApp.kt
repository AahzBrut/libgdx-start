package io.github.aahzbrut

import io.github.aahzbrut.screen.BaseScreen
import io.github.aahzbrut.screen.LoadingScreen
import ktx.app.KtxGame

class GameApp: KtxGame<BaseScreen>() {

    override fun create() {
        addScreen(LoadingScreen(this))
        setScreen<LoadingScreen>()
    }
}