import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberRandom = new Random().nextInt(100);
        int numberUser = 0;
        int count = 0;

        while(count < 5){
            System.out.println("tente acertar o numero:");
            numberUser = sc.nextInt();

            if(numberUser < numberRandom){
                System.out.println("Você errou. Tente um número maior.");
                count++;
            } else if (numberUser > numberRandom) {
                System.out.println("Você errou. Tente um número menor.");
                count++;
            } else {
                System.out.println("Parabens. Você ganhou.");
                System.exit(0);
            }

        }
        System.out.println("Você perdeu.");
    }
}
