import java.awt.*;

public class Asteroids extends Sprite{

    public Asteroids(Color color, int x, int y, int width, int height){

        super(color, x, y, width, height);

    }

    public void paint(Graphics g){

        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

}
