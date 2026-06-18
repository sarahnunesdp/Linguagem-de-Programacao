import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            String texto = lerTexto(scanner);
            analisarTexto(texto);

            System.out.print("\nDeseja executar o programa novamente? (S/N): ");
            String resposta = scanner.nextLine().trim().toUpperCase();
            continuar = resposta.isEmpty() ? 'N' : resposta.charAt(0);

        } while (continuar == 'S');

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }

    // Le o texto digitado pelo usuario, linha a linha, ate encontrar "FIM"
    private static String lerTexto(Scanner scanner) {
        StringBuilder textoCompleto = new StringBuilder();
        System.out.println("Digite o texto (pode ter varias linhas).");
        System.out.println("Para iniciar um paragrafo, comece a linha com TAB.");
        System.out.println("Para terminar a digitacao, digite FIM em uma linha sozinha:\n");

        boolean primeiraLinha = true;
        while (true) {
            String linha = scanner.nextLine();
            if (linha.trim().equals("FIM")) {
                break;
            }
            if (!primeiraLinha) {
                textoCompleto.append("\n");
            }
            textoCompleto.append(linha);
            primeiraLinha = false;
        }
        return textoCompleto.toString();
    }

    private static void analisarTexto(String texto) {
        int totalCaracteres = texto.length();
        int caracteresAlfabeticos = 0;
        int numeroFrases = 0;
        int numeroParagrafos = 0;
        boolean[] letraApareceu = new boolean[26]; // a..z

        // (1) caracteres totais (ja calculado acima) e caracteres alfabeticos
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                caracteresAlfabeticos++;
                char minuscula = Character.toLowerCase(c);
                if (minuscula >= 'a' && minuscula <= 'z') {
                    letraApareceu[minuscula - 'a'] = true;
                }
            }
        }

        // (1) numero de palavras: tokens separados por espacos em branco
        String textoSemEspacosExtras = texto.trim();
        int numeroPalavras = 0;
        if (!textoSemEspacosExtras.isEmpty()) {
            numeroPalavras = textoSemEspacosExtras.split("\\s+").length;
        }

        // (2) numero de frases: uma sequencia de '.', '!' ou '?' conta como
        // o fim de UMA frase (assim "..." nao conta como 3 frases)
        boolean dentroDePontuacaoFinal = false;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            boolean ehPontuacaoFinal = (c == '.' || c == '!' || c == '?');
            if (ehPontuacaoFinal && !dentroDePontuacaoFinal) {
                numeroFrases++;
            }
            dentroDePontuacaoFinal = ehPontuacaoFinal;
        }

        // (3) numero de paragrafos: cada TAB marca o inicio de um paragrafo
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '\t') {
                numeroParagrafos++;
            }
        }

        System.out.println("\n----- ESTATISTICAS DO TEXTO -----");
        System.out.println("Total de caracteres: " + totalCaracteres);
        System.out.println("Caracteres alfabeticos: " + caracteresAlfabeticos);
        System.out.println("Numero de palavras: " + numeroPalavras);
        System.out.println("Numero de frases: " + numeroFrases);
        System.out.println("Numero de paragrafos: " + numeroParagrafos);

        // (4) letras do alfabeto que nao aparecem no texto
        StringBuilder faltantes = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (!letraApareceu[i]) {
                if (faltantes.length() > 0) faltantes.append(" ");
                faltantes.append((char) ('a' + i));
            }
        }
        if (faltantes.length() == 0) {
            System.out.println("Letras que nao aparecem no texto: nenhuma (todas aparecem)");
        } else {
            System.out.println("Letras que nao aparecem no texto: " + faltantes);
        }
    }
}
