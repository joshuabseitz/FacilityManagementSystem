package src.Model;

import java.util.ArrayList;

public class Building implements Facility {
    //instantiate variables
    private FacilityInfo facilityInfo;
    private FacilityCapacity facilityCapacity;
    private FacilityUse use;
    private FacilityMaintenance maintenance;
    private ArrayList<Inspection> inspections;
    
    //creates setters for the instantiated variables
    public Building(FacilityInfo facilityInfo, FacilityCapacity facilityCapacity, FacilityUse use, FacilityMaintenance maintenance)
    {
        this.facilityInfo = facilityInfo;
        this.facilityCapacity = facilityCapacity;
        this.use = use;
        this.maintenance = maintenance;
        this.inspections = new ArrayList<Inspection>();
    }
    
    //getter for facilityinfo
    public FacilityInfo getFacilityInfo()
    {
        return facilityInfo;
    }

    //setter for facilityinfo
    public void setFacilityInfo(FacilityInfo facilityInfo)
    {
        this.facilityInfo = facilityInfo;
    }

    //getter for facilitycapacity
    public FacilityCapacity getFacilityCapacity()
    {
        return facilityCapacity;
    }

    //setter for facilitycapacity
    public void setFacilityCapacity(FacilityCapacity facilityCapacity)
    {
        this.facilityCapacity = facilityCapacity;
    }

    //getter for facilityuse
    public FacilityUse getFacilityUse()
    {
        return use;
    }

    //setter for facilityuse
    public void setFacilityUse(FacilityUse use)
    {
        this.use = use;
    }

    //getter for facilitymaintenance
    public FacilityMaintenance getFacilityMaintenance()
    {
        return maintenance;
    }

    //setter for facilitymaintenance
    public void setFacilityMaintenance(FacilityMaintenance maintenance)
    {
        this.maintenance = maintenance;
    }

    //getter for facility inspections
    public ArrayList<Inspection> getInspections()
    {
        return inspections;
    }

    //adds inspections to arraylist
    public void addInspection(Inspection inspection)
    {
        inspections.add(inspection);
    }
}
