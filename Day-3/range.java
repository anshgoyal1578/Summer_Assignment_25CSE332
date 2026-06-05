//program to find range of a prime number upto a given number


import java.util.*;
public class range
{
    public static void main(String[] args)
    {
        int i, n,count=0,j;
        Scanner ob=new Scanner(System.in);


        System.out.println("Enter the number");


        n=ob.nextInt();// The number input by the user is stored in n
        



        //procedure to check whether the given number is prime or not
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(i);
            }
            count=0;
        }
        ob.close();
    }
}