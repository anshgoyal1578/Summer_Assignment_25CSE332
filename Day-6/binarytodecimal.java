//This program will convert binary number to decimal number.


import java.util.*;

public class binarytodecimal
{

    public static void main(String[] args)
    {

        int bin,dec=0,a,i=0;

        Scanner ob=new Scanner(System.in);

        System.out.println("Enter binary number");

        bin=ob.nextInt();

        while(bin!=0)
        {

            int rem=bin%10;
            dec=dec+rem*(int)Math.pow(2,i);
            bin/=10;
            i++;
        }

        System.out.println("The decimal number is : "+dec);

        ob.close();


    }
}