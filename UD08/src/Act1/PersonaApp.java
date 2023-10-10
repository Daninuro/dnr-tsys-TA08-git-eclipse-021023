package Act1;

public class PersonaApp 
{

	public static void main(String[] args) 
	{
		
		Persona per = new Persona(123456789);
		System.out.println(per.toString());
		
		Persona per2 = new Persona("Dani", 27,"");
		System.out.println(per2.toString());
		
		Persona per3 = new Persona("Dani", 27, 485695842, 78.5, 1.76,"");
		System.out.println(per3.toString());
		
		
	}

}
