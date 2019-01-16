import org.apache.log4j.Logger;

public class Administrator extends Client {
Logger  logger=Logger.getLogger(Administrator.class);
    public Administrator() {
    }

    public Administrator(String administratorName, String administratorSurname, String administratorId) {
        super(administratorName, administratorSurname, administratorId);
    }

    private void getListOfClients() {
        logger.info("Administrator-getListOfClients");
    }

    private void getReportAboutRepairedApplianceForWeek() {
        logger.info("Administrator-getListOfClients");
    }

    public void isApplianceRepairable(Appliance appliance) {
        appliance.checkApplianceDateOfBuying();
        appliance.checkConditionOfAppliance();
        appliance.checkAppliancePrice();
        logger.info("Administrator-Aprroved tha appliance is repairable  ");

    }

    public void giveApplianceIntoRepair() {
        logger.info("Administrator are checkeng  appliance:");
      //  isApplianceRepairable();
        logger.info("Administrator-giveApplianceIntoRepair for Serviceman");
        new Serviceman().repairAppliance();
    }

    public void getApplianceFromRepair(Client client) {
        logger.info("Administrator getApplianceFromRepair to  Client");
        //new Client().getApplianceFromRepair();
    }

}
