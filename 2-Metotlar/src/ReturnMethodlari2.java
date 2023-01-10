
public class ReturnMethodlari2 {
	
		static int power(int a, int b) {
			// burada static void demememizin sebebi int tipli bir return yapmamizidir.
				// ve bu sebepten static int olarak adlandirdik.
			
			int result = 1;
			
			for (int i=1; i <= b; i++) {
				result *= a;
			}
			return result;
		}
	
		public static void main(String[] args) {
			
			int r2 = power(10,2);
			System.out.println(r2);;
		}
}
