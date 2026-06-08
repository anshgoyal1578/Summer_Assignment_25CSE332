//This program prints the number triangle.
//sample output: 1
//               12
//               123
//               1234
//               12345




import java.util.*;


public class numbertriangle
{
    
    public static void main(String[] args)
    {

        int i,j;

        for(i=1;i<=5;i++) //outer loop controls the number of rows.
        {
            
            for(j=1;j<=i;j++) //inner loop prints the number per row.

                {

                    System.out.print(j);
                
                }

                System.out.println("");


        }
    }
}