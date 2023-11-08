/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class LAB5 {

    public static void main(String[]args){

    }
    
    public static byte[] read(String path) throws FileNotFoundException, IOException {
        byte[] data;
        try (FileInputStream fis = new FileInputStream(path)) {
            int length = fis.available();
            data = new byte[length];
            fis.read(data);
        }
        return data;
    }

    public static void write(String path, byte[] data) throws FileNotFoundException, IOException {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data);
            fos.close();
        }
    }

    public static Object reaObj(String path) throws IOException, ClassNotFoundException {
        try (
                FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis);) {
            return ois.readObject();
        }

    }

    public static void witeObj(String path, Object data) throws FileNotFoundException, IOException {
        try (
                ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(path));
                ){
                      OOS.write((int) data);
                }
    }
}
