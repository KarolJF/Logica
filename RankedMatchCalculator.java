import java.util.Scanner;

public class RankedMatchCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número de vitórias: ");
        int victories = scanner.nextInt();

        System.out.print("Digite o número de derrotas: ");
        int defeats = scanner.nextInt();

        // Cálculo do saldo de vitórias
        int saldoVitorias = calcularSaldo(victories, defeats);

        // Determinação do nível do jogador
        String nivel = determinarNivel(victories);

        // Saída do resultado
        System.out.printf("O Herói tem de saldo de %d está no nível de %s\n", saldoVitorias, nivel);

        scanner.close();
    }

    // Função para calcular o saldo de vitórias
    public static int calcularSaldo(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    // Função para determinar o nível do jogador
    public static String determinarNivel(int vitorias) {
        if (vitorias < 10) {
            return "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            return "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            return "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            return "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            return "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            return "Lendário";
        } else {
            return "Imortal";
        }
    }
}
