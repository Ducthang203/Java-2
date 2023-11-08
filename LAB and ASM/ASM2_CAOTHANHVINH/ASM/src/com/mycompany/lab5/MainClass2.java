/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;
import java.io.IOException;

public class MainClass2 {
    public static void main(String[] args){ 
        String path  = "studen.dat";
        Student sv = new Student("nam",9,"cntt");
        try {
            LAB5.witeObj(path, sv);
            System.out.println("Thanh Cong");
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
