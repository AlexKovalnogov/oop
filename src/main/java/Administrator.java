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

    private void isApplianceRepairable() {
       /* Appliance appliances = new Appliance();
        appliances.checkApplianceDateOfBuying();
        appliances.checkConditionOfAppliance();
        appliances.checkAppliancePrice();*/
        System.out.println("Administrator-Aprroved tha appliance is repairable  ");
        //    giveApplianceIntoRepair();
    }

    public void giveApplianceIntoRepair() {
        System.out.println("Administrator are checkeng  appliance:");
        isApplianceRepairable();
        System.out.println("Administrator-giveApplianceIntoRepair for Serviceman");
        new Serviceman().repairAppliance();
    }

    public void getApplianceFromRepair(Client client) {
        System.out.println("Administrator getApplianceFromRepair to  Client");
        //new Client().getApplianceFromRepair();
    }

}
