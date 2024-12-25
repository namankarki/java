package progress;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progress {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    Progress(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();

    }

    public void fill(){
        int counter =0;
        while(counter<=100){
            bar.setValue(counter);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){

                e.printStackTrace();
            }
            counter +=10;
           
            
        }
         bar.setString("Completed");
    }

}
