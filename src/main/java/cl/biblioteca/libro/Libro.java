package cl.biblioteca.libro;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import cl.biblioteca.autor.Autor;

@Entity
@Table(name="LIBRO")
public class Libro {
	
	@Id
	@Column(name ="ID_LIBRO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLibro;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="CANTIDAD_PAGINAS")
	private int cantidadPaginas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="AUTOR_ID")
	private Autor autor;


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getCantidadPaginas() {
		return cantidadPaginas;
	}


	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", cantidadPaginas=" + cantidadPaginas + ", autor="
				+ autor + "]";
	}
	
}
