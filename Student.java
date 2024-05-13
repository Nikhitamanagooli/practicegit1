import java.time.*;
import java.util.Scanner;
public class Student{
    public void stud_name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a student name");
        String name = sc.nextLine();
        System.out.println("Name:"+name);
        }
    public void stude_age(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int year = Period.between(dob, today).getYears();
        System.out.println("current date:"+today);
        System.out.println("date of birth:"+dob);
        System.out.println("age:"+year);
    }       
}
class student_details{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.stud_name();
        LocalDate dob = LocalDate.of(2004,6,16);
        s1.stude_age(dob);
    }
}