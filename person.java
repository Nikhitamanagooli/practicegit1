import java.time.*;
import java.util.Scanner;
public class person {
    public void person_name()
    {
    Scanner sc= new Scanner(System.in);    
    System.out.println("enter student name");
    String name = sc.nextLine();
    System.out.println("name"+name);
    }
    public void person_age(LocalDate dob){
    LocalDate today = LocalDate.now();
    int year = Period.between(dob, today).getYears();
    System.out.println("curent date:"+today);
    System.out.println("dob"+dob);
    System.out.println("age"+year); 
}
}