/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ASMGD1_NGUYENDUCTHANG_PS28557;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 
 */
public class XFile {   
    // Hàm read(String path)
    // - input đầu vào : đường dẫn tên file ...vi du d:/ngoctrinh.jpg
    // - output : trả về mảng byte[] data
    public static byte[] read(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available(); //n là kích thước file
            byte[] data = new byte[n]; // cấp phát mảng byte[] kích thước n
            fis.read(data); // đọc file ra mảng data
            fis.close(); // đọc xong nhớ đóng lại.
            return data; // trả về mảng data
        }catch(Exception e){
           throw new RuntimeException(e);
        }
    }
    // hàm ghi
    // - input : đường dẫn file hình, ..mảng byte[] data
    public static void write(String path, byte[] data){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data); // ghi mảng data xuống file hình 
            fos.close();  //ghi xong nhớ đóng lại
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    // Hàm readObject(String path)
    // - input đầu vào : đường dẫn và tên file ... ví dụ e:/student.dat
    // - output đầu ra : là đối tượng Object 
    public static Object readObject(String path){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject(); // đọc đối tượng
            ois.close();  // đọc xong đóng lại
            return object; // trả về Object đã đọc từ file
        }catch(Exception e){
            throw new RuntimeException(e);
        }       
    }
    // Hàm writeObject(String path, Object object)
    // - Ghi đối tượng object xuống file path
    public static void writeObject(String path, Object object){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object); // ghi đối tượng xuống file
            oos.close();  // ghi xong rồi nhớ đóng lại.
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
