// Exemplo de manipulação de dados JSON
// objeto JSON
let pessoa = {
  "nome": "John",
  "idade": 30,
  "endereco": {
    "rua": "Rua do João",
    "cidade": "São Paulo",
  },
  "telefones": ["1234-56789", "9876-54321"],
};
console.log(pessoa);

// acessando dados
console.log("\nAcessando dados do objeto JSON");
console.log(pessoa.nome);
console.log(pessoa.endereco.cidade);
console.log(pessoa.telefones[1]);
// console.log(pessoa["nome"]) // outra forma de acessar

// adicionando dados
console.log("\nAdicionando dados ao objeto JSON");
pessoa.email = "bla@mail.com";
console.log(pessoa);

// alterando dados
console.log("\nAlterando dados do objeto JSON");
pessoa.nome = "Pedro";
console.log(pessoa);

// removendo dados
console.log("\nRemovendo dados do objeto JSON");
delete pessoa.endereco; // o DELETE remove a propriedade do objeto apenas
console.log(pessoa);

// operações com array
console.log("\nOperações com array");
pessoa.hobbes = ["futebol", "comer"];
pessoa.hobbes.push("viajar");
console.log(pessoa);

// iterrar sobre as propriedades do objeto
console.log("\nIterando sobre as propriedades do objeto JSON");
// for...in não deve ser usado para iterrar sobre arrays, se a ordem dos elementos importa, pois ele não garante a ordem da interação
// chave = key = propriedade do objeto
for (let chave in pessoa) {
  console.log(chave + ": " + pessoa[chave]);
}

// Convertendo o objeto JSON para string
console.log("\nConvertendo o objeto JSON para string");
let pessoaString = JSON.stringify(pessoa);
console.log(pessoaString);

// convertendo a string para objeto JSON
console.log("\nConvertendo a string para objeto JSON");
let pessoaObjeto = JSON.parse(pessoaString);
console.log(pessoaObjeto);