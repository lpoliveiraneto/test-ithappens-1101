package br.com.mateus.teste.dominios.formaPagamento;

/**
 * Pagamento
 */
public class Pagamento {

    private int pagamento;

    public Pagamento(int pagamento){
        this.pagamento = pagamento;
    }

    public String pagamento(){
        if(pagamento == 1){
            return "Débito";
        }
        else if(pagamento == 2){
            return "Cartão";
        }else{
            return "Boleto";
        }
    }
}