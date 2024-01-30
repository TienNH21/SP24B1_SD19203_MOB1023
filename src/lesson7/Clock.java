package lesson7;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Clock implements Runnable {
    private JLabel lblClock;
    
    public Clock(JLabel lbl)
    {
        this.lblClock = lbl;
    }

    @Override
    public void run() {
        while (true) {
            int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            int min = Calendar.getInstance().get(Calendar.MINUTE);
            int sec = Calendar.getInstance().get(Calendar.SECOND);
            String t = hour + ":" + min + ":" + sec;
            System.out.println(t);
            this.lblClock.setText(t);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
