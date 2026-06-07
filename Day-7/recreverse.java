// This program finds the reverse of a number entered by user using recursive.


import java.util.*;

public class recreverse

{

    public static void main(String[] args)
    {

        int num;
        
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the number");

        num= ob.nextInt();

        recreverse rev= new recreverse();
        
        int value = rev.reverse(num,0);
        
        System.out.println("The reverse of number is :"+value);

        ob.close();
    
    }

    int reverse(int n,int r)

    {

        if(n==0)
        {
            
            return r;
            
        }

        else
        {
            
            return reverse(n/10,r*10+n%10);
        
        }


    }
}