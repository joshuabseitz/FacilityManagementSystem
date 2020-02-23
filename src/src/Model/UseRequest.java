package src.Model;

public class UseRequest {
    private FacilityUser user;
    private Interval intervalSlot;

    public UseRequest() {}

    public UseRequest(FacilityUser user, Interval intervalSlot)
    {
        this.user = user;
        this.intervalSlot = intervalSlot;
    }

    public FacilityUser getUser()
    {
        return user;
    }

    public void setUser(FacilityUser user)
    {
        this.user = user;
    }

    public Interval getIntervalSlot()
    {
        return intervalSlot;
    }

    public void setIntervalSlot(Interval intervalSlot)
    {
        this.intervalSlot = intervalSlot;
    }
}
