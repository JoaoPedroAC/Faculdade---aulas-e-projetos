void main(){
  List<String> frutas = ['Maçã', 'Banana', 'Laranja', 'Uva'];

  // Exibindo o array completo
  print('Frutas: $frutas');

  // Acessando elementos individuais
  print('Primeira fruta: ${frutas[0]}');
  print('Segunda fruta: ${frutas[1]}');

  // Adicionando um novo elemento
  frutas.add('Manga');
  print('Após adicionar Manga: $frutas');

  // Removendo um elemento
  frutas.remove('Banana');
  print('Após remover Banana: $frutas');

  // Iterando sobre o array
  print('Lista de frutas:');
  for (String fruta in frutas) {
    print(fruta);
  }

  // *************** Conjuntos (Sets) ***************
  Set<int> numeros = {1, 2, 3, 4, 5};
  numeros.add(3); // Tentando adicionar um elemento duplicado
  print('\nNúmeros: $numeros'); // 3 não será adicionado novamente

  // *************** Mapas (Maps) ***************
  Map<String, int> idades = {
    'Alice': 30,
    'Bob': 25,
    'Charlie': 35
  };
  print('\nIdades: $idades');


}