
public interface ICalisan {
	
	// Interface'de public degisken olusturulamaz.
	
	// Ama degistirilemez olan final tipi degisken olusturulabilir.
	
	final String uni = "MIT";
	
	public void giris();
	public void cikis();
	public boolean yemek(int saat);
	
	
	// Interface'ler kalıp oluşturmaya yarar.
	// Abstract'ta metotlar ve degiskenler tanımlayabilirken, cagirabilir ve kullanabilirken Interface'ler bu sekilde degildir.
	// Bu Interface'i kullanan yeni olusturulacak sınıflar bu kalıbı kullanmak zorundadırlar.  
}
