package ru.q1w2e3.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.q1w2e3.base.BaseScreen;
import ru.q1w2e3.math.Rect;
import ru.q1w2e3.sprite.Background;
import ru.q1w2e3.sprite.Ship;

public class MenuScreen extends BaseScreen {

    private Texture img;
    private Texture bg;
    private Ship logo;
    private Background background;


    @Override
    public void show() {
        super.show();
        img = new Texture("small_ship.png");
        bg = new Texture("wall1.jpg");
        logo = new Ship(new TextureRegion(img));
        logo.setHeightProportion(0.15f);
        background = new Background(new TextureRegion(bg));
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        background.draw(batch);
        logo.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        img.dispose();
        bg.dispose();
        super.dispose();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        return false;
    }
}
