package src.Model;

public interface interface_FacilityInfo {

    Facility getFacility();

    // src.Model.Facility ID getter & setters
    int getFacilityID();
    void setFacilityID(int facilityID);

    // Address getter & setters
    String getAddressField();
    void setAddress(String AddressField);

    String getCity();
    void setCity(String city);

    String getState();
    void setState(String state);

    int getZip();
    void setZip(int zip);

}
