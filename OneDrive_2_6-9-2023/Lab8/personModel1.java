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
public class personModel1<T> {
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
        personModel1<student> ob1 = new personModel1<student>();
        int numbOfStudent;
        int id,age;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so sinh vien:");
        numbOfStudent=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numbOfStudent; i++) {
            System.out.println("student "+(i+1));
            System.out.print("nhap ID: ");
            id=sc.nextInt();
            System.out.print("nhap tuoi: ");
            age=sc.nextInt();
            sc.nextLine();
            System.out.print("nhap ten: ");
            name=sc.nextLine();
            ob1.addObject(new student(id,name,age));
        }
//        student st1 = new student(1, "Trong", 24);
//        student st2 = new student(2, "Thong", 20);
//        ob1.addObject(st1);
//        ob1.addObject(st2);
        System.out.println("Sinh Vien: ");
        ob1.display();
        //--------
        
        personModel1<employee> ob2 = new personModel1<employee>();        
        System.out.print("nhap so nhan vien:");
        numbOfStudent=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numbOfStudent; i++) {
            employee nv = new employee();
            System.out.println("nhan vien "+(i+1));
            System.out.print("nhap ID ");
            nv.id=sc.nextInt();sc.nextLine();
            System.out.print("nhap ten: ");
            nv.name=sc.nextLine();
            System.out.print("nhap salary: ");
            nv.salary=sc.nextDouble();
            ob2.addObject(nv);
        }
//        employee emp1 = new employee(3, "Ha", 650);
//        employee emp2 = new employee(4, "Dong", 700);
//        ob2.addObject(emp1);
//        ob2.addObject(emp2);
//        System.out.println("Nhan vien:");
        ob2.display();
        //-------
//        personModel1<String> ob3 = new personModel1<String>();
//        ob3.addObject("Phuc");
//        ob3.addObject("Linh");
//        System.out.println("String");
//        ob3.display();
    }   
    
}
