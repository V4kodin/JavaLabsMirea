public class num5_t1
{



    public static void main(String[] args)
    {
        book lol = new book(); // new object of class
        lol.name = "Lol";
        lol.pages = 1337;
        lol.author = "Me";
        lol.displayInfo();
    }
}

class book
{
    int pages;
    String name;
    String author;
    // display description of exemplar book class
    void displayInfo()
    {
        System.out.printf("Name: %s \tPages: %d \tAuthor: %s\n", name, pages, author);
    }

}