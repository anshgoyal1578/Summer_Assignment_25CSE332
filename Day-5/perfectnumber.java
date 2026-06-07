//This program check whether the inputed number is perfect number or not.

import java.util.*;

public class perfectnumber
{

    public static void main(String[] args)
    {

        int num,sum=0,i;

        Scanner ob= new Scanner(System.in);
        
        System.out.println("Enter number");

        num=ob.nextInt(); //Take the number from user.


        //loop for finding sum of factors


        for(i=1;i<num;i++)
        {

            if(num%i==0)
            {

                sum+=i;

            }
        }


        //checking whether the given number is perfect number or not.

        
        if(sum==num)
        {
            System.out.println("The number is a perfect number");
        }

        else
        {

            System.out.println("The number is not a perfect number");
        }

        ob.close();
    }
}
