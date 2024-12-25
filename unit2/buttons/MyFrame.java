package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){

        // ImageIcon image =new ImageIcon( "buttons/icon.png");
        ImageIcon icon= new ImageIcon("buttons/movie.png");

        label=new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);



        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this); //yesma lamda expression pani use garna milcha (e-> Sysout("wingardium leviosa"))
        button.setText("Abaracadabra");
        button.setFocusable(false);
        // button.setIcon(image);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            // System.out.println("WINGGARDIUM lEVIOSA");
            // button.setEnabled(false);
            label.setVisible(true);
            
        }

    }

}