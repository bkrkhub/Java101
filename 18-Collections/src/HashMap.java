
import java.util.*;

public class HashMap {
// -clear() Map icinde bulunan tum degerleri siler.
// - get(object key) Anahtara karşılık gelen objeyi döndürür.
// - put(object key, object value) : Anahtar - değer ikilisini kayıt eder.
	
// Aynı key'den birden fazla olmaz.
// veriler hashlenerek tutuluyor --> FIFO yok.
	
	public static void main(String[] args) {
		
		java.util.HashMap b = new java.util.HashMap<>();
		
		b.put("Turkiye", "Ankara");
		b.put("Fransa", "Paris");
		b.put("İngiltere", "Londra");
		
		// Mapimizde 3 veri oluştu. Bunlar içerisinde gezmek için set'e çevirmemiz lazım.
		
		java.util.Set s = b.entrySet();
		java.util.Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => " + item.getValue());
		}
		
		

	}

}
