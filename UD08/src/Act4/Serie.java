package Act4;

public class Serie 
{
	
	private String titulo;
	private int numero_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	
	
	
	public Serie() 
	{
		this.titulo = "";
		this.numero_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}
	


	public Serie(String titulo, String creador) 
	{
		this.titulo = titulo;
		this.numero_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	


	public Serie(String titulo, int numero_temporadas, String genero, String creador) 
	{
		this.titulo = titulo;
		this.numero_temporadas = numero_temporadas;
		this.genero = genero;
		this.creador = creador;
	}




	@Override
	public String toString() {
		return "Serie [Titulo = " + titulo + ", Temporadas = " + numero_temporadas + ", Entregado = " + entregado
				+ ", Genero = " + genero + ", Creadores =" + creador + "]";
	}
	
}
