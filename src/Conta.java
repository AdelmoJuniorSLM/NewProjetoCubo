	import java.util.Random;

	public class Conta {                                   // CLASSE CONTA

	    private String cpf, nome;                        // ATRIBUTOS VARIAVÉIS DA CONTA
	    private int numConta;                           // ATRIBUTOS VARIAVÉIS DA CONTA
	    private int agencia = 5863;                   // ATRIBUTOS VARIAVÉIS DA CONTA
	    private double saldo;                         // ATRIBUTOS VARIAVÉIS DA CONTA

	    Random random = new Random();                                   // MÉTODO PARA GERAR NÚMERO DA CONTA

	    public Conta(String nome, String cpf){                        // CONSTRUTOR DA CLASSE CONTA
	        this.nome = nome;                                        //  RECEBENDO O VALOR PARA OS ATRIBUTOS
	        this.cpf = cpf;                                          // RECEBENDO O VALOR PARA OS ATRIBUTOS
	        this.numConta = random.nextInt(1000); }                    // RECEBENDO O VALOR ALEATORIO PARA O NUMERO DA CONTA

	    public String getCpf() {return cpf; }                    // METODOS GET

	    public void setCpf(String cpf) { this.cpf = cpf; }      // METODOS SET

	    public String getNome() {return nome; }               //  METODOS GET

	    public void setNome(String nome) {this.nome = nome; }   // METODOS SET

	    public int getNumConta() {return numConta; }          // METODOS GET 

	    public void setNumConta(int numCOnta) {this.numConta = numCOnta;}  // METODOS SET

	    public int getAgencia() {return agencia;}         // METODOS GET

	    public void setAgencia(int agencia) {this.agencia = agencia;}    // METODOS SET

	    public double getSaldo() {return saldo;}     // METODOS GET
	  
	    public void sacar(double valor){           // METODO DE SACAR
	        if (this.saldo >= valor){             // SE O SALDO FOR MAIOR QUE O VALOR ELE SACA
	            this.saldo -= valor;
	            System.out.println("Saque Efetuado, porém Lembresse que Você tem juros");
	        	System.out.println(); }           // SE O VALOR FOR MENOR QUE O SALDO
	        else{System.out.print("Saldo insuficiente para o seu Saque, o Saldo Atual é  " +getSaldo());}
	        	System.out.println();}  // A MENSAGEM A SER APRESENTADA 
	              
	   /* public void pix(double valor){           // METODO DE FAZER PIX
	        if (this.saldo >= valor){             // SE O SALDO FOR MAIOR QUE O VALOR ELE PERMITE TRANSFERIR
	            this.saldo -= valor;
	            System.out.println("PIX Efetuado");
	        	System.out.println(); }           
	        else{
	        	System.out.print("Saldo insuficiente para o seu PIX, o Saldo Atual é  " +getSaldo());} // SE O VALOR FOR MENOR QUE O SALDO
	        	System.out.println(); // A MENSAGEM A SER APRESENTADA 
	        			}  
	    */
	    public void pix(double valor) {
			
			System.out.println("\nRealizando Transferência");
			System.out.printf("\nSaldo Anterior: R$%.2f ",this.saldo);
			if(valor <= this.saldo) {
			this.saldo -= valor;
				
			}
			else {
				System.out.println("\nSaldo Insuficiente!"); 
			}
			System.out.printf("\nSaldo Atual R$%.2f", this.saldo);
			System.out.println("\nFim da Transferência!");
			System.out.println("");
		}

	    
	    public void depositar (double valor){ 
	    	 this.saldo += valor;   // METODO DEPOSITAR
	         System.out.println("O Saldo Atual e : "+getSaldo()); // PEGA O SALDO ATUAL E MOSTRA
	         }  
	    
	 public void extrato () {                                 // METODO DO EXTRATO
	       	System.out.println("nome: "+getNome() );         // PEGA O NOME E MOSTRA
	    	System.out.println("cpf: "+getCpf() );          // PEGA O CPF E MOSTRA
	    	System.out.println("conta: "+getNumConta() );  // PEGA O NUMERO DA CONTA E MOSTRA
	       	System.out.println("Saldo: "+getSaldo() );    // PEGA O SALDO ATUAL E MOSTRA
	    }
	}



