package Module3;

public class Student {
    String name;
    int marks;
    void studentDetails(){
        System.out.println("Name of Student is : " + name);
        System.out.println("Marks of student is : " + marks);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Liki";
        s1.marks=97;
        s1.studentDetails();
        s2.name="Nischitha";
        s2.marks=100;
        s2.studentDetails();
    }
}
