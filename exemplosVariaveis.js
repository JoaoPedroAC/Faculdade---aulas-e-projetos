// Exemplo de uso de VAR, LET e CONST
const world = "Sou uma constante, externa";

// Declaração de uma variavel VAR
function exemploVar() {
  if (true) {
    // aqui vai checar se minha função é verdadeira
    var msg = "Sou uma variavel VAR, prazer!";
  }
  console.log(msg);
}

// chamando a função exemploVar
exemploVar();

// Checando erros com VAR
var msg = "Sou uma variavel VAR externo, prazer!";
console.log(msg);

// Declaração de uma variavel LET
function exemploLet() {
  if (true) {
    // aqui vai checar se minha função é verdadeira
    let msg = "Sou uma variavel LET, prazer!";
    console.log(msg); // o Let só é visivel dentro do bloco do IF, fora dele o mesmo não existe, diferente do VAR que vale para todo o bloco da função!
  }
  // console.log(msg);
}

// chamando a função exemploLet
exemploLet();

// Checando erros com LET -> é preciso mudar o nome ou remover o VAR com o mesmo nome que esta no escopo global
let msg2 = "Sou uma variavel LET externo, prazer!";
console.log(msg2);

// Declaração de uma variavel CONST
function exemploConst() {
  const msg = "Sou uma variavel CONST, prazer!";
  console.log(msg);
}

// chamando a função exemploConst
exemploConst();

// Exemplo extra de uso de CONST
console.log(world);

// Checando erros com CONST -> não é possivel reatribuir um valor a uma constante
// world = "outa coisa"; // vai dar erro
