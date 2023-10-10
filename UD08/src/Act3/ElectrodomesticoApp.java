package Act3;


public class ElectrodomesticoApp 
{

	public static void main(String[] args) 
	{

		Electrodomestico producto1 = new Electrodomestico();
		System.out.println(producto1);
		
		
		Electrodomestico producto2 = new Electrodomestico(500,160.99);
		System.out.println(producto2);
		
		Electrodomestico producto3 = new Electrodomestico(800,"Rojo", 'F',130.49);
		System.out.println(producto3);
		
		
		
	}

}
