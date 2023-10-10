package Act1;

public class Persona 
{

	private String nombre;
	private int edad;
	private int dni;
	private double peso;
	private double altura;
	private String sexo;
	private final String SEXO = "Hombre";

	
public Persona(int dni) 

{
	this.nombre="";
	this.edad=0;
	this.dni= dni;
	this.peso=0;
	this.altura=0;
	this.sexo=SEXO;
}


public Persona(String nombre, int edad, String sexo) 
{

	this.nombre = nombre;
	this.edad = edad;
	this.dni= 0;
	this.peso=0;
	this.altura=0;
	this.sexo=SEXO;
}


public Persona(String nombre, int edad, int dni, double peso, double altura, String sexo) {
	
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
	this.peso = peso;
	this.altura = altura;
	this.sexo = SEXO;
}


@Override
public String toString() {
	return "Persona [Nombre= " + nombre + ", Edad= " + edad + ", DNI= " + dni + ", Peso= " + peso + ", Altura= " + altura
			+ ", Sexo= " + sexo + "]";
}





	
	

}


