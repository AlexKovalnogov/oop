public class Administrator extends Client {

    public Administrator() {
    }

    public Administrator(String administratorName, String administratorSurname, String administratorId) {
        super(administratorName, administratorSurname, administratorId);
    }

    private void getListOfClients() {
        System.out.print("Administrator-getListOfClients");
    }

    private void getReportAboutRepairedApplianceForWeek() {
        System.out.println("Administrator-getListOfClients");
    }

    public void isApplianceRepairable(Appliance appliance) {
        appliance.checkApplianceDateOfBuying();
        appliance.checkConditionOfAppliance();
        appliance.checkAppliancePrice();
        System.out.println("Administrator-Aprroved tha appliance is repairable  ");

    }

    public void giveApplianceIntoRepair() {
        System.out.println("Administrator are checkeng  appliance:");
      //  isApplianceRepairable();
        System.out.println("Administrator-giveApplianceIntoRepair for Serviceman");
        new Serviceman().repairAppliance();
    }

    public void getApplianceFromRepair(Client client) {
        System.out.println("Administrator getApplianceFromRepair to  Client");
        //new Client().getApplianceFromRepair();
    }

}
