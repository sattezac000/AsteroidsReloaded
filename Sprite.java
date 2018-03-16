import java.awt.*;

public class Sprite implements Move, Paint{

    Color color;
    int x, y, width, height;

    double dx, dy;

    final int Speed = 5;

    public Sprite(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        while((int)dx == 0 || (int)dy == 0){
            double angle = 2 * Math.PI * (Math.random() + 1);
            double speed = (Speed * (Math.random() + 1 ));
            dx = Math.cos(angle) * speed;
            dy = Math.sin(angle) * speed;
        }
    }

    @Override
    public void move(int boardHeight, int boardWidth){

            double nextLeft =  x + dx;
            double nextRight = x + width + dx;
            double nextTop = y + dy;
            double nextBottom = y + height + dy;

            if(nextTop <= 0 || nextBottom > boardHeight){
                dy*=-1;
            }
            if(nextLeft <= 0 || nextRight > boardWidth){
                dx*=-1;
            }
            x += dx;
            y += dy;
        }

    @Override
    public Rectangle getBounds(){
        return new Rectangle((int)(x + dx), (int)(y + dy), width, height);
    }

    @Override
    public void paint(Graphics g){

    }

    @Override
    public void setPosition(int x, int y){

        this.x = x;
        this.y = y;
    }



}
