package src.Model;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public boolean olderThan(Date t)
    {
        if(this.getYear() < t.getYear())
        {
            return true;
        }
        else if(this.getYear() > t.getYear())
        {
            return false;
        }
        else
        {
            if(this.getMonth() < t.getMonth())
            {
                return true;
            }
            else if(this.getMonth() > t.getMonth())
            {
                return false;
            }
            else
            {
                if(this.getDay() < t.getDay())
                {
                    return true;
                }
                else if(this.getDay() > t.getDay())
                {
                    return false;
                }
            }
        }
        return true;
    }
    public String toString()
    {
        return this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
    }
}

