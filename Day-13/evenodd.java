import java.util.*;

public class evenodd
{
    public static void main(String[] args)
    {

        int size,i,evenCount=0,oddCount=0;

        Scanner ob= new Scanner(System.in);
        System.out.println("Enter size");

        size=ob.nextInt();

        int number[] =new int[size];

        for(i=0;i<size;i++)
        {
            System.out.println("Enter element");
            number[i]=ob.nextInt();


        }

        for(i=0;i<size;i++)
        {
            if(number[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }

        }


        System.out.println("Number of even elements in array is : "+evenCount);

        System.out.println("Number of odd elements in the array is : "+oddCount);

        ob.close();

        
    }
}