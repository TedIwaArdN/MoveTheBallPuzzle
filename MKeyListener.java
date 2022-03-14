import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_A || event.getKeyCode() == KeyEvent.VK_LEFT) {
            Levels.moveLeft(Background.xPos, Background.yPos);
        }

        if (event.getKeyCode() == KeyEvent.VK_S || event.getKeyCode() == KeyEvent.VK_DOWN) {
            Levels.moveDown(Background.xPos, Background.yPos);
        }

        if (event.getKeyCode() == KeyEvent.VK_D || event.getKeyCode() == KeyEvent.VK_RIGHT) {
            Levels.moveRight(Background.xPos, Background.yPos);
        }

        if (event.getKeyCode() == KeyEvent.VK_W || event.getKeyCode() == KeyEvent.VK_UP) {
            Levels.moveUp(Background.xPos, Background.yPos);
        }

        if (event.getKeyCode() == KeyEvent.VK_ESCAPE) {
            Background.xPos = Background.level.getXStt();
            Background.yPos = Background.level.getYStt();
            Background.changeIs_SuccessfulToFalse();
            Background.is_AllClear = false;
        }

        if (Background.getIs_Successful()) {
            if (event.getKeyCode() == KeyEvent.VK_Y) {
                if (Background.levelIndex == LoadLevels.levelNumbers - 1) {
                    Background.is_AllClear = true;
                }

                else {
                    Background.levelIndex++;
                    Background.level = Background.allLevels.levels.get(Background.levelIndex);
                    Background.xPos = Background.level.getXStt();
                    Background.yPos = Background.level.getYStt();
                    Background.changeIs_SuccessfulToFalse();
                }
            }

            else if (event.getKeyCode() == KeyEvent.VK_N) {
                Background.xPos = Background.level.getXStt();
                Background.yPos = Background.level.getYStt();
                Background.changeIs_SuccessfulToFalse();
                Background.is_AllClear = false;
            }
        }

    }
}
