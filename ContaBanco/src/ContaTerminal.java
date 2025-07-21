import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        String agenciaConta = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt() ;
        scanner.nextLine();
        System.out.print("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
