import javax.xml.namespace.QName;
import java.util.Scanner;

public class num2_t2
{


    public static void main(String[] args)
    {
        Author karl = new Author("Karl", "123@yahoo.com", 'm');
        System.out.println(karl.toString());
    }



}

class Author
{
    private String name;
    private String email;
    char gender;
    Author(String name, String email, char gender)
    {
        setName(name);
        setEmail(email);
        setGender(gender);
    }
    private String  getName()
    {
        return this.name;
    }
    private void setName(String n)
    {
        this.name=n;
    }
    private void setEmail(String e)
    {
        this.email=e;
    }
    private String getEmail()
    {
        return this.email;
    }
    private void setGender(char g)
    {
        this.gender=g;
    }
    private char getGender()
    {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}