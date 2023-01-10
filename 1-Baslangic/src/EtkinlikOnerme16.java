
import java.util.Scanner;

public class EtkinlikOnerme16 {

	public static void main(String[] args) {
		
		// Hava Sıcaklığını Alacağız.
		// Sıcaklık 30 veya daha yüksekse yüzme
		// 5 ve 30 derece arasında ise sinemaya gitsin.
		// 4 ve daha az ise kayak yapmayı denesin.
		
		Scanner scan = new Scanner(System.in);
		int sicaklik;
		System.out.println("Hava Sıcaklığını Giriniz: ");
		sicaklik = scan.nextInt();
		
		if (sicaklik > 30) {
			System.out.println("Bu havada yüzmeye gidilir.");
		}
		else if (sicaklik >= 5 && sicaklik <= 30){
			System.out.println("Bu havada en iyi sinema gider.");
		}
		else {
			System.out.println("Bu havada bi kayak patlar dayım.");
		}

	}
	
}
