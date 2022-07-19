import java.util.ArrayList;
public class Pickcard {
	
	public static void main(String args[]) {

    ArrayList<String> hand = new ArrayList<String>();
	
	for(int i = 0; i<2; i++) {
		
		if(i==0) {
		hand.add("King");
		hand.add("0");
		hand.add("4");
		hand.add("King");
		hand.add("2");
		System.out.println("Did you see it?");
		}
		System.out.println("04");
		System.out.println("s");

	}
	
	System.out.println(hand.toString());

	
}
}
