/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Tu Ech
 */
public class TestThread {
    public static void main(String[] args) {
        try {
            OddThread t1 = new OddThread();
            EvenThread t2 = new EvenThread();
            t1.start();
            t1.join();
            t2.start();
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }
    }
}
