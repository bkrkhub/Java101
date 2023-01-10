
import java.util.*;

public class TreeSet {

	public static void main(String[] args) {
		
		// Treeset'lerde elementler artan bir siralama ile tutuluyor. Null kabul etmiyor.
		// Hangi siralama ile girersek girelim kucukten buyuge siralama ile cikti verir.
		
		java.util.TreeSet tree = new java.util.TreeSet();
		tree.add(120);
		tree.add(30);		
		tree.add(20);		
		tree.add(-5);	

		tree.forEach(item -> System.out.println(item));
	}

}
