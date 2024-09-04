import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int GUEPARDO = 0;
    private static final int CORREDRONE = 1;
    private static final int CARAMUJO_DORMINHOCO = 2;

    public static void main(String[] args) {
        List<CorredorIF> corredores = new ArrayList<>();

        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            corredores.add(criaCorredor(rand.nextInt(3)));
        }

        for (CorredorIF corredor: corredores) {
            double tempo = corredor.correDistancia(1000);
            System.out.println(corredor.getTipoDoCorredor() + ": tempo de " + tempo + " segundos");
        }
        System.out.println("_____________________________________________________________________________");
        Collections.sort(corredores);
        for (CorredorIF corredor: corredores) {
            double tempo = corredor.correDistancia(1000);
            System.out.println(corredor.getTipoDoCorredor() + ": tempo de " + tempo + " segundos");
        }

    }

    private static CorredorIF criaCorredor(int tipo) {
        CorredorIF corredor = null;
        switch (tipo) {
            case GUEPARDO:
                corredor = new Guepardo(1, 70);
                break;
            case CORREDRONE:
                corredor = new Corredrone(100,"abcd");
                break;
            case CARAMUJO_DORMINHOCO:
                corredor = new CaramujoDorminhoco(System.currentTimeMillis()%60);
                break;
        }
        return corredor;
    }
}





















