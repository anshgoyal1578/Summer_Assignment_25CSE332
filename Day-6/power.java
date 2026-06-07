//This program is use to Find x^n without pow().

import java.util.*;

public class power
{
    public static void main(String[] args)
    {

        Scanner ob=new Scanner(System.in);

        int num1,num2,i,power=1;

        System.out.println("Enter the number whose power is to be found");

        num1=ob.nextInt();

        System.out.println("Enter the power of the number");

        num2=ob.nextInt();

        for(i=1;i<=num2;i++)
        {

            power=power*num1;
            
        }

        System.out.println("The x^n is:" +power);

        ob.close();

        
    }
}