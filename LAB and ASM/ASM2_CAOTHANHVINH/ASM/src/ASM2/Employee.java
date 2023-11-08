package ASM2;
import java.util.*;
import java.io.*;

public class Employee implements Serializable //implements Serializable: Mã hóa, Lưu xuống file
{
    private String MaNV;
    private String HoTen;
    private int Tuoi;
    private String Email;
    private int Luong;

    public Employee() {}

    public Employee(String MaNV, String HoTen, int Tuoi, String Email, int Luong) 
    {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.Email = Email;
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
            this.Tuoi = Tuoi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
           this.Luong = Luong;
    }
}
