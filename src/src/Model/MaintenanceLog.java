package src.Model;

import java.util.HashMap;

public class MaintenanceLog {
    private HashMap<MaintenanceOrder, Interval> log;

    MaintenanceLog()
    {
        log = new HashMap<MaintenanceOrder, Interval>();
    }

    public HashMap<MaintenanceOrder, Interval> getLog()
    {
        return log;
    }

    public void setLog(HashMap<MaintenanceOrder, Interval> log)
    {
        this.log = log;
    }
}
