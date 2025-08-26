import java.util.Scanner;
// Importa a classe Scanner para permitir leitura de dados digitados pelo usuário no teclado.

public class DobroNumero {
    // Define a classe pública chamada DobroNumero.

    public static void main(String[] args) {
        // Método principal (ponto de entrada da execução do programa).

        Scanner sc = new Scanner(System.in);
        // Cria o objeto Scanner 'sc', usado para capturar a entrada do usuário.

        boolean continuar = true;
        // Variável de controle do laço. Enquanto for 'true', o programa continua rodando.

        System.out.println("=== Calculadora de Dobro ===");
        // Exibe um título inicial no console.

        while (continuar) {
            // Estrutura de repetição: executa o bloco até 'continuar' ser falso.

            System.out.print("\nDigite um número(sair)");
            // Pede que o usuário digite um número ou a palavra "sair".

            if (sc.hasNextDouble()) {
                // Verifica se a entrada do usuário é um número decimal (double).

                double numero = sc.nextDouble();
                // Lê o número digitado e armazena na variável 'numero'.

                double dobro = numero * 2;
                // Calcula o dobro do número e guarda em 'dobro'.

                System.out.printf("O dobro de %.2f é %.2f%n", numero, dobro);
                // Exibe o resultado formatado com 2 casas decimais.
            } else {
                // Caso a entrada não seja um número, entra neste bloco.

                String entrada = sc.next();
                // Lê a entrada como texto (string).

                if (entrada.equalsIgnoreCase("sair")) {
                    // Verifica se o texto digitado é "sair" (ignora maiúsculas/minúsculas).

                    continuar = false;
                    // Altera a variável para false, encerrando o laço 'while'.

                    System.out.println("\nPrograma encerrado. Até mais!");
                    // Mensagem final antes de sair.
                } else {
                    // Caso o usuário digite algo inválido (nem número nem 'sair').

                    System.out.println("Entrada inválida, digite 'sair'.");
                    // Informa ao usuário que a entrada foi incorreta.
                }
            }
        }

        sc.close();
        // Fecha o Scanner para liberar recursos do sistema.
    }
}