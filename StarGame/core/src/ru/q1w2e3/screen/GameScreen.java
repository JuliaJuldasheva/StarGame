package ru.q1w2e3.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.q1w2e3.base.BaseScreen;
import ru.q1w2e3.math.Rect;
import ru.q1w2e3.sprite.Background;
import ru.q1w2e3.sprite.Ship;
import ru.q1w2e3.sprite.Star;

public class GameScreen extends BaseScreen {

    private static final int STAR_COUNT = 60;

    private Texture bg;
    private Texture img;
    private TextureAtlas atlas;
    private Star[] stars;
    private Ship ship;
    private Background background;
    //private TextureRegion region;
    //private Texture texture;
    //private Rect worldBounds;

    @Override
    public void show() {
        super.show();
        bg = new Texture("textures/bg.png");
        background = new Background(new TextureRegion(bg));
        img = new Texture("small_ship.png");
        atlas = new TextureAtlas("textures/mainAtlas.tpack");
        stars = new Star[STAR_COUNT];
        for (int i = 0; i < STAR_COUNT; i++) {
            stars[i] = new Star(atlas);
        }
        ship = new Ship(atlas);

        //texture = new Texture("textures/small_ship.png");
        //region = new TextureRegion(texture,texture.getWidth()/2,texture.getHeight());
    }

    @Override
    public void render(float delta) {
        update(delta);
        draw();
    }

    @Override
    public void resize(Rect worldBounds) {
        background.resize(worldBounds);
        for (Star star : stars) {
            star.resize(worldBounds);
        }
        ship.resize(worldBounds);
    }

    @Override
    public void dispose() {
        super.dispose();
        atlas.dispose();
        img.dispose();
        bg.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        ship.touchDown(touch, pointer);
        return false;
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer) {
        ship.touchDown(touch, pointer);
        return false;
    }

    private void update(float delta) {
        ship.update(delta);
        for (Star star : stars){
            star.update(delta);
        }
    }

    private void draw() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        background.draw(batch);
        for (Star star : stars){
            star.draw(batch);
        }
        ship.draw(batch);
        //batch.draw(region,0,0);
        batch.end();
    }
}