package src.Model;

public interface interface_FacilityInfo {

    // src.Model.Facility ID getter & setter
    int getFacilityID();
    void setFacilityID(int facilityID);

    // Address getter & setter
    String getAddressField();
    void setAddress(String AddressField);

    //city getter & setter
    String getCity();
    void setCity(String city);

    //state getter & setter
    String getState();
    void setState(String state);

    //zip code getter & setter
    int getZipCode();
    void setZipCode(int zipCode);

}
