package abstrac_factory;

public class Camion implements Nuevo_Carro{

	private String color;
	private String Marca;	
	
	public Camion() {
		this.color= "Blanco";
		this.Marca= "Isuzu";
	}
	
	public void get_Carro() {
		System.out.println("Su carro es un Camion con las siguientes características: \n"
				+ "Su marca es: " + this.Marca + "\n Su color es: " + this.color);	
	}


}
