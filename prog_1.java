import java.util.*;
public class prog_1
{
    public static void main ()
    {
        Scanner x = new Scanner(System.in);
        int [] values = new int [4];

        values [0] = x.nextInt();

        for(int i = 1;i<4;i++)
        {
            values [i] = ((values [i-1]*10)+(values [0]));
        }

        for(int i = 1;i<4;i++)
        {
            System.out.println("Numbers:"+values [i]);
        }
        int sum = 0;

        for(int i = 1;i<4;i++)
        {
            sum = sum + values[i];
        }

        System.out.println("Sum:"+sum);

    }
}

