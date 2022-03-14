import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background extends JPanel implements ActionListener {
    static LoadLevels allLevels = new LoadLevels();
    public static int levelIndex = 0;

    public static Levels level = allLevels.levels.get(levelIndex);

    protected static int xPos = level.getXStt(), yPos = level.getYStt();
    private static boolean is_Successful = false;
    public static boolean is_AllClear = false;
    static JFrame window = new JFrame("Moving Trial 1.0");

    public static boolean getIs_Successful(){
        return is_Successful;
    }

    public static void changeIs_SuccessfulToFalse(){
        is_Successful = false;
    }

    public void paintComponent (Graphics g){
        super.paintComponent(g);

        g.setColor(Color.CYAN);
        g.drawString(level.currLevel, 10, 15);

//        ball
        g.setColor(Color.WHITE);
        g.fillOval(xPos, yPos, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(xPos, yPos, 12, 12);
        g.setColor(Color.WHITE);
        g.fillOval(xPos, yPos, 7, 7);

        level.paintComponent(g);

        if(is_AllClear){
            g.setColor(Color.YELLOW);
            g.fillRect(235, 140, 135, 30);
            g.setColor(Color.RED);
            g.drawString("Congratulations!", 240, 154);
            g.drawString("You've cleared all levels!", 240, 164);
        }

        else if(is_Successful){
            g.setColor(Color.YELLOW);
            g.fillRect(240, 140, 100, 30);
            g.setColor(Color.RED);
            g.drawString("You win!", 245, 154);
            g.drawString("Next Level? (Y/N)", 245, 164);
        }

    }

    public void actionPerformed(ActionEvent e){
        window.addKeyListener(new MKeyListener());
        if(xPos == level.getXTar() && yPos == level.getYTar()){
            is_Successful = true;
        }
        repaint();
    }

    public static void main(String[] args) {
        window.setBounds(100, 100, 600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Background panel = new Background();
        panel.setBackground(Color.BLACK);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);

        Timer clock = new Timer(50, panel);
        clock.start();
    }
}
