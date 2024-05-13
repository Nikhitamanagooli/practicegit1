import java.util.Scanner;
public class Course {
    public static void main(String[] args) {
        System.out.println("enter a semister");
        Scanner s =new Scanner(System.in);
        int sem = s.nextInt();
        if (sem==1)
        {
            System.out.println("course\t marks");
            System.out.println("c\t85");
            System.out.println("ml\t68");
        }
        else if(sem==2)
        {
            System.out.println("course\t marks");
            System.out.println("os\t98");
            System.out.println("c++\t79");
        }
        else if(sem==3)
        {
            System.out.println("course\t marks");
            System.out.println("devops\t78");
            System.out.println("java\t78");
        }
    }
}    
