
public class Car {
	
	private int enginePower,model;
	// Burada arabanın motor gücünün ve motorunun değiştirilemez olduğunu varsalayım.
	// Burada private yazarsak sadece bu Class'ta kullanabiliriz anlamına gelir. Dışarıdan değiştirilemez hale gelir.
	public int speed;
	// Burada public dersek tüm package'lar içerisinden ulaşabiliriz bunlara.
	protected String color;
	// Burada protected dersek ise sadece bulunduğumuz 7-ErisimSaglayicilari package'indaki Class'lardan erisebiliriz.
	
	Car(){
		this.model = 2020;
		this.enginePower = 300;
		this.speed = 120;
		this.color = "red";
	}
	
	private void print() {
		System.out.println(model);
	}
	
	protected void run() {
		print();
	}
	
	
	
}
