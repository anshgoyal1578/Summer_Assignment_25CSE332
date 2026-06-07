// this program is based on finding the sum of digits of a number entered by the user using recursive.


import java.util.*;

public class recsum
{

    public static void main(String[] args)
    {

        int num;

        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the number");

        num=ob.nextInt();

        recsum digitsum=new recsum();

        int value=digitsum.sum(num);

        System.out.println("The sum of digits is: "+value);

        ob.close();

    }


    int sum(int n)
    {

        if(n==0)
        {

            return 0;

        }
        else
        {

            return n%10 + sum(n/10);

        }
    }
}