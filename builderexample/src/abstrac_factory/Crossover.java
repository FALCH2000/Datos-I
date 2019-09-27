package abstrac_factory;

public class Crossover implements Nuevo_Carro{
	
	private String color;
	private String Marca;	
	
	public Crossover() {
		this.color= "Rojo";
		this.Marca= "Renault Stepway";
	}
	
	public void get_Carro() {
		System.out.println("Su carro es un Crossover con las siguientes características: \n"
				+ "Su marca es: " + this.Marca + "\n Su color es: " + this.color);	
	}
}
