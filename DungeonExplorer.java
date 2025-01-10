import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DungeonExplorer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número total de salas
        int totalSalas = scanner.nextInt();

        // Define as salas com tesouro e as salas com monstro
        List<Integer> salasComTesouro = Arrays.asList(2, 4, 7);
        List<Integer> salasComMonstro = Arrays.asList(3, 6, 8);

        // Percorre todas as salas da masmorra
        for (int sala = 1; sala <= totalSalas; sala++) {
            verificarSala(sala, salasComTesouro, salasComMonstro);
        }

        scanner.close();
    }

    // Função que verifica o conteúdo de uma sala
    private static void verificarSala(int sala, List<Integer> salasComTesouro, List<Integer> salasComMonstro) {
        if (salasComTesouro.contains(sala)) {
            System.out.println("Tesouro na sala " + sala + "!");
        } else if (salasComMonstro.contains(sala)) {
            System.out.println("Monstro na sala " + sala + "!");
        }
    }
}
/*Explicação do código Java:
Scanner: Utilizado para capturar a entrada do número total de salas. O método nextInt() é usado para garantir que o número seja interpretado como um inteiro.
Listas: Usamos Arrays.asList para definir as salas que contêm tesouros ou monstros. Isso permite uma forma mais flexível de manipular esses dados.
Função verificarSala: Como no código JavaScript, extraímos a lógica de verificação de salas para uma função separada, o que torna o código mais modular e fácil de entender.
Controle de fluxo: Assim como no JavaScript, usamos if e else if para determinar o conteúdo das salas.*/* */
