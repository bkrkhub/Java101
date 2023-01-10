
public class StringClass5 {

	public static void main(String[] args) {
		// str.length() -> Girilen Karakter Sayısını Döndürür.
		// str1.concat(str2) -> String birleştirir.
		// str.indexOf('k') -> Karakterin konumunu verir.
		// str.charAt(5) -> Konumu verilen karakteri okur.
		// str.compareTo("Kodlama") -> büyük/küçük fark duyarlı olarak karşılaştırır.
		// str.compareToIgnoreCase("KODlama") -> Büyük küçük harf duyarlı olmadan karşılaştırır.
		// str.contains("kod") -> girilen değer string içinde geçiyor mu diye kontrol eder.
		// str.endsWith("a") -> Belirtilen karakterlerle bitiyorsa True döndürür.
		// str.replace("Kodlama", "Vakti") -> String değiştirme için kullanılır.
		// str.toLowerCase(), str.toUpperCase();

		String m1 = "CODDING";
		String m2 = " TIME";
		
		System.out.println(m1.length());
		System.out.println(m1.concat(m2));
		System.out.println(m1.indexOf('D'));
		System.out.println(m1.charAt(2));
		System.out.println(m1.contains("ING"));
		System.out.println(m1.endsWith("NG"));
		
		String m3 = "DENEME MESAJI";
		
		System.out.println(m3.replace("DENEME ", "KOD "));
		System.out.println(m3.toLowerCase());
	}

}
