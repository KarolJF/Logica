
// Definindo a classe Heroi
public class Heroi {
        // Atributos da classe
        private String nome;
        private int idade;
        private String tipo;
    
        // Construtor da classe
        public Heroi(String nome, int idade, String tipo) {
            this.nome = nome;
            this.idade = idade;
            this.tipo = tipo;
        }
    
        // Método de ataque que exibe a mensagem de ataque baseado no tipo do herói
        public void atacar() {
            String ataque;
            
            // Condicional para definir o tipo de ataque baseado no tipo do herói
            switch (this.tipo.toLowerCase()) {
                case "mago":
                    ataque = "magia";
                    break;
                case "guerreiro":
                    ataque = "espada";
                    break;
                case "monge":
                    ataque = "artes marciais";
                    break;
                case "ninja":
                    ataque = "shuriken";
                    break;
                default:
                    ataque = "ataque desconhecido";
            }
    
            // Exibindo a mensagem no formato correto
            System.out.println("O " + this.tipo + " atacou usando " + ataque);
        }
    
        // Método principal para testar a classe Heroi
        public static void main(String[] args) {
            Heroi heroi1 = new Heroi("Arthur", 30, "guerreiro");
            Heroi heroi2 = new Heroi("Merlin", 50, "mago");
            Heroi heroi3 = new Heroi("Li", 25, "monge");
            Heroi heroi4 = new Heroi("Shinobi", 28, "ninja");
    
            // Chamadas ao método atacar
            heroi1.atacar();
            heroi2.atacar();
            heroi3.atacar();
            heroi4.atacar();
        }
    }
    
