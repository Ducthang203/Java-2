/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.Serializable;

/**
 *
 * @author ThangND
 */
public class Student implements Serializable{
    public String name;
    public double mark;
    public String major;
    public Student(String name,double mark, String major){
        this.name = name;
        this.mark = mark;
        this.major = major; 
    }
    public String getGrade(){
        if(this.mark < 3){
            return"Kem";
        }if(this.mark < 5){
            return"Trung Binh";
        }if(this.mark < 6.5){
            return"Kha";
        }if(this.mark < 7.5){
            return"gioi";
        }if(this.mark < 9){
            return"Gioi";
        }
        return"xuat xac";
    }
    public boolean isBonus(){
        return this.mark >= 7.5;
    } 
}
