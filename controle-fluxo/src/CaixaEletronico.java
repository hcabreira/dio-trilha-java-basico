public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        else 
         System.out.println("Saque não efetuado! Saldo insuficiente");

        System.out.println(saldo);
    }
}
