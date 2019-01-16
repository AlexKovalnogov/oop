public class Appliance {

    private double price;
    private String applianceID;
    private String dateOfBuying;

 public Appliance(double price, String applianceID, String dateOfBuying) {
     this.price = price;
     this.applianceID = applianceID;
     this.dateOfBuying = dateOfBuying;
 }

    public void checkConditionOfAppliance() {
        System.out.println("Condition is checked");
    }

    public void checkApplianceDateOfBuying() {
        System.out.println("Date Of Buying is checked");
    }

    public void checkAppliancePrice() {
        System.out.println("Price is checked");
    }
}
