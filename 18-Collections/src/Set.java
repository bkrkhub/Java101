import java.util.HashSet;
import java.util.Iterator;

public class Set {
	// Hashset
				// LinkedHashSet
				// TreeSet
			
			
			// f(x) = x^2 * xmod7 * sqrt(x) --> icerisine deger attıkca çıktı alacagız.
				// Aslında ürettiğimiz değerlere kimlik üretiyoruz.
					
					// a'nın ASCII table char degeri 97 dir.
					// 97 yi f(x) in icerisine atti ve karsiliginda bir deger cikartti
					// hashlengidi icin ciktiya gitti ve a geldi.
					// kisacasi hashleyerek siraya girdigi icin girilen şekilde çıkması beklenemez korunma garantisi yoktur.
			
			public static void main(String[] args) {
					
					HashSet h = new HashSet();
					h.add("12 Str");
					h.add(12);
					// Arrayde bunu yapamazdık ama Hashset'te bunu yapabiliyoruz. Farklı veri tiplerini kabul ediyor.
					h.add(12.0);
					h.add(false);
					h.add(null);
					h.add(12);
					// Hashset duplicate kabul etmez.
					h.remove("12 Str");
					System.out.println(h.contains(12));
					System.out.println("-------------------");
					System.out.println(h.size()); // --> 4 cıktısı gelecek.
					System.out.println("-------------------");
					Iterator itr = h.iterator();
					// set'e ait iterator nesnesini itr icerisine aktardik.
					
					while(itr.hasNext()) {
						// itr.hasNext ile bir sonraki elemente gecme islemi yapıyoruz. Yoksa duruyor.
						
						System.out.println(itr.next());
						System.out.println("-------------------");
						// null'ı en son girmemize ilk cıktı kısacası sıralama yok.
						// h.remove(0) deseydik silmezdi. Cunku sıralama hash'e gore indis yok.
						// h.remove("12 Str") dersek anlar ve silebilir.
						// h.clear() ile icerisini bosaltiriz.
						// h.contains() ile icerisinde bulunma durumu --> booleann ciktisi.
					}
					// h.forEach(item -> System.out.println(item + " ")); 
					// Bu da aynı donguyu yaptı. Iterator icerisinde default olarak var gibi dusunebiliriz.

					
			
			
			
			}
}