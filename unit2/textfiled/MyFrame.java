package textfiled;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField usernameField;
    JPasswordField passwordField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Username field
        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(250, 40));

        // Password field with initial text and column size
        passwordField = new JPasswordField("Enter password", 20);
        passwordField.setPreferredSize(new Dimension(250, 40));

        // Button
        button = new JButton("Submit");
        button.addActionListener(this);

        // Add components to the frame
        this.add(usernameField);
        this.add(passwordField);
        this.add(button);

        // Finalize frame
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Retrieve username and password
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Display welcome message and make fields uneditable
            System.out.println("Welcome " + username);
            System.out.println("Your password is: " + password);

            usernameField.setEditable(false);
            passwordField.setEditable(false);
        }
    }
}
