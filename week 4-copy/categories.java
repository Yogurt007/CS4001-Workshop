import java.util.Scanner;
public class categories
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
        
        if (category == 'A' || category == 'a')
        {
            discount = 60;
        }
        else if (category == 'B' || category == 'b')
        {
            discount = 40;
        }
        else if (category == 'C' || category == 'c')
        {
            discount = 20;
        }
        else if (category == 'D' || category == 'd')
        {
            discount = 10;
        }
        else 
        {
            System.out.println("Invaild category!");
            return;
        }
        
        sellingPrice = markedPrice - (markedPrice * discount / 100);
        
        System.out.println("Selling price = " + sellingPrice);
    }
}