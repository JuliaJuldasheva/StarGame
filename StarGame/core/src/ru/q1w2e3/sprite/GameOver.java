package ru.q1w2e3.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.q1w2e3.base.Sprite;
import ru.q1w2e3.math.Rect;

public class GameOver extends Sprite {

    public GameOver(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(0.05f);
        this.pos.set(worldBounds.pos);
        //setTop(0.08f);
    }

}
