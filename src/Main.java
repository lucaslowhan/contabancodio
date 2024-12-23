import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
        System.out.println("Digite o número da conta:");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo:");
        double saldoCliente = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco" +
                ", sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente +
                " já está disponivel para saque.");
    }

}