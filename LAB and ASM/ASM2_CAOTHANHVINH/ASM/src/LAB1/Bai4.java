package LAB1;
import java.util.*;//Thu vien chua tat ca


// 1. Tao interface co ten la DAO
interface DAO
{
    //Chua 4 phuong thuc: insert, update, delete, select
    public void insert();
    public void update();
    public void delete();
    public void select();
}

class Product implements DAO
{
    // 2. Khai Bao Du Lieu
    private String name;
    private double price;
    
    // 3. Construstor
    public Product() {}

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }
    
    // 4. Getter Setter
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        if(name.length() == 0)
        {
            System.out.println("Name khong duoc de trong");
        }
        else
        {
            this.name = name;            
        }
    }


    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        if(price < 0)
        {
            System.out.println("Gia khong duoi 0 va khong duoc de am");
        }
        else
        {
            this.price = price;
        }
    }
    
    // 5. Tinh thue nhap khau
    public double getImportTax()
    {
        return getPrice() * 0.1;
    } 
    
    // 6. Nhap
    public void nhap()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap Ten: ");
        setName(sc.nextLine());
        
        System.out.print("Nhap Gia: ");
        setPrice(sc.nextDouble());
        System.out.println("+------------------------+");
    }
    
    // 7. Xuat
    public void xuat()
    {
        System.out.println("Ten: "+getName().toUpperCase());
        System.out.println("Gia: "+getPrice());
        System.out.println("Thue nhap khau: "+getImportTax());
        System.out.println("+------------------------+\n");
    }

    @Override
    public void insert() {
        System.out.println("Insert thanh cong");
    }

    @Override
    public void update() {
        System.out.println("Update thanh cong");
    }

    @Override
    public void delete() {
        System.out.println("Delect thanh cong");
    }

    @Override
    public void select() {
        System.out.println("Select thanh cong");
        System.out.println("+------------------------+\n");
    }
    
}

public class Bai4 
{
    public static void main(String[] args) 
    {
        Product a = new Product();
        a.nhap();
        a.xuat();
        a.insert();
        a.update();
        a.delete();
        a.select();
        
        Product b = new Product();
        b.nhap();
        b.xuat();
        b.insert();
        b.update();
        b.delete();
        b.select();
        
        Product c = new NoTaxProduct();
        c.nhap();
        c.xuat();
        c.insert();
        c.update();
        c.delete();
        c.select();
    }
}
