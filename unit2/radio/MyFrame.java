package radio;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton rb; // Pizza option
    JRadioButton bb; // Hotdog option

    MyFrame() {
        // Set up the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Initialize the radio buttons
        rb = new JRadioButton("pizza");
        bb = new JRadioButton("hotdog");

        // Add action listeners
        rb.addActionListener(this);
        bb.addActionListener(this);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(rb);
        group.add(bb);

        // Add buttons to the frame AFTER initialization
        this.add(rb);
        this.add(bb);

        // Finalize frame setup
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check which radio button triggered the event
        if (e.getSource() == rb) {
            System.out.println("Pizza pais");
        } else if (e.getSource() == bb) {
            System.out.println("Hotdog pais");
        }
    }

    //image halne hera
}
