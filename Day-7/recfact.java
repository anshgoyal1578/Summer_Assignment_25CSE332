// This program finds factorial of the number entered by the user by recursive.


import java.util.*;

public class recfact

{

    public static void main(String[] args)

    {

        int num;
        
        Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter the value of number");

        num=ob.nextInt();

        
        recfact fact=new recfact();
        
        int value= fact.factorial(num);
        
        
        System.out.println("The factorial of given number is"+value);
        
        ob.close();
        
    }

    int factorial(int n)
    
    {
        
        if(n==1)
        
        {
          
            return 1;
        
        }
        
        else{

            return(n*factorial(n-1));
            
        
        }


    }
}