package Act3;

public class Electrodomestico 
{
	
	private int precio_base;
	private String color;
	private char consumo_energetico;
	private double peso;
	
	
	
	
	public Electrodomestico() 
	{
		this.precio_base = 100;
		this.color = "Blanco";
		this.consumo_energetico = 'F';
		this.peso = 5;
	}




	public Electrodomestico(int precio_base, double peso) 
	{
		this.precio_base = precio_base;
		this.color = "Blanco";
		this.consumo_energetico = 'F';
		this.peso = peso;
	}




	public Electrodomestico(int precio_base, String color, char consumo_energetico, double peso)
	{
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}




	@Override
	public String toString() 
	{
		return "Electrodomestico [Precio Base = " + precio_base + ", Color = " + color + ", Consumo Energetico = "
				+ consumo_energetico + ", Peso = " + peso + "]";
	}




	public int getPrecio_base() {
		return precio_base;
	}




	public String getColor() {
		return color;
	}




	public char getConsumo_energetico() {
		return consumo_energetico;
	}




	public double getPeso() {
		return peso;
	}




	public void setPrecio_base(int precio_base) {
		this.precio_base = precio_base;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


