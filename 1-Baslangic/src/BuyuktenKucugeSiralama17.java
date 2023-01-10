
import java.util.*;

public class BuyuktenKucugeSiralama17 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayıları Giriniz: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a>b && a>c) {
			if (b>c) {
				System.out.println("a > b > c");
			}else {
				System.out.println("a > c > b");
			}
		}
		else if (b > a && b > c) {
			if (a > c) {
				System.out.println("b > a > c");
			}else {
				System.out.println("b > c > a");
			}
		}
		else {
			if (a > b) {
				System.out.println("c > a > b");
			}else {
				System.out.println("c > b > a");
			}
		}
	}
}
// Burada her birini eşit verdiğimizde ya da 2sini eşit verdiğimizde çalışmıyor ama önemi yok if ile yazılabilir.
