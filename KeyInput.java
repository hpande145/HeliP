package HeliP;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    public KeyInput() {
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
            Player obj = Game.player;
            obj.setX(obj.getX() - obj.getSpeedX());
        }
        else if(key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
            Player obj = Game.player;
            obj.setX(obj.getX() + obj.getSpeedX());
        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
