/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThangND
 */
public class MainClass {
    public static void main(String[]args){
        try {
            byte [] data = LAB5.read("F:\\JAVA 2\\LAB and ASM\\LAB5\\LAB5\\note1.txt");
            LAB5.write("note2.txt", data);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
