function saudacao(msg) {
  // console.log(msg);
  return msg;
}
console.log(saudacao("Olá, mundo!"));

let novaSaudacao = function() {
  let nomes = ['João', 'Maria', 'José'];
  let muitosNomes = nomes.map((nome) =>{console.log(`\n${saudacao("olá")}, ${nome}!`);});
}
novaSaudacao();