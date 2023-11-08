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
public class Lab8Bai1 {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(5);
        obj.add(5.5);
        obj.add(true);
        obj.add("Hello");
        int in = (Integer)obj.get(0);
        double d = (Double)obj.get(1);
        boolean b = (Boolean)obj.get(2);
        String s = (String)obj.get(3);
        System.out.println("Integer: "+in);
        System.out.println("Double: "+d);
        System.out.println("Boolean: "+b);
        System.out.println("String: "+s);
    }
}
