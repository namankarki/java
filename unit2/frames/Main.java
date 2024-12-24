package frames;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){

        //JFrame vane ko chai GUI window to add components to it

        // JFrame frame = new JFrame(); //frame ko instance banayo yeta
        // frame.setSize(420,420); //sets the x-dimenstion and y-dimension of out frame
        // frame.setTitle("Harry Potter and Deadly Hollows"); //sets the title for the frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cross thichyo vane close huncha by default chai HIDE_ON_CLOSE huncha
        // frame.setResizable(false);
        // frame.setVisible(true);//frame ko visibility set garya (if false frame dekhinna)

        // ImageIcon image = new ImageIcon("logo.png"); //image icon ko stance banayo
        // frame.setIconImage(image.getImage());//freame ma image icon halyo
        // frame.getContentPane().setBackground(Color.MAGENTA); //contentpane ma color halne // naya color halne pare ma new Color(r,g,b)
        MyFrame myFrame=new MyFrame();
    }
}