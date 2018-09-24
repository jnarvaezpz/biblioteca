package cl.biblioteca.autor;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("H2")
public class AutorRepository implements AutorRepositoryInterface{

	private static EntityManager em;
	private static EntityManagerFactory emf;
	
	@SuppressWarnings("static-access")
	public AutorRepository() {
		this.emf = Persistence.createEntityManagerFactory("persistencia");
		this.em = emf.createEntityManager();	
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Autor> listadoAutor() {
		List<Autor> autores = (List<Autor>) em.createQuery("FROM Autor").getResultList(); 
		return autores;
	}

	@Override
	public Autor obtenerAutor(int idAutor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autor actualizarAutor(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarAutor(Autor autor) {
		em.getTransaction().begin();
		em.persist(autor);		
		em.getTransaction().commit();		
	}

	@Override
	public void eliminarAutor(int idAutor) {
		// TODO Auto-generated method stub
		
	}

	
}
