package abstrac_factory;

public class Cliente {

	public static void main(String[] args) {
		
		Tipo_Carro MiCarro= new Carga();
		MiCarro.Crear_Carro("Pequeño");
		MiCarro.ver_Carro();

	}

}
