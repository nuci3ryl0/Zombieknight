package com.example.zombieknight.game

class RubyMaker(pos: Vec2) :
    Entity(Vec2(64f, 64f)){
    private val frames = loadTiles("ruby", 7)

    init{
        showTexture(frames[0])
        setBottomLeft(pos)
    }
    fun update() {
        animate(frames, 0.25f)
    }
}

