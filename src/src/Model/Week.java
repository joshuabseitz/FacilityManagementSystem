package src.Model;

public class Week {
    //instantiates variables
    private boolean Mon;
    private boolean Tue;
    private boolean Wed;
    private boolean Thurs;
    private boolean Fri;
    private boolean Sat;
    private boolean Sun;

    //method for setting variables
    public Week(boolean Mon, boolean Tue, boolean Wed, boolean Thurs, boolean Fri, boolean Sat, boolean Sun)
    {
        this.Mon = Mon;
        this.Tue = Tue;
        this.Wed = Wed;
        this.Thurs = Thurs;
        this.Fri = Fri;
        this.Sat = Sat;
        this.Sun = Sun;
    }

    //checks for monday
    public boolean isMon()
    {
        return Mon;
    }

    //setter for monday
    public void setMon(boolean Mon)
    {
        this.Mon = Mon;
    }

    //checks for tuesday
    public boolean isTue()
    {
        return Tue;
    }

    //setter for tuesday
    public void setTue(boolean Tue)
    {
        this.Tue = Tue;
    }

    //checks for wednesday
    public boolean isWed()
    {
        return Wed;
    }

    //setter for wednesday
    public void setWed(boolean Wed)
    {
        this.Wed = Wed;
    }

    //checks for thursday
    public boolean isThurs()
    {
        return Thurs;
    }

    //setter for thursday
    public void setThurs(boolean Thurs)
    {
        this.Thurs = Thurs;
    }

    //checks for friday
    public boolean isFri()
    {
        return Fri;
    }

    //setter for friday
    public void setFri(boolean Fri)
    {
        this.Fri = Fri;
    }

    //checks for saturday
    public boolean isSat()
    {
        return Sat;
    }

    //setter for saturday
    public void setSat(boolean Sat)
    {
        this.Sat = Sat;
    }

    //checks for sunday
    public boolean isSun()
    {
        return Sun;
    }

    //setter for sunday
    public void setSun(boolean Sun)
    {
        this.Sun = Sun;
    }

    //checks that week is cumulative
    public boolean cumulative(Week w)
    {
        if(this.isMon() == w.isMon() || this.isTue() == w.isTue() || this.isWed() == w.isWed() || this.isThurs() == w.isThurs() || this.isFri() == w.isFri() || this.isSat() == w.isSat() || this.isSun() == w.isSun())
        {
            return true;
        }
        return false;
    }

    //returns total number of days a facility is in use
    public int daysInUse()
    {
        int totalDays = 0;

        if(this.isMon())
            totalDays++;
        if(this.isTue())
            totalDays++;
        if(this.isWed())
            totalDays++;
        if(this.isThurs())
            totalDays++;
        if(this.isFri())
            totalDays++;
        if(this.isSat())
            totalDays++;
        if(this.isSun())
            totalDays++;

        return totalDays;
    }
}
