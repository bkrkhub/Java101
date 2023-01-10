
public class Siniflar1 {

	public static void main(String[] args) {
		// Object Orient Programming
		
		// SinifAdi objeAdi = new SinifAdi();
		
		// HesapMakinesi makine1 = new HesapMakinesi();
		
		// Main methodumuza bir başka class'ı import ettik. 
		
		/*makine1.sayi1 = 10;
		makine1.sayi2 = 20;
		System.out.println(makine1.sayi2);
		
		HesapMakinesi makine2 = new HesapMakinesi();
		makine2.sayi1 = 20;
		System.out.println(makine2.sayi1);*/
		
		
		// Constructor (Yapıcı) Kullanımı ve Sınıf Metotları
		
		/*HesapMakinesi makine1;
		makine1 = new HesapMakinesi(1,3);
		System.out.println(makine1.sayi1 + " - " + makine1.sayi2);
		makine1.sayi1 = 5;
		System.out.println(makine1.sayi1 + " - " + makine1.sayi2);*/
		
		HesapMakinesi1 m1 = new HesapMakinesi1(10,5, "siyah");
		System.out.println(m1.toplama());
		m1.sayi1 = 8;
		System.out.println(m1.cikarma());
		
		HesapMakinesi1 m2 = new HesapMakinesi1(20,10, "mavi");
		System.out.println(m2.toplama());

	}

}
