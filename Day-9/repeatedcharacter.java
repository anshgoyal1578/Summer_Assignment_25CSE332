// A program to Print repeated character pattern.
// sample output : A
//                 BB
//                 CCC
//                 DDDD
//                 EEEEE

import java.util.*;

public class repeatedcharacter
{

    public static void main(String[] args)
    
    {
        int i,j;
        
        for(i=65;i<=69;i++)// outer handles the number of rows.
        {

            for(j=65;j<=i;j++)// inner loop handle rows.
            {
                System.out.print((char)i);
            }

            System.out.println("");

        }
    }

}
