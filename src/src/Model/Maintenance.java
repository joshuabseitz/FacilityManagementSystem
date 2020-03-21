package src.Model;

public class Maintenance implements interface_Maintenance{
    //instantiates variables
    private int maintenanceID;
    private int maintenanceRequestID;
    private int facilityID;
    private String maintenanceDetails;
    private int cost;
    private Facility facility;


    //getter for maintenance id
    public int getMaintenanceID() {
        return maintenanceID;
    }

    //setter for maintenance id
    public void setMaintenanceID(int maintenanceID) {
        this.maintenanceID = maintenanceID;
    }

    //getter for maintenancerequestid
    public int getMaintenanceRequestID() {
        return maintenanceRequestID;
    }

    //setter for maintenancerequestid
    public void setMaintenanceRequestID(int maintenanceRequestID) {
        this.maintenanceRequestID = maintenanceRequestID;
    }

    //getter for facilityid
    public int getFacilityID() {
        return facilityID;
    }

    //setter for facilityid
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    //getter for maintenance details
    public String getMaintenanceDetails() {
        return maintenanceDetails;
    }

    //setter for maintenance details
    public void setMaintenanceDetails(String maintenanceDetails) {
        this.maintenanceDetails = maintenanceDetails;
    }

    //getter for maintenance cost
    public int getCost() {
        return cost;
    }

    //setter for maintenance cost
    public void setCost(int cost) {
        this.cost = cost;
    }

    //getter for facility
    public Facility getFacility() {
        return facility;
    }

    //setter for facility
    public void setFacility(Facility facility) {
        this.facility = facility;
    }

}
