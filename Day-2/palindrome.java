import java.util.*;
public class palindrome
{
    public static void main(String[] args)
    {
        int rev=0, n;
        Scanner ob=new Scanner(System.in);


        System.out.println("Enter the number");


        n=ob.nextInt();// The number input by the user is stored in n

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
        ob.close();

        
    }
}