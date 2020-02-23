package src.Model;

public class Inspection {
    private String inspectionType;
    private Interval interval;

    public Inspection(){}

    public Inspection(String inspectionType, Interval interval)
    {
        this.inspectionType = inspectionType;
        this.interval = interval;
    }

    public String getInspectionType()
    {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType)
    {
        this.inspectionType = inspectionType;
    }

    public Interval getInterval()
    {
        return interval;
    }

    public void setInterval(Interval interval)
    {
        this.interval = interval;
    }
}
