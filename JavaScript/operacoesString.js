// operação de string
let frutas = "banana, maçã, pera, uva, melancia";
// console.log(frutas);
// console.log(frutas.length); // conta o numero de caracteres da string

// Queremos apenas maça e pera
let frutaSliced = frutas.slice(8, 18); // ele cria uma nova string ao inves de reescrever a string original
// console.log(frutaSliced); // precisa de parametro de inicio e fim

// Exemplo com trim()
let fruta = "    abacate    ";
// console.log(fruta.trim()); // remove os espaços em branco

// Exemplo com split()
let frutasSplit = frutas.split(", ");
// console.log(frutasSplit); // transforma em array

// Criação de strings com animais
let animais = ["cachorro", "gato", "papagaio", "peixe"];

// Exemplo de metodo substring()
let animaisString = animais.toString(); // transforma em string
// console.log(animaisString.substring(0, 8)); // precisa de parametro de inicio e fim // sempre ponha +1 que o indice original ou conte normalmente sem ser por indice
let animalSub = animais[0]
// console.log(animalSub.substring(0, 5)); // precisa de parametro de inicio e fim

// Exemplo de metodo replace()
let frase = "Eu gosto de cachorro";
let novaFrase = frase.replace("cachorro", "gato"); // troca a palavra
// console.log(novaFrase);

// Exemplo de metodo concat()
let frase1 = "Eu gosto de";
let frase2 = "cachorro";
let fraseNova = frase1.concat(" ",frase2); // concatena as strings
// console.log(fraseNova);

// Exemplo de metodo em nomes
let nome = "João";
let nomeMaiusulo = nome.toUpperCase(); // transforma em maiusculo
let nomeMinusculo = nome.toLowerCase(); // transforma em minusculo
// console.log(nome);
// console.log(nomeMaiusulo);
// console.log(nomeMinusculo);
