
public class Book {

	// Encaplusation == Bir sinifa ait degiskenlerin degerlerinin sadece o sinifin icerisine kodlanmis 
		// metotlar tarafından degistirilebilmesi ve kullanabilmesi ilkesidir.
	
	private String name,author,publisher;
	private int numberOfPage;
	
	Book(String name, int numberOfPage, String author, String publisher){
		
		this.name = name;
		this.numberOfPage = numberOfPage;
		this.author = author;
		this.publisher = publisher;
		
		// Constructor yapısı
		if(numberOfPage < 1) {
			this.numberOfPage = 10;
		}else {
			this.numberOfPage=numberOfPage;
		}
	}
	
	public int getNumberOfPage() {
		return this.numberOfPage;
		//getter method
	}
	
	public void setNumberOfPage(int size) {
		if(size < 1) {
			System.out.println("Cannot have negative number of pages !");
			this.numberOfPage = 10;
			
		}else {
			this.numberOfPage = size;

		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	// numberOfPage degiskenini encapsulation ettim. Private yaptigim icin disaridan direk etkilesimde olmasini engelledim.
	// Bu private katmanini iceride bir constructor yapisi oldugunda aciyor ve sadece bagli oldugu kod blogunda calistiriyorum.
	// Olusturmus oldugum bir baska methodla karsiya sundum. Birebir etkilesime gecmesini engelledim.
	
	// Bu getter ve setter metotları tek tek elle yazmak yerine  Source -> Generate Getter and Setters.
	
	
	
}
