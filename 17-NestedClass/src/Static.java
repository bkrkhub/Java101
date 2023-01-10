
public class Static {
	
	// Bir class veya method static tanımlanırsa oradan bir nesne üretmeden methoda veya sınıfa erişilebiliyordu.
	
	private int a = 10;
	private static int b = 2;
	
	public static class Inner{
		int a = 1;
		
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
			// System.out.println(Static.this.a);
			// static inner sınıf oldugu ıcın inner'dan bir nesne uretmiyorum. 
				// nesne üretmediğim icin ise ust sınıf referansına erişemiyorum.
			System.out.println(b);
			System.out.println("----------------- STATIC ----------------");

		}
	}
}
