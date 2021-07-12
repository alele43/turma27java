package POO;

public class Conta {
	//atributos
    private int numero;
    private double saldo;
    private double limite;
    
    // constructor
    public Conta(int numero) {
    	this.numero = numero;
    }
    
    public Conta(int numero, double saldo) {
    	this.numero = numero;
    	this.saldo = saldo;
    }
    	//sobrecarga no constructor
    public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
    
  //ENCAPSULAMENTO - GETters and setters

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
    
	//METODOS 
	
	public void imprimeExtrato() {
		System.out.println("Conta numero: " +numero+ " Saldo atual: R$ " +saldo);
	}
    
	//valorSaque é uma variavél do metodo saca sem retorno
	public void saca(double valorSaque) {
		if (valorSaque < saldo || valorSaque <=0) {
			System.out.println("Saldo indisponível ou valor negativo...");
		} else {
			saldo = saldo - valorSaque;
			System.out.println("Saque realizado! ");
		}
		
	}
	
	public void deposita(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
