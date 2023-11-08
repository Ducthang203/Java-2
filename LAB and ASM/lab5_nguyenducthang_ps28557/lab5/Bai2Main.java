/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import Lab4.*;
import Lab5.XFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teo
 */
public class Bai2Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Teo", 5, "CNTT"));
        list.add(new Student("Bi", 7, "TKWed"));
        list.add(new Student("Gai", 8, "TkDoHoa"));
        list.add(new Student("Ti", 6, "Android"));
        
        XFile.writeObject("d:/BTJava/students.dat", list);
        
        List<Student> list2 = (List<Student>)XFile.readObject("d:/BTJava/students.dat");
        for(Student sv:list2){
            System.out.println(sv.name+"\t"+sv.marks+"\t"+sv.major+"\t"+sv.getGrade());
        }
    }
}
