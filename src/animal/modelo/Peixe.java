package animal.modelo;

public class Peixe extends AnimalBase{
	
	public Peixe() {
		super("Peixe");
	}
	
	public void emitSound() {
		System.out.println("Peixe não emite som");
	}

}
