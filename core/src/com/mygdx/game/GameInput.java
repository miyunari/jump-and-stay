package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

public class GameInput implements InputProcessor {
	private Player player;
	/*
	if(Gdx.input.isKeyPressed(Keys.A)) {
		position.x -= maxVelocity * delta;
	}
	if(Gdx.input.isKeyPressed(Keys.D)) {
		position.x += maxVelocity * delta;
	}
	if(Gdx.input.isKeyPressed(Keys.W)) {
		position.y += maxVelocity * delta;
	}
	if(Gdx.input.isKeyPressed(Keys.S)) {
		position.y -= maxVelocity * delta;
	}
	
	if(Gdx.input.isKeyJustPressed(Keys.ESCAPE)) {
		Gdx.app.exit();
	}*/
	public GameInput(Player p) {
		player = p;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		switch(keycode) {
		case Keys.SPACE:
			player.jump();
			break;
		case Keys.ESCAPE:
			Gdx.app.exit();
			break;
		}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}

}
