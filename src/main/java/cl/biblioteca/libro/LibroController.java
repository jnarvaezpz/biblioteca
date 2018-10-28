package cl.biblioteca.libro;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.biblioteca.autor.Autor;

@Controller
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Libro> listadoLibro() {
		return libroService.listadoLibro();	
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void agregarLibro(@RequestBody Libro libro, Autor autor) {
		libroService.agregarLibro(libro, autor);
	}
	
	
}
