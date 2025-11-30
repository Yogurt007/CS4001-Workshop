import java.util.Scanner;
public class GpaCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double gpa;
        
        System.out.println("Enter GPA : ");
        if (scanner.hasNextDouble()) 
        {
            gpa = scanner.nextDouble();
            if (gpa >= 0.0 && gpa <= 4.0) 
            {
                if (gpa >= 3.5) 
                {
                    System.out.println("Your grade is: A");
                } 
                else if (gpa >= 3.0) 
                {
                    System.out.println("Your grade is: B");
                } 
                else if (gpa >= 2.0) 
                {
                    System.out.println("Your grade is: C");
                } 
                else if (gpa >= 1.0) 
                {
                    System.out.println("Your grade is: D");
                } 
                else 
                {
                    System.out.println("Your grade is: F");
                }
            } 
            else 
            {
                System.out.println("Error: GPA must be between 0.0 and 4.0");
            }
        } else 
        {
            System.out.println("Error: Invalid input");
        }
        scanner.close();
    }    
}