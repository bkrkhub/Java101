
public class Local {
	// Yerel y;
	// Local class degiskenlerine ve metotlarına sadece tanımlı oldukları metot içerisinden ulaşılabilir.
	
	public void run() {
		
		class Yerel {
			int a;
			Yerel(int a) {
				this.a = a;
			}
			
			public void print() {
				System.out.println(a);
			}
		}
		
		Yerel y = new Yerel(10);
		y.print();
		System.out.println("------------------------ LOCAL --------------------------");
	}
	
	
}
