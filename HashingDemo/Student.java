package HashingDemo;


import java.util.Comparator;

public class Student implements Comparator<Student> {
    String firstName,LastName;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }




    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Student)) {
            return false;
        }

        Student user = (Student) o;

        return user.firstName.equals(firstName) &&

                user.LastName.equals(LastName);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + LastName.hashCode();
        return result;
    }

}
