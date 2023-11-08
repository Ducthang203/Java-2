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
public class MyThread implements Runnable{
    @Override
    public void run() {
         for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() +i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        MyThread ob1 = new MyThread();
        MyThread ob2 = new MyThread();      
        Thread th1 = new Thread(ob1);
        Thread th2 = new Thread(ob2);
        th1.setName("Thread 1: ");
        th2.setName("Thread 2: ");
        th1.setPriority(Thread.MAX_PRIORITY);       
        th2.setPriority(Thread.MIN_PRIORITY);      
        th1.start();
        th2.start();
    }
}
