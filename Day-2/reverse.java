import java.util.*;
public class reverse
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




        System.out.println("Reverse of a number="+rev);


        ob.close();

        
    }
}