package src.DAL;

import src.Model.*;

import java.util.ArrayList;

public class UseDAO {
    public UseDAO(){}

    public boolean inUseDuringInterval(Facility f, Date d, Time start, Time end)
    {
        Interval comp = new Interval(d, start, end);
        for(Interval i : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
        {
            if(i.timeOverlaps(comp))
            {
                return true;
            }
        }
        return false;
    }

    public boolean inUseDuringInterval(Facility f, Week w, Time start, Time end)
    {
        Interval comp = new Interval(w, start, end);
        for(Interval i : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
        {
            if(i.timeOverlaps(comp))
            {
                return true;
            }
        }
        return false;
    }

    public void assignFacilityToUse(Facility f, UseRequest useRequest)
    {
        Database.db.get(f).getFacilityUse().getSchedule().getSchedule().put(useRequest, useRequest.getIntervalSlot());
    }

    public void vacateFacility(Facility f)
    {
        Database.db.get(f).getFacilityUse().getSchedule().getSchedule().clear();
    }

    public ArrayList<Inspection> listInspections(Facility f)
    {
        return Database.db.get(f).getInspections();
    }

    public UseSchedule listActualUsage (Facility f)
    {
        return Database.db.get(f).getFacilityUse().getSchedule();
    }

    public double calcUsageRate(Facility f)
    {
        float totalMinutesInUse = 0;
        double usageRate;
        for(Interval i : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
        {
            if(i.getWeek() == null)
            {
               totalMinutesInUse += i.getTimeSpan().getTimeSpan()*i.getWeek().daysInUse();
            }
            else
            {
                totalMinutesInUse += i.getTimeSpan().getTimeSpan();
            }
        }
        usageRate = totalMinutesInUse/10000;

        return usageRate;
    }
}
