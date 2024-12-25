package menu;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar bar;
    JMenu fileMenu;
    JMenuItem loadItem;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        // Initialize menu bar and menus
        bar = new JMenuBar();
        fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Initialize menu items
        loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Add action listeners to menu items
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Set mnemonics for menu items
        loadItem.setMnemonic(KeyEvent.VK_L); // Alt+L for Load
        saveItem.setMnemonic(KeyEvent.VK_S); // Alt+S for Save
        exitItem.setMnemonic(KeyEvent.VK_E); // Alt+E for Exit

        // Add menu items to the "File" menu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add menus to the menu bar
        bar.add(fileMenu);
        bar.add(editMenu);
        bar.add(helpMenu);

        // Set the menu bar for the frame
        this.setJMenuBar(bar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Check which menu item was clicked
        if (e.getSource() == loadItem) {
            System.out.println("Loading...");
        } else if (((JMenuItem) e.getSource()).getText().equals("Save")) {
            System.out.println("Saving...");
        } else if (((JMenuItem) e.getSource()).getText().equals("Exit")) {
            System.out.println("Exiting...");
            System.exit(0); // Close the application
        }
    }
}
