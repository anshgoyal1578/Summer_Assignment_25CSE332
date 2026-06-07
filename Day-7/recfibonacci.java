//This program finds the fibonacci series upto n term entered by user using recursion.


import java.util.*;

public class recfibonacci

{

    public static void main(String[] args)
    
    {

        int num,i;

        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the number");

        num=ob.nextInt();

        recfibonacci fibo= new recfibonacci();
        
        for(i=1;i<=num;i++)
        {
            System.out.println(fibo.fibonacci(i));
        }

        ob.close();

    }

    int fibonacci(int n)
    {
        if(n==1)
        {

            return 0;
        }

        else if(n==2)
        {
            return 1;

        }

        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }

}
