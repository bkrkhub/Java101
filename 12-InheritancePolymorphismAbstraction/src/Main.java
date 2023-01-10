
public class Main {

	public static void main(String[] args) {
		// Inheritance --> Kalıtım.
		// Polymorphism --> Çok Biçimlilik.
		
		Akademisyen a = new Akademisyen("Mehmet","m@gmail.com","5050564165","CS","Hoca","CS-101");
		OgretimUyesi  o = new OgretimUyesi("Ahmet", "a@gmail.com", "50505511","CENG","Hoca","CENG 102","Yard. Doç.");
		Memurlar m = new Memurlar("Veli", "v@gmail.com", "5055414561","Bilgi İslem","Tam Zamanlı");
		
		Calisan[] girisListesi = {a,o,m};
		
		Calisan.listele(girisListesi);
		
		// İşte bu polymorphism oluyor.
		// Bir tek metot adıyla, birden çok farklı  metotları koşturma özeliğine, java’da polymorphism denir.   
		// Bir üst sınıfın referansı (işaretçi, pointer) bir alt sınıfa ait nesneyi işaret edebilir. 
		// Java, bu özelliği kullanarak, run-time aşamasında hangi overridden metodu seçmesi gerektiğini bulur. 
		
	}

}
