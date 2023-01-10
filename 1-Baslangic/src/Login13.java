
import java.util.Scanner;

public class Login13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String kullanici_adi, parola;
		System.out.println("Kullanıcı Adınızı Giriniz: ");
		kullanici_adi = scan.nextLine();
		System.out.println("Parola Giriniz: ");
		parola = scan.nextLine();
		
		if (kullanici_adi.equals("java") && parola.equals("123")) {
			System.out.println("Login İşlemi Başarılı.");
		}
		else {
			System.out.println("Kullanıcı adı veya parolanız yanlış!");
		}
		
	}

}
