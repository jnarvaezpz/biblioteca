package cl.biblioteca.autor;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
	
	@Autowired
	@Qualifier("H2")
	private AutorRepositoryInterface autorRepositoryInterface;
	
	public void agregarAutor(Autor autor) {
		autorRepositoryInterface.agregarAutor(autor);
	}
	
	public Collection<Autor> listadoAutor() {
		return autorRepositoryInterface.listadoAutor();
	}

}
