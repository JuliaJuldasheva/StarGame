package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.q1w2e3.base.ScaledTouchButton;
import ru.q1w2e3.math.Rect;

public class ButtonExit extends ScaledTouchButton {

    public ButtonExit(TextureAtlas atlas) {
        super(atlas.findRegion("btExit"));


    }

    @Override
    public void action() {

    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.15f);
        setRight(worldBounds.getRight() - 0.05f);
        setBottom(worldBounds.getBottom() + 0.05f);
    }
}
