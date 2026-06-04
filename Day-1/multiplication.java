import java.util.*;
public class multiplication
{
    public static void main(String[] args)
    {
        int n,i;
        Scanner ob=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER WHICH TABLE IS TO BE PRINT");
        n=ob.nextInt();
        for(i=1;i<=10;i++)
        {
            int p=n*i;
            System.out.println(n+" * "+i+" = "+p);
        }
    }
}