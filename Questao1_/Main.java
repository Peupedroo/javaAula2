//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Calculo c = new Calculo();
    Scanner sc = new Scanner(System.in);
    int continuar = sc.nextInt();
    do {
        System.out.println("quantos km sao de distancia ");
        c.setDistancia(sc.nextDouble());
        sc.nextLine();

        System.out.println("Quanto tempo de espera ");
        c.setTempoEspera(sc.nextInt());
        sc.nextLine();

        System.out.println("Tarifa base ");
        c.setTarifaBase(sc.nextDouble());
        sc.nextLine();


        System.out.println("fator demanda ");
        c.setFatorDemanda(sc.nextDouble());

        c.calcularValorCorrida();

        c.exibirDetalhes();




        continuar = sc.nextInt();
    }while (continuar == 2);
    }
}