package src.Model;

public class Time
{
    private int hour;
    private int minute;

    public Time(){}

    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public int getFourDigitTime()
    {
        return (hour *100) + minute;
    }
}
