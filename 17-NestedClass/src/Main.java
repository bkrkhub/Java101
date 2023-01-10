
public class Main {

	public static void main(String[] args) {
		// Nested Class (İç İçe Sınılar)
		// Inner Class (İç Sınıflar)		
		// - Static
		// - Non-Static
		// Local Class(Yerel Sınıf)
		// - Anonymous Class (Anonim Sınıflar)
		
		
		NonStatic n = new NonStatic();
		NonStatic.Inner inner = n.new Inner();
		inner.run();
		
		Static.Inner s = new Static.Inner();
		// Nesne üretmeden direk Inner sınıfına eriştik.
		s.run();
		
		Local l = new Local();
		l.run();
		
		Anonymous a = new Anonymous() {
			public void run () {
				System.out.println();
				System.out.println("Anonim sınıfa ait run methodu !");
				System.out.println("---------- ANONYMOUS ----------");
			}
		};
		
		a.run();
		
	}

}
