public class ContaCorrente  extends  Conta{


    public ContaCorrente(String nome, String cpf) {   //CONSTRUTOR DA CLASSE CONTA CORRENTE
        super(nome, cpf);                            // CHAMA O CONSTRUTOR DA CLASSE PAI (CONTA)
    }

    public void sacar (double valor){   // METODO SACAR DA CONTA CORRENTE
        valor += (valor * 0.1);       // PEGA O VALOR E ACRENCENTA 10% DE JUROS

         super.sacar(valor);

    }
}

