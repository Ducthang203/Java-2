/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import java.util.*; // nhớ import thư viện này nhé.

// khai báo interface
// - tất cả các phương thức trong interface đều là phương thức trừu tượng
// - phương thức trừu tượng là phương thức chỉ có tên ... ko viết code
interface DAO
{
    //phương thức chỉ có tên ... ko viết code
    public void insert();
    public void update();
    public void delete();
    public void select();
}


// tạo lớp Product
class Product implements DAO
{
    //1. khai báo dữ liệu / thuộc tính
    String name;
    double price;
    //2.1 constructor ko tham số
    // - tên giống tên lớp
    // - ko có kiểu trả về
    // - tự động kích hoạt khi 1 đối tượng được sinh ra
    public Product() {
    }
    //2.2 constructor có tham số
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
   
    //3. getter + setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
       
        if (name.length() == 0)
        {
            System.out.println("Name cannot be empty!");
        }
        else
        {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
        {
            System.out.println("Giá không được là số âm");
        }
        else
        {
            this.price = price;
        }
    }
   
    // hàm tính thuế nhập khẩu
    public double getImportTax()
    {
        return price*10/100;
    }
   
    // hành động - method - hàm nhập
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("input name : ");
        setName(s.next());
        System.out.println("input price : ");
        setPrice(s.nextDouble());
    }
    public void output()
    {
        System.out.println("name : "+ getName());
        System.out.println("price : "+ getPrice());
        System.out.println("import tax : " + getImportTax());
    }

    @Override
    public void insert() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("insert thành công");
    }

    @Override
    public void update() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("update thành công");
    }

    @Override
    public void delete() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("delete thành công");
    }

    @Override
    public void select() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("select thành công");
    }
}


// lớp con
class NoTaxProduct extends Product
{
    // viết code lại cho hành động/ method tính thuế nhập khẩu... 0 đồng
    @Override
    public double getImportTax()
    {
        return 0;
    }    
}
