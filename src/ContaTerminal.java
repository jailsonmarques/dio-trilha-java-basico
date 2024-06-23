import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens solicitando os dados que o nosso usuário deve fornecer

        // obter pela classe Scanner os valores digitados no terminal

        // Exibir a mensagem de conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da sua conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        double saldo = 237.48;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já esta disponível para saque");

    }

}
