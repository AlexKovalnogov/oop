public class Serviceman extends Client {

    public void repairAppliance(){
        System.out.println("Serviceman  is reparing ");
        getApplianceFromRepair();
    }
    public void getApplianceFromRepair(){
        System.out.println("Serviceman   getApplianceFromRepair to Administrator");
        new Administrator().getApplianceFromRepair();
    }


}
