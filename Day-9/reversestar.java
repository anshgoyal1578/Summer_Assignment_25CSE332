// A program to Print reverse star pattern.
//Sample output:  *****
//                ****
//                ***
//                **
//                *
//

import java.util.*;

public class reversestar
{

    public static void main(String[] args)
    {

        int i,j;

        for(i=5;i>=1;i--)//outer loop controls the number of rows.
        {

            for(j=1;j<=i;j++)//inner loop prints the character per row.

            {

                System.out.print("*");

            }

            System.out.println("");

        }
    }
}
