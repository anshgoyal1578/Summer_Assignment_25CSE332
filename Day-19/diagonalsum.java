import java.util.*;

public class diagonalsum
{

    public static void main(String args[])
    {

        int i,j,n,m,sum=0;
        
        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the number of rows");

        n=ob.nextInt();

        System.out.println("Enter the number of columns");

        m=ob.nextInt();

        int[][] matrix1=new int[n][m];
        System.out.println("Enter the elements of matrix");
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                matrix1[i][j]=ob.nextInt();
            }
        }
        System.out.println("Transpose of a matrix is :");

        for(i=0;i<n;i++)
        {

            for(j=0;j<m;j++)

            {
                if(i==j)
                {

                    sum+=matrix1[i][j];
                }

            }

        }

        System.out.println("Sum of diagonal elements of matrix is :"+sum);

        
        ob.close();

    }
}