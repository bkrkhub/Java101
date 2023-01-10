
import java.util.Scanner;

public class KDV8 {

	public static void main(String[] args) {

		double tutar, kdvliFiyat, kdv = 0.18;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen KDV'siz ürün Tutarını Giriniz.");
		tutar = input.nextDouble();
		kdvliFiyat = tutar + (tutar*kdv);
		System.out.println("Ürünün KDV'li Fiyatı: " + kdvliFiyat + "\nİyi Günler Dileriz.");
		
		
		
	}

}
