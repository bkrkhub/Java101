
public class Main {

	public static void main(String[] args) {
		
		System.out.println(HesapMakinesi.PI);
		
		// HesapMakinesi m1 = new HesapMakinesi(10,5,"siyah");
			// gibi bir class import işlemi yapmamıza gerek kalmadı.
				// Çünkü PI değişkenimizi final static double PI = 3.14; olarak tanımladık.
					// değişmez ve başka class'tan static sayesinde ulaşılabilir bir sabit oluşturduk.
		
		HesapMakinesi m1 = new HesapMakinesi(2,3,"siyah");  
		System.out.println(m1.area(10));
	}

}
