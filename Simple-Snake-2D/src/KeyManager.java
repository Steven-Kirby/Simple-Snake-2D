import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	public boolean up, down, left, right, select;
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		up = false;
		down = false; 
		left = false;
		right = false;
		select = false;
		
		switch(arg0.getKeyCode()) {
		
		case KeyEvent.VK_W:
			up = true;
			System.out.println("UP Pressed");
			break;
		case KeyEvent.VK_S:
			down = true;
			System.out.println("DOWN Pressed");
			break;
		case KeyEvent.VK_A:
			left = true;
			System.out.println("LEFT Pressed");
			break;
		case KeyEvent.VK_D:
			right = true;
			System.out.println("RIGHT Pressed");
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("SELECT Pressed");
			select = true;
			break;
			
		case KeyEvent.VK_ESCAPE:
			///add Pause
			System.out.println("PAUSE Pressed");
			break;
		default:
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}
