

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input personal position:director,admin,serviceman,client.");
        Appliance coffeemachine = new Appliance(24.5, "coffeemachine", "24/12.15");
        try {
        StuffPosition position= StuffPosition.valueOf(scanner.nextLine().toUpperCase());

            switch (position) {
                case DIRECTOR:
                    System.out.println("1");
                    break;

                case CLIENT:
                    System.out.println("2");
                    Client client = new Client();

                    Administrator administrator = new Administrator();
                    client.giveApplianceIntoRepair(coffeemachine, administrator);
                    administrator.getApplianceFromRepair();
                    break;

                case ADMIN:
                    System.out.println("3");
                    break;

                case SERVICEMAN:
                    break;
                default: {
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.print("sss"+e);

        }

    }
}
