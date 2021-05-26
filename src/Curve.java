import javax.swing.*;
import java.awt.*;
import java.awt.geom.QuadCurve2D;


/**
 * Draws curves between start, control and end point.
 */
public class Curve extends JPanel {

    public int xS = 10, yS=200;
    public int x = 150, y=250;
    public int x2 = 350, y2=350;
    public int x3 = 450, y3=200;
    public int x4 = 350, y4=400;
    public int xE = 450, yE=400;

    private void doDrawing(Graphics g) {


        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setPaint(Color.gray);
        g2d.translate(25, 5);


        QuadCurve2D q = new QuadCurve2D.Double();
        q.setCurve(xS, yS, x, y, (x+x2)/2, (y+y2)/2);

        QuadCurve2D q2 = new QuadCurve2D.Double();
        q2.setCurve((x+x2)/2, (y+y2)/2, x2, y2, (x2+x3)/2, (y2+y3)/2);

        QuadCurve2D q3 = new QuadCurve2D.Double();
        q3.setCurve((x2+x3)/2, (y2+y3)/2, x3, y3, (x3+x4)/2, (y3+y4)/2);

        QuadCurve2D q4 = new QuadCurve2D.Double();
        q4.setCurve((x3+x4)/2, (y3+y4)/2, x4, y4, xE, yE);

        g2d.draw(q);
        g2d.draw(q2);
        g2d.draw(q3);
        g2d.draw(q4);


    }

    public void setPositionS(int x, int y) {
        this.xS = x;
        this.yS = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition2(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    public void setPosition3(int x, int y) {
        this.x3 = x;
        this.y3 = y;
    }

    public void setPosition4(int x, int y) {
        this.x4 = x;
        this.y4 = y;
    }

    public void setPositionE(int x, int y) {
        this.xE = x;
        this.yE = y;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }

    void animate() {
        repaint();
    }

}
