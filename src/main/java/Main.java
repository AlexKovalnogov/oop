

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Position position=Position.CLIENT;

        Client client = new Client();
        Administrator administrator = new Administrator();
        Appliance coffeemachine = new Appliance(24.5, "coffeemachine", "24/12.15");

        //     client.giveApplianceIntoRepair(coffeemachine, administrator);
        //  administrator.getApplianceFromRepair();
//position.toString()=scanner.nextLine();

      position=Position.valueOf(scanner.nextLine().toUpperCase());
        switch (position) {
            case DIRECTOR: {
                System.out.println("1");
                break;
            }

            case CLIENT: {
                System.out.println("2");
                break;
            }
            case ADMIM:
                System.out.println("3");
                break;

            case SERVICEMAN:
                break;
            default: {
                break;
            }
        }
    }
}
