import java.util.*;

public class prime
{

    public static void primeNumber(int n)
    {

        int i,count=0;

        for(i=1;i<=n;i++)
        {

            if(n%i==0)
            {

                count++;
            }
        }

        if(count==2)
        {
            System.out.println("THE GIVEN NUMBER "+n+" IS A PRIME NUMBER");
        }

        else{

            System.out.println("The given number is not a prime number.");
        }
    }

    public static void main(String[] args)
    {

        int n;

        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the number");

        n=ob.nextInt();

        primeNumber(n);

        ob.close();
    }
}