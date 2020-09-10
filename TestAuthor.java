package practice2_1;
import java.util.Scanner;

public class TestAuthor {
     private String name;
    private String email;
    private char gender;
    private Author author;
    public TestAuthor(){
        System.out.print("Введите имя автора:\n");
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
        System.out.print("Введите email автора:\n");
        email=in.nextLine();
        System.out.print("Введите пол автора:\n");
        gender=in.next().charAt(0);
        
        author=new Author(name, email, gender);
        
        System.out.print("Результаты работы программы:\n");
        System.out.println(author.toString());
    };
}
