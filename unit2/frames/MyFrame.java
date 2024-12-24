package frames;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
public class MyFrame extends JFrame {
MyFrame(){
    // JFrame frame = new JFrame(); //frame ko instance banayo yeta
        this.setSize(420,420); //sets the x-dimenstion and y-dimension of out frame
        this.setTitle("Harry Potter and Deadly Hollows"); //sets the title for the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cross thichyo vane close huncha by default chai HIDE_ON_CLOSE huncha
        this.setResizable(false);
        this.setVisible(true);//frame ko visibility set garya (if false frame dekhinna)

        ImageIcon image = new ImageIcon("logo.png"); //image icon ko stance banayo
        this.setIconImage(image.getImage());//freame ma image icon halyo
       this.getContentPane().setBackground(Color.MAGENTA); //contentpane ma color halne // naya color halne pare ma new Color(r,g,b)
}
    
}