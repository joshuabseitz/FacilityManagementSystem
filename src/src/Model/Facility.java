package src.Model;

import java.util.ArrayList;

//interface for facility 
public interface Facility {
    FacilityInfo getFacilityInfo();
    void setFacilityInfo(FacilityInfo Info);
    FacilityCapacity getFacilityCapacity();
    void setFacilityCapacity(FacilityCapacity facilityCapacity);
    FacilityUse getFacilityUse();
    void setFacilityUse(FacilityUse use);
    FacilityMaintenance getFacilityMaintenance();
    void setFacilityMaintenance(FacilityMaintenance Maintenance);
    ArrayList<Inspection> getInspections();
    void addInspection(Inspection inspection);
}
