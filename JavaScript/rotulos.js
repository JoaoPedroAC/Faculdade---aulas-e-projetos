/**
 * Rotulos
 */
// Serve para rotular um bloco de código faazendo com que o código pule para o rótulo
rotulo:for (let i = 0; i <= 5; i++) {
    console.log(`O I vale ${i}`);
    for (let j = 0; j < 5; j++) {
      if (j == 2) {
        continue rotulo;
      }
      console.log(`O J vale ${j}`);
    }
}