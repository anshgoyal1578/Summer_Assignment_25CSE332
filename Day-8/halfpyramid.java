//This program prints the half pyramid.

//sample output: *
//               **
//               ***
//               ****
//               *****




import java.util.*;

public class halfpyramid

{

    public static void main(String[] args)
    {

        int i,j;

        for(i=1;i<=5;i++) //outer loop controls the number of rows.
        {
            
            for(j=1;j<=i;j++) //inner loop prints the number per row.

                {

                    System.out.print("*");
                }
                System.out.println("");

        }
    }
}