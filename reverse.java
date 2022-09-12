package reverseSentence;
import java.util.*;


public class reverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Say one sentence without punctuation:");
		
		String sentence = scan.nextLine();
		
		

			
			String[] words = sentence.split(" ");
			
		for(int i = words.length-1; i>-1; i--) {
			System.out.print(words[i] + " ");

		}

		
	}
}
