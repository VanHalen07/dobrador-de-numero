import java.util.Scanner;//Importa a classe Scanner, que permite ler dados digitados pelo usuário no teclado.

public class DobroNumero {//Define a classe pública chamada DobroNumero.
    public static void main(String[] args) {//Quando você executa o Java, ele começa aqui.
        Scanner sc = new Scanner(System.in);//Cria o objeto sc da classe Scanner.

        System.out.print("Digite um número: ");//Mostra a mensagem para o usuário digitar um número.
        int numero = sc.nextInt(); // lê o número

        int dobro = numero * 2; // calcula o dobro

        System.out.println("O dobro de " + numero + " é " + dobro);//Exibe o resultado na tela, juntando texto e variáveis

        sc.close();//Fecha o objeto Scanner
    }
}