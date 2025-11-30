import java.util.Scanner;
public class Scholarship
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter attendance percentage (0 - 100): ");
        double attendancePercent = scanner.nextDouble();

        System.out.print("Enter attitude score (1-10): ");
        int attitudeScore = scanner.nextInt();

        scanner.close();
        
        if (gpa >= 3.2) 
        {
            if (attendancePercent > 80) 
            {
                if (attitudeScore < 5) 
                {
                    System.out.println("The student is eligible.");
                } 
                else 
                {
                    System.out.println("The student is not eligible (Attitude score requirement failed).");
                }
            } 
            else 
            {
                System.out.println("The student is not eligible (Attendance requirement failed).");
            }
        }
        else 
        {
            System.out.println("The student is not eligible (GPA requirement failed).");
        }
    }
}