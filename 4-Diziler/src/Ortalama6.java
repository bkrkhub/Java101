
import java.util.Scanner;

public class Ortalama6 {

	public static void main(String[] args) {
		
		int[] notlar = new int[7];
		int toplam = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hoşgeldiniz! Lütfen Notlarınızı Sırasıyla Giriniz.");
		System.out.print("Matematik: ");
		notlar[0] = scan.nextInt();
		System.out.print("Türkçe: ");
		notlar[1] = scan.nextInt();
		System.out.print("Fizik: ");
		notlar[2] = scan.nextInt();
		System.out.print("Tarih: ");
		notlar[3] = scan.nextInt();
		System.out.print("Kimya: ");
		notlar[4] = scan.nextInt();
		System.out.print("Biyoloji: ");
		notlar[5] = scan.nextInt();
		System.out.print("Edebiyat: ");
		notlar[6] = scan.nextInt();
		
		for(int not: notlar) {
			toplam += not;
		}
		System.out.println("Ortalamanız: " + (toplam / notlar.length));
		
	}

}
