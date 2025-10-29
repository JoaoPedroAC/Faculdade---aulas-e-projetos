// Entre no terminal e execute: dart aula_02.dart
void main() {
  // Declaração de variáveis
  String saudacao = 'Olá, Mundo!';
  String nome = 'João';
  int idade = 25;
  double altura = 1.75;
  bool estudante = true;

  // Exibindo valores no console
  print(saudacao);
  print('Nome: $nome');
  print('Idade: $idade');
  print('Altura: $altura');
  print('Estudante: $estudante');

  // Operações básicas
  int soma = idade + 5;
  double alturaEmCm = altura * 100;

  print('Idade em 5 anos: $soma');
  print('Altura em cm: $alturaEmCm');

  // Chamando uma função
  exemploFuncao();
  print(parametroFuncao('Esta é uma mensagem de teste.'));
}

void exemploFuncao() {
  print('Esta é uma função de exemplo.');
}

String parametroFuncao(String mensagem) => 'Mensagem recebida: $mensagem';
