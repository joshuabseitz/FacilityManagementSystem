package src.Model;

import java.util.ArrayList;

public class FacilityUse {
    //instantiates variable
    private ArrayList<UseRequest> requests;
    private UseSchedule schedule;

    //method for setting variables
    public FacilityUse(UseSchedule schedule)
    {
        this.requests = new ArrayList<UseRequest>();
        this.schedule = schedule;
    }

    //getter for facility requests
    public ArrayList<UseRequest> getRequests()
    {
        return requests;
    }

    //adds facility request
    public void addRequest(UseRequest request)
    {
        requests.add(request);
    }

    //getter for facility schedule
    public UseSchedule getSchedule()
    {
        return schedule;
    }

    //setter for facility schedule
    public void setSchedule(UseSchedule schedule)
    {
        this.schedule = schedule;
    }
}
