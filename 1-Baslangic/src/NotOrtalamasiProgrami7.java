
import java.util.Scanner;
public class NotOrtalamasiProgrami7 {

	public static void main(String[] args) {

		
		int quiz, vize, finalExam;
		double ortalama;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quiz Notunuzu Giriniz: ");
		quiz = input.nextInt();
		System.out.println("Vize Notunuzu Giriniz: ");
		vize = input.nextInt();
		System.out.println("Final Notunuzu Giriniz: ");
		finalExam = input.nextInt();
				
		ortalama = (quiz * 0.2) + (vize * 0.35) + (finalExam * 0.45);
		System.out.println("Not Ortalamanız: " + ortalama);
		
		String sonuc = (ortalama >= 50)? "Dersi Geçtiniz Tebrik Ederiz.": "Kaldınız :(";
		System.out.println(sonuc);
	}

}
