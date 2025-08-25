import java.util.Scanner;

public class CadastroEstilizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Códigos de cores ANSI para o console
        final String RESET = "\u001B[0m";
        final String BLUE = "\u001B[34m";
        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String PURPLE = "\u001B[35m";

        System.out.println(BLUE + "=== CADASTRO DE USUÁRIO ===" + RESET);

        System.out.print(CYAN + "Digite seu nome: " + RESET);
        String nome = sc.nextLine();

        System.out.print(CYAN + "Digite sua idade: " + RESET);
        int idade = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha

        System.out.print(CYAN + "Digite seu email: " + RESET);
        String email = sc.nextLine();

        System.out.println(GREEN + "\n=== DADOS CADASTRADOS ===" + RESET);
        System.out.println(PURPLE + "Nome: " + RESET + nome);
        System.out.println(PURPLE + "Idade: " + RESET + idade);
        System.out.println(PURPLE + "Email: " + RESET + email);

        sc.close();
    }
}