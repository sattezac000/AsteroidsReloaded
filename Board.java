import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel implements ActionListener{

    List<Sprite> objects = new ArrayList<Sprite>();

    final int asteroids = 10;

    Timer timer;


    public Board(){
        setPreferredSize(new Dimension(1000, 500));
        setBackground(Color.BLACK);
        Timer timer = new Timer(1000/60, this);
        timer.start();
    }

    public void setup(){

        objects.add(0, new Ship(Color.cyan, getWidth()/2, getHeight()/2, 15));

        for(int i = 0; i < asteroids; i++){
            objects.add(new Asteroids(Color.WHITE, (int)((Math.random()+ 1) * 500), (int)((Math.random()+ 1) * 250), 20, 30));
        }
    }

    public void playerPlace(int x, int y){
        objects.get(0).setPosition(x, y);
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < objects.size(); i++){
            objects.get(i).paint(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        for(int i = 0; i < objects.size(); i++){
            objects.get(i).move(getHeight(), getWidth());
        }
        repaint();
    }
}
