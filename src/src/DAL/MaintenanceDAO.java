package src.DAL;

import src.Model.Facility;
import src.Model.Interval;
import src.Model.Time;

import java.util.ArrayList;

public class MaintenanceDAO {
    public MaintenanceDAO(){}

    public void makeFacilityMaintenanceRequest(Facility f, MaintenanceRequest mr)
    {
        Database.db.get(f).getFacilityMaintenance().addMaintReq(mr);
    }
    public void scheduleMaintenance(Facility f, MaintenanceOrder mo, Slot s)
    {
        Database.db.get(f).getFacilityMaintenance().addOrderToSchedule(mo, s);
    }
    public int calcMaintenanceCostForFacility(Facility f)
    {
        int totalCost = 0;

        for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintOrders())
        {
            totalCost += o.getCost();
        }

        for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().keySet())
        {
            totalCost += o.getCost();
        }

        for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().keySet())
        {
            totalCost += o.getCost();
        }

        return totalCost;
    }
    public String calcProblemRateForFacility(Facility f)
    {
        int totalProblems = 0;
        Time lastTime = new Time();

        for(MaintenanceOrder o: Database.db.get(f).getFacilityMaintenance().getMaintOrders())
        {
            if(o.getRequestTime().olderThan(lastTime))
            {
                lastTime = o.getRequestTime();
            }
            totalProblems++;
        }

        for(MaintenanceOrder o: Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().keySet())
        {
            if(o.getRequestTime().olderThan(lastTime))
            {
                lastTime = o.getRequestTime();
            }
            totalProblems++;
        }

        for(MaintenanceOrder o: Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().keySet())
        {
            if(o.getRequestTime().olderThan(lastTime))
            {
                lastTime = o.getRequestTime();
            }
            totalProblems++;
        }
        return totalProblems + " as of " + lastTime.toString();
    }

    public int calcDownTimeForFacility(Facility f)
    {
        int downTime = 0;
        for(Interval i : Database.db.get(f).getFacilityMaintenance().getMaintSchedule().getSchedule().values())
        {
            downTime += i.getTimeSpan().getTimeSpan();
        }

        for(Interval i : Database.db.get(f).getFacilityMaintenance().getMaintLog().getLog().values())
        {
            downTime += i.getTimeSpan().getTimeSpan();
        }

        return downTime;
    }

    public ArrayList<MaintenanceRequest> listMaintRequests(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintRequest();
    }

    public ArrayList<MaintenanceOrder> listMaintenance(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintOrders();
    }

    public MaintenanceSchedule listFacilityProblems(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintSchedule();
    }
}
