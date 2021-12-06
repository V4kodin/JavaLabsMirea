import java.util.Arrays;
import java.util.Random;


public class num3_t1
{
    // print array func
    private static void Array_out(String text, int[]a)
    {

        System.out.print(text);
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");

    }

    // random array by random
    private static int[]  random_array(int len)
    {
        int[] Array = new int[len];

        for (int i=0; i<len; i++)
        {
            int a = (int) Math.round(Math.random()*200 - 100);
            Array[i] = a;
        }
        return Array;
    }

    // random array by Random
    private static int[] random_array(int len, int del)
    {
        int[] Array = new int[len]; // array of random numbers
        Random random = new Random();
        for (int i = 0; i < Array.length; i++)
        {
            int num = random.nextInt(del*2)-del;
            Array[i] = num;
        }
        return Array;
    }


    // main
    public static void main(String[] args)
    {
        int del = 100; //delta of random numbers in array
        int len = 100; //lenght of array
        int[] Array = random_array(len);
        int[] Array2 = random_array(len, del);

        Array_out( "Array=", Array);
        Arrays.sort(Array);
        Array_out("Array sorted=", Array);
        System.out.print("\n");
        Array_out( "Array2=", Array2);
        Arrays.sort(Array2);
        Array_out("Array sorted2=", Array2);


    }

}