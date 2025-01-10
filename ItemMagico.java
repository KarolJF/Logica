import java.util.Scanner;

public class ItemMagico {
    // Atributos do item mágico
    private String tipo;
    private int dano;
    private int resistencia;

    // Construtor que inicializa o item mágico
    public ItemMagico(String tipo, int dano, int resistencia) {
        this.tipo = tipo;
        this.dano = dano;
        this.resistencia = resistencia;
    }

    // Método para calcular o dano
    public int calcularDano() {
        // Se o tipo for "arma", o dano é multiplicado por 2
        return tipo.equals("arma") ? dano * 2 : dano;
    }

    // Métodos getter para acessar os atributos
    public String getTipo() {
        return tipo;
    }

    public int getDano() {
        return dano;
    }

    public int getResistencia() {
        return resistencia;
    }

    // Método principal que cria e exibe o item mágico
    public static void main(String[] args) {
        // Scanner para captura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados de entrada
        String tipoItem = scanner.nextLine();
        int danoItem = scanner.nextInt();
        int resistenciaItem = scanner.nextInt();

        // Criação do item mágico
        ItemMagico itemPersonalizado = new ItemMagico(tipoItem, danoItem, resistenciaItem);

        // Exibindo os atributos do item
        System.out.println("Tipo: " + itemPersonalizado.getTipo());
        System.out.println("Dano: " + itemPersonalizado.getDano());
        System.out.println("Resistencia: " + itemPersonalizado.getResistencia());

        // Calculando e exibindo o dano total
        int danoTotal = itemPersonalizado.calcularDano();
        System.out.println("Dano em combate: " + danoTotal);

        // Fechar o scanner
        scanner.close();
    }
}

/* Explicação do Código Java:
Classe ItemMagico:

A classe contém os atributos tipo, dano e resistencia, com um construtor para inicializá-los.
O método calcularDano() verifica se o tipo é "arma". Se for, multiplica o dano por 2; caso contrário, retorna o dano normal.
Entrada e Saída:

O Scanner é usado para capturar os dados do tipo do item, dano e resistência.
O programa cria um objeto ItemMagico e exibe suas propriedades, incluindo o cálculo do dano com o método calcularDano().
Boas Práticas:
Encapsulamento e Métodos Getters:

Os atributos da classe ItemMagico são encapsulados e acessados por métodos getTipo(), getDano(), e getResistencia(), o que facilita a manutenção e a extensibilidade do código.
Lógica Simples e Clara:

O código usa uma lógica simples para calcular o dano com base no tipo de item e as entradas fornecidas pelo usuário, tornando-o fácil de entender.
Reusabilidade:

A classe ItemMagico é reutilizável para criar diferentes tipos de itens mágicos, seja para outros itens de combate ou itens mágicos com diferentes lógicas de cálculo de dano.*/