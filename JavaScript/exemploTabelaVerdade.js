// Tabela verdade
// operador AND (&&)
const t = true;
const f = false;

console.log(` True && True: ${t && t}`); // true
console.log(`True && False: ${t && f}`); // false

// operador OR (||)
console.log(`True || True: ${t || t}`); // true
console.log(`False || False: ${f || f}`); // false

// operador NOT (!)
console.log(`!True: ${!t}`); // false
console.log(`!False: ${!f}`); // true

// combinação de operadores
const comboUm = (t && f) || t;
const comboDois = (t || f) && !f;
console.log(`(True && False) || True: ${comboUm}`); // true
console.log(`(True || False) && !False: ${comboDois}`); // true

let a = 8;

let b = 3;

let resultado = (a + b * 2) > (a % b) && a != b;
console.log(resultado); // true