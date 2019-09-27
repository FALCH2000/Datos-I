package abstrac_factory;

public class Carga implements Tipo_Carro{
	private Nuevo_Carro Carro;
	
	@Override
	public void Crear_Carro(String tipo) {
		if(tipo== "Grande") {
			Carro= new Camion();
		}else if(tipo== "Pequeño"){
			Carro= new Pickup();
		}else {
			System.out.println("Tipo de carro no reconocido");
			Carro= null;
		}
		
	}

	@Override
	public void ver_Carro() {
		try {
			Carro.get_Carro();
		}catch(Exception e) {
			System.out.println("El tipo de carro que ha ingresado no existe");
		}
	}

}
