
public class NonStatic {
	
	private int a = 10;
	
	public class Inner {
		int a = 1;
		
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(NonStatic.this.a);
			System.out.println("----------------- NONSTATIC ----------------");
			// Kalıtım ile karıştırılmaması gerekir. Kalıtımda farklı 2 sınıfın birbirine miras bırakması yapısı vardır.
			// Nested Class'ta ise iç içe sınfılar bulunur.
		}
		
	}
	
	public void run() {
		System.out.println(a);
		System.out.println(this.a);
		Inner i = new Inner();
		// Nesne üretildi
		System.out.println(i.a);
		// Nesne üretmeden yukarıdaki print çalışmaz.
		
	}
	
	
}
