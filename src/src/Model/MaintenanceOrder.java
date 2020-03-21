package src.Model;

public class MaintenanceOrder {
    //instantiates variables
    private int priority;
    private String detail;
    private Date requestDate;
    private Date orderDate;
    private int cost;

    //method for setting variables
    public MaintenanceOrder(MaintenanceRequest MaintReq, Date orderDate, int cost)
    {
        this.priority = MaintReq.getPriority();
        this.detail = MaintReq.getDetail();
        this.requestDate = MaintReq.getRequestDate();
        this.orderDate = orderDate;
        this.cost = cost;
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

    //getter for maintenance order date
    public Date getOrderDate()
    {
        return orderDate;
    }

    //setter for maintenance order date
    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    //getter for maintenance cost
    public int getCost()
    {
        return cost;
    }

    //setter for maintenance cost
    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
