import javax.swing.*;
import java.awt.*;

public abstract class Levels extends JPanel {
    private static int[][] ground = new int[10000][10000];
    private int xTar, yTar;
    private int xStt, yStt;
    public String currLevel;

    public int getXTar() {
        return xTar;
    }

    public void setXTar(int xTar) {
        this.xTar = xTar;
    }

    public int getYTar() {
        return yTar;
    }

    public void setYTar(int yTar) {
        this.yTar = yTar;
    }

    public int getXStt() {
        return xStt;
    }

    public void setXStt(int xStt) {
        this.xStt = xStt;
    }

    public int getYStt() {
        return yStt;
    }

    public void setYStt(int yStt) {
        this.yStt = yStt;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public static void addVerLine(int x1, int y1, int x2, int y2){
        if(y1 > y2){
            for(int i = y2; i <= y1; i++){
                ground[x1][i] = 1;
            }
        }
        else if(y1 < y2){
            for(int i = y1; i <= y2; i++){
                ground[x1][i] = 1;
            }
        }
    }

    public static void addHorLine(int x1, int y1, int x2, int y2){
        if(x1 > x2){
            for(int i = x2; i <= x1; i++){
                ground[i][y1] = 1;
            }
        }
        else if(x1 < x2){
            for(int i = x1; i <= x2; i++){
                ground[i][y1] = 1;
            }
        }
    }

    public static void moveLeft(int xPos, int yPos){
        for(int i = xPos; i >= 0; i--){
            if(ground[i][yPos + 3] == 1)
            {
                Background.xPos = i;
                return;
            }
        }
        Background.xPos = 40;
    }

    public static void moveRight(int xPos, int yPos){
        for(int i = xPos + 1; i <=1000; i++){
            if(ground[i][yPos + 3] == 1)
            {
                Background.xPos = i - 20;
                return;
            }
        }
        Background.xPos += 1000;
    }

    public static void moveUp(int xPos, int yPos){
        for(int i = yPos; i >= 0; i--){
            if(ground[xPos + 3][i] == 1)
            {
                Background.yPos = i;
                return;
            }
        }
        Background.yPos = 20;
    }

    public static void moveDown(int xPos, int yPos){
        for(int i = yPos + 1; i <=500; i++){
            if(ground[xPos + 3][i] == 1)
            {
                Background.yPos = i - 20;
                return;
            }
        }
        Background.yPos += 1000;
    }
}
