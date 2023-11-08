package LAB2;

public class ListLAB2_Bai4 
{
    private String Username;
    private String Password;
    private String Role;
    
    public ListLAB2_Bai4() {
    }

    public ListLAB2_Bai4(String Username, String Password, String Role) {
        this.Username = Username;
        this.Password = Password;
        this.Role = Role;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    
}
