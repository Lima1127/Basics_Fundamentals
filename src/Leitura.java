import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de uma pessoa:");
        String nome = leitura.nextLine();
        System.out.println("Quantos anos essa pessoa tem?");
        int ano = leitura.nextInt();
        System.out.println("Qual é o jogo favorito dela:");
        leitura.nextLine();
        String jogo = leitura.nextLine();

        System.out.printf("O %s tem %d e gosta de %s", nome, ano, jogo);
    }
}
