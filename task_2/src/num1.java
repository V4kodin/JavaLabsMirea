public class num1
{
    public static void main(String[] args)
    {
        Human karl = new Human("Karl",1, 2, 2);
        System.out.println(karl.toString());
    }
}


class Human
{
    String limbs;
    private String name;
    class Head
    {
        private int count;
        public double getCount()
        {
            return this.count;
        }
        public void setCount(int count)
        {
            this.count=count;
        }
        Head(int count)
        {
            setCount(count);
        }
        @Override
        public String toString() {
            return "Head{" +
                    "count=" + count +
                    '}';
        }
    }
    class Leg
    {
        private int count;
        public double getCount()
        {
            return this.count;
        }
        public void setCount(int count)
        {
            this.count=count;
        }
        Leg(int count)
        {
            setCount(count);
        }
        @Override
        public String toString() {
            return "Leg{" +
                    "count=" + count +
                    '}';
        }
    }
    class Hand
    {
        private int count;
        public double getCount()
        {
            return this.count;
        }
        public void setCount(int count)
        {
            this.count=count;
        }
        Hand(int count)
        {
            setCount(count);
        }
        @Override
        public String toString() {
            return "Hand{" +
                    "count=" + count +
                    '}';
        }
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    Human(String name,int countH, int countL, int countA)
    {
        setName(name);
        Head head = new Head(countH);
        Leg leg = new Leg(countL);
        Hand arm = new Hand(countA);
        limbs=head.toString()+", "+leg.toString()+", "+arm.toString();
    }
    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                "limbs={" + limbs + "}" +
                '}';
    }
}