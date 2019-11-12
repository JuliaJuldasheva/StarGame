package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.q1w2e3.base.Sprite;

public class Ship extends Sprite {

    private static final float V_LEN =0.005f;

    private Vector2 velocity = new Vector2();
    private Vector2 endPoint = new Vector2();
    private Vector2 buf = new Vector2();

    public Ship(TextureRegion region) {
        super(region);
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        endPoint.set(touch);
        velocity.set(touch.cpy().sub(pos)).setLength(V_LEN);
        return false;
    }

    @Override
    public void update(float delta) {
        buf.set(endPoint);
        if (buf.sub(pos).len() > V_LEN) {
            pos.add(velocity);
        } else {
            pos.set(endPoint);
        }
    }
}
