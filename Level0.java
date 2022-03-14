import java.awt.*;

public class Level0 extends Levels {
    private final int xStart = 40, yStart = 300;
    private final int xTarget = 520, yTarget = 20;

    public Level0() {
        super.setXStt(xStart);
        super.setYStt(yStart);
        currLevel = "Level 0";
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


//        instruction
        g.drawString("Use WASD or ↑←↓→ to move white ball to the red.", 50, 100);
        g.drawString("Use ESC to reset.", 50, 110);
    }
}
