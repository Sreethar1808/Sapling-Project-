import javax.swing.*;
import java.awt.*;

public class GameFrame {

    JFrame frame;
    Table table;
    GameFrame(){
        frame=new JFrame("PongGame");
        //frame.setLayout(null);
        table=new Table();
        //table.setBounds(100,100,800,200);
        table.setBackground(Color.black);
        frame.add(table);
        //frame.setBounds(200,200,1000,555);
        //frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(Color.black);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
}
