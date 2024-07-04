public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente henrique = new Cliente();
        henrique.setNome("Henrique");
        
        Conta cc = new ContaCorrente(henrique);
        cc.depositar(100);

        Conta poupamca = new ContaPoupanca(henrique);

        cc.transferir(30, poupamca);        

        cc.imprimirExtrato();
        poupamca.imprimirExtrato();
    }
}
