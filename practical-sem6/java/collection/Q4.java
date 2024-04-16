import java.util.*;
import java.io.*;

class Student {
    int rno;
    String name;
    int age;

    public Student(int rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

class Q4 {
    public static void main(String args[]) {
        ArrayList<Student> Students = new ArrayList<>();

        Students.add(new Student(1, "Sushant", 18));
        Students.add(new Student(2, "vaishali", 21));
        Students.add(new Student(3, "duggu", 1));

        System.out.println("Student details :");
        for (Student s : Students) {
            System.out.println("Roll no: " + s.rno);
            System.out.println("Name :" + s.name);
            System.out.println("Age :" + s.age);
        }

        Collections.sort(Students, new NameComparator());
        System.out.println("Sort by name : ");
        for (Student s : Students) {
            System.out.println("Roll no: " + s.rno);
            System.out.println("Name :" + s.name);
            System.out.println("Age :" + s.age);
        }

        Collections.sort(Students, new AgeComparator());
        System.out.println("Sort by age : ");
        for (Student s : Students) {
            System.out.println("Roll no: " + s.rno);
            System.out.println("Name :" + s.name);
            System.out.println("Age :" + s.age);
        }
    }
}
