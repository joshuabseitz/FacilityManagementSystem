package src.DAL;

import src.Model.*;

import java.util.ArrayList;

public class MaintenanceDAO {
    public MaintenanceDAO(){}
    
    //adds a maintenance request for a specific facility
    public void makeFacilityMaintenanceRequest(Facility f, MaintenanceRequest mr)
    {
        Database.db.get(f).getFacilityMaintenance().addMaintenanceRequest(mr);
    }
    
    //adds maintenance facility to the schedule
    public void scheduleMaintenance(Facility f, MaintenanceOrder mo, Interval i)
    {
        Database.db.get(f).getFacilityMaintenance().addOrderToSchedule(mo, i);
    }
    
    //calculates the total cost for facility maintenance of a specific facility
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
    
    //calculates number of problems for a specified facility
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
    
    //calculates the downtime for the specified facility
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
    
    //lists the maintenance requests for a specified facility
    public ArrayList<MaintenanceRequest> listMaintRequests(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintenanceRequests();
    }
    
    //lists maintenance orders for a specified facility
    public ArrayList<MaintenanceOrder> listMaintenance(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintenanceOrders();
    }
    
    //lists the facility problems for a specified facility
    public MaintenanceSchedule listFacilityProblems(Facility f)
    {
        return Database.db.get(f).getFacilityMaintenance().getMaintenanceSchedule();
    }
}
