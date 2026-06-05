////program to find GCD of two numbers

import java.util.*;
public class GCD
{
    public static void main(String[] args)
    {
        int a,b,temp;

        Scanner ob=new Scanner(System.in);


        System.out.println("Enter the value of a");
        a=ob.nextInt();


        System.out.println("Enter the value of b");
        b=ob.nextInt();
        

        //procedure to find GCD
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }


        System.out.println("The value of GCD is"+a);

        ob.close();
    }
}