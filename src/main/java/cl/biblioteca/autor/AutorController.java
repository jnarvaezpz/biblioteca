package cl.biblioteca.autor;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	private AutorService autorService;

	@RequestMapping(method = RequestMethod.POST)
	public void agregarAutor(@RequestBody Autor autor) {
		autorService.agregarAutor(autor);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Autor> listadoAutor() {
		return autorService.listadoAutor();
	}
}
