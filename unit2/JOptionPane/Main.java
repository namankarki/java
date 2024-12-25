package JOptionPane;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {

    //JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something

    // JOptionPane.showMessageDialog(null, "Wingardium leviosa","title", JOptionPane.PLAIN_MESSAGE );
    // JOptionPane.showMessageDialog(null, "Wingardium leviosa","title", JOptionPane.INFORMATION_MESSAGE );
    // JOptionPane.showMessageDialog(null, "Wingardium leviosa","title", JOptionPane.WARNING_MESSAGE );
    // JOptionPane.showMessageDialog(null, "Wingardium leviosa","title", JOptionPane.ERROR_MESSAGE );
    // JOptionPane.showMessageDialog(null, "Wingardium leviosa","title", JOptionPane.QUESTION_MESSAGE );

    // JOptionPane.showConfirmDialog(null,"wingardium leviosa", "Spell", JOptionPane.YES_NO_CANCEL_OPTION);

    // String name =JOptionPane.showInputDialog("Name a spell..");
    String[] responses = {"No","thanks","blush"};
    JOptionPane.showOptionDialog(null,"You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,responses,0);
    
}
}
