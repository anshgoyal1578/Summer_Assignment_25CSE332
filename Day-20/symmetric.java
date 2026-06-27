import java.util.*;

public class symmetric
{

    public static void main(String args[])
    {

        int i,j,n,m;
        
        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the number of rows");

        n=ob.nextInt();

        System.out.println("Enter the number of columns");

        m=ob.nextInt();

        if(n==m)
        {
            int[][] matrix1=new int[n][m];
            System.out.println("Enter the elements of matrix");
        
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    matrix1[i][j]=ob.nextInt();
                }
            }

            boolean symmetric=true;

            for(i=0;i<n;i++)
            {

                for(j=0;j<m;j++)

                {
                    if(matrix1[i][j]!=matrix1[j][i])
                    {
                        symmetric = false;
                    }
                }

                if(symmetric)
                {
                    System.out.println("The given matrix is symmetric");

                }
                else
                {
                    System.out.println("The matrix is not symmetric");
                }

            }

        }
        else{

            System.out.println("ROWS SHOULD BE EQAL TO COLUMN");
        }

        ob.close();

    }
}