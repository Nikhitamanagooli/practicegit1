import java.time.LocalDate;
public class Employee_details extends person{
private double bonus;
public Employee_details(String name,int Employee_ID,double salary, double bonus){
    this.bonus= bonus;
}
public double gettotalsalary()
{
return bonus;
}
@Override
public void person_name()
{
    super.person_name();
    System.out.println("bonus"+bonus);
    System.out.println("total salary"+gettotalsalary());
}
public static void main(String[] args) {
    {
        Employee_details e1 = new Employee_details("john doe", 1010, 80000, 1500);
        e1.person_name();
        person p1= new person();
        p1.person_name();
        LocalDate dob = LocalDate.of(2004,6 , 16);
        p1.person_age(dob);
    }
}
}
