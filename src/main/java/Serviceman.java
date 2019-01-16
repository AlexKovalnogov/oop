import org.apache.log4j.Logger;

public class Serviceman extends Client {
Logger logger =Logger.getLogger(Serviceman.class);

    public void repairAppliance(){
        logger.info("Serviceman  is reparing ");
        getApplianceFromRepair();
    }
    public void getApplianceFromRepair(){
        logger.info("Serviceman   getApplianceFromRepair to Administrator");
        new Administrator().getApplianceFromRepair();
    }

}
