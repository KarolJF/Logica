import java.util.ArrayList;
import java.util.List;

public class HeroJourney {

    // Função que calcula a posição final do herói
    public static int calcularPosicaoFinal(int posicaoInicial, int numeroDePassos) {
        return posicaoInicial + numeroDePassos;
    }

    public static void main(String[] args) {
        // Conjuntos de entradas simulados para o desafio
        List<int[]> entradas = new ArrayList<>();
        entradas.add(new int[]{2, 3});  // Saída esperada: 5
        entradas.add(new int[]{15, 3}); // Saída esperada: 18
        entradas.add(new int[]{10, 6}); // Saída esperada: 16

        // Processamento e saída
        for (int[] entrada : entradas) {
            int posicaoInicial = entrada[0];
            int numeroDePassos = entrada[1];

            int posicaoFinal = calcularPosicaoFinal(posicaoInicial, numeroDePassos);

            System.out.printf("Posicao final do heroi: %d\n", posicaoFinal);
        }
    }
}

