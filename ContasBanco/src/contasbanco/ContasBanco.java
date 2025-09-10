package contasbanco;

public class ContasBanco {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBancaria cc = new ContaCorrente(1000.0);
        ContaBancaria cp = new ContaPoupanca(5000.0);

        
        System.out.println("Saldo inicial CC: R$" + cc.getSaldo());
        cc.depositar(200.0);
        cc.sacar(150.0);
        System.out.println("Saldo final CC: R$" + cc.getSaldo());

        System.out.println("\n--------------------\n");

        
        System.out.println("Saldo inicial CP: R$" + cp.getSaldo());
        cp.depositar(500.0);
        cp.sacar(1000.0);
        System.out.println("Saldo final CP: R$" + cp.getSaldo());
        
    }
    
}
