// imagine que está em uma festa de aniversario.
// Os blocos de codigo são como diferentes areas da festa, onde varias atividades acontecem.
// Por exemplo, a area de dança, a area de comida, a area de jogos, etc.

{
  //Area de dança
  console.log("Hora de dançar");
  // Aqui vão as instruções para a pista de dança
}
{
  //Area de jogos
  console.log("Hora de jogar");
  // Aqui vão as instruções para os jogos
}
{
  //Area de comida
  console.log("Hora de comer");
  // Aqui vão as instruções para o buffet
}

// Os reotulos são como etiquetas que você coloca em diferentes atividades durante a festa.
// Imagine que há uma competição de dança, um torneio de jogos e um concurso de comida.

dança: {
  //Area de dança
  for (let d = 0; d < 3; d++) {
    jogos: {
      for (let j = 0; j < 3; j++) {
        if (d === 1 && j === 1) {
          console.log("A competição de dança foi interrompida!");
          break dança;
        }
        console.log(`competidor ${d + 1} está dançando enquanto o competidor ${j + 1} está jogando`);
      }
    }
  }
}
