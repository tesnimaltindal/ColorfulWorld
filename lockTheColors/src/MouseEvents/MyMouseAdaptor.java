//MyMouseAdaptor class

package MouseEvents;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MyMouseAdaptor extends MouseAdapter {
    myJPanel jpanel;
    public MyMouseAdaptor (myJPanel jpanel){
        this.jpanel=jpanel;
        jpanel.addMouseMotionListener(this);
    }
   @Override
    public void mouseMoved(MouseEvent e)
    {
        super.mouseMoved(e);
        if(!jpanel.CheckBox.isSelected())
        {
            jpanel.setBackground(jpanel.randomColor());
        }

    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        super.mouseClicked(e);
        if(!jpanel.CheckBox.isSelected())
        {
            jpanel.setBackground(jpanel.randomColor());
        }
    }
}
