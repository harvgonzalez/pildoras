package colleciones;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private int isbn;
	
	public Libro(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}
	
	public String getDatos() {
		return "El título es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}
	
	/*public boolean equals(Object obj) {
		
		if(obj instanceof Libro) {
			Libro newObj=(Libro)obj;
			
			if(this.isbn==newObj.isbn) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	*/
}
