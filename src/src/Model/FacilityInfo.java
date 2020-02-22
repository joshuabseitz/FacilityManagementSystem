package src.Model;

public class FacilityInfo {

    private int FacilityID;
    private long PhoneNumber;
    private String AddressFieldOne;
    private String AddressFieldTwo;
    private String City;
    private String State;
    private int ZipCode;

    public FacilityInfo(int FacilityID, long PhoneNumber, String AddressFieldOne, String AddressFieldTwo, String City, String State, int ZipCode){
        this.FacilityID = FacilityID;
        this.PhoneNumber = PhoneNumber;
        this.AddressFieldOne = AddressFieldOne;
        this.AddressFieldTwo = AddressFieldTwo;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    // set FacilityID
    public void setFacilityID(int FacilityID){
      this.FacilityID = FacilityID;
    }
    // set PhoneNumber
    public void setPhoneNumber(long PhoneNumber) { this.PhoneNumber = PhoneNumber;}

    // set AddressFieldOne
    public void setAddressOne(String AddressFieldOne){
      this.AddressFieldOne = AddressFieldOne;
    }

    // set AddressFieldTwo
    public void setAddressTwo(String AddressFieldTwo){
      this.AddressFieldTwo = AddressFieldTwo;
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
    // get AddressFieldOne
    public String getAddressFieldOne(){
      return AddressFieldOne;
    }

    // get AddressFieldOne
    public String getAddressOne() { return AddressFieldOne; }

    // get AddressFieldTwo
    public String getAddressFieldTwo(){
      return AddressFieldTwo;
    }

    // get AddressFieldTwo
    public String getAddressTwo(){
      return AddressFieldTwo;
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
