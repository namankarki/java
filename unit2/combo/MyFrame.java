package combo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox combo;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"dog", "cat", "bird"};

        combo = new JComboBox(animals);
        // combo.setEditable(true);
        combo.addItem("horse");
        combo.insertItemAt("elephant", 0);
        combo.setSelectedIndex(0);
        combo.removeItem("cat");//removeItemAt ani index //removeAllItems
        combo.addActionListener(this);
        this.add(combo);

        this.pack();
        this.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==combo){
            System.out.println(combo.getSelectedItem()); //getSelectedIndex
        }

    }
}
