package animal.modelo;

public abstract class AnimalBase implements Animal{
	private String tipo;
	
	public AnimalBase(String tipo) {
		this.tipo = tipo;
	}
	
	public void move() {
		System.out.println(tipo + " se move");
	}
}
