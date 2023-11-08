/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class personModel11<T> {
    public ArrayList<T> li = new ArrayList<T>();
    public void addObject(T object){
        li.add(object);
    }
    public void display(){
//        for(T e:li){
//            System.out.println(e);
//        }
          for(int i=0;i<li.size();i++){
              System.out.println(li.get(i));
          }
    }
    public static void main(String[] args) {
        personModel11<student> ob1 = new personModel11<student>();
//        student st1 = new student(1, "Trong", 24);
//        student st2 = new student(2, "Thong", 20);
//        ob1.addObject(st1);
//        ob1.addObject(st2);
        Scanner in=new Scanner(System.in);
        System.out.print("Nhap vao so sinh vien: ");
        int svamount=in.nextInt();
        for (int i=0;i<svamount;i++){
            System.out.print("Nhap vao id: ");
            int id=in.nextInt();
            System.out.print("Nhap vao ten: ");
            String name=in.next();
            System.out.print("Nhap vao tuoi: ");
            int age=in.nextInt();
            student st=new student(id,name,age);
            ob1.addObject(st);
        }
        ob1.display();
        //--------
        personModel11<employee> ob2 = new personModel11<employee>();
        employee emp1 = new employee(3, "Ha", 650);
        employee emp2 = new employee(4, "Dong", 700);
        ob2.addObject(emp1);
        ob2.addObject(emp2);
        ob2.display();
        //-------
        personModel11<String> ob3 = new personModel11<String>();
        ob3.addObject("Phuc");
        ob3.addObject("Linh");
        ob3.display();
        //------
        personModel11<Integer> ob4 = new personModel11<Integer>();
        ob4.addObject(4);
        ob4.addObject(5);
        ob4.display();
    }   
    
}
