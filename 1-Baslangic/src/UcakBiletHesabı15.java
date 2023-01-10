
import java.util.Scanner;

public class UcakBiletHesabı15 {

	public static void main(String[] args) {
		
		// Km Birim Fiyatı: 0.10$
		// 12 yaşından küçükse toplam fiyata %50 indirim
		// 12 ve 24 yaş arasında ise %10 indirim
		// 65+ ise %30 indirim
		// Gidiş Dönüş alırsa %20 indirim
		// Tüm bu koşullara göre bilet fiyatını hesaplayacağız

		Scanner scan = new Scanner(System.in);
		int km,yas,tip;
		System.out.println("Mesafeyi Giriniz: ");
		km = scan.nextInt();
		System.out.println("Yaşınızı Giriniz: ");
		yas = scan.nextInt();
		System.out.println("Yolculuk Tipini Seçiniz (1= Tek Gidiş, 2= Gidiş Dönüş) :");
		tip = scan.nextInt();
		
		double normalFiyat, yasIndirimi, tipIndirimi;
		
		if (km > 0 && yas > 0 && (tip ==1 || tip ==2)) {
			System.out.println("Girdiler Doğru");
			
			normalFiyat = km * 0.10;
			if (yas < 12) {
				yasIndirimi = normalFiyat * 0.5;
			}
			else if (yas >= 12 && yas <= 24) {
				yasIndirimi = normalFiyat * 0.10;

			}
			else if (yas >= 65) {
				yasIndirimi = normalFiyat * 0.30;
			}
			else {
				yasIndirimi = 0;
			}
			normalFiyat -= yasIndirimi;
			
			if (tip == 2) {
				tipIndirimi = normalFiyat * 0.20;
				normalFiyat = (normalFiyat -tipIndirimi) * 2;
			}
			System.out.println("Bilet Tutarı: " + normalFiyat + "$");
			}
		else {
			System.out.println("Girdiler Yanlış");
		}
		
		
	}

}
