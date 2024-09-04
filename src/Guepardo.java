import java.util.Objects;
import java.util.Random;

public class Guepardo implements CorredorIF {
    private int idade;
    private int peso;
    private double velocidade; //em metros por segundo

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guepardo guepardo)) return false;
        return getIdade() == guepardo.getIdade() && getPeso() == guepardo.getPeso() && Double.compare(getVelocidade(), guepardo.getVelocidade()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdade(), getPeso(), getVelocidade());
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "idade=" + idade +
                ", peso=" + peso +
                ", velocidade=" + velocidade +
                '}';
    }

    public Guepardo(int idade, int peso) {
        this.idade = idade;
        this.peso = peso;
        Random rand = new Random();
        velocidade = rand.nextDouble(22, 36);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }

    public double getVelocidade() {
        return velocidade;
    }


    @Override
    public String getTipoDoCorredor() {
        return "Guepardo";
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
    public int compareTo(CorredorIF o) {
        if(this.correDistancia(100) == o.correDistancia(100))
            return 0;
        if(this.correDistancia(100) < o.correDistancia(100))
            return -1;
        return 1;
    }
}
