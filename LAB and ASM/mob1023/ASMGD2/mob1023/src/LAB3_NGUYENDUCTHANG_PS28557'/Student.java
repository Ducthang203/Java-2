/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;





public class Student {

    //1. khai báo dữ liệu 
    public String name;
    public double marks;
    public String major;

    //2. constructor
    public Student() {
    }

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    //3. hàm lấy ra học lực
    
    public String getGrade() {
        if (this.marks < 3) {
            return "Kém";
        }
        if (this.marks < 5) {
            return "Yếu";
        }
        if (this.marks < 6.5) {
            return "Trung bình";
        }
        if (this.marks < 7.5) {
            return "Khá";
        }
        if (this.marks < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    //4. hàm tính thưởng
    // - trả về là true : có phần thưởng
    // - trả về false : không có phần thưởng
    public boolean isBonus() {
        return this.marks >= 7.5;
    }
}

