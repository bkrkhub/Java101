
public class Main {

	public static void main(String[] args) {
		
		// Abstraction --> Soyutlama
		
		OgretimUyesi  o = new OgretimUyesi("Ahmet", "a@gmail.com", "50505511","CENG","Hoca","CENG 102","Yard. Doç.");
		//Memurlar m = new Memurlar("Veli", "v@gmail.com", "5055414561","Bilgi İslem","Tam Zamanlı");
		
		o.derseGir();
		
		
		// Asistan ve Öğretim üyesi sınıflarımızın bir üst sınıfı akademisyen sınıfıdır.
		// Akademisyen sınıfımız ara sınıfımızdır. 
		// Buradan nesne üretmek anlamsızdır. Çünkü daha spesifik olarak alt sınıflardan nesne üretilebiliyor. 
		// Akademisyen class'ının içerisinde derseGir() methodu bulunuyor.
			// Her iki alt sınıfta bu methodu kullanıyor.
		// İlk önce metodu abstract ediyor ve metot içeriğini girmiyor sadece bir kalıp oluşturuyoruz.

		// Eğer bir sınıf içeriisnde abstract bir metot varsa o sınıfı da abstract yapmak zorundayız.
		
		// Bir sınıf üretildiğinde o sınıftan nesne üretmek zorunluluk değildir. Tasarım dizaynı açısından ara birim olabilir.
		
	}

}
