package labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main (String[] args){

//JLabel= a GUI display area for a string of text and image or both

        ImageIcon image = new ImageIcon("labels/test.png");
        Border border =BorderFactory.createLineBorder(Color.GREEN,3);

        JLabel label= new JLabel(); //create an instance of a label
        label.setText("Wingardium Leviosa"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);// left.center.right
        label.setVerticalTextPosition(JLabel.TOP);//top.center.bottom
        label.setForeground(Color.BLACK); //font coplor of text
        label.setFont(new Font("MV BOLI", Font.PLAIN,20));//font of the text
        label.setIconTextGap(30);//sets gap between text and icon
        label.setBackground(Color.BLUE);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set verical position of icon+text within labels
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(0,0,250,250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    
    

        

    }
    
}
