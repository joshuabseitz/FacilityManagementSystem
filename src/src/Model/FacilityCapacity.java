package src.Model;

public class FacilityCapacity{
    private String name;
    private int facilityCapacity;
    private int squareFeet;

    public FacilityCapacity(String name, int facilityCapacity, int squareFeet)
    {
        this.name = name;
        this.facilityCapacity = facilityCapacity;
        this.squareFeet = squareFeet;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getFacilityCapacity()
    {
        return facilityCapacity;
    }

    public void setFacilityCapacity(int facilityCapacity)
    {
        this.facilityCapacity = facilityCapacity;
    }

    public int getSquareFeet()
    {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }
}
