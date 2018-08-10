package HashingDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String args[]) {

        List<Student> students=new ArrayList<>();
        students.add(new Student("manish","purohit"));
        students.add(new Student("dilip","purohit"));
        Collections.sort(students,new Student());

        for(Student student:students) {

            System.out.println(student.getFirstName()+" " +student.getLastName());
        }
    }


}