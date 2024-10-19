import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valor = 0, res = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("informe o numero a ser somado:");
            valor = leitura.nextDouble();
            res += valor;
            System.out.printf("Valor atual: %.1f\n", res);
        }
        System.out.printf("Valor final: %.1f", res);
    }
}
