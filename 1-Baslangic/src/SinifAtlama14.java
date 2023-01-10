
import java.util.Scanner;
public class SinifAtlama14 {

	public static void main(String[] args) {

		// Türkçe, Matematik, Fen, Sosyal ve İngilizce notlarını girsin.
		// Notların ortalaması hesaplansın
		// Ortalama 50'den aşağı ise sınıfta kalsın değilse sınıfı geçsin.
		
		double turkce,matematik,fen,sosyal,ingilizce,ortalama;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Türkçe Not Ortalamanızı Giriniz: ");
		turkce = scan.nextDouble();
		System.out.print("Matematik Not Ortalamanızı Giriniz:");
		matematik = scan.nextDouble();
		System.out.print("Fen Bilgisi Not Ortalamanızı Giriniz:");
		fen = scan.nextDouble();
		System.out.print("Sosyal Bilgiler Not Ortalamanızı Giriniz:");
		sosyal = scan.nextDouble();
		System.out.print("İngilizce Not Ortalamanızı Giriniz:");
		ingilizce = scan.nextDouble();
		
		ortalama = (turkce+matematik+fen+sosyal+ingilizce) / 5;
		if (ortalama < 50) {
			System.out.println("Sınıfta Kaldınız ! Tekrar okursun abisi");
		}
		else {
			System.out.println("Tebrikler Sınıfı Başarılı Bir Şekilde Geçtiniz.");
		}
		System.out.println("Dönem Ortalamanız: " + ortalama);

		
	}

}
