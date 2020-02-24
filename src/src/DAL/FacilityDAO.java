package src.DAL;

import src.Model.Facility;
import src.Model.FacilityCapacity;
import src.Model.FacilityInfo;

import java.util.Collection;

public class FacilityDAO {
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

    public Facility addNewFacility(Facility f)
    {
        Database.db.put(f, f);
        return Database.db.get(f);
    }

    public void addFacilityDetail(Facility f, FacilityInfo fi)
    {
        Database.db.get(f).setFacilityInfo(fi);
    }

    public void removeFacility(Facility f)
    {
        Database.db.remove(f);
    }
}
