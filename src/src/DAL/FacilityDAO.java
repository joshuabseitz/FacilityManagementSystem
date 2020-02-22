package src.DAL;

import src.Model.Facility;
import src.Model.FacilityCapacity;
import src.Model.FacilityInfo;

import java.util.Collection;

public class FacilityDAO {
    //TODO FacilityDAO
    public FacilityDAO(){}
    public Collection<Facility> listFacilities()
    {
        return Database.db.values();
    }

    public FacilityInfo getFacilityInfo(Facility f)
    {
        return Database.db.get(f).getFacilityInfo();
    }

    public FacilityCapacity getFacilityCapacity(Facility f)
    {
        return Database.db.get(f).getFacilityCapacity();
    }

}
