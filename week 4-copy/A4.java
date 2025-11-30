import java.util.Scanner;
public class A4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter paper size (A0 - A5): ");
        String size = scanner.nextLine();
        
        switch(size)
        {
            case "A0":
                System.out.println("841 x 1189mm");
                System.out.println("33.1 x 46.8 inches");
                break;
                
            case "A1":
                System.out.println("594 x 841 mm");
                System.out.println("23.4 x 33.1 inches");
                break;
            
            case "A2":
                System.out.println("420 x 594 mm");
                System.out.println("16.5 x 23.4 inches");
                break;
            
            case "A3":
                System.out.println("297 x 420 mm");
                System.out.println("11.7 x 16.5 inches");
                break;
                
            case "A4":
                System.out.println("210 x 297 mm");
                System.out.println("8.3 x 11.7 inches");
                break;
                
            case "A5":
                System.out.println("148 x 210 mm");
                System.out.println("5.8 x 8.3 inches");
                break;
                
            default:
                System.out.println("Invaild");
        }
    }
}