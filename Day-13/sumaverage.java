import java.util.*;

public class sumaverage
{
    public static void main(String[] args)
    {

        int size,i,sum=0;

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
            sum+=number[i];

        }

        double average= (double)sum/size;

        System.out.println("The sum of array is : "+sum);

        System.out.println("The average value of the array is : "+average);

        ob.close();

        
    }
}