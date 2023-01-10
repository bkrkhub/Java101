
import java.util.ArrayList;

public class ArrayList {
	
	// Set'lerde tekrarlanan duplicate durumlara izin verilmiyordu ancak listte izin veriliyor.
	// Elementleri FIFO ile ele alıyor List. 
	// İstediğimiz indise veri ekleyebiliyorum. Arraylerin gelişmiş versiyonudur. Dinamik yapıdadır.
	// Arraylerin daha gelişmiş hali olarak görülebilir.
	
	public static void main(String[] args) {

	      // create an empty array list with an initial capacity
	      java.util.ArrayList<String> arrlist = new java.util.ArrayList<String>(5);

	      // use add() method to add elements in the list
	      arrlist.add("Ankara");
	      arrlist.add("Bolu");
	      arrlist.add("İstanbul");
	      arrlist.add("Ankara");
	      
	      //İndexli ekleme yaptık.
	      arrlist.add(2,"Çanakkale");
	      arrlist.add(0,"Düzce");
	      arrlist.remove(0);
	      arrlist.forEach(i -> System.out.println(i));
	      
	   }

	
	
}
