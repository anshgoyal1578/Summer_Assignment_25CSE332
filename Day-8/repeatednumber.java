//This program prints the  repeated number paattern.
//sample output: 1
//               22
//               333
//               4444
//               55555


import java.util.*;


public class repeatednumber
{
    
    public static void main(String[] args)
    {

        int i,j;

        for(i=1;i<=5;i++) //outer loop controls the number of rows.
        {
            
            for(j=1;j<=i;j++) //inner loop prints the number per row.

            {

                 System.out.print(i);
                
            
            }
            System.out.println("");

                
        }
    }
}