package com.example.zombieknight.game

class Ruby(
    private val platforms: List<Tile>,
    private val portals: List<Portal>
) : Entity(size = Vec2(64f,  64f)) {


    private val frames = loadTiles(Folder = "ruby", count = 7)
    private val portalSound = addSound(name = "portal_sound")


    companion object {
        val VERTICAL_ACCELERATION = Vec2(0f, 3f) // gravity
        val HORIZONTAL_VELOCITY = Vec2(5f, 0f)
    }
}

