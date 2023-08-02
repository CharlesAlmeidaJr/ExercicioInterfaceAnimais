package animal.modelo;

public class Cachorro extends AnimalBase{
	
	public Cachorro() {
		super("Cachorro");
	}
	
	public void emitSound() {
		System.out.println("Cachorro late");
	}
}
