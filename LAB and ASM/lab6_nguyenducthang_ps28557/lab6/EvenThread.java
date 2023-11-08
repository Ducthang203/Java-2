/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;
/**
 *
 * @author teo
 */
public class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }               
            try{
                Thread.sleep(15);
            }catch(InterruptedException e){
                break;
            }
        }
    }   
}
