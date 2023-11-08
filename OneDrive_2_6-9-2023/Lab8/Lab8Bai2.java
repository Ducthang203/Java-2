package Lab8;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Lab8Bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //insert 
        for(int i=1;i<=10;i++){
            arr.add(i);
        }
        //show
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        } 
    }
}
