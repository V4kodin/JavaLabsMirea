import java.util.Random;


public class num1_t1
{
    // print array
    private static void Array_out(int[]a)
    {

        System.out.print("Array=");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");

    }

    //sum by for
    private static long Array_sum_for(int[]a)
    {
        int sum=0;
        for (int i=0; i<a.length; i++)
        {
            sum+=a[i];
        }
        return sum;
    }

    //sum by while
    private static long Array_sum_while(int[]a)
    {
        int sum=0;
        int i=0;
        while (i!=a.length)
        {
            sum+=a[i];
            i++;
        }
        return sum;
    }

    //sum by do while
    private static long Array_sum_dowhile(int[]a)
    {
        int sum=0;
        int i=0;
        do
        {
            sum+=a[i];
            i++;
        }
        while (i!=a.length);
        return sum;
    }


    // main
    public static void main(String[] args)
    {
        int del = 100; //delta of random numbers in array
        int len = 100; //lenght of array

        int[] Array = new int[len]; // array of random numbers
        Random random = new Random();
        for (int i = 0; i < Array.length; i++)
        {
            int num = random.nextInt(del*2)-del;

            Array[i] = num;



        }
        Array_out(Array); //print array
        System.out.println("Sum of Array Calculated by for=" + Array_sum_for(Array));
        System.out.println("Sum of Array Calculated by while=" + Array_sum_while(Array));
        System.out.println("Sum of Array Calculated by do while=" + Array_sum_dowhile(Array));


    }

}
