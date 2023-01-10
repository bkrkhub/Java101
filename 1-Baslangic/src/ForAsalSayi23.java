
import java.util.Scanner;

public class ForAsalSayi23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input;
		boolean asal = true;
		
		do {
			System.out.println("Lütfen pozitif bir sayı giriniz: ");
			input = scan.nextInt();
		}while (input < 2);
		
		for(int i=2; i < input; i++) {
			
			if(input%i==0) {
				asal = false;
				break;
			}
		
		}	
		if(asal) {
			System.out.println("Girilen Sayı: " + input + " asaldır.");
		}
		else {
			System.out.println("Girilen Sayı: " + input + " asal değildir.");
		}
			
			
		
		

	}

}
