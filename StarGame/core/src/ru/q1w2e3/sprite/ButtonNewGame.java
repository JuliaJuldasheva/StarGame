package ru.q1w2e3.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.q1w2e3.base.ScaledTouchButton;
import ru.q1w2e3.math.Rect;
import ru.q1w2e3.screen.GameScreen;

public class ButtonNewGame extends ScaledTouchButton {


    public ButtonNewGame(TextureAtlas atlas) {
        super(atlas.findRegion("button_new_game"));
     }

    @Override
    public void action() {
 
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.05f);
        setLeft(worldBounds.getLeft() + 0.2f);
        setBottom(worldBounds.getBottom() + 0.05f);
    }
}
