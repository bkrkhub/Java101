
import java.util.Scanner;

public class SwitchCase11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		int sayi = input.nextInt();
		// Kullanıcıya bir sayı girdirdik ve bunu kontrol edeceğiz switch ile.
		
		switch(sayi) {
		
		case 1:
			System.out.println("Sayı 1'e eşittir.");
			break;
		
		case 2:
			System.out.println("Sayı 2'ye eşittir.");
			break;
		case 3:
			System.out.println("Sayı 3'e eşittir.");
			break;
		
		default:
			System.out.println("Geçersiz Bir Sayı Girdiniz.");
		
		}
		
		
	}

}
