
	public class ContaPoupanca extends Conta {

	    public ContaPoupanca(String nome, String cpf) {  //CONSTRUTOR DA CLASSE CONTAPOUPANÇA
	        super(nome, cpf);                       /// CHAMA O CONSTRUTOR DA CLASSE PAI (CONTA)
	    }

	    public void sacar (double valor){  // METODO SACAR DA CONTA CORRENTE
	    	
	        valor += (valor * 0.01);  // PEGA O VALOR E ACRENCENTA 10% DE JUROS

	        super.sacar(valor);    // CHAMA O METODO SACAR DA CONTA MULTIPLICANDO COM OS 05%
	        
	        
	    }
	}
	

