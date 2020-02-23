package src.Model;

import java.util.ArrayList;

public class Building implements Facility {
    private FacilityInfo facilityInfo;
    private FacilityCapacity facilityCapacity;
    private FacilityUse use;
    private FacilityMaintenance maintenance;
    private ArrayList<Inspection> inspections;

    Building(){}

    public Building(FacilityInfo facilityInfo, FacilityCapacity facilityCapacity, FacilityUse use, FacilityMaintenance maintenance)
    {
        this.facilityInfo = facilityInfo;
        this.facilityCapacity = facilityCapacity;
        this.use = use;
        this.maintenance = maintenance;
        this.inspections = new ArrayList<Inspection>();
    }

    public FacilityInfo getFacilityInfo()
    {
        return facilityInfo;
    }

    public void setFacilityInfo(FacilityInfo facilityInfo)
    {
        this.facilityInfo = facilityInfo;
    }

    public FacilityCapacity getFacilityCapacity()
    {
        return facilityCapacity;
    }

    public void setFacilityCapacity(FacilityCapacity facilityCapacity)
    {
        this.facilityCapacity = facilityCapacity;
    }

    public FacilityUse getFacilityUse()
    {
        return use;
    }

    public void setFacilityUse(FacilityUse use)
    {
        this.use = use;
    }

    public FacilityMaintenance getFacilityMaintenance()
    {
        return maintenance;
    }

    public void setFacilityMaintenance(FacilityMaintenance maintenance)
    {
        this.maintenance = maintenance;
    }

    public ArrayList<Inspection> getInspections()
    {
        return inspections;
    }

    public void addInspection(Inspection inspection)
    {
        inspections.add(inspection);
    }
}
