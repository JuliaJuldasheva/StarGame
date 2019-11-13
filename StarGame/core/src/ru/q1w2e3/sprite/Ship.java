package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

import ru.q1w2e3.base.Sprite;
import ru.q1w2e3.math.Rect;


public class Ship extends Sprite {

    private static final float V_LEN =0.005f;

    private Rect worldBounds; //область экрана
    private Vector2 velocity = new Vector2();
    private Vector2 endPoint = new Vector2();
    private Vector2 buf = new Vector2();

    public Ship(TextureAtlas atlas) {
        super(atlas.findRegion("main_ship"));
        setHeightProportion(0.15f);
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
        checkBounds();
    }

    @Override
    public void resize(Rect worldBounds) {
        this.worldBounds = worldBounds;
        float posX = worldBounds.getRight() - 0.35f;
        float posY = worldBounds.getBottom() + 0.1f;
        pos.set(posX, posY);
    }

    private void checkBounds() {
        if (getRight() < worldBounds.getLeft()) setLeft(worldBounds.getRight());
        if (getLeft() > worldBounds.getRight()) setRight(worldBounds.getLeft());

    }
}
