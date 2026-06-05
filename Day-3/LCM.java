//program to find LCM of two numbers entered by user.


import java.util.*;
public class LCM
{
    public static void main(String[] args)
    {
        int a,b,temp,a1,b1,LCM;

        Scanner ob=new Scanner(System.in);


        System.out.println("Enter the value of a");
        a=ob.nextInt();


        System.out.println("Enter the value of b");
        b=ob.nextInt();
        

        a1=a;//copying the value of a


        b1=b;//copying the value of b

        //procedure to find GCD
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }


        //procedure to find LCM
        LCM=(a1*b1)/a;


        System.out.println("The value of LCM is"+LCM);

        ob.close();
    }
}