// package ordenacao;

public class BubbleSort {

  public static int[] bubbleSort(int[] numeros) {
    final int n = numeros.length;
    int aux;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (numeros[j] > numeros[j + 1]) {
          // Troca os elementos
          aux = numeros[j];
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = aux;
        }
      }
    }
    return numeros;
  }

  public static void quickSort(int inicio, int fim, int[] numeros) {
    int x;
    if (inicio < fim) {
      x = particao(inicio, fim, numeros);
      quickSort(inicio, x - 1, numeros);
      quickSort(x + 1, fim, numeros);

    }
  }

  public static int particao(int inicio, int fim, int[] numeros) {
    int j = inicio - 1;
    int temp, aux = numeros[fim];
    for (int i = inicio + 1; j <= fim; j++) {
      if (numeros[j] <= aux) {
        // Troca os elementos
        j++;
        temp = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = aux;
      }
    }
    return j;
  }

  public static void mergeSort(int[] array, int inicio, int fim) {
    if (inicio == fim) {
      return;
    }
    int meio = (inicio + fim) / 2;
    mergeSort(array, inicio, meio);
    mergeSort(array, meio + 1, fim);
    merge(array, inicio, meio, fim);
  }

  private static void merge(int[] array, int inicio, int meio, int fim) {
    int n = fim - inicio + 1;
    int[] b = new int[n];
    int i1 = inicio, i2 = meio + 1, j = 0;

    while (i1 <= meio && i2 <= fim) {
      if (array[i1] < array[i2]) {
        b[j] = array[i1];
        i1++;
      } else {
        b[j] = array[i2];
        i2++;
      }
      j++;
    }
    while (i1 <= meio) {
      b[j] = array[i1];
      i1++;
      j++;
    }
    while (i2 <= fim) {
      b[j] = array[i2];
      i2++;
      j++;
    }
    for (int i = 0; i < n; i++) {
      array[inicio + i] = b[i];
    }
  }

  public static void main(String[] args) {
    int i, numeros[] = { 5, 3, 6, 4, 2 };
    // numeros = bubbleSort(numeros);
    // quickSort(0, numeros.length - 1, numeros);
    // mergeSort(numeros, 0, numeros.length - 1);

    for (i = 0; i < numeros.length; i++) {
    System.out.print(numeros[i] + " ");
    }
    System.exit(0);


  }

}