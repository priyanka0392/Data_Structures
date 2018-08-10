package HashingDemo;


import java.util.HashSet;

public class HashEqualDemo {

    public static void main(String args[]) {

        HashSet<Student> students=new HashSet();
        students.add(new Student("manish","purohit"));
        students.add(new Student("dilip","purohit"));
        students.add(new Student("dilip","purohit"));

        for(Student student:students)
        {
            System.out.println(student.getFirstName());
        }

    }
}