package panels;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
public static void main(String[] args) {


    ImageIcon icon = new ImageIcon("panels/test.png");
    JLabel label = new JLabel();
    label.setText("hi");
    label.setIcon(icon);

    JPanel redpanel = new JPanel();// a gui component that functions as a container to hold other components
    redpanel.setBackground(Color.red);
    redpanel.setBounds(0,0,250,250);

    JPanel bluepanel = new JPanel();
    bluepanel.setBackground(Color.blue);
    bluepanel.setBounds(250,0,250,250);

    JPanel greenpanel = new JPanel();
    greenpanel.setBackground(Color.green);
    greenpanel.setBounds(500,0,250,250);




    JFrame  frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(750,750);
    frame.setVisible(true);
    greenpanel.add(label);
    frame.add(redpanel);
    frame.add(bluepanel);
    frame.add(greenpanel);
}
}
