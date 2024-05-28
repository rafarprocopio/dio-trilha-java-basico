import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //TO DO: Conhecer e importar a classe SCANNER

        //Exibir as mensagens para os nossos usuários

        //Obeter pela classe scanner os valores digitados pelo terminal

        //Exibir a mensagem conta criada
       

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();

    System.out.println("Por favor, digite da agência");
        String numeroAgencia = scanner.next();

     System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();

    System.out.println("Por favor, digite o saldo da conta");
        double saldo = scanner.nextDouble();

    //imprimindo os dados obtidos pelo usuario
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.1021");


    }
}
