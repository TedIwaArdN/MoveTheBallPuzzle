import java.awt.*;

public class Level1 extends Levels {
    private final int xStart = 40, yStart = 300;
    private final int xTarget = 400, yTarget = 300;

    public Level1() {
        super.setXStt(xStart);
        super.setYStt(yStart);
        currLevel = "Level 1";
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);

//        start point
        setXStt(xStart);
        setYStt(yStart);

//        end point
        g.setColor(Color.RED);
        setXTar(xTarget);
        setYTar(yTarget);
        g.fillOval(xTarget, yTarget, 20, 20);

//        boundary
        g.setColor(Color.WHITE);
        g.drawRect(40, 20, 500, 300);
        Levels.addHorLine(40, 20, 540, 20);
        Levels.addHorLine(40, 320, 540, 320);
        Levels.addVerLine(40, 20, 40, 320);
        Levels.addVerLine(540, 20, 540, 320);

//        walls
        g.setColor(Color.WHITE);
        g.drawLine(40, 280, 140, 280);
        Levels.addHorLine(40, 280, 100, 280);
        g.drawLine(400, 320, 400, 200);
        Levels.addVerLine(400, 320, 400, 200);
        g.drawLine(300, 20, 300, 150);
        Levels.addVerLine(300, 20, 300, 150);
        g.drawLine(300, 150, 450, 150);
        Levels.addHorLine(300, 150, 450, 150);
        g.drawLine(400, 200, 200, 200);
        Levels.addHorLine(400, 200, 200, 200);
        g.drawLine(540, 240, 500, 240);
        Levels.addHorLine(540, 240, 500, 240);
        g.drawLine(500, 280, 400, 280);
        Levels.addHorLine(500, 280, 400, 280);
    }
}
