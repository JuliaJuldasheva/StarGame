package ru.q1w2e3.screen;

import com.badlogic.gdx.Gdx;

public class InputHandler {

    public static boolean isTouched() {
        return Gdx.input.isTouched();
    }

    public static boolean justTouched() {
        return Gdx.input.justTouched();
    }

    public static int getX() {
        return Gdx.input.getX();
    }

    public static int getY() {
        return Gdx.graphics.getHeight() - Gdx.input.getY();
    }
}
