import java.util.*;
public class palindrome
{
    public static void palindromeNumber(int n)
    {

        int rev=0;

        //copying the value of n in n1
        int n1=n;

        //procedure to find the reverse
        while(n1!=0)
        {

            int rem = n1%10;
            rev=rev*10+rem;
            n1/=10;

        }





        //checking the condition of palindrome
        if(rev==n)
        {
            System.out.println("The given number is palindrome");
        }
        else
        {
            System.out.println("The given number is not palindrome");
        }

        
    }

    public static void main(String[] args)
    {

        int n;

        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the number");

        n=ob.nextInt();

        palindromeNumber(n);

        ob.close();
    }
}