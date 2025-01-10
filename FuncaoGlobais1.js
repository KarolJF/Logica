// Funções globais 'gets' e 'print' são fornecidas pela plataforma DIO

// Lê o número total de salas
const totalSalas = parseInt(gets(), 10);

// Define as salas com tesouro e as salas com monstro
const salasComTesouro = [2, 4, 7];
const salasComMonstro = [3, 6, 8];

// Função que verifica o conteúdo de uma sala
function verificarSala(sala) {
  const temTesouro = salasComTesouro.includes(sala);
  const temMonstro = salasComMonstro.includes(sala);

  // Verifica e imprime o que há na sala
  if (temTesouro) {
    print(`Tesouro na sala ${sala}!`);
  } else if (temMonstro) {
    print(`Monstro na sala ${sala}!`);
  }
}

// Percorre todas as salas da masmorra
for (let sala = 1; sala <= totalSalas; sala++) {
  verificarSala(sala);
}
