
import java.util.Iterator;
import java.util.PriorityQueue;



// Hastanelerin poliklinik servislerine gittiğimiz zaman muayene olabilmek için bir sıra numarası alırız. 
// Almış olduğumuz bu sıra numaralarına göre de Doktorlar bizleri odaya alırlar.
// Genelde bu işlem first in first out şeklinde çalışır. 
// Fakat herhangi bir kronik bir rahatsızlığı olan, hamile olan ve yaşı belirli bir seviyenin üstünde veya altında olan kişiler için 
// bu sıralamada öncelik sağlandığını görmüşünüzdür. Bu yapı güncel hayatımızda kullandığımız bir priorityqueue sistemidir. 


// Size(): Kuyruğun içerisinde bekleyen öğe sayısının çıktısını döndürür.
// Comparator(): PriorityQueue yapısının öğelerini sıralayacak comparatoru verir. Eğer kuyruk yapısı doğal sıralı ise null olarak değer döndürür.




public class PriorityQueue {

	public static void main(String[] args) {
		
		String ayrac="--------------";
		///---> Generic PriorityQueue Tanımlaması <---\\\
        java.util.PriorityQueue <Integer> queue = new java.util.PriorityQueue<>();
        ///---> Kuyruk İçerisine Bazı Veriler Ekleyelim <---\\\
        queue.add(30);
        queue.offer(20);
        queue.add(10);
        queue.offer(40);
        
        ///---> Diğer Metot Yapılarını Kullanmadan Önce Kuyruğumuzdaki Verilerin Görünüşüne Bakalım <---\\\
        System.out.println(ayrac+"\n< PriorityQueue Metotları >\n"+ayrac);
        System.out.print("-> Kuyruk İçerisindeki Değerler: ");
        queue.forEach( i -> System.out.print("["+i+"]")); ///---> Collections yapılarının genelinde bulunan foreach tanımlaması <---\\\
        System.out.println("\n"+ayrac);
        Iterator <Integer> iterator = queue.iterator(); ///---> İterator Kullanımı <---\\\
        
        System.out.print("-> Iterator Metot Kullanımı Sonucunda Değerler: ");
        while(iterator.hasNext()){
            System.out.print("["+iterator.next()+"]");
        }
        System.out.println("\n-> Size Metot Kullanımı: "+queue.size()+" öğe bulunuyor.");
        System.out.println("-> Poll Metot Kullanımı ile İlk Değere Ulaşmak: "+queue.poll());
        System.out.print("-> Yeni Kuyruk Yapısı: ");
        queue.forEach(i -> System.out.print("["+i+"]"));
        System.out.println("\n-> Peek Metot Kullanımı ile İlk Değere Ulaşmak: "+queue.peek());
        System.out.print("-> Remove(40) Metot Kullanımı: ");
        queue.remove(40);
        queue.forEach(i -> System.out.print("["+i+"]"));
        System.out.println("\n-> Contains(40) Metot Kullanımı: "+queue.contains(40)+"\n"+ayrac);
        
        
        
      ///---> Generic Öncelikli Kuyruk Tanımlaması <---\\\
        java.util.PriorityQueue <Integer> que = new java.util.PriorityQueue<>(10,
                new java.util.Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if(o1==o2) {
                        	return 0;
                        } else if(o1 > o2) {
                        	return 1;
                        } else {
                        	return -1;
                        }   
                    }
                });
        System.out.println(ayrac+"\n< Java PriorityQueue Örnekleri #1 >\n"+ayrac);
        System.out.print("-> Verilerin Eklenme Sırası: ");
        ///---> Verilerin Eklenmesi <---\\\
        for(int i=0; i < 10; i++){
            que.offer(10-i); ///---> 10 9 8 7 .... 1 şeklinde verilerin eklenmesini sağladık <---\\\
            System.out.print("["+(10-i)+"]");
        }
        System.out.print("\n-> Comparator Yapısına Göre Sıralanması: ");
        for(int i=0; i < 10; i++){
            System.out.print("["+que.poll()+"]");
        }
        System.out.println("\n"+ayrac);
        
        
    }

}
