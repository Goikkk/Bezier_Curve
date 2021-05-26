import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Initializes control points and the curve.
 */
public class Control extends JFrame {

    static Curve c = new Curve();
    static Surface sS = new Surface();
    static Surface s = new Surface();
    static Surface s2 = new Surface();
    static Surface s3 = new Surface();
    static Surface s4 = new Surface();
    static Surface sE = new Surface();

    public Control() {

        draw();
    }

    /**
     * Draws the control point and the curve
     */
    private void draw() {

        setTitle("Curve");
        setSize(550, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        jp.setSize(getSize());
        jp.setBackground(Color.white);
        jp.setLayout(null);
        jp.setLocation(0,0);

        sS.setSize(10,10);
        sS.setLocation(25,300);
        sS.setBackground(Color.ORANGE);

        s.setSize(10,10);
        s.setLocation(70,105);
        s.setBackground(Color.blue);

        s2.setSize(10,10);
        s2.setLocation(190,344);
        s2.setBackground(Color.red);

        s3.setSize(10,10);
        s3.setLocation(355, 86);
        s3.setBackground(Color.green);

        s4.setSize(10,10);
        s4.setLocation(415, 380);
        s4.setBackground(Color.MAGENTA);

        sE.setSize(10,10);
        sE.setLocation(480, 170);
        sE.setBackground(Color.GRAY);

        jp.add(sS);
        jp.add(s);
        jp.add(s2);
        jp.add(s3);
        jp.add(s4);
        jp.add(sE);


        c.setLocation(0,0);
        c.setSize(getSize());
        c.setBackground(Color.white);
        c.setVisible(true);

        jp.add(c);

        add(jp);

    }

    /**
     * When player moves a control point, it calls curve to change its shape.
     */
    public static void setPos()
    {

        Point pS = sS.getLocation();
        Point p = s.getLocation();
        Point p2 = s2.getLocation();
        Point p3 = s3.getLocation();
        Point p4 = s4.getLocation();
        Point pE = sE.getLocation();

        c.setPositionS(pS.x-20, pS.y);
        c.setPosition(p.x-20, p.y);
        c.setPosition2(p2.x-20, p2.y);
        c.setPosition3(p3.x-20, p3.y);
        c.setPosition4(p4.x-20, p4.y);
        c.setPositionE(pE.x-20, pE.y);
        c.animate();

    }

}