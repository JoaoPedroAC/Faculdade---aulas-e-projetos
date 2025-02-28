// Classe que não está emcapsulada
class Imovel {
  constructor(endereco, tamanho) {
    this.endereco = endereco;
    this.tamanho = tamanho;
  }
  descrever() {
    throw new Error("\nMétodo descrever não implementado"); // Exceção para caso o método não seja implementado
  }
  validar() {
    if (!this.endereco || !this.tamanho) { // caso não tenha endereço ou tamanho
      throw new Error("\nDados inválidos para o imóvel"); 
    }
  }
}
// Definição de classe minha "Casa" classes começam com letra maiúscula
class Casa extends Imovel {
  // Construtor define as propriedades da casa, colocar _antes do nome da propriedade para indicar que é privada (isso é encapsulamento)
  // O construtor é um método especial que é chamado quando um objeto é instanciado a partir de uma classe
  constructor(endereco, tamanho, cor, numQuartos, temGaragem) {
    super(endereco, tamanho);
    this._cor = cor; // esse this vai se referir ao objeto que está sendo criado da classe Casa (ele fará a ligação entre chave e valor)
    this._numQuartos = numQuartos;
    this._temGaragem = temGaragem;
  }
  // Métodos getters e setters para acessar e modificar as propriedades, somente get e set podem modifar propriedades privadas
  get cor() {
    return this._cor;
  }
  set cor(novaCor) {
    this._cor = novaCor;
  }
  get numQuartos() {
    return this._numQuartos;
  }
  set numQuartos(novoNumQuartos) {
    this._numQuartos = novoNumQuartos;
  }
  get temGaragem() {
    return this._temGaragem;
  }
  set temGaragem(novoTemGaragem) {
    this._temGaragem = novoTemGaragem;
  }

  // Método para descrever a casa
  descrever() {
    try {
      this.validar();
      let descricao = `Casa esta localizada em ${this.endereco} seu tamanho é de ${this.tamanho}m² e sua cor é ${this._cor} e tem ${this._numQuartos} quartos`;

      descricao += this._temGaragem ? " e tem garagem." : " e não tem garagem.";

      return descricao;
    } catch (error) {
      throw new Error("\nErro ao descrever a casa", error.message);
    }
  }
}

class CasaLuxuosa extends Casa {
  // extends é usado para criar uma classe filha (CasaLuxuosa) que herda de uma classe pai (Casa)
  constructor(endereco, tamanho, cor, numQuartos, temGaragem, temPiscina) {
    super(endereco, tamanho, cor, numQuartos, temGaragem); // super é usado para chamar o construtor da classe pai (Casa)
    this._temPiscina = temPiscina;
  }
  get temPiscina() {
    return this._temPiscina;
  }
  set temPiscina(novoTemPiscina) {
    this._temPiscina = novoTemPiscina;
  }
  descrever() {
    try {
      let descricao = super.descrever();
      if (this._temPiscina) {
        descricao += " Além disso, tem piscina.";
      } else {
        descricao += " Além disso, não tem piscina.";
      }
      return descricao;
    } catch (error) {
      throw new Error("\nErro ao descrever a casa luxuosa", error.message);
    }
  }
}
// função para descrever um imovel (polimorfismo)
function descreverImovel(imovel) {
  try {
    console.log(imovel.descrever());
  } catch (error) {
    console.error("\nErro ao descrever o imóvel", error.message);
  }
}

// Criação de objeto  (instância da classe Casa)
const minhaCasa = new Casa("Av. Titui", 90, "azul", 3, false);
const casaVizinho = new CasaLuxuosa("Rua Golden Street", 1000, "vermelha", 3, true, true);
const casaInvalida = new Casa("", 0, "", "", false);
// console.log(minhaCasa.descrever());
// console.log(casaVizinho.descrever());

// manipulação dos objetos e exibições das descriçõesusando o polimorfismo
descreverImovel(minhaCasa);
descreverImovel(casaVizinho);
descreverImovel(casaInvalida);  
