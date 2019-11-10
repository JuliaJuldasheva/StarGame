package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.q1w2e3.base.Sprite;

public class Ship extends Sprite {

    public Ship(TextureRegion region) {
        super(region);
    }

    public boolean touchDown(Vector2 touch, int pointer) {
        return false;
    }




}
