
import java.util.Scanner;
public class ContinueBreak20 {

	public static void main(String[] args) {
		
		// break --> Döngüyü durduruyor.
		// continue --> döngüyü durdurmaz ama bir sonraki adıma gider.
		
		Scanner scan = new Scanner(System.in);
		
		/*
		int sayi;
		while (true) {
			System.out.println("Bir Sayı Giriniz: ");
			sayi = scan.nextInt();
			if (sayi == 0) {
				System.out.println("Döngü Bitti.");
				break;
			}
			System.out.println(sayi);
		}
		*/
		
		for (int i=1; i<=10; i++) {
			if (i == 4 || i == 9) {
				System.out.println("Atladı =" + i);
				continue;
			}
			System.out.println("i =" + i);
		}
		

	}

}
