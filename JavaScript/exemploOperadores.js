// exemplo de operadores aritmeticos basicos
function calculadora(a=0, b=0) {
  let adicao = a + b;
  let subtracao = a - b;
  let multiplicacao = a * b;
  let divisao = a / b;
  let resto = a % b;
  let exponenciacao = a ** b;

  // Nessa parte do código, incrementamos e decrementamos estão assim, pois se não eles teriam que ser escritos na mesma linha mas invertendo o local de seus sinais como: incremento = ++a e decremento = --b sem a parte de das linhas 12 e 15, porem voce perde o controle do valor atribuido.
  let incremento = a;
  incremento++;

  let decremento = b;
  decremento--;

  console.log(`Adição ${a} + ${b} = ${adicao}`); // 15
  console.log(`Subtração ${a} - ${b} = ${subtracao}`); // 5
  console.log(`Multiplicação ${a} * ${b} = ${multiplicacao}`); // 50
  console.log(`Divisão ${a} / ${b} = ${divisao}`); // 2
  console.log(`Resto ou módulo ${a} % ${b} = ${resto}`); // 0
  console.log(`Exponenciação ${a} ** ${b} = ${exponenciacao}`); // 100000
  console.log(`Incremento ${a}++ = ${incremento}`); // 11
  console.log(`Decremento ${b}-- = ${decremento}`); // 4
}
calculadora(10, 5);
