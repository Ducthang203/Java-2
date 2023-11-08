/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.nio.file.Files.lines;

/**
 *
 * @author ThangND
 */
public class lab5 {
    public static byte[] read(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data; 
        }catch(Exception e){
        throw new RuntimeException(e);
        }
    }
    public static void write(String path,byte[]data){
        try{
             FileOutputStream fos = new FileOutputStream(path);
             fos.write(data);
             fos.close();
        }catch(Exception e){
        throw new RuntimeException(e);
        }
    }
    
}