
public class RecursiveMetot4 {
	
	static int r(int x) {
		if (x==1) {
			return 1;
		}
		return x + r(x-1);
	}
	
	
	public static void main(String[] args) {
		/* Recursive == Özyinelemeli
		 f(1) = 1
		 f(2) = f(1) + 2
		 f(3) = f(2) + 3
		 ...............
		 f(7) = f(6) + 7
		 */
		System.out.println(r(2));

	}

}
