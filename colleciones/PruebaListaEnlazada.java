package colleciones;

import java.util.*;
public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Perú");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("CDMX");
		capitales.add("Lima");
		
		System.out.println(paises);
		System.out.println(capitales);
		
		ListIterator<String> itrPaises = paises.listIterator();
		ListIterator<String> itrCapitales = capitales.listIterator();
		
		while(itrCapitales.hasNext()) {
			
			if(itrPaises.hasNext()) {
				itrPaises.next();
			}
			itrPaises.add(itrCapitales.next());
		}
		System.out.println(paises);
		
		itrCapitales  = capitales.listIterator(); // vuelve a posicion inicial
		
		while(itrCapitales.hasNext()) {
			itrCapitales.next();
			
			if(itrCapitales.hasNext()) {
				
				itrCapitales.next();
				
				itrCapitales.remove();
			}
			
		}
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		
		System.out.println(paises);
	}

}
