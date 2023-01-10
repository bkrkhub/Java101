
import java.util.*;
public class HesapMakinesi12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2,secim;
		
		System.out.println("İlk Sayıyı Giriniz: ");
		sayi1 = scan.nextInt();
		
		System.out.println("\nİkinci Sayıyı Griniz: ");
		sayi2 = scan.nextInt();
		
		System.out.println("\nLütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
		System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
		
		System.out.print("Seçiminizin Rakamsal Karşılığını Giriniz: ");
		secim = scan.nextInt();
		
		if (secim==1) {
			System.out.println("Toplam İşlemi Sonucu: " + (sayi1 + sayi2));
		}
		else if (secim == 2) {
			System.out.println("Çıkarma İşlemi Sonucu: " + (sayi1 - sayi2));
		}	
        else if (secim == 3) {
        	System.out.println("Çarpma İşlemi Sonucunu: " + (sayi1 * sayi2));
        }
        else if (secim == 4) {
        	if (sayi2 == 0) {
        		System.out.println("İkinci Sayı 0'a eşittir ve sonuç belirsizdir !");
        	}else {
            	System.out.println("Bölme İşlemi Sonucu: " + (sayi1 / sayi2));
        	}
        }else {
        	System.out.println("Geçersiz Bir İşlem Girdiniz!");
        }
		
	}
    

}
