
public class OgretimUyesi extends Akademisyen{
	
	String unvan;

	public OgretimUyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String unvan) {
		super(adSoyad, eposta, telefon, bolum, gorevler, ders);
		this.unvan = unvan;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	@Override
	public String giris() {
		return this.unvan + " " + super.giris();
	}
	
	@Override
	public void derseGir() {
		System.out.println(getUnvan() + " " + getAdSoyad() + " Derse Girdi.");

	}
	
}
