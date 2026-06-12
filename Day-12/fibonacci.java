//program to find fibonacci series

import java.util.*;

public class fibonacci
{
    public static void FibonacciNumber(int n)
    {
        int a=0,b=1,temp,i;


        if(n==1)
        {
            System.out.println(a);

        }
        else if(n==2)
        {
            System.out.println(a+"\n"+b);
        }
        else
        {
            System.out.println(a+"\n"+b);
            for(i=3;i<=n;i++)
            {
                temp=a+b;
                System.out.println(temp+" ");
                a=b;
                b=temp;
            }
        }

    }

    public static void main(String[] args)
    {
        int n;

        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=ob.nextInt();
        
        FibonacciNumber(n);

        ob.close();
    }
}