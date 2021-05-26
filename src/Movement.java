import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


/**
 * Animate movement of Surface objects, when user grab them and move by mouse.
 */
public class Movement implements MouseListener, MouseMotionListener {

    int x, y;

    public Movement(Component panel)
    {
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        x = e.getX();
        y = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        e.getComponent().setLocation((e.getX()+e.getComponent().getX())-x,
                (e.getY()+e.getComponent().getY())-y);

        Control.setPos();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
