import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*    Scanner scanner = new Scanner(System.in);
        scanner.nextInt();*/

        Client client = new Client();

        Appliance coffeemachine = new Appliance(24.5, "coffeemachine", "24/12.15");
        client.giveApplianceIntoRepair();
                ///new Administrator("1", "2", "3"));

    }
}
