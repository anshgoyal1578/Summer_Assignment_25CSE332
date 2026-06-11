import java.util.*;

public class sum
{

    public static void sumNumber(int a, int b)
    {

        int s= a+b;
        System.out.println("Sum of two number is : "+s);
    }

    public static void main(String[] args)
    {

        int a,b;
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter two numbers");

        a=ob.nextInt();

        b=ob.nextInt();

        sumNumber(a,b);

        ob.close();
    }
}