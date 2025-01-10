import java.util.Scanner;

public class Mineracao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a quantidade de golpes informada pelo usuário
        int quantidadeGolpes = scanner.nextInt();

        // Define os tipos de minerais
        String[] minerais = {"Carvao", "Ferro", "Diamante", "Pedra"};

        // Loop para cada golpe
        for (int i = 1; i <= quantidadeGolpes; i++) {
            String mineral = obterMineral(i, minerais);
            // Exibe o número do golpe e o minério obtido
            System.out.println(i + ": " + mineral);
        }

        scanner.close();
    }

    // Função que determina o minério de acordo com o golpe
    private static String obterMineral(int golpe, String[] minerais) {
        return minerais[(golpe - 1) % minerais.length]; // (golpe - 1) para ajustar o índice zero-based
    }
}

/*
Explicação do código Java:
Scanner: O programa usa a classe Scanner para ler a entrada do usuário. O nextInt() captura o número de golpes.

Função obterMineral: A função recebe o número do golpe e o array de minerais, e usa o operador % para garantir que a sequência de minerais se repita. O índice é ajustado subtraindo 1 do golpe para que a contagem comece corretamente em zero (como em arrays).

Estrutura de Loop: O loop percorre todos os golpes, e em cada iteração, imprime o número do golpe seguido pelo mineral correspondente.

Organização e Clareza: O código é modular e bem estruturado, facilitando manutenção e escalabilidade.*/