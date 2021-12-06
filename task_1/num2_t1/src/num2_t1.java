public class num2_t1
{
    // low accuracy
    public static void main(String[] args)
    {
        double sum = 0;
        double sum2 = 0;
        for (float i=1; i<11; i++)
        {

            sum += (1 / i);
            sum2+=sum;


            System.out.print((int) i+" член ряда="+sum + "; ");
        }

        System.out.println("\nСумма первых 10 членов гармонического ряда:" + sum2);

    }

}
