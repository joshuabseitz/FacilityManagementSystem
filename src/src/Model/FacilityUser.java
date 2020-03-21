package src.Model;

public class FacilityUser {
    //instantiates variables
    private String userID;
    private String userName;
    private long userPhone;
    private String userEmail;
    private String userRole;

    //method for setting variables
    public FacilityUser(String userID, String userName, long userPhone, String userEmail, String userRole)
    {
        this.userID = userID;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }

    //getter for user id
    public String getUserID()
    {
        return userID;
    }

    //setter for user id
    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    //getter for user name
    public String getUserName()
    {
        return userName;
    }

    //setter for user name
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    //getter for user phone
    public long getUserPhone()
    {
        return userPhone;
    }

    //setter for user phone
    public void setUserPhone(long userPhone)
    {
        this.userPhone = userPhone;
    }

    //getter for user email
    public String getUserEmail()
    {
        return userEmail;
    }

    //setter for user email
    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    //getter for user role
    public String getUserRole()
    {
        return userRole;
    }

    //setter for user role
    public void setUserRole(String userRole)
    {
        this.userRole = userRole;
    }
}
