import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            String texto = lerTexto(scanner);
            analisarTexto(texto);

            System.out.print("\nDeseja criptografar o texto (Cifra de Atbash)? (S/N): ");
            String respostaCripto = scanner.nextLine().trim().toUpperCase();
            if (!respostaCripto.isEmpty() && respostaCripto.charAt(0) == 'S') {
                String textoCifrado = criptografarAtbash(texto);
                System.out.println("\nTexto cifrado:");
                System.out.println(textoCifrado);
            }

            System.out.print("\nDeseja executar uma nova entrada de texto? (S/N): ");
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

        String textoSemEspacosExtras = texto.trim();
        int numeroPalavras = 0;
        if (!textoSemEspacosExtras.isEmpty()) {
            numeroPalavras = textoSemEspacosExtras.split("\\s+").length;
        }

        boolean dentroDePontuacaoFinal = false;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            boolean ehPontuacaoFinal = (c == '.' || c == '!' || c == '?');
            if (ehPontuacaoFinal && !dentroDePontuacaoFinal) {
                numeroFrases++;
            }
            dentroDePontuacaoFinal = ehPontuacaoFinal;
        }

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

    private static String criptografarAtbash(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                resultado.append((char) ('z' - (c - 'a')));
            } else if (c >= 'A' && c <= 'Z') {
                resultado.append((char) ('Z' - (c - 'A')));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}
