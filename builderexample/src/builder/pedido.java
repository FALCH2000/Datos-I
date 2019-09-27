package builder;

public class pedido {

	public static void main(String[] args) {
		jefe crear= new jefe();
		builder aguacate= new avocado();
		builder de_la_casa= new casa();
		
		crear.set_emparedado(de_la_casa);
		crear.hacer_emparedado();
		System.out.print(crear.get_emparedado());
		
		jefe crear2= new jefe();
		crear2.set_emparedado(aguacate);
		crear2.hacer_emparedado();
		System.out.print(crear2.get_emparedado());
		
		//Ok aquí voy a comentar algo solo porque me parece importante 
		//resaltar que hay que hacer push

	}

}
