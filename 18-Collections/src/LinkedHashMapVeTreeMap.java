
import java.util.*;

public class LinkedHashMapVeTreeMap {

	public static void main(String[] args) {
		// LinkedHashMap'te FIFO var. HashMap'ten farkı bu.
		// TreeMap'te ise sırala içerisinde sıralama bulunuyor.
		
		System.out.println("------------- LinkedHashMap -------------");

		
		java.util.LinkedHashMap ogr = new java.util.LinkedHashMap();
		ogr.put("Ali", 90);
		ogr.put("Veli", 70);
		ogr.put("Ahmet", 85);
		
		java.util.Set set = ogr.entrySet();
		
		java.util.Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry item = (Map.Entry) i.next();
			System.out.println(item.getKey() + " => " + item.getValue()); 
		}
		
		System.out.println("------------- TreMap -------------");
		
		
		java.util.TreeMap ogr1 = new java.util.TreeMap();
		ogr1.put(10, 90);
		ogr1.put(5, 70);
		ogr1.put(6, 85);
		
		java.util.Set set1 = ogr1.entrySet();
		
		java.util.Iterator j = set1.iterator();
		
		while(j.hasNext()) {
			Map.Entry item = (Map.Entry) j.next();
			System.out.println(item.getKey() + " => " + item.getValue()); 
		}
		
		// Comparator yazılarak sıralama spesifik olarak yapılabilir ya da değiştirilebilir.
		
	}

}
