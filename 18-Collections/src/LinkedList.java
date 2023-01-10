
public class LinkedList {

	public static void main(String[] args) {
		// LinkedList ile ArrayList'in tek farkı algoritmasıdır.
		
		// Elimizde 2 farklı büyük List olsun --> LinkedList arama işleminde o(n) iken ArrayList o(1) 'dir.
		// Çok arama işlemi yaparken ArrayList daha performanslı.
		// Eleman silme işleminde LinkedList o(1) bu sebeple LinkedList performanslı oluyor.
		// Ekleme işlemlerinde de LinkedList o(1) bu sebeple LinkedList performanslı oluyor.
			
			// Tabi bu durumlar maliyet durumları. Hacmi büyük veri durumlarında etkili oluyor.
		
		java.util.LinkedList lnkList = new java.util.LinkedList();
		
		lnkList.add("Kavun");
		lnkList.add("Armut");
		lnkList.add("Kiraz");
		lnkList.add(0,"Mandalina");
		
		lnkList.forEach(i -> System.out.println(i));
		
	}

}
