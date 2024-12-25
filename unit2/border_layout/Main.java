package border_layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        //Layout manager= Defines the natural layout for componenets wiothin a container

        //3 common managers

        //borderLayout= A borderlayout places components in five ares: NORTH, SOUTH, WEST ,EAST, CENTER.
                        //All Extra spaces is placed in the center area
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.MAGENTA);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.ORANGE);
        panel6.setBackground(Color.red);
        panel7.setBackground(Color.darkGray);
        

        

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));


        panel3.setLayout(new BorderLayout(2,2));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.WEST);
        panel3.add(panel6, BorderLayout.NORTH);
        panel3.add(panel7, BorderLayout.SOUTH);

    }

}
