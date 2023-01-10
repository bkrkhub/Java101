
public class KarakterVeMantiksal4 {
	public static void main(String[] args) {
		
		char karakter = 117;
		System.out.println(karakter);
		char karakter2 = 'u';
		System.out.println(karakter2);
		
		// Burada cift tirnak ile u versek string olarak algilayacak ve hata verecektir.
			
		// Bu sebepten char tanimlari ya ascii koduna gore ya da 'deger' arasinda verilir.
		
		// Char ile sadece ascii codu ya da karakterin 1 tanesini tutabiliriz. Bir metni tutamayiz.
		
		// ORNEK --> char a = 'Yavuz'; error verdirecektir. Bu sebepten String kullanilmaktadir.
		
		// Ancak String resmiyette bir veri tipi degildir.
		
		// Char tek tirnakla kullanilir ancak String cift tirnakla kullanilir.
		
		System.out.println("Hello World!");
		// Bu ciktinin tipi string'tir.
		
		String merhaba = "Welcome to Test!";
		System.out.println(merhaba.getClass().getName());
		System.out.println("**************************");
		
		String deneme = "Bu da bir deneme atisidir.";
		System.out.println(deneme.getClass().getSimpleName());
		System.out.println("The variable 'deneme' is the type of " + "'" +deneme.getClass().getSimpleName() + "'");
		
		// Burada string tanimlamasi ve bir degiskenin type'ini nasil gosterecegimizi ogrendik.
	
		boolean mantik = true;
		System.out.println(mantik);
		
		boolean mantik2 = false;
		System.out.println(mantik2);
		
		char abcd = 'a';
		System.out.println('a' + 15);
		// Burada 'a' ascii koddur bu sebepten degeri ele alinir ve toplanir.
			// 'a' nin degeri 97 + 15 == 112 olmaktadir.
		System.out.println("a" + 15);
		System.out.println(abcd+ 15);
		// 'a' nin degeri 97 + 15 == 112 olmaktadir.

	
	
	}	
}
