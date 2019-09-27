package abstrac_factory;

public class CityCar implements Nuevo_Carro {

	private String color;
	private String Marca;	
	
	public CityCar() {
		this.color= "Azul";
		this.Marca= "Kia";
	}
	
	public void get_Carro() {
		System.out.println("Su carro es un CityCar con las siguientes características: \n"
				+ "Su marca es: " + this.Marca + "\nSu color es: " + this.color);	
	}
}
