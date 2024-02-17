package MouseEvents;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame myJFrame =new JFrame("Colorful World");
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane=myJFrame.getContentPane();
        pane.setLayout(new GridLayout(5,5));
        myJFrame.setSize(300,300);
        myJFrame.setVisible(true);
        for(int i=0;i<25;i++)
        {
            myJPanel myPanel = new myJPanel();
            pane.add(myPanel);

        }
    }
}

