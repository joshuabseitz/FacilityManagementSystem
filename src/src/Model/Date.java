package src.Model;

public class Date {
    //instantiates variables
    private int month;
    private int day;
    private int year;
    
    //setter method for month, day, and year
    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date() {}

    //getter for month variable
    public int getMonth()
    {
        return month;
    }

    //setter for month variable
    public void setMonth(int month)
    {
        this.month = month;
    }

    //getter for day variable
    public int getDay()
    {
        return day;
    }

    //setter for day variable
    public void setDay(int day)
    {
        this.day = day;
    }

    //getter for year variable
    public int getYear()
    {
        return year;
    }

    //setter for year variable
    public void setYear(int year)
    {
        this.year = year;
    }

    //checks given date with set date
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
    
    //returns date
    public String toString()
    {
        return this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
    }
}

