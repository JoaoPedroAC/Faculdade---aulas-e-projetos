// Anotações em linha

/* 
    Anotações em bloco
*/

// esse tipo de anotações é usado para gerar documentação e é capitado por plugins  
/**
    * Função para somar parametros
    * @param {number} a - primeiro número
    * @param {number} b - segundo número
    * @returns {number} - soma dos números
    * 
    * @example
    * let resultado = soma(1, 2);
    * console.log(resultado); // 3
    */
function soma(a, b) {
    return a + b;
}
let resultado = soma(2, 2);
console.log(resultado);