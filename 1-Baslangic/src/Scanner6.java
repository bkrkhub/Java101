
import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		/*System.out.println("A sayısını Giriniz: ");
		a = input.nextInt();
		System.out.println("B sayısını Giriniz: ");
		b = input.nextInt();
		
		System.out.println("A sayısı :" + a);
		System.out.println("B sayısı :" + b);*/
		
		
		/*double c;
		System.out.println("Double Türünde sayı giriniz: ");
		c = input.nextDouble();
		System.out.println(c);*/
		
		// 22,2 dersek calisir. Inputta double 22,2 olarak verilir ancak Java bize 22.2 olarak gösterir.
		
		String str;
		System.out.println("Lütfen User ID giriniz: ");
		str = input.nextLine();
		System.out.println(str);
		
	}

}
