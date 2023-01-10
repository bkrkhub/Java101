
import java.util.Scanner;

public class DaireAlanVeHacimHesaplama9 {
	public static void main(String[] args) {
		
		int r;
		double alan,hacim, pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Daire Yarıçapını Giriniz: \n");
		r = input.nextInt();
		alan = 2*pi*r;
		hacim = pi*(r*r);
		System.out.println("Dairenizin Alanı: " + alan);
		System.out.println("Dairenizin Hacmi: " + hacim);
		
		
		
	}
}
