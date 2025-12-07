import java.util.Scanner;
public class Qn_Eight
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter a number to generate its multiplication table: ");
        
        if (scanner.hasNextInt()) 
        {
            int number = scanner.nextInt();  

            System.out.println("--- Multiplication Table for " + number + " ---");

            for (int i = 1; i <= 10; i++) 
            {
                System.out.printf("%d * %d = %d%n", number, i, (number * i));
            }
        } 
        else 
        {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
