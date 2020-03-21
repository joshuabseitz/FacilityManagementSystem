package src.Model;

public class Interval {

    //instantiates variables
    private Week week;
    private Time startTime;
    private Time endTime;
    private TimeSpan timeSpan;
    private Date date;

    //method for setting variables
    public Interval(Week week, Time startTime, Time endTime)
    {
        this.week = week;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeSpan = new TimeSpan(startTime, endTime);
    }

    //method for setting variables
    public Interval (Week week, Time startTime, TimeSpan timeSpan)
    {
        this.week = week;
        this.startTime = startTime;
        this.timeSpan = timeSpan;
        this.endTime = new Time(timeSpan.getTimeSpan()/60, timeSpan.getTimeSpan()%60);
    }

    //method for setting variables
    public Interval(Date date, Time startTime, Time endTime)
    {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeSpan = new TimeSpan(startTime, endTime);
    }

    //method for setting variables
    public Interval(Date date, Time startTime, TimeSpan timeSpan)
    {
        this.date = date;
        this.startTime = startTime;
        this.timeSpan = timeSpan;
        this.endTime = new Time(timeSpan.getTimeSpan()/60, timeSpan.getTimeSpan()%60);
    }

    //getter for week
    public Week getWeek()
    {
        return week;
    }

    //setter for week
    public void setWeek(Week week)
    {
        this.week = week;
    }

    //getter for start time
    public Time getStartTime()
    {
        return startTime;
    }

    //setter for start time
    public void setStartTime(Time startTime)
    {
        this.startTime = startTime;
    }

    //getter for end time
    public Time getEndTime()
    {
        return endTime;
    }

    //setter for end time
    public void setEndTime(Time endTime)
    {
        this.endTime = endTime;
    }

    //getter for timespan
    public TimeSpan getTimeSpan()
    {
        return timeSpan;
    }

    //setter for timespan
    public void setTimeSpan(TimeSpan timeSpan)
    {
        this.timeSpan = timeSpan;
    }

    //getter for date
    public Date getDate()
    {
        return date;
    }

    //setter for date
    public void setDate(Date date)
    {
        this.date = date;
    }

    //calculates the time span of the given interval
    public void calculateTimeSpan()
    {
        this.timeSpan = new TimeSpan(startTime, endTime);
    }

    //calculates the end time of given interval
    public void calculateEndTime()
    {
        this.endTime = new Time(timeSpan.getTimeSpan()/60, timeSpan.getTimeSpan()%60);
    }

    //checks to see if the intervals overlap
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
