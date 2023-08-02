package app;
import java.util.Scanner;

import animal.modelo.Animal;
import animal.modelo.Cachorro;
import animal.modelo.Passaro;
import animal.modelo.Peixe;

public class AnimalSimulator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Animal animal = null;
		
		String opcao;
		
		do {
			System.out.println("Escolha o animal:\n1 - Cachorro\n2 - Pássaro\n3 - Peixe\n4 - Sair");
			opcao = scanner.next();
			
			switch(opcao) {
			case "1":
				animal = new Cachorro();
				break;
			case "2":
				animal = new Passaro();
				break;
			case "3":
				animal = new Peixe();
				break;
			case "4":
				System.out.println("Fechando programa");
				animal = null;
				break;
			default:
				System.out.println("Opção inválida");
				animal = null;
				break;
			}
			
			if(animal != null) {
				animal.move();
				animal.emitSound();
				animal = null;
			}
			
		}while(!opcao.equals("4"));
		
		scanner.close();
	}
		
}
