//This program finds out the factor of given number.


import java.util.*;


public class factors

{

    public static void main(String[] args)
    {

        int i,num;

        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the number");

        num=ob.nextInt();

        for(i=1;i<=num;i++)
        {

            if(num%i==0)
            {
                
                System.out.println(i);
                

            }
        }

        ob.close();
        
    }
    
}