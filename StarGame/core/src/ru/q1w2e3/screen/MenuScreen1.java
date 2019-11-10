package ru.q1w2e3.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import ru.q1w2e3.base.BaseScreen;

public class MenuScreen1 extends BaseScreen {

    private Texture backgroundTexture;
    private Texture shipTexture;
    private Sprite backgroundSprite;
    private Sprite shipSprite;
    boolean movingRight;
    boolean movingLeft;
    boolean movingUp;
    boolean movingDown;

    @Override
    public void show() {
        super.show();
        backgroundTexture = new Texture("wall1.jpg");
        shipTexture = new Texture("small_ship.png");
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        shipSprite = new Sprite(shipTexture);
        shipSprite.setPosition(Gdx.graphics.getWidth()/2 - shipSprite.getWidth()/2,0);

    }

    @Override
    public void render(float delta) {
        super.render(delta);

        //TODO добавить условие остановки как только экран закончился

        if (movingRight)
                shipSprite.translateX(5f);
        if(shipSprite.getX() == Gdx.graphics.getWidth()) {
            shipSprite.setX(0f);
        }
        if (movingLeft)
            shipSprite.translateX(-5f);
        if (movingUp)
            shipSprite.translateY(5f);
        if (movingDown)
            shipSprite.translateY(-5f);

        Gdx.gl.glClearColor(1, 0, 0, 1); //фон
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //очистка экрана
        //отрисовка
        batch.begin();
        //batch.draw(background, 0, 0,240,400);
        backgroundSprite.draw(batch);
        shipSprite.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
       backgroundTexture.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) { //нажали мышью/пальцем на экране по какой-то координате
        shipSprite.setPosition(screenX,Gdx.graphics.getHeight() - screenY);
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) { //движение мышью
        //shipSprite.setPosition(screenX,Gdx.graphics.getHeight() - screenY);
        return false;
    }

    @Override
    public boolean keyDown(int keycode) { //нажали клавишу
        if(keycode == Input.Keys.LEFT)
            movingLeft = true;
        if(keycode == Input.Keys.RIGHT)
            movingRight = true;
        if(keycode == Input.Keys.UP)
            movingUp = true;
        if(keycode == Input.Keys.DOWN)
            movingDown = true;
        return false;
    }

    @Override
    public boolean keyUp(int keycode) { //отпустили клавишу
        if(keycode == Input.Keys.LEFT )
            movingLeft = false;
        if(keycode == Input.Keys.RIGHT)
            movingRight = false;
        if(keycode == Input.Keys.UP)
            movingUp = false;
        if(keycode == Input.Keys.DOWN)
            movingDown = false;
        return false;
    }

}
