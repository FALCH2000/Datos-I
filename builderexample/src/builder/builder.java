package builder;

//this is an abstract class that makes the instance of the "product" and this will be used by children class
public abstract class builder { 
	protected crear_emparedado emparedado;
	
	public String get_emparedado() {
		return emparedado.bread+ "\n" + emparedado.cheese+ "\n" + emparedado.meat
				+ "\n" + emparedado.sauce+ "\n" + emparedado.vegetable;
	}
	public void nuevo_emparedado() {
		emparedado= new crear_emparedado();
	}
	
	//this abstracts methods are build because will be needed in the creation of kinds of sandwich 
	public abstract void build_bread();
	public abstract void build_meat();
	public abstract void build_vegetable();
	public abstract void build_sauce();
	public abstract void build_cheese();
	
}
