/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab8;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class personModel<T> {
    public ArrayList<T> li = new ArrayList<T>();
    public void addObject(T object){
        li.add(object);
    }
    public void display(){
        for(T e:li){
            System.out.println(e);
        }
//          for(int i=0;i<li.size();i++){
//              System.out.println(li.get(i));
//          }
    }
    public static void main(String[] args) {
        personModel<student> ob1 = new personModel<student>();
        student st1 = new student(1, "Trong", 24);
        student st2 = new student(2, "Thong", 20);
        ob1.addObject(st1);
        ob1.addObject(st2);
        ob1.display();
        //--------
        personModel<employee> ob2 = new personModel<employee>();
        employee emp1 = new employee(3, "Ha", 650);
        employee emp2 = new employee(4, "Dong", 700);
        ob2.addObject(emp1);
        ob2.addObject(emp2);
        ob2.display();
        //-------
        personModel<String> ob3 = new personModel<String>();
        ob3.addObject("Phuc");
        ob3.addObject("Linh");
        ob3.display();
        //------
        personModel<Integer> ob4 = new personModel<Integer>();
        ob4.addObject(4);
        ob4.addObject(5);
        ob4.display();
    }   
    
}
