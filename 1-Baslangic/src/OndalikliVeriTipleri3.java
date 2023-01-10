
public class OndalikliVeriTipleri3 {
	public static void main(String[] args) {
		
		float sayi1 = 14.0f; 
		// Java double ve float'i bu sekilde ayirir. 
			// Kisacasi float tanimlarken degisken degeri sonuna f ya da F yazilir.
		
		float sayi2 = 35f;
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi2);
		// 35 yazsak bile 35.0 olarak gorur cunku float tipinde.
		
		double doubleSayi = 3;
		double doubleSayi2 = 3.15123123123123123123;
		System.out.println(doubleSayi);
		System.out.println(doubleSayi2);
		// Tekrardan doubleSayi adinda bir double degisken tanimlarsak sistem error verir.
			// Cunku Java'da kod okuması sirasiyla gider.
		doubleSayi = 25;
		System.out.println(doubleSayi);
		// Ancak degisken tipi vermeden duplicate satir olmadigi icin tanim yapabiliriz.

		
	}
}
