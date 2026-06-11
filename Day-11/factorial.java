import java.util.*;

public class factorial
{

    public static void factorialNumber(int n)
    {
       int fact=1;

        for(int i=1;i<=n;i++)
        {

            fact=fact*i;
        }

        System.out.println("Factorial of a number is : "+fact);
    }


    public static void main(String[] args)
    {

        int n;


        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the number");

        n=ob.nextInt();

        factorialNumber(n);

        ob.close();
    }


}

