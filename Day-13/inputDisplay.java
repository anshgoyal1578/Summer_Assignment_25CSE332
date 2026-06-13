import java.util.*;

public class inputDisplay

{

    public static void main(String[] args)
    {

        Scanner ob= new Scanner(System.in);

        System.out.println("Enter the size of array");

        int size =ob.nextInt();

        ob.nextLine();

        String name[] = new String[size];

        int i;

        for(i=0; i<size;i++)
        {
            System.out.println("Enter name");
            name[i]=ob.nextLine();
        }

        System.out.println("The names in the array are :");

        for(i=0;i<size;i++)
        {
            System.out.println(name[i]);
        }

        ob.close();


    }
}