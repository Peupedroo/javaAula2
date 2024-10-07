import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Calcular rendimento da poupança");
            System.out.println("4. Definir taxa Selic");
            System.out.println("5. Verificar saldo");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    conta.calcularRendimentoPoupanca();
                    break;

                case 4:
                    System.out.print("Digite o valor da taxa Selic: ");
                    double selic = scanner.nextDouble();
                    conta.setSelic(selic);
                    System.out.println("Taxa Selic definida como " + selic + "%.");
                    break;

                case 5:
                    System.out.printf("Seu saldo atual é: R$%.2f\n", conta.getSaldo());
                    break;

                case 6:
                    System.out.println("Saindo do sistema.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
