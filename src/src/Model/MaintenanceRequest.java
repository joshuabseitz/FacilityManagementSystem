package src.Model;

public class MaintenanceRequest {
    private int priority;
    private String detail;
    private Date requestDate;

    public MaintenanceRequest(){}

    public MaintenanceRequest(int priority, String detail, Date requestDate)
    {
        this.priority = priority;
        this.detail = detail;
        this.requestDate = requestDate;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public Date getRequestDate()
    {
        return requestDate;
    }

    public void setRequestDate(Date requestDate)
    {
        this.requestDate = requestDate;
    }
}
