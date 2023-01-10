
import java.util.Scanner;

public class Palindrom2 {

	public static void main(String[] args) {
		// kapak, yapay, yatay, teğet, 121
		
		System.out.print("Polindromik Bir Kelime Giriniz: ");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
				
		String tmp = "";
		
		for (int i = word.length()-1; i >= 0; i--) {
			tmp += word.charAt(i);
		}
		
		if(tmp.equals(word)) {
			System.out.println("Girmiş olduğunuz kelime polindromiktir.");
		}
		else {
			System.out.println("Girmiş olduğunuz kelime polindromik değildir.");
		}

	}

}
