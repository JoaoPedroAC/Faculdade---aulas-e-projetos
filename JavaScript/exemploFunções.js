// FUNÇÃO REGULAR
function soma(a, b) {
  return a + b;
}
let resultadoSoma = soma(2, 2);
console.log(resultadoSoma, "\n");
// console.log(soma(2, 2)); // É a mesma coisa que a linha acima

// FUNÇÃO ANÔNIMA
// Declaração de função anônima e atribuição a uma variável
let multiplacacaoParametros = function (params1, params2) {
  console.log("1º Parametro: " + params1);
  console.log("2º Parametro: " + params2);

  let resultado = params1 * params2;
  console.log("Resultado: " + resultado);
  return resultado;
};
// Chamada da função anônima através da variável
let multiplicacao = multiplacacaoParametros(3, 3);
console.log("Resultado da chamada da função multiplacacaoParametros: " + multiplicacao);

// Funregular que aceita outra função como argumento
function outraFuncao(funcao, valor1, valor2) {
  console.log("\nExecutando uma função como argumento de outra função");
  return funcao(valor1, valor2);
}
// Passando a função multiplicacaoParametros como argumento para a função outraFuncao
let resultadoDaFuncao = outraFuncao(multiplacacaoParametros, 5, 5);
console.log("Resultado da função multiplicacaoParametros passada como argumento: " + resultadoDaFuncao);

// Definindo uma função anônima imediatamente
let resultadoImediato = (function (x, y) {
  console.log("\nFunção anônima imediatamente chamada");
  console.log("1º Parametro: " + x);
  console.log("2º Parametro: " + y);
  return x - y;
})(4, 4);

let resultado = resultadoImediato;
console.log("Resultado da função anônima imediatamente chamada: " + resultado);

// Arrow Function
// Arrow Function que recebe 2 parâmetros e retorna a divisão deles
let divideParametros = (a, b) => {
  console.log("\nArrow Function aqui!");
  console.log("1º Parametro: " + a);
  console.log("2º Parametro: " + b);
  return a / b;
};
let divisao = divideParametros(10, 2);
console.log("Resultado da função divideParametros: " + divisao);

// Arrow Function em 1 unica linha
let dobrar = (n) => n * 2;
console.log("Dobrando o valor:", dobrar(divideParametros(20, 2)));

// callback com arrow function
let numeros = [1, 2, 3, 4, 5];
let numerosDobrados = numeros.map((numero) => numero * 2);
console.log("\nNumeros dobrados do callback:", numerosDobrados);

// Arrow Function mais complexo
let saudacao = (nome, idade) => {
  let mensagem = `Meu nome é ${nome} e tenho ${idade} anos`;
  return mensagem;
};
console.log(`\n${saudacao("João", 25)}`);
