package Practice;

public class practice {
    public static void main(String[] args) {

        // store 5 roll no
        int[] rollno = new int[5];

        // store 5 name

        String[] name = new String[5];

        //store 5 rollno,mark,name

        int[] rollnum = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        //combine to a single entity --- do it with the help of class

        Student vaishali = new Student(13,"vaishali chavan",3.3f);
        //Student sakshi = new Student();
        //System.out.println(sakshi.rollnum);


//        vaishali.rollnum = 13;
//        vaishali.names = "vaishali chavan";
//        vaishali.marks = 53;


        System.out.println(vaishali.rollnum);
        System.out.println(vaishali.marks);
        System.out.println(vaishali.names);
    }
}

//create a class

class Student {
    int rollnum;
    String names;
    float marks;

    Student(int rollnum,String names,float marks) {
        this.rollnum = rollnum;
        this.marks = marks;
        this.names = names;
    }

}
