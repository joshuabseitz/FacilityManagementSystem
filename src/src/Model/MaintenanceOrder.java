package src.Model;

public class MaintenanceOrder {
    private int priority;
    private String detail;
    private Date requestDate;
    private Date orderDate;
    private int cost;

    public MaintenanceOrder(MaintenanceRequest MaintReq, Date orderDate, int cost)
    {
        this.priority = MaintReq.getPriority();
        this.detail = MaintReq.getDetail();
        this.requestDate = MaintReq.getRequestDate();
        this.orderDate = orderDate;
        this.cost = cost;
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

    public Date getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
