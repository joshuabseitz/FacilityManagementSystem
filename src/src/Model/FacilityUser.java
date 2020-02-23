package src.Model;

public class FacilityUser {
    private String userID;
    private String userName;
    private long userPhone;
    private String userEmail;
    private String userRole;

    public FacilityUser(String userID, String userName, long userPhone, String userEmail, String userRole)
    {
        this.userID = userID;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public long getUserPhone()
    {
        return userPhone;
    }

    public void setUserPhone(long userPhone)
    {
        this.userPhone = userPhone;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public String getUserRole()
    {
        return userRole;
    }

    public void setUserRole(String userRole)
    {
        this.userRole = userRole;
    }
}
