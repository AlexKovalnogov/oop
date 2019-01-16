import org.apache.log4j.Logger;



public class Client //implements Goods
{

    public String clientName;
    public String clientSurname;
    public String clientId;

    public Client(){

    }

    public Client(String clientName, String clientSurname, String clientId) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientId = clientId;
    }

    Logger logger=Logger.getLogger(Client.class);
    public void giveApplianceIntoRepair(Appliance appliances, Administrator administrator) {
        logger.info("Client giveApplianceIntoRepair into Service centre");

    }

      public void getApplianceFromRepair(){
          logger.info("Client getApplianceFromRepair from Service centre");

    }


}
