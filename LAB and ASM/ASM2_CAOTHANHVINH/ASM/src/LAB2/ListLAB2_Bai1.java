package LAB2;

public class ListLAB2_Bai1 
{
    private String ID;
    private String FullName;
    private String Country;
    private String Gender;
    private String Status;

    public ListLAB2_Bai1() {}

    public ListLAB2_Bai1(String ID, String FullName, String Country, String Gender, String Status) 
    {
        this.ID = ID;
        this.FullName = FullName;
        this.Country = Country;
        this.Gender = Gender;
        this.Status = Status;
    }

    public String getID() 
    {
        return ID;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public String getFullName() 
    {
        return FullName;
    }

    public void setFullName(String FullName) 
    {
        this.FullName = FullName;
    }

    public String getCountry() 
    {
        return Country;
    }

    public void setCountry(String Country) 
    {
        this.Country = Country;
    }

    public String getGender() 
    {
        return Gender;
    }

    public void setGender(String Gender) 
    {
        this.Gender = Gender;
    }

    public String getStatus() 
    {
        return Status;
    }

    public void setStatus(String Status) 
    {
        this.Status = Status;
    }
}
