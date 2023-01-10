
public class SayisalVeriTipleri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteDegiskeni = 100;
		System.out.println(byteDegiskeni);
		System.out.println("byteDegiskeni");
		// Eger ki burada byte tipindeki degiskenimize 150 verirsek hata verir cunku byte 127'ye kadar destekler.
		
		short shortDegiskeni = 1000;
		System.out.println(shortDegiskeni);
		System.out.println("Vermis Oldugumuz Deger: " + shortDegiskeni);
		
		int intDegiskeni = 12345678;
		System.out.println("Integer Degerimiz: " + intDegiskeni);
		
		long longDegiskeni = 1231231230;
		System.out.println("Long Degerimiz: " + longDegiskeni);
		
		//Eger ki buyuk datasetlerine id atiyor ve cok fazla datamiz var ise diyelim:
			// Burada long da bize yetmeyecektir. Bu sebepten double kullanmak mantikli hale gelir.
	}

}
