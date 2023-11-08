/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author teo
 */
public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("d:/BaitapJava/from.jpg");
        XFile.write("d:/BaitapJava/to.jpg", data);
    }
}
