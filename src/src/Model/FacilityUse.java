package src.Model;

import java.util.ArrayList;

public class FacilityUse {
    private ArrayList<UseRequest> requests;
    private UseSchedule schedule;

    public FacilityUse(){}

    public FacilityUse(UseSchedule schedule)
    {
        this.requests = new ArrayList<UseRequest>();
        this.schedule = schedule;
    }

    public ArrayList<UseRequest> getRequests()
    {
        return requests;
    }

    public void addRequest(UseRequest request)
    {
        requests.add(request);
    }

    public UseSchedule getSchedule()
    {
        return schedule;
    }

    public void setSchedule(UseSchedule schedule)
    {
        this.schedule = schedule;
    }
}
