
public class Operatorler5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int toplam = a+b;
		int cikarma = a-b;
		int bolme = a/b;
		int carpma = a*b;
		int mod = a%b;
		//System.out.println("Toplama:" + toplam);
		//System.out.println("Cikarma:" + cikarma);
		//System.out.println("Bölme:" + bolme);
		//System.out.println("Carpma:" + carpma);
		//System.out.println("Mod Değeri:" + mod);
		//System.out.println("************************");
		//toplam++;
		//System.out.println(toplam);
		// CTRL + F11 ile hizli shortcut ile RUN edebiliriz.
		//cikarma--;
		//System.out.println(cikarma);
		
		//int sonuc = a++ + b++;
		//System.out.println(sonuc);
		
		//int sonuc2 = ++a + ++b;
		//System.out.println(sonuc);
		
		int sayi1 = 10;
		int sayi2 = 5;
		
		boolean query = (sayi1 == sayi2);
		System.out.println(query);
		System.out.println("************");
		boolean query2 = (sayi1 >= sayi2);
		System.out.println(query2);
		System.out.println("************");
		boolean query3 = (sayi1 <= sayi2);
		System.out.println(query3);
		System.out.println("************");
		boolean query4 = (sayi1 != sayi2);
		System.out.println(query4);
		System.out.println("************");
		boolean query5 = (sayi1 / sayi2) == 2;
		System.out.println(query5);
		System.out.println("************");		
		
		boolean kosul1 = (sayi1 > sayi2);
		boolean kosul2 = (sayi2 > sayi1);
		boolean sonuc2 = kosul1 && kosul2;
		
		// Kisacasi True ve False ciktisi alacagiz.
		
		System.out.println("Ve Koşulu Çıktısı: " +sonuc2);
		
		boolean sonuc3 = kosul1 || kosul2;
		System.out.println("veya Koşulu Çıktısı: " + sonuc3);
		
		String sonuc4  = (kosul1) ? "Doğru" : "Yanlış";
		System.out.println(sonuc4);
		
		String sonuc5  = (a==b) ? "Doğru" : "Yanlış";
		System.out.println(sonuc5);

	}
}


