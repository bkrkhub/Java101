
public class ArmstrongFor24 {

	public static void main(String[] args) {
		
		int tmp,b,o,y,toplam;
		for(int i=100; i<=999; i++) {
			
			tmp = i;
			
			b = tmp % 10;
			tmp /= 10;
			
			o = tmp % 10;
			tmp /= 10;
		
			y = tmp % 10;
			tmp /= 10;
		
			toplam = (b*b*b) + (y*y*y) + (o*o*o);
			
			if(toplam == i) {
				System.out.println(i + " bir Armstrong Sayısıdır.");
			}
			
		}
		

	}

}
