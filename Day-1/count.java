import java.util.*;
public class count
{
    public static void main(String[] args)
    {
        int count1=0,n,n1;
        Scanner ob=new Scanner(System.in);
        System.out.print("ENTER NUMBER");
        n=ob.nextInt();
        n1=n;
        while(n1!=0)
        {
            count1++;
            n1/=10;
        }
        System.out.println(count1);
    }
}