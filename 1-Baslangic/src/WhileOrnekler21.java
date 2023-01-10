
import java.util.Scanner;

public class WhileOrnekler21 {

	public static void main(String[] args) {
		
		
		// Ornek1 --> 1'den 100'e kadar çift sayıları ekrana yazan program
		
		// Ornek2 --> Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
			// ve girilen değerlerden tek sayıları toplayan program

		// Ornek3 --> Girilen sayıya kadar olan 2'nin kuvvetleri.
		
		//----------------------------------------------------------------------------------------------------------
		
		/* ÖRNEK 1
		int i = 1;
		while (i<=100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
			
		}
		*/
		
		//----------------------------------------------------------------------------------------------------------
		
		/* ÖRNEK 2
		Scanner scan = new Scanner(System.in);
		int toplam=0;
		int input;
		
		while(true) {
			System.out.print("Lütfen Sayı Giriniz: ");
			input = scan.nextInt();
			
			if (input < 0) {
				System.out.println("Program Bitti Negatif Sayı Girdiniz.");
				System.out.println("Girilen Tek Sayılar Toplamı: " + toplam);
				break;
				
			}
			if (input%2 == 1) {
				toplam += input;
			}
		}
		*/
		
		//------------------------------------------------------------------------------------------------------------
		
		/* ÖRNEK 3
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		int input = scan.nextInt();		
		int k = 1;
		
		while (k <= input) {
			System.out.println(k);
			k  = k*2;
		}
		*/
		
		//------------------------------------------------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
	}

}
