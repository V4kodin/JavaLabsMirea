public class num3
{
    public static void main(String[] args)
    {
        Ball ball1 = new Ball(10, 10);
        System.out.println(ball1.toString());
        ball1.move(10, 5);
        System.out.println(ball1.toString());
        Ball ball2 = new Ball();
        System.out.println(ball2.toString());
    }
}


class Ball
{
    private double x=0.0;
    private double y=0.0;

    public double getX()
    {
        return this.x;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setY(double y)
    {
        this.y=y;
    }
    public void setXY(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public void move(double xDisp, double yDisp)
    {
        setXY(x+xDisp, y+yDisp);
    }
    Ball()
    {

    }
    Ball(double x, double y)
    {
        setXY(x, y);
    }
    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}