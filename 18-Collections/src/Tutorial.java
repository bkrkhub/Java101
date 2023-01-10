
public class Tutorial {
	/*int[] a = new int[3];
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] = 1;*/
	
	// Burada bir array olusturduk ve olusturdugumuz arrayimiz'e bir yeni eleman ekleyemiyoruz.
	// Dinamik array olsa daha güzel olurdu. 
	// Arrayimiz icerisinde farklı tiplerde veri tutmak istiyoruz.
	// ya da 10bin lik veri arrayimiz var icerisinden 1 elemana ulasmak istiyoruz. Her seferde 10bin donecek miyiz ?
	// verileri sırasız tutmak istiyoruz. Aynı nesneden 2 tane olmasın ya da kurallara tabi olmasın istiyoruz.
	// bu sorunlara cozum olarak collentionslar ortaya cıkmıstır.
	
	// Collections --> Element adı verilen nesneleri gruplar halinde temsil eden bir yapıdır.
	
	// set interface --> küme --> birden fazla aynı türden veri kabul etmez. --> Null kabul eder.
		
		// set altında  AbstractSet, HashSet, LinkedHashSet, TreeSet bulunmaktadır. Aralarında kullanım farklılıkları vardır.
	
	// list interface --> liste --> kararkteristik özellikleri tekrarlı elementlere izin verir.
		// elementleri ekleme sırasına göre tutabiliyor. Indexler ile ekleme yapabiliyoruz.
		// 2 ve 3. indexe gidip direk "a" yazabiliyoruz. Duplicate izni var.
	
		// list interface altında --> ArrayList, VectorList, LinkedList bulunmaktadır.

	
	// Queue Interface --> FIFO --> First in First Out --> İlk Giren İlk Çıkar.

	
	// Map Interface --> key, value mantıgı vardır. --> arr[0] == key / arr[0] eşitliği de value oluyor.
	
		// Map Interface altinda --> HashMap, LinkedHashMap, TreeMap bulunmaktadır.
}
