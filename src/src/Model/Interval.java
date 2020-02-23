package src.Model;

public class Interval {

    private Week week;
    private Time startTime;
    private Time endTime;
    private TimeSpan timeSpan;
    private Date date;

    public Interval(Week week, Time startTime, Time endTime)
    {
        this.week = week;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeSpan = new TimeSpan(startTime, endTime);
    }

    public Interval (Week week, Time startTime, TimeSpan timeSpan)
    {
        this.week = week;
        this.startTime = startTime;
        this.timeSpan = timeSpan;
        this.endTime = new Time(timeSpan.getTimeSpan()/60, timeSpan.getTimeSpan()%60);
    }

    public Interval(Date date, Time startTime, Time endTime)
    {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeSpan = new TimeSpan(startTime, endTime);
    }

    public Interval(Date date, Time startTime, TimeSpan timeSpan)
    {
        this.date = date;
        this.startTime = startTime;
        this.timeSpan = timeSpan;
        this.endTime = new Time(timeSpan.getTimeSpan()/60, timeSpan.getTimeSpan()%60);
    }

    public Week getWeek()
    {
        return week;
    }

    public void setWeek(Week week)
    {
        this.week = week;
    }

    public Time getStartTime()
    {
        return startTime;
    }

    public void setStartTime(Time startTime)
    {
        this.startTime = startTime;
    }

    public Time getEndTime()
    {
        return endTime;
    }

    public void setEndTime(Time endTime)
    {
        this.endTime = endTime;
    }

    public TimeSpan getTimeSpan()
    {
        return timeSpan;
    }

    public void setTimeSpan(TimeSpan timeSpan)
    {
        this.timeSpan = timeSpan;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public void calculateTimeSpan()
    {
        this.timeSpan = new TimeSpan(startTime, endTime);
    }

    public void calculateEndTime()
    {
        this.endTime = new Time(timeSpan.getTimeSpan()/60, timeSpan.getTimeSpan()%60);
    }

    public boolean timeOverlaps(Interval i)
    {
        if(this.getDate().equals(i.getDate()) || this.getWeek().cumulative(i.getWeek()))
        {
            if((this.getStartTime().getFourDigitTime() <= i.getStartTime().getFourDigitTime() && this.getEndTime().getFourDigitTime() >= i.getStartTime().getFourDigitTime()) || (this.getStartTime().getFourDigitTime() <= i.getEndTime().getFourDigitTime() && this.getEndTime().getFourDigitTime() >= i.getEndTime().getFourDigitTime()) || (this.getStartTime().getFourDigitTime() <= i.getStartTime().getFourDigitTime() && this.getEndTime().getFourDigitTime() >= i.getEndTime().getFourDigitTime()))
            {
                return true;
            }
        }
        return false;
    }
}
