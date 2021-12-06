

abstract class Dish{


    public String size;
    public String color;



    public String getSize() { return size; }
    public String getColor() { return color; }

    public void setSize(String s) { size = s; }
    public void setColor(String c) { color = c; }

    public Dish(String s, String c) {
        this.size = s;
        this.color = c;
    }
    public abstract void displayInfo();
}

class Plate extends Dish{
    public String name = "Тарелка";

    public Plate(String size, String color) {
        super(size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor());
    }
}

class Cup extends Dish{
    public String name = "Кружка";

    public Cup(String size, String color) {
        super(size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor());
    }
}

class DeepPlate extends Dish{
    public String name = "Глубокая тареклка";

    public DeepPlate(String size, String color) {
        super(size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor());
    }
}

public class num1_t3 {
    public static void main(String[] args) {
        Plate c1 = new Plate("Маленькая", "Белая");
        DeepPlate c2 = new DeepPlate("Маленькая", "Черная");
        Cup c3 = new Cup("Большая", "Розовая");
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}
