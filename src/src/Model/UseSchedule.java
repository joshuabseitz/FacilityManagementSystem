package src.Model;

import java.util.HashMap;

public class UseSchedule {
    //instantiates schedule
    private HashMap<UseRequest, Interval> schedule;

    public UseSchedule()
    {
        schedule = new HashMap<UseRequest, Interval>();
    }

    //getter for facility use schedule
    public HashMap<UseRequest, Interval> getSchedule()
    {
        return schedule;
    }

    //setter for facility use schedule
    public void setSchedule(HashMap<UseRequest, Interval> schedule)
    {
        this.schedule = schedule;
    }
}
