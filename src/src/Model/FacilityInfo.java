package src.Model;

public class FacilityInfo implements interface_FacilityInfo{

    private int FacilityID;
    private long PhoneNumber;
    private String AddressField;
    private String City;
    private String State;
    private int ZipCode;

    public FacilityInfo(int FacilityID, long PhoneNumber, String AddressField, String City, String State, int ZipCode){
        this.FacilityID = FacilityID;
        this.PhoneNumber = PhoneNumber;
        this.AddressField = AddressField;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    public FacilityInfo() {}

    // set FacilityID
    public void setFacilityID(int FacilityID){
      this.FacilityID = FacilityID;
    }
    // set PhoneNumber
    public void setPhoneNumber(long PhoneNumber) { this.PhoneNumber = PhoneNumber;}

    // set AddressField
    public void setAddress(String AddressField){
      this.AddressField = AddressField;
    }

    // set City
    public void setCity(String City){
      this.City = City;
    }

    // set State
    public void setState(String State){
      this.State = State;
    }

    // set Zip Code
    public void setZipCode(int ZipCode){
      this.ZipCode = ZipCode;
    }

    // get FacilityID
    public int getFacilityID(){
      return FacilityID;
    }
    // get PhoneNumber
    public long getPhoneNumber() { return PhoneNumber; }
    // get AddressField
    public String getAddressField(){
      return AddressField;
    }

    // get City
    public String getCity(){
      return City;
    }

    // get State
    public String getState(){
      return State;
    }

    // get ZipCode
    public int getZipCode(){
      return ZipCode;
    }

}
