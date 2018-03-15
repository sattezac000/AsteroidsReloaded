import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel{

    List<Sprite> objects = new ArrayList<Sprite>();


    public Board(){
        setPreferredSize(new Dimension(1000, 500));
        setBackground(Color.BLACK);
    }

    public void setup(){

        objects.add(0, new Ship(Color.cyan, getWidth()/2, getHeight()/2, 15));

    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}
