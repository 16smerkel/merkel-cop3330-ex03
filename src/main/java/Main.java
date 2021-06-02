import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("What is the quote?");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        while (quote.length() < 1)
        {
            System.out.println("Please state the quote.");
            quote = scanner.nextLine();
        }
        System.out.println("Who said it?");
        String name = scanner.nextLine();
        while (name.length() < 1)
        {
            System.out.println("Please state the name.");
            name = scanner.nextLine();
        }
        System.out.println(name + " says, "+ '"' + quote + '"');
    }
}
