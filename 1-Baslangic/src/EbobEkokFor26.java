
import java.util.Scanner;

public class EbobEkokFor26 {

	public static void main(String[] args) {
		// EKOK bir sayı grubundan sayıların ortak katlarının en küçüğü
		// EBOB ise bu sayıları bölen en büyük sayı
		// ekok = (s1*s2) /ebob

		int s1,s2,ebob=1,ekok;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Sayıları Giriniz: ");
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		
		int min = (s1 < s2) ? s1: s2;
		
		for (int i = min; i > 0; i--) {
			
			if ((s1 % i == 0) && (s2 %i == 0)) {
				ebob = i;
				break;
			}
		}
		
		ekok = (s1*s2) / ebob;
		System.out.println(s1 + " ve " + s2 + " Sayılarının EKOK'U: " + ekok);
		System.out.println(s1 + " ve " + s2 + " Sayılarının EBOB'U: " + ebob);

	}

}
