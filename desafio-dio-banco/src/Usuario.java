public class Usuario {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Symon Lima");
        
        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);
        corrente.depositar(1000);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        

    }

}
