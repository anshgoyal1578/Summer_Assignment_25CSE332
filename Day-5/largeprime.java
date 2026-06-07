//This program contains the largest prime number upto a given range.

import java.util.*;

public class largeprime
{
    public static void main(String[] args)
    {

        int i,num,count=0,j,max=0;
        
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the number");

        num=ob.nextInt();

        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {

                if(i%j==0)
                    count++;

            }
            if(count==2) 
            {
                if(i>max)
                {
                    max=i;
                }

            }
            count=0;

        }

        System.out.println("The greatest prime number in a given range is : "+max);

        ob.close();
    
    
    }
}