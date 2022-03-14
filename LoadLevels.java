import java.util.ArrayList;

public class LoadLevels {
    public ArrayList<Levels> levels = new ArrayList<>();
    public static int levelNumbers = 0;

    public LoadLevels () {
        levels.add(new Level0());
        levelNumbers++;
        levels.add(new Level1());
        levelNumbers++;
    }
}
