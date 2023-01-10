
import java.util.*;

public class Vector {

	public static void main(String[] args) {
		// Duplicate ve null kabul ediyor.
		// FIFO var, indis var.
		
		
		// Diğerlerinden farkı ise sekronize collection yapısıdır. Default oluşturuldugunda boyutu 10 oluyor.
		
		java.util.Vector v = new java.util.Vector();
		
		v.add("Armut");
		v.add("Elma");
		v.add("Kiraz");
		v.add("Nar");
		v.add("Mandalina");
		v.add("Üzüm");
		v.add("Kiraz");
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		// default kapasite 10 ama 11 add yaparsak kapasite 20 olacaktır.
		// java.util.Vector(4) tanımı yapsaydık ve 5 tanım yapsaydık bu sefer de (kapasite + kapasite) == 8 olacaktı.
		// java.util.Vector(2) tanımı yapsaydık ve 5 tanım yapsaydık bu sefer de (kapasite + kapasite) == 6 olacaktı.
	}

}
