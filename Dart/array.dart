void main() {
  var list = [1, 2, 3, 4, 5];
  // print(list.length); // QUANTIDADE DE ITENS NO ARRAY
  // print(list.isEmpty); // VERIFICA SE O ARRAY ESTÁ VAZIO
  // print(list.reversed); //deixa o array ao contrário
  // print(list.first); // PRIMEIRO ITEM DO ARRAY
  // print(list.last); // ÚLTIMO ITEM DO ARRAY

  // print(list.runtimeType); // TIPO DO ARRAY
  // print(list.contains(6)); // VERIFICA SE O ITEM ESTÁ NO ARRAY

  // print(list.indexOf(3)); // RETORNA O ÍNDICE DO ITEM
  // print(list[2]); // ACESSA O ITEM PELO ÍNDICE
  // print(list.sublist(1, 4)); // RETORNA UMA PARTE DO ARRAY

  // list.add(6); // ADICIONA UM ITEM NO FINAL DO ARRAY
  // list.insert(0, 0); // ADICIONA UM ITEM NO ÍNDICE ESPECIFICADO
  // list.remove(3); // REMOVE O ITEM ESPECIFICADO

  // list.removeAt(0); // REMOVE O ITEM NO ÍNDICE ESPECIFICADO
  // list.clear(); // REMOVE TODOS OS ITENS DO ARRAY

  list.forEach((item) {
    print('Item: $item ');
    print(item.runtimeType);
  });
}
