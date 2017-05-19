import java.util.Date;

import java.util.Timer;

import java.util.TimerTask;

public class Main {
//delay for 6 sec sandeep
    long delay = 6 * 1000;
    LoopTask task = new LoopTask();
    Timer timer = new Timer("TaskName");

    public void start() {
        timer.cancel();
        timer = new Timer("TaskName");
        Date executionDate = new Date(); 
        timer.scheduleAtFixedRate(task, executionDate, delay);
    }

    private class LoopTask extends TimerTask {
        public void run() {
            System.out.println("This message will print every 6 SEC");
        }
    }

    public static void main(String[] args) {
      Main executingTask = new Main();
        executingTask.start();
    }


}