package cl.biblioteca.libro;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cl.biblioteca.autor.Autor;


@Repository
@Qualifier("H2")
public class LibroRepository implements LibroRepositoryInterface{

	public static EntityManager em;
	public static EntityManagerFactory emf;
	
	@SuppressWarnings("static-access")
	public LibroRepository() {
		this.emf = Persistence.createEntityManagerFactory("persistencia");
		this.em = emf.createEntityManager();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Libro> listadoLibro() {

		List<Libro> libros = (List<Libro>) em.createQuery("from Libro").getResultList();
		return libros;
	}

	@Override
	public Libro obtenerLibro(int idLibro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro actualizarLibro(Libro Libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarLibro(Libro libro, Autor autor) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		libro.setAutor(autor);
		em.persist(libro);
		em.getTransaction().commit();
		
	}

	@Override
	public void eliminarLibro(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	
}
