//This program prints the character triangle.
//sample output: A
//               AB
//               ABC
//               ABCD
//               ABCDE


import java.util.*;


public class chartriangle
{
    
    public static void main(String[] args)
    {

        int i,j;

        for(i=65;i<=69;i++) //outer loop controls the number of rows.
        {
            
            for(j=65;j<=i;j++) //inner loop prints the character per row.

            {

                 System.out.print((char)j);
                
            
            }
            System.out.println("");

                
        }
    }
}