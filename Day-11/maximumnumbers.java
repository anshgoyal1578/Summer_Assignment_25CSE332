//This program finds the maximum of two numbers using functions.

import java.util.*;

public class maximumnumbers

{

    public static void maxNum(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else if(a==b)
        {
            System.out.println("Both the numbers are equal");
        }

        else
        {
            System.out.println(b+" is greater than "+a);
            
        }
    }

    public static void main(String[] args)
    {

        int a,b;
        Scanner ob=new Scanner(System.in);

        System.out.println("ENTER THE VALUE OF A AND B");

        a=ob.nextInt();

        b=ob.nextInt();

        maxNum(a,b);

        ob.close();

    }
}