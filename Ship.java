import java.awt.*;

public class Ship extends Sprite{

    public Ship(Color color, int x, int y, int diam){

        super(color, x, y, diam, diam);

    }

    @Override
    public void paint(Graphics g){

        g.setColor(color);
        g.fillOval(x, y, width, height);
    }

}
