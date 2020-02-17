public class test_objectModel() {

  //office1

  Facility office1 = new Facility();

  FacilityDetails office1Details = new FacilityDetails();

  office1.setFacilityID(123);
  office1Details.setAddressFieldOne("26 E Pearson St.");
  office1Details.setAddressFieldTwo(" ");
  office1Details.setCity("Chicago");
  office1Details.setState("Illinois");

  office1.setFacilityDetail(office1Details);
  
}