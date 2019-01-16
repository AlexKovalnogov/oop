public class Administrator extends Client {

    private void getListOfClients() {
        System.out.print("Administrator-getListOfClients");
    }

    private void getReportAboutRepairedApplianceForWeek() {
        System.out.println("Administrator-getListOfClients");
    }

    private void isApplianceRepairable() {
        Appliances appliances = new Appliances();
        appliances.checkApplianceDateOfBuying();
        appliances.checkConditionOfAppliance();
        appliances.checkAppliancePrice();
        System.out.println("Administrator-Aprroved tha appliance is repairable  ");
        //    giveApplianceIntoRepair();
    }

    public void giveApplianceIntoRepair() {
        System.out.println("Administrator are checkeng  appliance:");
        isApplianceRepairable();
        System.out.println("Administrator-giveApplianceIntoRepair for Serviceman");
        new Serviceman().repairAppliance();
    }

    public void getApplianceFromRepair() {
        System.out.println(" Administrator getApplianceFromRepair to  Client");
        new Client().getApplianceFromRepair();
    }

}
