
public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ali", 220,90);
		Student s2 = new Student("Ayşe", 330,50);
		Student s3 = new Student("Mehmet", 300,40);
		System.out.println("Online Öğrenci: " + Student.howStudent());

		int[] notlar = new int[3];
		notlar[0] = s1.point;
		notlar[1] = s2.point;
		notlar[2] = s3.point;
		
		System.out.println("Online Öğrencilerin Ders Ortalaması: " + Student.calcOverall(notlar));
	}

	
	// Burada Student Class içerisinde Static Method kullandığımız için hiçbir nesne tanımı yapmadan rahatça işimizi hallettik.
	
}
