import java.util.*;

public class transpose
{

    public static void main(String args[])
    {

        int i,j,n,m;
        
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
        System.out.println("T   ranspose of a matrix is :");

        for(j=0;j<m;j++)
        {

            for(i=0;i<n;i++)

            {

                System.out.print(matrix1[i][j]+" ");
            }

            System.out.println("");

        }
        ob.close();

    }
}