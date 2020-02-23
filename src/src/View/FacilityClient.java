package src.View;

// import java.util.List;
import src.Model.FacilityInfo;
import src.Model.interface_FacilityInfo;


public class FacilityClient {

    public FacilityClient() throws Exception {

        //office1
        interface_FacilityInfo office1 = new FacilityInfo(); //No object creation
        interface_FacilityInfo office1Details = new FacilityInfo();
        office1.setFacilityID(100);
        office1Details.setAddressOne("6330 N Sheridan Rd");
        office1Details.setAddressTwo("Suit 03");
        office1Details.setCity("Chicago");
        office1Details.setState("Illinois");
        office1Details.setZip(60660);

        // office1.setFacilityInfo(office1Details);

    }

}
