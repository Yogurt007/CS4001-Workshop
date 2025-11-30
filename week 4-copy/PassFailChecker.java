import java.util.Scanner;
public class PassFailChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int passingScore = 50; 

        System.out.print("Enter the student's score: ");
        int studentScore = scanner.nextInt();

        if (studentScore >= passingScore) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        scanner.close();
    }
}