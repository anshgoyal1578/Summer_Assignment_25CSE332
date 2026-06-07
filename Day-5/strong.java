//This program checks whether the given number is stong number or not.


import java.util.*;

public class strong

{
    public static void main(String[] args)
    {
        int num,i,sum=0,count=0,fact=1;

        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the number");

        num=ob.nextInt();

        int num1=num;

        while(num1!=0)
        {

            int rem=num1%10;

            for(i=1;i<=rem;i++)
            {

                fact*=i;
            }
            sum+=fact;

            num1/=10;
            
            fact=1;


        }

        if(sum==num)
        {

            System.out.println("The number is strong number");
        }

        else
        {

            System.out.println("The number is not strong number");
        }

        ob.close();
        
    }
} 