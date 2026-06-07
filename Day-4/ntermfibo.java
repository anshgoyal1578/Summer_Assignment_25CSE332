//program to find fibonacci series of nth term

import java.util.*;

public class ntermfibo
{
    public static void main(String[] args)
    {
        int a=0,b=1,temp,i,n;


        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=ob.nextInt();


        if(n==1)
        {
            System.out.println(a);

        }
        else if(n==2)
        {
            System.out.println(b);
        }
        else
        {
            for(i=3;i<=n;i++)
            {
                temp=a+b;
                a=b;
                b=temp;
            }
            System.out.println(b);

        }

        ob.close();
    }
}