import java.util.*;

public class largeSmallNumber
{
    public static void main(String[] args)
    {

        int max,min,size,i;

        Scanner ob= new Scanner(System.in);
        System.out.println("Enter size");

        size=ob.nextInt();

        int number[] =new int[size];

        for(i=0;i<size;i++)
        {
            System.out.println("Enter element");
            number[i]=ob.nextInt();


        }
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;

        for(i=0;i<size;i++)
        {
            if(number[i]>max)
            {
                max=number[i];
            }

            if(number[i]<min)
            {
                min=number[i];
            }

        }

        System.out.println("The maximum value in array is : "+max);

        System.out.println("The minimum value in the array is : "+min);

        ob.close();

        
    }
}