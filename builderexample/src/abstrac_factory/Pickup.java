package abstrac_factory;

public class Pickup implements Nuevo_Carro{
	
	private String color;
	private String Marca;	
	
	public Pickup() {
		this.color= "Plateado";
		this.Marca= "Toyota Hilux";
	}
	
	public void get_Carro() {
		System.out.println("Su carro es un Pickup con las siguientes características: \n"
				+ "Su marca es: " + this.Marca + "\n Su color es: " + this.color);	
	}

}
