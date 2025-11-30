import java.util.Scanner;
public class Postive_negative_zero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        double number = input.nextDouble();
        
        if(number > 0)
        {
            System.out.println(number + " is a postive number.");
        }
        else if (number <0)
        {
            System.out.println(number + " is a negative number.");
        }
        else 
        {
            System.out.println(number + " is zero.");
        }
    }
        
}