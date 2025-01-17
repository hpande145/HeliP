package helip;

import java.awt.Graphics;
import java.awt.Color;


public class Bullet extends GameObject {
    public Bullet(int posX, int posY, int id, int size) {

        super(posX, posY, id, size, "/Images/bullet-2.png");

        speedX = 0;
        speedY = 2;
    }

    public void tick() {
        posY += speedY;

        // Checking if Bullet hits player
        int X = Game.player.getX();
        int Y = Game.player.getY();
        if(X <= this.posX && posX <= X + 24 && Y <= this.posY && posY <= Y + 32) {
            this.posX = Game.WIDTH + 50;
            this.posY = Game.HEIGHT + 50;
            Game.player.decHealth(10);
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.black);
        g.drawImage(img, posX, posY, null);
    }
}
