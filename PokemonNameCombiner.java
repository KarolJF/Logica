import java.util.Scanner;

public class PokemonNameCombiner {

    public static void main(String[] args) {
        // Cria um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lê a entrada (primeira parte do nome do Pokémon)
        String nomeEntrada = scanner.nextLine();

        // Chama a função para gerar o nome completo do Pokémon
        String nomeCompleto = combinarNomePokemon(nomeEntrada);

        // Exibe o nome completo do Pokémon
        System.out.println(nomeCompleto);

        // Fecha o scanner
        scanner.close();
    }

    // Função que combina a parte do nome com o sufixo 'saur' para formar o nome completo do Pokémon
    private static String combinarNomePokemon(String palavra) {
        // Combina a entrada com 'saur' para formar o nome completo do Pokémon
        return palavra + "saur";
    }
}

/* Explicação do código em Java:
Scanner:

O Scanner é usado para capturar a entrada do usuário (o prefixo do nome do Pokémon).
Função combinarNomePokemon:

A função recebe o prefixo do nome e o combina com "saur" para formar o nome completo do Pokémon.
Entrada e Saída:

O nome do Pokémon é lido com scanner.nextLine() e o resultado final é exibido com System.out.println(). */