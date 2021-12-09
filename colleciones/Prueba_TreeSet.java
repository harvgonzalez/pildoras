package colleciones;
import java.util.*;
public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Alberto");
		ordenaPersonas.add("Jaime");
		ordenaPersonas.add("Pedro");
		ordenaPersonas.add("Zaida");
		ordenaPersonas.add("Amanda");
		
		for (String string : ordenaPersonas) {
			System.out.println(string);
		}
	}

}
