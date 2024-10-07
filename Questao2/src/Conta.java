public class Conta {
    private double saldo;
    private double chequeEspecial = 10000.00;
    private String nome;
    private double selic;
    public void setSelic(double selic) {
        this.selic = selic;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else if (valor <= saldo + chequeEspecial) {
                double restante = valor - saldo;
                saldo = 0;
                chequeEspecial -= restante;
                System.out.println("Saque de R$" + valor + " realizado utilizando o cheque especial.");
            } else {
                System.out.println("Saldo insuficiente, mesmo com o cheque especial.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }


    public void calcularRendimentoPoupanca() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.printf("Rendimento de R$%.2f aplicado. Novo saldo: R$%.2f\n", rendimento, saldo);
    }


    public double getSaldo() {
        return saldo;
    }


    public double getChequeEspecialDisponivel() {
        return chequeEspecial;
    }
}

