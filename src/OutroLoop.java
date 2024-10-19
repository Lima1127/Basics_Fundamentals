import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double valor = 0, res = 0;
        int count = 0;

        while (count < 5) {
            System.out.println("informe o numero a ser somado:");
            valor = leitura.nextDouble();
            res += valor;
            System.out.printf("Valor atual: %.1f\n", res);
            count++;
        }
        System.out.printf("Valor final: %.1f", res);
    }
}
