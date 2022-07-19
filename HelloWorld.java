import java.util.*;

public class HelloWorld {
	
	
	 
	public void run() {
		
        System.out.println("I want you to say my name!");

	}

	
    public static void main(String[] args) {
    	
    	
        System.out.println("Hello, World!"); 
        Scanner scan = new Scanner(System.in);
        
        MyThread a = new MyThread("Goku");
        MyThread b = new MyThread("Naruto");

        
        System.out.println("What do you want me to say?");
        
        a.start();
        b.start();
        
        
    }
}