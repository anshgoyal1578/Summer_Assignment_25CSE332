import java.util.*;

public class armstrong
{

    public static void armstrongNumber(int num)
    {

        int count=0;
        int i,num1=0,num2,num3;


        num2=num;


        while(num2!=0)
        {

            count++;
            num2/=10;
            


        }
        num3=num;

        while(num3!=0)
        {
            i=num3%10;
            num1+=Math.pow(i,count);
            num3/=10;
        }
        if(num1==num)
        {
            System.out.println("Yes the number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
    }

    public static void main(String[] args)
    {

        int num;

        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the number");

        num=ob.nextInt();

        armstrongNumber(num);

        ob.close();
        
    }
}