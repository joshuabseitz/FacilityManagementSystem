package src.Model;

public class TimeSpan {
    private int timeSpan;

    //setter for timespan
    public TimeSpan(int timeSpan)
    {
        this.timeSpan = timeSpan;
    }

    //setter fopr timespan
    public TimeSpan(Time startTime, Time endTime)
    {
        this.timeSpan = (endTime.getHour() - startTime.getHour())*60 + (endTime.getMinute() - startTime.getMinute());
    }

    //getter for timespan
    public int getTimeSpan()
    {
        return timeSpan;
    }

    //setter for timespan 
    public void setTimeSpan(int timeSpan)
    {
        this.timeSpan = timeSpan;
    }
}
