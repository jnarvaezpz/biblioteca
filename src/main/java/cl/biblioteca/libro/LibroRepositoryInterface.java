package cl.biblioteca.libro;

import java.util.Collection;

import cl.biblioteca.autor.Autor;

public interface LibroRepositoryInterface {
	
	Collection<Libro> listadoLibro();
	
	Libro obtenerLibro (int idLibro);
	
	Libro actualizarLibro (Libro Libro);
	
	void agregarLibro (Libro libro, Autor autor);
	
	void eliminarLibro (Libro libro);	

}
