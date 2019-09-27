package abstrac_factory;

public class Liviano implements Tipo_Carro{
	private Nuevo_Carro Carro;
	
	@Override
	public void Crear_Carro(String tipo) {
		if(tipo== "Grande") {
			Carro= new Crossover();
		}else if(tipo== "Pequeño"){
			Carro= new CityCar();
		}else {
			System.out.println("Tipo de carro no reconocido");
			Carro= null;
		}
		
	}

	@Override
	public void ver_Carro() {
		Carro.get_Carro();
	}

}
