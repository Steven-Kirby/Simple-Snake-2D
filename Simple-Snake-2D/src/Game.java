import java.awt.event.KeyListener;

public class Game implements Runnable {

	private KeyManager keyManager;
	
	private Window window;
	Game(Window window){
		this.setWindow(window);
		
		init();
	}
	
	private void init() {
		keyManager = new KeyManager();
		window.getFrame().addKeyListener(keyManager);
	}

	public Window getWindow() {
		return window;
	}
	
	public void setWindow(Window window) {
		this.window = window;
	}

	@Override
	public void run() {
		
	}
}
