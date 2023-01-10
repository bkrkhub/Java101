import java.util.*;

public class LinkedHashSet {

	public static void main(String[] args) {
		
		// HashSet ile tek farkı --> HashSet hash sırasına göre çıktı veriyordu. Burada girilen değere göre sılama veriyor.
		
		java.util.LinkedHashSet gunler = new java.util.LinkedHashSet();
		
		gunler.add("pazartesi");
		gunler.add("salı");
		gunler.add("çarşamba");
		gunler.add("perşembe");
		gunler.add("cuma");
		gunler.add("cumartesi");
		gunler.add("pazar");
		
		gunler.add("pazatesi");
		
		gunler.forEach(item -> System.out.print(item + ","));
	}

}
