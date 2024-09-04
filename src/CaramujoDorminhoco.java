public class CaramujoDorminhoco implements CorredorIF {
    private double distanciaEntreSonecas;//metros
    private double velocidade;

    public CaramujoDorminhoco(double distanciaEntreSonecas) {
        this.distanciaEntreSonecas = distanciaEntreSonecas;
        velocidade = 0.05;
    }

    public double getDistanciaEntreSonecas() {
        return distanciaEntreSonecas;
    }

    public void setDistanciaEntreSonecas(double distanciaEntreSonecas) {
        this.distanciaEntreSonecas = distanciaEntreSonecas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String getTipoDoCorredor() {
        return "Caramujo Dorminhoco";
    }
    @Override
    public double correDistancia(double distanciaEmMetros) {
        double rodadas = distanciaEmMetros/distanciaEntreSonecas;

        return distanciaEmMetros/velocidade + rodadas*2 ;
    }

    @Override
    public double correTempo(double segundos) {
        return segundos * velocidade;
    }

    public int compareTo(CorredorIF o) {
        if(this.correDistancia(100) == o.correDistancia(100))
            return 0;
        if(this.correDistancia(100) < o.correDistancia(100))
            return -1;
        return 1;
    }
}
