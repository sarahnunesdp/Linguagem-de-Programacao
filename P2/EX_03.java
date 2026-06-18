import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a quantidade de termos da Sequencia de Dionesio "
                    + "(numero negativo = erro, zero = encerrar o programa): ");
            long valor = lerValorNumerico(scanner);

            if (valor < 0) {
                System.out.println("Erro: o valor nao pode ser negativo. Tente novamente.\n");
                continue;
            }

            if (valor == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            int quantidade = (int) valor;
            long[] sequenciaDionesio = gerarSequenciaDionesio(quantidade);

            System.out.println("\nSequencia de Dionesio (ordem crescente):");
            imprimirVetor(sequenciaDionesio);

            long[] decrescente = inverterVetor(sequenciaDionesio);
            System.out.println("Sequencia de Dionesio (ordem decrescente):");
            imprimirVetor(decrescente);
            System.out.println();
        }

        scanner.close();
    }

    // Le um valor inteiro, descartando entradas que nao sejam numeros
    private static long lerValorNumerico(Scanner scanner) {
        while (!scanner.hasNextLong()) {
            System.out.print("Entrada invalida. Digite um numero inteiro: ");
            scanner.next();
        }
        return scanner.nextLong();
    }

    // Percorre a sequencia de Fibonacci e guarda apenas os termos primos,
    // ate completar a quantidade solicitada
    private static long[] gerarSequenciaDionesio(int quantidade) {
        long[] resultado = new long[quantidade];
        int encontrados = 0;

        long fibAnterior = 1; // F1
        long fibAtual = 1;    // F2

        while (encontrados < quantidade) {
            long proximoFib = fibAnterior + fibAtual;
            fibAnterior = fibAtual;
            fibAtual = proximoFib;

            if (ehPrimo(fibAtual)) {
                resultado[encontrados] = fibAtual;
                encontrados++;
            }
        }
        return resultado;
    }

    private static boolean ehPrimo(long numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long[] inverterVetor(long[] vetorOriginal) {
        int n = vetorOriginal.length;
        long[] invertido = new long[n];
        for (int i = 0; i < n; i++) {
            invertido[i] = vetorOriginal[n - 1 - i];
        }
        return invertido;
    }

    private static void imprimirVetor(long[] vetor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i]);
            if (i < vetor.length - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }
}
