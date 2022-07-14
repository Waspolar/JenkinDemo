import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What do you want me to say?");
        String message = scan.nextLine();
        System.out.println(message);
    }
}