package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.q1w2e3.base.ScaledTouchButton;
import ru.q1w2e3.math.Rect;
import ru.q1w2e3.screen.GameScreen;

public class ButtonNewGame extends ScaledTouchButton {

    private GameScreen screen;

    public ButtonNewGame(TextureAtlas atlas, GameScreen screen) {
        super(atlas.findRegion("button_new_game"));
        this.screen = screen;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(0.05f);
        setBottom(-0.08f);
    }

    @Override
    public void action() {
        screen.startNewGame();
    }
}
