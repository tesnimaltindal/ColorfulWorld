//myJPanel class
package MouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class myJPanel extends JPanel {

    JCheckBox CheckBox;
    Color ColorBackGround;

    public Color randomColor()
    {
        int red=(int)(Math.random()*256);
        int green=(int)(Math.random()*256);
        int blue=(int)(Math.random()*256);
         ColorBackGround = new Color(red, green, blue);
        return ColorBackGround;
    }

    public myJPanel() {
        setLayout(new FlowLayout());
        CheckBox = new JCheckBox("Lock");
        add(CheckBox);
        setBackground(randomColor());

        MyMouseAdaptor myAdaptor = new MyMouseAdaptor(this);
        addMouseListener(myAdaptor);
        addMouseMotionListener(myAdaptor);

        CheckBox.addItemListener(new ItemListener()
        {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED)
                {
                    setBackground(ColorBackGround);
                }
            }
        });
    }

}
