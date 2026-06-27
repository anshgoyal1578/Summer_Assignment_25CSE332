import java.util.*;

public class Add
{

    public static void main(String args[])
    {

        int i,j,n,m,n1,m1;
        
        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the number of rows for 1");

        n=ob.nextInt();

        System.out.println("Enter the number of columns for 1");

        m=ob.nextInt();

        int[][] matrix1=new int[n][m];
        System.out.println("Enter the elements of matrix1");
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                matrix1[i][j]=ob.nextInt();
            }
        }

        System.out.println("Enter the number of rows for 2");

        n1=ob.nextInt();

        System.out.println("Enter the number of columns for 2");

        m1=ob.nextInt();

        int[][] matrix2=new int[n1][m1];


        System.out.println("Enter the elements of matrix2");
        
        for(i=0;i<n1;i++)
        {
            for(j=0;j<m1;j++)
            {
                matrix2[i][j]=ob.nextInt();
            }
        }

        if(n==n1 && m==m1)
        {

            int[][] sum=new int[n][m];

            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {

                    sum[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }

            System.out.println("Sum of two matrixes is ");

            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println("");

            }
            
        }
        else
        {
            System.out.println("NUMBER OF ROWS AND COLUMN OF MATRIX 1 SHOULD BE EQUAL TO ROWS AND COLUMN OF MATRIX 2");
        }

        ob.close();
    }
}