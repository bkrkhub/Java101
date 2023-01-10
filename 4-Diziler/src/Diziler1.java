
import java.util.Scanner;

public class Diziler1 {

	public static void main(String[] args) {
		// Array
		// VeriTipi diziAdi[] = new VeriTipi[elemanSayisi];
		// VeriTipi[] diziAdi = new VeriTipi[elemanSayisi];
		// VeriTipi[] diziAdi = {v1,v2,v3};
	
		int[] liste = new int[4];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < liste.length; i++) {
			liste[i] = scan.nextInt();		
		}
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		
	}

}
