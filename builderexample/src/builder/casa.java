package builder;

public class casa extends builder{

	@Override
	public void build_bread() {
		emparedado.set_bread("Ajonjolí");
		
	}

	@Override
	public void build_meat() {
		emparedado.set_meat("Res");
		
	}

	@Override
	public void build_vegetable() {
		emparedado.set_vegetable("Tomate & Lechuga");
		
	}

	@Override
	public void build_sauce() {
		emparedado.set_sauce("Salsa rosada");
		
	}

	@Override
	public void build_cheese() {
		emparedado.set_cheese("Provolonne");
		
	}

}
