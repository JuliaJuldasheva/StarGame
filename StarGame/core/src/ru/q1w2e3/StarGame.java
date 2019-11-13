package ru.q1w2e3;

import com.badlogic.gdx.Game;

import ru.q1w2e3.screen.MenuScreen;
import ru.q1w2e3.screen.MenuScreen1;

public class StarGame extends Game {

	@Override
	public void create () {
		setScreen(new MenuScreen(this));
	}

}
