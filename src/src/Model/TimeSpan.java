package src.Model;

public class TimeSpan {
    private int timeSpan;

    public TimeSpan(){}

    public TimeSpan(int timeSpan)
    {
        this.timeSpan = timeSpan;
    }

    public TimeSpan(Time startTime, Time endTime)
    {
        this.timeSpan = (endTime.getHour() - startTime.getHour())*60 + (endTime.getMinute() - startTime.getMinute());
    }

    //returns timeSpan in minutes
    public int getTimeSpan()
    {
        return timeSpan;
    }

    public void setTimeSpan(int timeSpan)
    {
        this.timeSpan = timeSpan;
    }
}
