import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta bancaria!");
        int numero = Integer.valueOf(scanner.next());

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número do saldo da conta bancária do cliente");
        double saldo = Double.valueOf(scanner.next());

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$ "+saldo+" já está disponível para saque.");
    }   
}
