
public class Natural_Number_Do_While_Loop
{
    public static void main(String[] args)
    {
        int sum = 0;
        int i = 1;
        int limt = 10;
        
        System.out.println("Series of natural number: ");
        
        do
        {
            sum += (i * i);
            i++;
        } while ( i <= limt);
        
        System.out.println("The sum of the first ten natural number is: " + sum);
    }    
}