public class Corredrone implements CorredorIF {
    private double alturaMaxima;
    private double velocidade; //m/s
    private String modelo;

    public Corredrone(double alturaMaxima, String modelo) {
        this.alturaMaxima = alturaMaxima;
        this.modelo = modelo;
        velocidade = 6;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String getTipoDoCorredor() {
        return "Corredrone";
    }

    @Override
    public double correDistancia(double distanciaEmMetros) {
        return distanciaEmMetros/velocidade;
    }

    @Override
    public double correTempo(double segundos) {
        return segundos * velocidade;
    }

    @Override
    public double voar() {
        return 0;
    }

    @Override
    public void planar() {

    }

    @Override
    public boolean pousar() {
        return false;
    }

    public int compareTo(CorredorIF o) {
        if(this.correDistancia(100) == o.correDistancia(100))
            return 0;
        if(this.correDistancia(100) < o.correDistancia(100))
            return -1;
        return 1;
    }
}
