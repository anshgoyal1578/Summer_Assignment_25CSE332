import java.util.*;
public class rangearmstrong
{
    public static void main(String[] args)
    {
        int i,num,count=0,num1=0,num2,num3,i1;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the range");
        num=ob.nextInt();

        
        //loop for range from 1 to num.
        for(i=1;i<=num;i++)
        {




            num2=i;//copying the value of i in num2.

            //loop for counting the number of digits.
            while(num2!=0)
            {

                count++;
                num2/=10;
            


            }


            num3=i;


            //process to find armstrong.
            while(num3!=0)
            {
                i1=num3%10;
                num1+=Math.pow(i1,count);
                num3/=10;
            }






            //process to check whether number after processing is equal to number entered by user or not.
            if(num1==i)
            {
                System.out.println(i);
            }


            count=0;
            num1=0;
        }
        ob.close();
    }
}