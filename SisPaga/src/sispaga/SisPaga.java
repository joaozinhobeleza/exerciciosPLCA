package sispaga;

public class SisPaga {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Pagamento cartao = new PagamentoCartaoCredito(100.0, 0.05); 
        Pagamento boleto = new PagamentoBoleto(100.0, 0.1);      

        System.out.printf("Valor final no Cartão de Crédito: R$%.2f\n", cartao.calcularValor());
        System.out.printf("Valor final no Boleto: R$%.2f\n", boleto.calcularValor());
        
    }
    
}
