// Definindo a classe Heroi
class Heroi {
        // Construtor da classe para inicializar as propriedades do herói
        constructor(nome, idade, tipo) {
          this.nome = nome;
          this.idade = idade;
          this.tipo = tipo;
        }
      
        // Método de ataque que exibe a mensagem adequada conforme o tipo de herói
        atacar() {
          let ataque;
      
          // Usando uma estrutura condicional para determinar o ataque baseado no tipo do herói
          switch (this.tipo.toLowerCase()) {
            case 'mago':
              ataque = 'magia';
              break;
            case 'guerreiro':
              ataque = 'espada';
              break;
            case 'monge':
              ataque = 'artes marciais';
              break;
            case 'ninja':
              ataque = 'shuriken';
              break;
            default:
              ataque = 'ataque desconhecido';
          }
      
          // Exibindo a mensagem no formato esperado
          console.log(`O ${this.tipo} atacou usando ${ataque}`);
        }
      }
      
      // Criando instâncias de heróis com diferentes tipos
      const heroi1 = new Heroi("Arthur", 30, "guerreiro");
      const heroi2 = new Heroi("Merlin", 50, "mago");
      const heroi3 = new Heroi("Li", 25, "monge");
      const heroi4 = new Heroi("Shinobi", 28, "ninja");
      
      // Chamada ao método atacar para cada herói
      heroi1.atacar();
      heroi2.atacar();
      heroi3.atacar();
      heroi4.atacar();
      