package Act2;

public class Password 

{

	private int longitud;
	private String contrasenya;
	
	
	public Password() 
	{
		this.longitud=8;
		this.contrasenya = "";
	}

	
	public Password(int longitud) 
	{
		this.longitud=longitud;
		this.contrasenya="";
	}
		

	public Password(int longitud, String contrasenya) 
	{
		this.longitud = longitud;
		this.contrasenya = contrasenya;
	}


	
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasenya=" + contrasenya + "]";
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getContrasenya() {
		return contrasenya;
	}


	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	

	
}
