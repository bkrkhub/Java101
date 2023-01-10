
public class Asistan extends Akademisyen{
	
	protected String yuksekLisans;

	public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String ders,
			String yuksekLisans) {
		super(adSoyad, eposta, telefon, bolum, gorevler, ders);
		this.yuksekLisans = yuksekLisans;
	}

	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}
	
	public String giris() {
		return "Asistan " + super.giris();
	}

}
