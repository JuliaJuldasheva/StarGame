package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.q1w2e3.base.Sprite;

public class Ship extends Sprite {

    Texture shipTexture;
    Vector2 position;
    Vector2 velocity;
    TextureRegion region;

    public Ship(TextureRegion region) {
        super(region);
//        this.shipTexture = new Texture("small_ship.png");
//        this.position = new Vector2(590,360);
//        this.velocity = new Vector2(0,0);

    }

    public boolean touchDown(Vector2 touch, int pointer) {
        return false;
    }




}
