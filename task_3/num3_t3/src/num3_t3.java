abstract class Shape {

    protected String    color;
    protected boolean   filled;

    public Shape() {
        color  = "red";
        filled =true;
    }

    public Shape(String color, boolean filled) {
        this.color  = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString() {
        // StringBuilder sb        = new StringBuilder();
        // Formatter     formatter = new java.util.Formatter(sb);
        // formatter.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
        // return sb.toString();
        return String.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
    }
}

class Rectangle extends Shape {

    protected  double width;
    protected  double length;

    public Rectangle() {
        super();
        width  = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width  = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width  = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        // StringBuilder sb        = new StringBuilder();
        // Formatter     formatter = new java.util.Formatter(sb);
        // formatter.format("A Rectangle with width = %d and length = %d, which is a subclass of %s"
        //                 , width, length, super.toString());
        // return sb.toString();
        return String.format("A Rectangle with width = %f and length = %f, which is a subclass of %s"
                , width, length, super.toString());
    }
}

class Circle extends Shape {

    protected  double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        // StringBuilder sb        = new StringBuilder();
        // Formatter     formatter = new java.util.Formatter(sb);
        // formatter.format("A Circle with radius = %d, which is a subclass of %s"
        //                 , radius, super.toString());
        // return sb.toString();
        return String.format("A Circle with radius = %f, which is a subclass of %s"
                , radius, super.toString());
    }
}

class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        // return "A Square with side="+getSide()
        //      + ", which is a subclass of "+super.toString();
        return String.format("A Square with side = %f , which is a subclass of %s"
                , width, super.toString());
    }
}

class num3_t3 {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());        // ERROR: class Shape does not have getRadius() method !!!

        Circle c1 = (Circle)s1;                    // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape();  // ERROR: Shape is abstract; cannot be instantiated

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());          // ERROR: class Shape does not have getLength() method !!!

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());   // ERROR: class Shape does not have getSide() method !!!

        // Take note that we downcast Shape s4 to Rectangle,
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());    // ERROR: class Rectangle does not have getSide() method !!!
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }

}