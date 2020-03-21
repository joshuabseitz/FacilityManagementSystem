package src.Model;

import java.util.HashMap;

public class MaintenanceLog {
    //instantiates log
    private HashMap<MaintenanceOrder, Interval> log;

    public MaintenanceLog()
    {
        log = new HashMap<MaintenanceOrder, Interval>();
    }

    //getter for maintenance log
    public HashMap<MaintenanceOrder, Interval> getLog()
    {
        return log;
    }

    //setter for maintenance log
    public void setLog(HashMap<MaintenanceOrder, Interval> log)
    {
        this.log = log;
    }
}
