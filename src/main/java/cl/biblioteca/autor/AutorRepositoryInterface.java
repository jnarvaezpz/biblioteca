package cl.biblioteca.autor;

import java.util.Collection;

public interface AutorRepositoryInterface {

	Collection<Autor> listadoAutor ();
	
	Autor obtenerAutor (int idAutor);
	
	Autor actualizarAutor (Autor autor);
	
	void agregarAutor (Autor autor);
	
	void eliminarAutor (int idAutor);
}
