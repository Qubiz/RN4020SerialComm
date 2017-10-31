import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static final String CAMERA_MAC_ADDRESS = "001EC02FB1D9";

    public static void main(String[] args) throws IOException, InterruptedException {

        SerialCommunication serialCommunication = new SerialCommunication("COM14");
        serialCommunication.open();

        Scanner scanner = new Scanner(System.in);
        String input = "";

        PersistentBluetooth persistentBluetooth = new PersistentBluetooth(serialCommunication);

        loop : while (true) {
            input = scanner.nextLine();

            switch(input.toLowerCase()) {
                case "stop":
                    persistentBluetooth.stop();
                    serialCommunication.write("K");
                    break loop;
                case "connect":
                    serialCommunication.write("E,0," + CAMERA_MAC_ADDRESS);
                    break;
                case "start":
                    serialCommunication.write("CUWC," + Commands.CLIENT_INDICATE_UUID + ",1");
                    persistentBluetooth.start(5000);
                    break;
                default:
                    serialCommunication.write(input);
                    break;
            }
        }
        serialCommunication.close();
    }
}
