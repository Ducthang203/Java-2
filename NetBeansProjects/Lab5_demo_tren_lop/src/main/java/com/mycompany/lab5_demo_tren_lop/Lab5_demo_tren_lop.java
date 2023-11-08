/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_demo_tren_lop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author ThangND
 */
public class Lab5_demo_tren_lop {

    public static void main(String[] args) throws FileNotFoundException, IOException {
         // khai báo biến
        try ( //  tạo 1 đối tượng
                FileInputStream fis = new FileInputStream("")) {
            // khai báo biến
            int c;
            //3 duyệt kí tự từ trong file
            while ((c = fis.read())!= -1) {
                System.out.println((char)c);//ép qua char trước khi xuất
            }
            //5 đọc xong phải đóng lại
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
         
        
    }
}
