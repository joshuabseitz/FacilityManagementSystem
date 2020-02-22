package src.Model;

public class Week {
    private boolean Mon;
    private boolean Tue;
    private boolean Wed;
    private boolean Thurs;
    private boolean Fri;
    private boolean Sat;
    private boolean Sun;

    public Week(){}

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

    public boolean isMon()
    {
        return Mon;
    }

    public void setMon(boolean Mon)
    {
        this.Mon = Mon;
    }

    public boolean isTue()
    {
        return Tue;
    }

    public void setTue(boolean Tue)
    {
        this.Tue = Tue;
    }

    public boolean isWed()
    {
        return Wed;
    }

    public void setWed(boolean Wed)
    {
        this.Wed = Wed;
    }

    public boolean isThurs()
    {
        return Thurs;
    }

    public void setThurs(boolean Thurs)
    {
        this.Thurs = Thurs;
    }

    public boolean isFri()
    {
        return Fri;
    }

    public void setFri(boolean Fri)
    {
        this.Fri = Fri;
    }

    public boolean isSat()
    {
        return Sat;
    }

    public void setSat(boolean Sat)
    {
        this.Sat = Sat;
    }

    public boolean isSun()
    {
        return Sun;
    }

    public void setSun(boolean Sun)
    {
        this.Sun = Sun;
    }

    public boolean cumulative(Week w)
    {
        return this.isMon() == w.isMon() || this.isTue() == w.isTue() || this.isWed() == w.isWed() || this.isThurs() == w.isThurs() || this.isFri() == w.isFri() || this.isSat() == w.isSat() || this.isSun() == w.isSun();
    }

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
