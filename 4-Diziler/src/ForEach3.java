
public class ForEach3 {

	public static void main(String[] args) {
		
		/*int liste[] = new int[4];
		liste[0] = 1;
		liste[1] = 2;
		liste[2] = 3;
		liste[3] = 4;
		
		// Foreach 
		
		for(int value: liste) {
			System.out.println(value);
		}*/
		
		int[][] tablo = new int[][] {
			{1,75,10},
			{2,87,13},
			{3,95,15},
			{4,103,18},
			{5,110,19}
		};
		
		
		for (int[] sutun: tablo) {
			for (int value: sutun) {
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
