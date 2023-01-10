
public class HesapMakinesi1 {
	
	public int sayi1;
	// Sayi1  adinda integer tipinde HesapMakinesi class'ına ait bir nesene tanımladım.
		// Hesap makinesi class'ına ait bir değişkendir.
	
	public int sayi2;
	// Buradaki public istediğimiz herhangi bir Class'tan ulaşabilme anlamını ifade eder.
	
	private int sayi3;
	// Private olursa sadece bu Class içerisinde kullanılabilme anlamına gelir.
	
	public String renk;
	// Hesap Makinelerine renk verecegiz.
	
	// Constructor (Yapıcı)
	
	HesapMakinesi1(int sayi1, int sayi2, String renk) {
		
		this.sayi1 = sayi1;
		// this.sayi1 ile bulunduğumuz class'taki sayi1 değişkenini al ve dışarıdan gelen sayi1 değişkenine eşitle demek.
		this.sayi2 = sayi2;
		this.renk = renk;
	}
	
	public int toplama() {
		return this.sayi1 + this.sayi2;
	}
	public int cikarma() {
		return this.sayi1 - this.sayi2;
	}
	public int carpma() {
		return this.sayi1 * this.sayi2;
	}
	public int bolme() {
		return this.sayi1 / this.sayi2;
	}
	
	
	
}
