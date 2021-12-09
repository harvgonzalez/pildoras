package colleciones;
import java.util.*;
public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Javier", "00001", 200000);
		Cliente cl2 = new Cliente("Rafa Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Rosalia", "00003", 3000000);
		Cliente cl4 = new Cliente ("Julio Iglesias", "00004", 500000);
		Cliente cl5 = new Cliente("Javier", "00001", 200000);
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		/*for (Cliente cliente : clientesBanco) {
			
			//System.out.println(cliente.getNombre() + " " 
			//+ cliente.getNumCuenta() + " " + cliente.getSaldo());
			
			if(cliente.getNombre().equals("Julio Iglesias")) {
				clientesBanco.remove(cliente);
			}
		}*/
		Iterator<Cliente> itr = clientesBanco.iterator();
		while(itr.hasNext()) {
			String nombre_cliente = itr.next().getNombre();
			if(nombre_cliente.equals("Julio Iglesias")) {
				itr.remove();
			}
		}
		
		for (Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre() + " " 
			+ cliente.getNumCuenta() + " " + cliente.getSaldo());
			
		}
		
		/*Iterator<Cliente> itr = clientesBanco.iterator();
		
		while(itr.hasNext()) {
			String nombreCliente = itr.next().getNombre();
			System.out.println(nombreCliente);}*/
	}

}
