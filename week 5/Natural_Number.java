
public class Natural_Number
{
    public static void main(String[] args)
    {
        int i = 1;
        int limt = 10;
        
        System.out.println("Series of natural number: ");
        
        while (i <= limt )
        {
            int square = i * i;
            System.out.println("The square of " + i + " is " + square);
            i++;
        }
    }
}
