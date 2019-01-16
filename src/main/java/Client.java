import java.security.PublicKey;

public class Client implements Goods{

    public String clientName;
    public String clientSurname;
    public String clientId;


    public void giveApplianceIntoRepair() {
        System.out.println("Client giveApplianceIntoRepair into Service centre");
        new Administrator().giveApplianceIntoRepair();
    }

      public void getApplianceFromRepair(){
        System.out.println("Client getApplianceFromRepair from Service centre");

    }


}
