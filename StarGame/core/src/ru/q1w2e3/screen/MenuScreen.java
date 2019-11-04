package ru.q1w2e3.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import ru.q1w2e3.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    private Texture backgroundTexture;
    private Sprite backgroundSprite;


    @Override
    public void show() {
        super.show();
        backgroundTexture = new Texture("wall1.jpg");
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(1, 0, 0, 1); //фон
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //очистка экрана
        //отрисовка
        batch.begin();
        //batch.draw(background, 0, 0,240,400);
        backgroundSprite.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        backgroundTexture.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        super.touchDown(screenX, screenY, pointer, button);
        return false;
    }
}
