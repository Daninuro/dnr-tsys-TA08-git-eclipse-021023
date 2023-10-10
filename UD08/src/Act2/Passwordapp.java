package Act2;

public class Passwordapp 
{
	
	public static void main(String[] args) 
	{
		
		Password pass = new Password();
		pass.getLongitud();
		System.out.println(pass);
		
		System.out.println("--Contraseña generada por defecto-- Longitud de "+pass.getLongitud());
		generaNumRandom(pass.getLongitud(),0);

			
		Password pass2 = new Password();
		pass2.setLongitud(10);
		System.out.println(pass2);
		
		System.out.println("--Contraseña generada por defecto-- Longitud de "+pass2.getLongitud());
		generaNumRandom(pass2.getLongitud(),0);
		
	}
	

	public static int generaNumRandom(int Cont, int min)
	{
		
		int numRandom =0;
		
		for (int contador=2; contador<=Cont; contador++) 
		{
			
			numRandom = (int) (Math.random() * (Cont - min)) + min;
		 
				System.out.print(numRandom+"");	
				
		}
		System.out.print(numRandom+"\n");	
		
		return numRandom;
	}
	
	
	
	
}
