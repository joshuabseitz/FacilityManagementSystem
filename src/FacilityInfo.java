public class FacilityInfo {

    private int FacilityID;
    private String AddressFieldOne;
    private String AddressFieldTwo;
    private String City;
    private String State;
    private int ZipCode;

    // set FacilityID
    public void setFacilityID(int FacilityID){
      this.FacilityID = FacilityID;
    }
    
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

    // get AddressFieldOne
    public String getAddressFieldOne(String AddressFieldOne){
      return AddressFieldOne;
    }

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
