package src.Model;

import java.util.ArrayList;

public interface Facility {
    FacilityInfo getFacilityInfo();
    void setFacilityInfo(FacilityInfo Info);
    FacilityCapacity getFacilityCapacity();
    void setFacilityCapacity(FacilityCapacity Capacity);
    FacilityMaintenance getFacilityMaintenance();
    void setFacilityMaintenance(FacilityMaintenance Maintenance);
    ArrayList<Inspection> getInspections();
    void addInspection(Inspection inspection);
}
