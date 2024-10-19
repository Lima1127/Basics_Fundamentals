import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberNegOrPos, numberComparation1, numberComparation2, squareSide, squareArea, radiusCircle, circleArea;
        int pointer, numberMulti, resMulti, evenOrOdd, fatorial, resFatorial = 1;
        System.out.println("Digite um número. Iremos ficar se ele é negativo ou positivo:");
        numberNegOrPos = sc.nextDouble();

        //Primeiro Exercicio

        if (numberNegOrPos > 0) {
            System.out.println("O número é positivo");
        } else if (numberNegOrPos < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

        //Segundo Exercicio

        System.out.println("Agora digite 2 números para ser feita uma comparação:");
        numberComparation1 = sc.nextDouble();
        numberComparation2 = sc.nextDouble();

        if (numberComparation1 < numberComparation2){
            System.out.println("Os números são diferentes e o primeiro número é menor que o segundo número.");
        } else if (numberComparation1 > numberComparation2) {
            System.out.println("Os números são diferentes e o primeiro número é maior que o segundo número.");
        } else{
            System.out.println("Os números são iguais.");
        }

        //Terceiro Exercicio

        System.out.println("Informe a operação desejada:\n1 - Calculo da área de um quadrado " +
                " 2 - Calculo da área de um circulo");
        pointer = sc.nextInt();

        if (pointer == 1){
            System.out.println("Informe a medida do lado do quadrado.");
            squareSide = sc.nextDouble();
            squareArea = Math.pow(squareSide, 2);
            System.out.printf("A área do quadrado é: %.2f\n", squareArea);
        } else if (pointer == 2) {
            System.out.println("Informe a medida do raio do circulo.");
            radiusCircle = sc.nextDouble();
            circleArea = Math.pow(radiusCircle, 2) * 3.14;
            System.out.printf("A área do circulo é: %.2f\n", circleArea);
        } else {
            System.out.println("Operação não encontrada");
        }

        //Quarto Exercicio
        System.out.println("Tabuada. Informe o número:");
        numberMulti = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            resMulti = numberMulti * i;
            System.out.printf("%d * %d = %d\n", numberMulti, i, resMulti);
        }

        //Quinto Exercicio

        System.out.println("Verificação de par e impar. Informe o número (apenas inteiros):");
        evenOrOdd = sc.nextInt();
        if (evenOrOdd % 2 == 0){
            System.out.printf("%d é par.\n", evenOrOdd);
        } else {
            System.out.printf("%d é impar.\n", evenOrOdd);
        }

        //Sexto Exercicio

        System.out.println("Informe um numero para ser exibido seu respectivo fatorial (apenas números inteiros):");
        fatorial = sc.nextInt();

        for (int i = 1; i < fatorial + 1; i++) {
            resFatorial *= i;
        }
        System.out.println(resFatorial);

    }
}
