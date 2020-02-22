package src.Model;

public interface Facility {
    FacilityInfo getFacilityInfo();
    void setFacilityInfo(FacilityInfo Info);
    FacilityCapacity getFacilityCapacity();
    void setFacilityCapacity(FacilityCapacity Capacity);
    FacilityMaintenance getFacilityMaintenance();
    void setFacilityMaintenance(FacilityMaintenance Maintenance);

}
