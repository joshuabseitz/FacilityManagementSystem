package src.Model;

import java.util.HashMap;

public class UseSchedule {
    private HashMap<UseRequest, Interval> schedule;

    public UseSchedule()
    {
        schedule = new HashMap<UseRequest, Interval>();
    }

    public HashMap<UseRequest, Interval> getSchedule()
    {
        return schedule;
    }

    public void setSchedule(HashMap<UseRequest, Interval> schedule)
    {
        this.schedule = schedule;
    }
}
