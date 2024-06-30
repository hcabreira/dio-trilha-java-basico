import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //System.out.println("Qual será o valor do seu primeiro depósito?");
        //Double saldo = scanner.nextDouble();

        //Exibir as mensagens para nosso usuario
        System.out.println("Por favor digite o número da Agência!");
        //Obter pela scanner os valores digitais
        String agencia = scanner.next();

        System.out.println("Por favor digite o número da Conta!");
        Integer conta = scanner.nextInt();

        System.out.println("Por favor Informe seu primeiro nome!");
        String nome = scanner.next();

        System.out.println("Por favor Informe seu sobrenome!");
        String sobrenome = scanner.next();

        System.out.println("Qual será o valor do seu primeiro depósito?");
        double saldoConta = scanner.nextDouble();

        //Exibir a mensagem de conta criada      

        System.out.println("Olá "+ nome + " "+ sobrenome +
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + conta + " e seu saldo " 
        + saldoConta +" já está disponível para saque");


       

        

       
    }
}
