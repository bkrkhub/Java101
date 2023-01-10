
public class Main {
	
	public static void main(String[] args) {
		
										// Sınıflar Arası İlişkiler
		//------------------------------------------------------------------------------------------//
		
										// Bağımlılık (Dependency) "uses a"
		
		
		A a = new A();
		B b = new B();
		
		a.run(b);
		
		// A sınıfının calisabilmesi icin b sinifindan b nesnesinin olması gerekiyor.
		// A sınıfı B sınıfına bağımlı olduğu anlamına geliyor --> Dependency
		// B çalışmadığında A'da çalışmaz veya B'de bir işlem olduğunda A'yı etkiliyecektir. --> "A uses B" --> Dependency
		
		//------------------------------------------------------------------------------------------//

										// Birleştirme (Composition) "has a"
		
		C c = new C();
		D d = new D();
		
		c.d = d;
		
		// c objesinin d niteliği d objesine eşittir.
		// c ve d birleştirilmiştir. --> Composition --> c has d
		// Bir sınıfa ait bir degisken diger sınıfın bir objesi olma durumudur.
		
		//------------------------------------------------------------------------------------------//

										// Kalıtım (Inheritance) "is a"

		// İnsan class'ı oldugunu dusunelim ve yas,kilo,boy degerlerine sahip olsun.
		// Ogretmen class'ı oldugunu dusunelim  ve ogretmen classının da nicelikleri oldugunu varsayalım.
		// Ogrenci class'ı oldugunu dusunelim ve onların da nicelikleri olsun.
		
		// Ortada 2 farklı ogretmen ve ogrenci olmak uzere class var ancak birbirlerine insan class'ı ile baglilar.
		// her ogrencinin yası boyu kilosu ve her ogretmenin de yası boyu kilosu var.
		
		// Bir sınıfa ait tüm nesneler aynı zamanda bir baska daha genel sınıfa aitse bu sınıflar arasında Kalıtım vardır.
		
		// Inhertitance --> Ogrenci is a İnsan --> Ogretmen is a İnsan
		
		
		//------------------------------------------------------------------------------------------//
		
		// Kodlama yapılırken sınfılar arası bağımlılığın minimuma indirilmesi kod kalitesini artırır.
		// Bunun icin Design Patterns'lar bulunmaktadır.
	}
	
	
	
	
	
}
