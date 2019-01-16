
import org.apache.log4j.Logger;

public class Appliance {

    private double price;
    private String applianceID;
    private String dateOfBuying;

    Logger logger = Logger.getLogger(Appliance.class);

    public Appliance(double price, String applianceID, String dateOfBuying) {
        this.price = price;
        this.applianceID = applianceID;
        this.dateOfBuying = dateOfBuying;
    }

    public void checkConditionOfAppliance() {

        logger.info("Condition is checked");
    }

    public void checkApplianceDateOfBuying() {
        logger.info("Date Of Buying is checked");
    }

    public void checkAppliancePrice() {
        logger.info("Price is checked");
    }
}
