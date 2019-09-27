package builder;

public class avocado extends builder{

	@Override
	public void build_bread() {
		emparedado.set_bread("Orégano");
		
	}

	@Override
	public void build_meat() {
		emparedado.set_meat("Pollo");
		
	}

	@Override
	public void build_vegetable() {
		emparedado.set_vegetable("Aguacate");
		
	}

	@Override
	public void build_sauce() {
		emparedado.set_sauce("Mostaza miel");
		
	}

	@Override
	public void build_cheese() {
		emparedado.set_cheese("Americano");
		
	}
	

}
