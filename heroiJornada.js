// Funções de entrada e saída globais fornecidas pela plataforma DIO
// 'gets' para ler dados de entrada e 'print' para exibir resultados.

function calcularPosicaoFinal(posicaoInicial, totalPassos) {
    // A posição final do herói é a soma da posição inicial com o número de passos dados
    return posicaoInicial + totalPassos;
  }
  
  // Lê a posição inicial do herói
  const posicaoInicial = parseInt(gets(), 10);
  
  // Lê o número total de passos que o herói deve dar
  const totalPassos = parseInt(gets(), 10);
  
  // Calcula a posição final
  const posicaoFinal = calcularPosicaoFinal(posicaoInicial, totalPassos);
  
  // Exibe o resultado formatado
  print(`Posicao final do heroi: ${posicaoFinal}`);
  