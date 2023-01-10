
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		java.util.ArrayList<Integer> a = new java.util.ArrayList<>();
		a.add(1);
		a.add(2);
		
		for(Integer obj: a) {
			System.out.println(obj.doubleValue());
		}
		
		java.util.HashMap<Integer, String> c = new java.util.HashMap<>();
		
		c.put(1, "Adana");
		c.put(6, "Ankara");
		c.put(34, "İstanbul");
		
		for(Integer key: c.keySet()) {
			System.out.println("Key: " + key + " - Value: " + c.get(key));
		}
		
		for(String value: c.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("----------------------------- GENERIC TYPES ------------------------------");
		
		Test<Integer> i = new Test<Integer>(15);
		System.out.println(i.getObj());
		Test<String> j = new Test<String>("Deneme");
		System.out.println(j.getObj());
		
		System.out.println("----------------------------- GENERIC TYPES 2 ------------------------------");
		
		Test2<Integer,String> z = new Test2<>(1,"Adana");
		z.print();
		
		System.out.println("----------------------------- GENERIC TYPES 3 ------------------------------");

		Integer[] intArr = {1,2,3,4};
		Double[] doubleArr = {1.1,2.1,3.1};
		Character[] chaArr = {'K','O','D'};
		
		genericMethod(intArr);
		genericMethod(doubleArr);
		genericMethod(chaArr);
		
	}
	
	public static <E> void genericMethod(E[] arr) {
		for(E item : arr) {
			System.out.print(item+ ",");
		}
	}
	
	
}
