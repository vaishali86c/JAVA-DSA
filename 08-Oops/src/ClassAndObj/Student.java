package ClassAndObj;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Student {
    int rollNo;
    String name;
    int marks;

    Student () {
        this.rollNo = 20;
        this.marks = 90;
        this.name = "vaishali chavan";
    }
    Student (int roll, int mark, String naam) {
        this.rollNo = roll;
        this.marks = mark;
        this.name = naam;
    }

    public static void main(String[] args) {

        Student[] std = new Student[5];
        Student vaishali = new Student(34, 89, "vaishali");


        System.out.println(vaishali.marks);
        System.out.println(vaishali.name);
        System.out.println(vaishali.rollNo);


    }

}
