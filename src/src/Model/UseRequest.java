package src.Model;

public class UseRequest {
    //instantiates variables
    private FacilityUser user;
    private Interval intervalSlot;

    //method for setting variables
    public UseRequest(FacilityUser user, Interval intervalSlot)
    {
        this.user = user;
        this.intervalSlot = intervalSlot;
    }

    //getter for facility user
    public FacilityUser getUser()
    {
        return user;
    }

    //setter for facility user
    public void setUser(FacilityUser user)
    {
        this.user = user;
    }

    //getter for facility interval slot
    public Interval getIntervalSlot()
    {
        return intervalSlot;
    }

    //setter for facility interval slot
    public void setIntervalSlot(Interval intervalSlot)
    {
        this.intervalSlot = intervalSlot;
    }
}
