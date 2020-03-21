package src.Model;

public class MaintenanceRequest {
    //instantiates variables
    private int priority;
    private String detail;
    private Date requestDate;

    //method for setting variables
    public MaintenanceRequest(int priority, String detail, Date requestDate)
    {
        this.priority = priority;
        this.detail = detail;
        this.requestDate = requestDate;
    }

    //getter for maintenance priority
    public int getPriority()
    {
        return priority;
    }

    //setter for maintenance priority
    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    //getter for maintenance detail
    public String getDetail()
    {
        return detail;
    }

    //setter for maintenance detail
    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    //getter for maintenance request date
    public Date getRequestDate()
    {
        return requestDate;
    }

    //setter for maintenance request date
    public void setRequestDate(Date requestDate)
    {
        this.requestDate = requestDate;
    }
}
