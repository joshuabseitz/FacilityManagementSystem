package src.Model;

import java.util.HashMap;

public class MaintenanceSchedule {
    private HashMap<MaintenanceOrder, Interval> schedule;

    public MaintenanceSchedule()
    {
        schedule = new HashMap<MaintenanceOrder, Interval>();
    }

    public HashMap<MaintenanceOrder, Interval> getSchedule()
    {
        return schedule;
    }

    public void setSchedule(HashMap<MaintenanceOrder, Interval> schedule)
    {
        this.schedule = schedule;
    }
}

