package cl.biblioteca.autor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTOR")
public class Autor {
	
	@Id
	@Column(name = "ID_AUTOR")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAutor;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO")
	private String apellido;
	@Column(name = "NACIONALIDAD")
	private String  nacionalidad;
	
	public Autor() {
		
	}	
	public Autor(String nombre, String apellido, String nacionalidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
	}
	
	public int getIdAutor() {
		return idAutor;
	}
	
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
				+ "]";
	}

	
	

}
