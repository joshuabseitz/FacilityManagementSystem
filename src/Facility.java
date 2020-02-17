import FacilityCapacity;
import FacilityMaintenance;
import FacilityInfo;
import FacilityUse;
import FacilityAlter;

public class Facility {

    private int facilityID;
    private FacilityDetails facilityDetail;

    //getter FacilityDetail
    public FacilityDetails getFacilityDetail() {
        return facilityDetail;
    }

    //setter FacilityDetail
    public void setFacilityDetail(FacilityDetails facilityDetail) {
        this.facilityDetail = facilityDetail;
    }

    //setter FacilityID
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    //getter FacilityID
    public int getFacilityID() {
        return facilityID;
    }
}
