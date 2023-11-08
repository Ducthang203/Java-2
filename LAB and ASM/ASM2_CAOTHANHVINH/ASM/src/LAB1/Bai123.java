package LAB1;
import java.util.*;//Thu vien chua tat ca

// 1. Tao class Product . Lop cha
class Product
{
    // 2. Khai Bao Du Lieu
    private String name;// Bao mat du lieu name
    private double price;// Bao mat du lieu price
    
    // 3. Construstor: giong ten lop
    public Product() {}

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }
    
    // 4. Getter Setter: Getter: Lay Ra; Setter: Gan Vao

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
}

// 8. Khong danh thue nhap khau . Lop con
class NoTaxProduct extends Product
{
    @Override
    public double getImportTax()
    {
        return 0;
    }
}

public class Bai123
{
    public static void main(String[] args) 
    {
        Product a = new Product();
        a.nhap();
        a.xuat();
        
        Product b = new Product();
        b.nhap();
        b.xuat();
        
        Product c = new NoTaxProduct();
        c.nhap();
        c.xuat();
        
        Product d = new Product();
        d.nhap();
        d.xuat();
        
        Product e = new Product();
        e.nhap();
        e.xuat();
    }
}

