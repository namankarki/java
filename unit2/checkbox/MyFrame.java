package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;



public class MyFrame extends JFrame implements ActionListener {

    JCheckBox checkbox; 
    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);

        checkbox = new JCheckBox();
        checkbox.setText("Bishmilla");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font ("Concolas",Font.PLAIN,35));

        this.add(checkbox);
        this.add(button);
        this.pack();
        this.setVisible(true);

        //icon halne wala chai hernu hai nabirsi kana

    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
            System.out.println(checkbox.isSelected()); 

        }

    }
}
