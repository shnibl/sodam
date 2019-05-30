package sodam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
	private static final int KEY_COUNT = 256;
	//sets keyCount to a fixed value of 256 - 256 key limit
	
	private enum KeyState {
		RELEASED,
		PRESSED,
		ONCE
	}
	//sets enumerated values for later use with KeyboardInput
	
	private boolean[] currentKeys = null;
	
	private KeyState[] keys = null;
	//defines boolean and KeyState for later use with KeyboardInput
	
	public KeyboardInput() {
		currentKeys = new boolean[ KEY_COUNT ];
		keys = new KeyState[ KEY_COUNT ];
		for( int i = 0; i < KEY_COUNT; i++ ) {
			keys[ i ] = KeyState.RELEASED;
		}
		
	}
	
	public synchronized void poll() {
		for( int i = 0; i < KEY_COUNT; i++ ) {
			if( currentKeys[ i ]) {
				if( keys[ i ] == KeyState.RELEASED )
					keys[ i ] = KeyState.ONCE;
				else
					keys[ i ] = KeyState.PRESSED;
			} else {
				keys[ i ] = KeyState.RELEASED;
			}
		}
	}
	
	public boolean keyDown( int keyCode ) {
		return keys[ keyCode ] == KeyState.ONCE ||
				keys[ keyCode ] == KeyState.PRESSED;
	}//return true if key is down
	
	public boolean keyDownOnce( int keyCode ) {
		return keys[ keyCode ] == KeyState.ONCE;
	}//check if key was pushed down this frame, but not last frame
	
	public synchronized void keyPressed ( KeyEvent e ) {
		int keyCode = e.getKeyCode();
		if( keyCode >= 0 && keyCode < KEY_COUNT ) {
			currentKeys[ keyCode ] = true;
		}
		
		if (keyCode == KeyEvent.VK_LEFT) {
			
		}
		
		if (keyCode == KeyEvent.VK_RIGHT) {
			
		}

		if (keyCode == KeyEvent.VK_UP) {
	
		}

		if (keyCode == KeyEvent.VK_DOWN) {
	
		}//if keys up, down, left, or right are pressed, move cursor
	}//if key is pressed, return true
	
	public synchronized void keyReleased ( KeyEvent e ) {
		int keyCode = e.getKeyCode();
		if( keyCode >= 0 && keyCode < KEY_COUNT ) {
			currentKeys[ keyCode ] = false;
		}
	}//if key is released, return false
	
	public void keyTyped( KeyEvent e ) {
		//unneeded
	}
	
	
	
}
