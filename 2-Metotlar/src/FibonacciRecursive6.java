
import java.util.Scanner;

public class FibonacciRecursive6 {

	static int fibo(int n) {
		
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
		
	}
	
	public static void main(String[] args) {
		
		// 1 1 2 3 5 8 13 21 
		// f(6)= f(5) + f(4)
		System.out.print("Lütfen Fibonacci Seri Sınır Sayısını Giriniz: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println(fibo(n));

	}
	
	
}
