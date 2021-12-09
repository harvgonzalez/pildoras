package colleciones;

import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private String numCuenta;
	private double saldo;
	
	public Cliente(String nombre, String numCuenta, double saldo) {
		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(numCuenta, other.numCuenta);
	}
	
	// HASH CODE Y EQUALS
	
	
	
}
