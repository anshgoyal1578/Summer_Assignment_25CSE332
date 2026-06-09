// A program to Print reverse number triangle.

//sample output:  12345
//                1234
//                123
//                12
//                1
//

import java.util.*;

public class reversenumber
{

    public static void main(String[] args)
    {


        int i,j;

        for(i=5;i>=1;i--)// outer loop handles number of rows.
        {

            for(j=1;j<=i;j++)// inner loop handles rows.
            {
                System.out.print(j);
            }

            System.out.println("");
        }

    }

}
