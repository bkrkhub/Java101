
import java.util.Scanner;

public class ATMProjesi27 {

	public static void main(String[] args) {
		
		int bakiye = 1000, process, miktar;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Merhabalar Bankamıza Hoş Geldiniz.");
		System.out.println("Güncel Bakiyeniz: " + bakiye + "TL");
		
		while (bakiye > 0) {
			
			System.out.println();
			System.out.println("1-) Para Yatır");
			System.out.println("2-) Para Çek");
			System.out.println("3-) Bakiye Sorgula");
			System.out.println("4-) Çıkış Yap");
			System.out.print("Yapmak İstediniz İşlemi Seçiniz: ");
			process = scan.nextInt();			
			
			if (process == 1) {
				System.out.print("Yatırmak İstediğiniz Miktarı Giriniz: ");
				miktar = scan.nextInt();
				bakiye += miktar;
				System.out.println("Başarıyla Paranızı Yatırdınız.");

			}else if(process == 2){
				System.out.print("Çekmek İstediğiniz Miktarı Giriniz: ");
				miktar = scan.nextInt();
				System.out.println("Para Çekme Talebi Başarılı...");
				
				if(miktar > bakiye) {
					System.out.println("Yetersiz Bakiye!");
				}else {
					bakiye -= miktar;
				}
			}else if(process == 3) {
				System.out.println("Güncel Bakiyeniz: " + bakiye);
			}else if(process == 4) {
				System.out.println("Çıkış Yapılıyor. Tekrar Bekleriz.");
				break;
			}else {
				System.out.println("Geçersiz Bir İşlem Girdiniz. Tekrar Deneyiniz !");
			}
			
			
			
			
			
			
		}
		
		

	}

}
