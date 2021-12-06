import java.util.Scanner;

public class num4_t1
{

    // input for numbers
    private static int numin()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        return num;
    }

    //factorial
    private static long factorial(int num)
    {
        long sum = 1;
        for (int i=1; (i-1)<num; i++)
        {
            sum*=i;
        }
        return sum;
    }

    // main
    public static void main(String[] args)
    {
    System.out.println(factorial(numin()));
    }
}
