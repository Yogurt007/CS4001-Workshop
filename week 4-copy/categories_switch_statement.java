import java.util.Scanner;

public class categories_switch_statement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float markedPrice, sellingPrice;
        char category;
        float discount = 0;

        System.out.print("Enter the marked price: ");
        markedPrice = sc.nextFloat();
        
        System.out.println("Enter the category (A, B, C, D): ");
        category = sc.next().charAt(0);

        switch (category) {
            case 'A':
            case 'a':
                discount = 60;
                break;
            case 'B':
            case 'b':
                discount = 40;
                break;
            case 'C':
            case 'c':
                discount = 20;
                break;
            case 'D':
            case 'd':
                discount = 10;
                break;
            default:
                System.out.println("Invalid category!");
                return;
        }

        sellingPrice = markedPrice - (markedPrice * discount / 100);
        System.out.println("Selling price = " + sellingPrice);
    }
}