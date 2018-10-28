package cl.biblioteca.libro;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.biblioteca.autor.Autor;

@Service
public class LibroService {
	
	@Autowired
	@Qualifier("H2")
	private LibroRepositoryInterface libroRepositoryInterface;
	
	public Collection<Libro> listadoLibro() {
		return libroRepositoryInterface.listadoLibro();	
	}
	
	public void agregarLibro(Libro libro, Autor autor) {
		libroRepositoryInterface.agregarLibro(libro, autor);
	
	}

}
