
public class Akademisyen extends Calisan{
	// Burada extends dedigimizde akademisyeni calisanin bir alt sinifi ilan ettik.
	
	String bolum,gorevler;
	String ders;
	
	 
	
	
	public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders) {
		
		// Burada Akademisyen constructor yapısını oluşturmak için bir üst sınıf constructor yapısını da çağırmamız lazım.
		super(adSoyad, eposta, telefon);
		// Bunu da super diyerek belirtiyoruz.
		
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.ders = ders;
	}

	public void derseGir() {
		System.out.println("Derse Girildi.");
	}


	public String getBolum() {
		return bolum;
	}

	public String giris() {
		return super.giris()+ " A kapısından !";
		// Ust sınıfımızda giris methodu vardı ancak tekrar spesifik olusturarak 
			// method overriding yaptık.
	}


	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}
	
}
