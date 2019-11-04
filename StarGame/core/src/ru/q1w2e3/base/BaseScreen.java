package ru.q1w2e3.base;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BaseScreen implements Screen, InputProcessor {

    protected SpriteBatch batch;

    @Override
    public void show() { //отображение экрана
        Gdx.input.setInputProcessor(this); //объявляем перехватчиком событий сам экран
        this.batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) { //отрисовка

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() { //если приложение свернули

    }

    @Override
    public void resume() { // если приложение развернули

    }

    @Override
    public void hide() { //приложение закрыли
        dispose();
    }

    @Override
    public void dispose() {

    }

    @Override
    public boolean keyDown(int keycode) { //нажали клавишу
        return false;
    }

    @Override
    public boolean keyUp(int keycode) { //отпустили клавишу
        return false;
    }

    @Override
    public boolean keyTyped(char character) { //фиксирует нажатие
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) { //нажали мышью/пальцем на экране по какой-то координате
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) { //отпустили нажатие мышью/пальцем
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) { //протаскивание по экрану
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) { //движение мышью
        return false;
    }

    @Override
    public boolean scrolled(int amount) { //направление скроллинга
        return false;
    }
}
