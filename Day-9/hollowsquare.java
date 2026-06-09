// A program to Print hollow square pattern.
// sample output: *****
//                *   *
//                *   *
//                *   *
//                *****

import java.util.*;

public class hollowsquare
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++) // outer loop handles the number of rows.
        {
            if(i==1 || i==5) //if condition prints * in continous way when i==1 or i==5.
            {
                for(j=1;j<=5;j++) //this loop prints * when i==1 or i==5.
                {
                    System.out.print("*");
                }
            }
            else //if the contdition i==1 or i==5 fails then outer loop enters and prints *   *.
            {
                System.out.print("*   *");
            }
            System.out.print("\n");
        }
    }
}