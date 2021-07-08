package programas;

import POO.Aviao;

public class programaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		aviao1.modelo = "BIMOTOR";
		aviao1.rodas= 3;
		aviao1.tipo= "PASSAGEIRO 14 LUGARES";
		aviao1.noAr= false;
		aviao1.ligado= false;
		aviao1.velocidade=0;
		
		//vamos colocar esse aviao pra voar ...
		aviao1.ligar();
		aviao1.aumentarVelocidade();
		System.out.println("Passageiros, estamos decolando!");
		aviao1.decolando();
		System.out.println("Passageiros estamos voando a "+aviao1.velocidade+" noz!");
		aviao1.diminuirVelocidade();
		System.out.println("Passageiros, estamos pousando!");
		aviao1.pousar();
		System.out.println("Você chegou ao seu destino!");
		
		

	}

}
