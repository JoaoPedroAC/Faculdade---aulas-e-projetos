// Função que simula uma operação assicrona de verificação do status de uma casa
function verificarStatusDaCasa(casa) {
  return new Promise((resolve, reject) => {
    // Simula uma operação assincrona que leva 2 segundos para ser concluída
    setTimeout(() => {
      const sucess = Math.random() > 0.5; // Simula um sucesso ou falha na operação de forma aleatoria
      if (sucess) {
        resolve(`A casa localizada em ${casa.endereco} está em boas condições`);
      } else {
        reject(`A casa localizada em ${casa.endereco} está em más condições`);
      }
    }, 2000);
  });
}
// Função que simula uma operação assincrona de inspeção de uma casa
function inspecionarCasa(casa) {
  return new Promise((resolve) => {
    // Simula uma operação assincrona que leva 1 segundo para ser concluída
    setTimeout(() => {
      resolve(`A casa localizada em ${casa.endereco} foi inspecionada`);
    }, 1000);
  });
}

// Função que simula uma operação assincrona de reparar uma casa
function repararCasa(casa) {
  return new Promise((resolve) => {
    // Simula uma operação assincrona que leva 3 segundo para ser concluída
    setTimeout(() => {
      resolve(`A casa localizada em ${casa.endereco} foi reformada`);
    }, 3000);
  });
}

class Casa {
  constructor(endereco, tamanho, cor, numQuartos, temGaragem) {
    this._endereco = endereco;
    this.tamanho = tamanho;
    this.cor = cor;
    this.numQuartos = numQuartos;
    this.temGaragem = temGaragem;
  }
  get endereco() {
    return this._endereco;
  }
  verificarStatus() {
    verificarStatusDaCasa(this)
      .then((resultado) => {
        console.log(resultado);
        return inspecionarCasa(this);
      })
      .then((resultadoDaInspecao) => {
        console.log(resultadoDaInspecao);
      })
      .catch((error) => {
        console.error(error);
        return repararCasa(this);
      })
      .then((resultadoDoRaparo) => {
        if (resultadoDoRaparo) {
          console.log(resultadoDoRaparo);
          return inspecionarCasa(this);
        }
      })
      .catch((error) => {
        console.error("Error Final",error);
      });
  }
}

let minhaCasa = new Casa("Rua das Flores, 123", 100, "Azul", 3, true);
console.log("Verificando o status da casa...");
minhaCasa.verificarStatus();
