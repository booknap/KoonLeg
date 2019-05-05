package code;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {

    // Default time
    private int time = 5;

    public void countDown(Runnable tick) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                time--;
                tick.run();
            }
        };

        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public int getTime() {
        return time;
    }
}
