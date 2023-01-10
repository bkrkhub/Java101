
import java.util.*;

public class QueueLinkedList {

	public static void main(String[] args) {
	
		// LinkedList list olarak verilirse onun formatını, queue olarak tanımlandıysa queue kalıtımını sağlayacaktır.
		
		// Queue --> İstediğimiz yere ekleme yok --> FIFO var.
	
			// - element() kuyrugun basındaki ogeyi verir ama onu kuyruktan atmaz
			// - offer(E o) mumkunse verilen ogeyi kuyruga ekler
			// - peek() kuyrugun basındaki ogeyi verir ama onu kuyruktan atmaz. Kuyruk bossa null verir.
			// - poll() kuyrugun basindaki ogeyi verir ve onu kuytuktan atar. Kuyruk bossa null verir.
			// - remove() kuyrugun basındakini verir ve onu kuyruktan atar.
		
		java.util.Queue q = new java.util.LinkedList();
		
		q.add("Deniz");
		q.add("Mehmet");
		
		q.offer("Ali");
		q.offer("Damla");
		
		// offer try catch ile bir exception yapar. --> Ekleyemezse false döner.
		System.out.println("remove() : " + q.remove()+ "\n---------------------");
		System.out.println("remove() : " + q.remove(1)+ "\n---------------------");
		// Silmez cunku sıralamaya bakar en ustten alır en ustten siler, ilk girene ulasmak lazım.
		
		System.out.println("element() : " + q.element()+ "\n---------------------");
		System.out.println("poll() : " + q.poll()+ "\n---------------------");


		q.forEach(i -> System.out.println(i));
		
		
	}
	
	
}
