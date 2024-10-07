public class Calculo {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    public void setDistancia (double distancia){
        this.distancia = distancia;
    }
    public void setTempoEspera (int tempoEspera){
        this.tempoEspera = tempoEspera;
    }
    public void setTarifaBase (double tarifaBase){
        this.tarifaBase = tarifaBase;
    }
    public void setFatorDemanda (double  fatorDemanda){
        this.fatorDemanda = fatorDemanda;
    }

    public double getDistancia(){
        return distancia;
    }
    public int getTempoEspera (){
        return tempoEspera;
    }
    public double getTarifaBase (){
        return tarifaBase;
    }
    public double getFatorDemanda (){
        return fatorDemanda;
    }


    public double calcularValorCorrida (){
        double valorFinal = (distancia * 2) + (tempoEspera * 2) + tarifaBase * fatorDemanda;
        return valorFinal;

    }

    public double exibirDetalhes (){
        System.out.printf("o valor final ficou %f, com a distancia %f, com o tempo %d, com o fator demanda %f, e com a tarifabase %f", calcularValorCorrida(), getDistancia(), getTempoEspera(), getFatorDemanda(), getTarifaBase());
        return calcularValorCorrida();
    }

}
