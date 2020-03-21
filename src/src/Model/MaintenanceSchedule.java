package src.Model;

import java.util.HashMap;

public class MaintenanceSchedule {
    //instantiates schedule
    private HashMap<MaintenanceOrder, Interval> schedule;

    public MaintenanceSchedule()
    {
        schedule = new HashMap<MaintenanceOrder, Interval>();
    }

    //getter for maintenance schedule
    public HashMap<MaintenanceOrder, Interval> getSchedule()
    {
        return schedule;
    }

    //setter for maintenance schedule
    public void setSchedule(HashMap<MaintenanceOrder, Interval> schedule)
    {
        this.schedule = schedule;
    }
}

