	import java.util.Scanner;

	public class contaMain {                       // Criando a Classe Principal         
		
		 static Conta cadastroCliente = null;    //Classe Conta, "STATIC" recebndo NULL o cadastro do cliente
			
		    public static void main(String[] args){iniciar();}  // METODO MAIN PARA CHAMAR O BOTÃO INICIAR  

		    public static void iniciar(){                             // Criação do Método Iníciar 
		        int opcao;                                           // Variável que vai receber os valores
		        Scanner entrada = new Scanner(System.in);           // importando a classe Scanner, contida no pacote
		        do{ exibeMenu();                                   // Método Exibir Menu
		            opcao = entrada.nextInt();                    // Invocando o metodo de LEITURA DO INICIAR
		            escolheOpcao(opcao);}
		        while(opcao!=6);}                              // Enquanto a opção for DIFERENTE DE 6 

		    public static void exibeMenu(){                  // Criação da classe de exibição do menu
		    	System.out.println("************************************************************************************************");
		    	System.out.println("        Seja Bem Vindo ao LuluADV Bank, Pronto(a) pra abrir sua conta conosco!");
		    	System.out.println("************************************************************************************************");
		        System.out.println(" \nEscolha Uma das Opções Abaixo Desejada\n");
		        System.out.println("1 - Criar Conta  ");
		        System.out.println("2 - Consultar Extrato");
		        System.out.println("3 - Sacar");
		        System.out.println("4 - Depositar");
		        System.out.println("5 - PIX");
		        System.out.println("6 - Sair\n");
		        System.out.print("Digite aqui a sua Opção: ");
		        
		    }

		    public static void escolheOpcao(int opcao){        // METODO DE ESCOLHA DA OPÇÃO
		        double valor;                                 // VARIAVÉL GUARDADA
		        int tipoConta; 						         // VARIAVÉL GUARDADA     
		        Scanner entrada = new Scanner (System.in);  // INSTANCIANDO A CLASSE

		        switch( opcao ){                          // ESCOLHENDO A OPÇÃO
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------	        
	                   //CASO SEJA ESCOLHIDO A OPÇÃO 1, VAI SER APRESENTADO NA TELA PARA CRIAR A CONTA POUPANÇA OU CORRENTE//	            
		        case 1:
		        	    System.out.println("************************************************************************************************");
		                System.out.println("************************************************************************************************");
		                              
		                System.out.println("Digite 1 para Conta Poupança e 2 Para Conta Corrente\n");          // MENSAGEM APRESENTADA A SER ESCOLHIDA
		                tipoConta = entrada.nextInt();     // ESCOLHE A OPÇÃO DO NIVÉL DE CONTA, TIPO DA CONTA SE CORRENTE OU POUPANÇA
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		                if (tipoConta == 1){                                                                   // (SE O TIPO DA CONTA FOR POUPANÇA ELE VAI PEDIR AS INFORMAÇÕES ABAIXO)//
		                    System.out.println("Digite o CPF do Cliente:");
		                    String cpf = entrada.next();                                                      // VARIAVÉL QUE RECEBE O NUMERO DO CPF
		                    System.out.println("*************************************************************");
		                    System.out.println("Digite o seu Nome Completo do Cliente:");
		                    String nome = entrada.next();                                                  // VARIAVÉL QUE RECEBE O NOME DIGITADO
		                    System.out.println("*************************************************************");
		                    cadastroCliente = new ContaPoupanca (nome,cpf);                             // O CRIA A CLASSE CONTA POUPANÇA
		                    System.out.println("Conta Poupança Criada com Sucesso!\nConta: "+cadastroCliente.getNumConta()+"\nAgencia: "+cadastroCliente.getAgencia());} 
		                    // METODO PARA MOSTRA OS DADOS DA CONTA QUE FOI CRIADA
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------------	                
		                else if (tipoConta == 2) {                                                  // (SE O TIPO DA CONTA FOR CORRENTE ELE VAI PEDIR AS INFORMAÇÕES ABAIXO)//
		                    System.out.println("Digite o CPF do Cliente: ");                       // VARIAVÉL QUE RECEBE O NUMERO DO CPF
		                    String cpf = entrada.next();                                          // VARIAVÉL QUE RECEBE O NUMERO DO CPF
		                    System.out.println("*************************************************************");
		                    System.out.println("Digite o seu Nome Completo do Cliente:");       // DIGITANDO O NOME DO CLIENTE
		                    String nome = entrada.next();                                      // VARIAVÉL QUE RECEBE O NOME DIGITADO
		                    System.out.println("*************************************************************");
		                    cadastroCliente = new ContaCorrente (nome,cpf);                  // O CRIA A CLASSE CONTA CORRENTE
		                    System.out.println("Conta Corrente Criada com Sucesso!\nConta: "+cadastroCliente.getNumConta()+"\nAgencia "+cadastroCliente.getAgencia());}
		                                                                                   // METODO PARA MOSTRA OS DADOS DA CONTA QUE FOI CRIADA
			                else {System.out.println("Opção Invalida"); }                 // SE O ESCOLHIDO NÃO FOR 1 NEM 2 ENTÃO ELE DAR A MSG
		                
		                break;                                                         // PAUSA
	//----------------------------------------------------------------------------------------------------------------------------------------------------------	            	                
		            case 2:                                                          //CASO ESCOLHA A OPÇÃO 2 ELE MOSTRA O EXTRATO DO CLIENTE
		                cadastroCliente.extrato();                                  //CHAMANDO O METODO CRIADO DA CLASE CONTA.
		                break;                                                     // PAUSA
	//----------------------------------------------------------------------------------------------------------------------------------------------------------	            
		            case 3:
		                System.out.print("Quanto Deseja Sacar: ");              // MOSTRANDO A OPÇÃO DE SACAR DA CONTA DO CLIENTE
		                valor = entrada.nextDouble();                          // RECEBENDO O VALOR A SER SACADO
		                cadastroCliente.sacar(valor);                         //METODO SACAR DA CONTA DO CLIENTE
		                break;                                               // PAUSA
	//----------------------------------------------------------------------------------------------------------------------------------------------------------	            
		                
		            case 4:
		                System.out.print("Quanto Deseja Depositar: ");    // MOSTRANDO A OPÇÃO DE DEPOSITAR DA CONTA DO CLIENTE
		                valor = entrada.nextDouble();                    // RECEBENDO O VALOR A SER DEPOSITADO     
		                cadastroCliente.depositar(valor);               // CHAMANDO O METODO DEPOSITAR
		                break;                                         // PAUSA
	//----------------------------------------------------------------------------------------------------------------------------------------------------------	            	            
		        	case 5:
		        		System.out.print("Qual Valor Que Deseja Fazer o PIX: ");  
		        		valor = entrada.nextDouble();
		        		cadastroCliente.pix(valor);
		        		break;  
		        		
	//----------------------------------------------------------------------------------------------------------------------------------------------------------	
		                
		            case 6:                                          
		                System.out.println("Sistema Encerrado.");   // MOSTRANDO A OPÇÃO DE ENCERRAMENTO
		                break;                                     // PAUSA
		            default:                                      // SE NÃO FOR NENHUMA OPÇÕES DO CASE ELE ENTRA NESSA OPÇÃO
		                System.out.println("Opção Inválida"); //  ENTRANDO NA OPÇÃO    
		                
	//----------------------------------------------------------------------------------------------------------------------------------------------------------	            
		        }

       }

}		    
	