import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class PersistentBluetooth {
    private static final long PERIOD = 5000;

    private Timer timer;
    private TimerTask timerTask;

    private SerialCommunication serialCommunication;

    public PersistentBluetooth(SerialCommunication serialCommunication) {
        this.serialCommunication = serialCommunication;

        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                try {
                    serialCommunication.write("CHW,"
                            + Commands.CLIENT_WRITE_HANDLE_COMMANDS
                            + "," + Commands.toHexString(Commands.R_DATETIME));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public void start(long delay) {
        timer.schedule(timerTask, delay, PERIOD);
    }

    public void skip() {
        timer.cancel();
        timer = new Timer();
        timer.schedule(timerTask,5000, 5000);
    }

    public void stop() {
        timer.cancel();
    }


}