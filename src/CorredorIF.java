public interface CorredorIF extends Comparable<CorredorIF> {
    String getTipoDoCorredor();
    /*
    retorna o tempo que o corredor leva para correr esses metros
     */
    double correDistancia(double distanciaEmMetros);
    /*
    retorn qtde de metros corridos no tempo que foi passado
     */
    double correTempo(double segundos);
}
