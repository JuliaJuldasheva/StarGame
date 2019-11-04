package ru.q1w2e3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StarGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture backgroundTexture;
	private Sprite backgroundSprite;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		backgroundTexture = new Texture("wall1.jpg");
		backgroundSprite = new Sprite(backgroundTexture);
		backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1, 0, 0, 1); //фон
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //очистка экрана
		//отрисовка
		batch.begin();
		//batch.draw(background, 0, 0,240,400);
		backgroundSprite.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () { //выгружаем из памяти тяжелые текстуры
		batch.dispose();
		backgroundTexture.dispose();
	}
}
