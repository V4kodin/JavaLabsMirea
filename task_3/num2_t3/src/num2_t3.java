abstract class Furniture {

    public int price;
    public String size;
    public String color;


    public int getPrice() { return price; }
    public String getSize() { return size; }
    public String getColor() { return color; }

    public void setPrice(int p) { price = p; }
    public void setSize(String s) { size = s; }
    public void setColor(String c) { color = c; }


    public Furniture(int p, String s, String c) {
        this.price = p;
        this.size = s;
        this.color = c;
    }
    public abstract void displayInfo();
}

class Cupboard extends Furniture{
    public String name = "Шкаф";

    public Cupboard(int price, String size, String color) {
        super(price, size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor() +  " | Цена: " + super.getPrice());
    }
}

class Chair extends Furniture{
    public String name = "Стул";

    public Chair(int price, String size, String color) {
        super(price, size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor() +  " | Цена: " + super.getPrice());
    }
}

class Bed extends Furniture{
    public String name = "Кровать";

    public Bed(int price, String size, String color) {
        super(price, size, color);
    }
    public void displayInfo(){
        System.out.println(" Название: " + name + " | Размер: " + super.getSize() + " | Цвет: " + super.getColor() +  " | Цена: " + super.getPrice());
    }
}

class FurnitureShop {

    public void ToShop(){

            Chair c1 = new Chair(1467, "Маленький", "Пурпурный");
            Chair c2 = new Chair(8537, "Маленький", "Красный");
            c1.displayInfo();
            c2.displayInfo();
            Bed b1 = new Bed(1795, "Большой", "Черная");
            b1.displayInfo();
            Cupboard cup1 = new Cupboard(2784, " Очень большой", "Жеедтый");
            cup1.displayInfo();

    }
}

class num2_t3 extends FurnitureShop{
    public static void main(String[] args) {
        FurnitureShop a = new  FurnitureShop();
        a.ToShop();
    }
}