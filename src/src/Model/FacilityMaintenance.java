package src.Model;

import java.util.ArrayList;

public class FacilityMaintenance {
    private MaintenanceSchedule maintenanceSchedule;
    private ArrayList<MaintenanceOrder> maintenanceOrders;
    private MaintenanceLog maintenanceLog;
    private ArrayList<MaintenanceRequest> maintenanceRequests;

    public FacilityMaintenance(MaintenanceSchedule schedule, MaintenanceLog log)
    {
        this.maintenanceSchedule = schedule;
        this.maintenanceOrders = new ArrayList<MaintenanceOrder>();
        this.maintenanceLog = log;
        this.maintenanceRequests = new ArrayList<MaintenanceRequest>();
    }

    public MaintenanceSchedule getMaintenanceSchedule()
    {
        return maintenanceSchedule;
    }

    public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule)
    {
        this.maintenanceSchedule = maintenanceSchedule;
    }

    public ArrayList<MaintenanceOrder> getMaintenanceOrders()
    {
        return maintenanceOrders;
    }

    public MaintenanceLog getMaintenanceLog()
    {
        return maintenanceLog;
    }

    public ArrayList<MaintenanceRequest> getMaintenanceRequests()
    {
        return maintenanceRequests;
    }

    public void addMaintenanceRequest(MaintenanceRequest maintenanceRequest)
    {
        maintenanceRequests.add(maintenanceRequest);
    }

    public void addOrderToSchedule(MaintenanceOrder maintenanceOrder, Interval intervalSlot)
    {
        maintenanceSchedule.getSchedule().put(maintenanceOrder, intervalSlot);
        maintenanceOrders.remove(maintenanceOrder);
    }

    public void addMaintenanceOrder(MaintenanceOrder maintenanceOrder)
    {
        maintenanceOrders.add(maintenanceOrder);
    }

    public void addOrderToLog(MaintenanceOrder maintenanceOrder)
    {
        maintenanceLog.getLog().put(maintenanceOrder, maintenanceSchedule.getSchedule().get(maintenanceOrder));
        maintenanceSchedule.getSchedule().remove(maintenanceOrder);
    }
}
