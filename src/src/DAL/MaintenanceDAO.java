package src.DAL;

import src.Model.*;

import java.util.ArrayList;

public class MaintenanceDAO {
    public MaintenanceDAO(){}

    public void makeFacilityMaintenanceRequest(Facility f, MaintenanceRequest mr)
    {
        Database.db.get(f).getFacilityMaintenance().addMaintenanceRequest(mr);
    }
    public void scheduleMaintenance(Facility f, MaintenanceOrder mo, Interval i)
    {
        Database.db.get(f).getFacilityMaintenance().addOrderToSchedule(mo, i);
    }
    public int calcMaintenanceCostForFacility(Facility f)
    {
        int totalCost = 0;

        for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintenanceOrders())
        {
            totalCost += o.getCost();
        }

        for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintenanceSchedule().getSchedule().keySet())
        {
            totalCost += o.getCost();
        }

        for(MaintenanceOrder o : Database.db.get(f).getFacilityMaintenance().getMaintenanceLog().getLog().keySet())
        {
            totalCost += o.getCost();
        }

        return totalCost;
    }
    public String calcProblemRateForFacility(Facility f)
    {
        int totalProblems = 0;
        Date lastTime = new Date();

        for(MaintenanceOrder o: Database.db.get(f).getFacilityMaintenance().getMaintenanceOrders())
        {
            if(o.getRequestDate().olderThan(lastTime))
            {
                lastTime = o.getRequestDate();
            }
            totalProblems++;
        }

        for(MaintenanceOrder o: Database.db.get(f).getFacilityMaintenance().getMaintenanceSchedule().getSchedule().keySet())
        {
            if(o.getRequestDate().olderThan(lastTime))
            {
                lastTime = o.getRequestDate();
            }
            totalProblems++;
        }

        for(MaintenanceOrder o: Database.db.get(f).getFacilityMaintenance().getMaintenanceLog().getLog().keySet())
        {
            if(o.getRequestDate().olderThan(lastTime))
            {
                lastTime = o.getRequestDate();
            }
            totalProblems++;
        }
        return totalProblems + " as of " + lastTime.toString();
    }

    public int calcDownTimeForFacility(Facility f)
    {
        int downTime = 0;
        for(Interval i : Database.db.get(f).getFacilityMaintenance().getMaintenanceSchedule().getSchedule().values())
        {
            downTime += i.getTimeSpan().getTimeSpan();
        }

        for(Interval i : Database.db.get(f).getFacilityMaintenance().getMaintenanceLog().getLog().values())
        {
            downTime += i.getTimeSpan().getTimeSpan();
        }

        return downTime;
    }

    public ArrayList<MaintenanceRequest> listMaintRequests(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintenanceRequests();
    }

    public ArrayList<MaintenanceOrder> listMaintenance(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintenanceOrders();
    }

    public MaintenanceSchedule listFacilityProblems(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintenanceSchedule();
    }
}
