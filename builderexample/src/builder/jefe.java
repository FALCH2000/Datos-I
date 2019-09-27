package builder;

public class jefe {
	private builder emparedado;
	
	public void set_emparedado(builder emp) {
		emparedado= emp;
	}
	public String get_emparedado() {
		return emparedado.get_emparedado();
	}
	
	public void hacer_emparedado() {
		emparedado.nuevo_emparedado();
		emparedado.build_bread();
		emparedado.build_cheese();
		emparedado.build_meat();
		emparedado.build_sauce();
		emparedado.build_vegetable();
	}
}
