// Exemplo de Array

// Criar Array
let array1 = [];
// Ou
let array2 = new Array();

// Adicionando Array
console.log("\nAdicionando elementos do Array");

array1.push("teste 1", 20); // vai adicionar elemente na ultima posição
array2.push("Jonas", "Rio");

console.log("Array 1:", array1);
console.log("Array 2:", array2);

// Acessar elemntos de um Array
console.log("\nAcessando elementos do Array");

let firstElement = array1[0];
let secondElement = array2[1];
let thirdElement = array2[2];

console.log("Array 1:", firstElement);
console.log("Array 2:", secondElement);
console.log("Erro no array 2:", thirdElement);

// Modificar o Array
console.log("\nModificando elementos do Array");

array1[0] = "Testado";
array2.splice(1, 1, "SP"); // Esse metodo adiciona e/ou remove elementos de um array sem deixar "buracos" (qtd de elementos add, qtd removidos, o que sera add), sempre removendo o ultimo para o primeiro lugar!

console.log("Array 1:", array1);
console.log("Array 2:", array2);

// Uso de outros metodos do Array
console.log("\nMostrando metodos do Array");

let frutas = ["Maça", "Goiaba", "Abacate", "Manga"]; // 0 .. 3

console.log("Array inicial:",frutas);
console.log("Comprimento do Array:",frutas.length);

// Usando o metodo push()
console.log("\nMostrando metodo push()");

let ultimoAdicionado = frutas.push("Morango");

console.log("Array atualizado:",frutas);
console.log("Comprimento do Array:",frutas.length);

// Usando o metodo pop(), ele remove sempre da direita, ou seja, do último lugar
console.log("\nMostrando metodo pop()");

let ultimaFruta = frutas.pop();

console.log("Array atualizado:",frutas);
console.log("Eelemento removido:",ultimaFruta);
console.log("Comprimento do Array:",frutas.length);

// Usando o metodo shift(), ele remove sempre da esquerda, ou seja, o 1º lugar
console.log("\nMostrando metodo shift()");

let primeiraFruta = frutas.shift();

console.log("Array atualizado:",frutas);
console.log("Eelemento removido:",primeiraFruta);
console.log("Comprimento do Array:",frutas.length);