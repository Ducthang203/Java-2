package LAB3;

public class Student 
{
    private String Hoten;
    private double Diem;
    private String Nganh;
    
    public Student() {
    }

    public Student(String Hoten, double Diem, String Nganh) {
        this.Hoten = Hoten;
        this.Diem = Diem;
        this.Nganh = Nganh;
    }
    
    public String getGrade()
    {
        if(this.Diem < 3)
        {
            return "Kém";
        }
        if(this.Diem < 5)
        {
            return "Yếu";
        }
        if(this.Diem < 6.5)
        {
            return "Trung bình";
        }
        if(this.Diem < 7.5)
        {
            return "Khá";
        }
        if(this.Diem < 9)
        {
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    
    public boolean isBonus()
    {
        return this.Diem >= 7.5;
    }
    
    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    } 
    
}
