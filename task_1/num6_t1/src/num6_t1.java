import java.util.Scanner;

public class num6_t1
{
    //input of string, later can transform to type that need
    public static String in(String out)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(out);
        String inp = in.nextLine();
        System.out.print("\n");
        //in.close(); ???????????????????????????????
        return inp;
    }

    //main
    public static void main(String[] args)
    {
        int num_dogs=Integer.parseInt(in("Введите колличество собак:"));
        Dog[] Array = new Dog[num_dogs];
        for (int i=0; i<num_dogs; i++)
        {
            Array[i] = new Dog(in("Введите имя собаки:"), Integer.parseInt( in("Введите возраст собаки:")));
        }
        int doge = Integer.parseInt(in("Выберите собаку из "+Array.length+":"))-1;
        System.out.println(Array[doge].ToString()+"\nее человеческий возраст="+Array[doge].to_Human());
    }
}


class Dog
{
    private String name;
    private int age;

    // constructor
    Dog(String n, int a)
    {
        setName(n);
        setAge(a);
    }
    //get for name
    public String  getName()
    {
        return this.name;
    }
    //set for name
    public void setName(String n)
    {
        this.name=n;
    }
    //get for age
    public int getAge()
    {
        return this.age;
    }
    //set for age
    public void setAge(int a)
    {
        this.age=a;
    }
    // return dog age in humans age
    int to_Human()
    {
        return this.age*7;
    }
    // display description of exemplar Dog class
    String ToString()
    {
        String st = ("Name: "+getName()+" \tAge: "+getAge()+"\n");
        return st;
    }
}
