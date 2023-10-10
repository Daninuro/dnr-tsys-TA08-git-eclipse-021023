package Act4;

public class SerieApp 
{

	public static void main(String[] args) 
	{
		
		Serie serie1 = new Serie();
		System.out.println(serie1);

		Serie serie2 = new Serie("Juego de tronos", "David Benioff");
		System.out.println(serie2);
		
		Serie serie3 = new Serie("El cuerpo en llamas", 1, "true Crime", "Laura Sarmiento" );
		System.out.println(serie3);

		
		
		
		
	}

}
