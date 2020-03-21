package src.Model;

public class Time
{
    //instantiates variable
    private int hour;
    private int minute;

    //method for setting variables
    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    //getter for hour
    public int getHour()
    {
        return hour;
    }

    //setter for hour
    public void setHour(int hour)
    {
        this.hour = hour;
    }

    //getter for minute
    public int getMinute()
    {
        return minute;
    }

    //setter for minute
    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    //getter for time
    public int getFourDigitTime()
    {
        return (hour *100) + minute;
    }
}
