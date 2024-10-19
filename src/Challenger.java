import java.util.Scanner;
//Simulação BASICA de um terminal bancario
public class Challenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, accountType;
        double money = 5000.65,withdraw, deposit;
        boolean access = true;
        int operation;

        System.out.println("Informe o nome do usuário:");
        name = sc.nextLine();
        System.out.println("Informe o tipo de conta que deseja acessar (Corrente ou Poupança):");
        accountType = sc.nextLine();

        System.out.printf("""
                ************************************
                nome:          %s
                Tipo conta:    %s
                Saldo inicial: %.2f
                ************************************
                """, name, accountType, money);


        while (access){
            System.out.println("""
                    ---Operações---
                    1- Consultar Saldo
                    2- Sacar dinheiro
                    3- Depositar
                    4- Sair""");
            operation = sc.nextInt();
            switch (operation){
                case 1 :
                    System.out.printf("Seu saldo é de R$%.2f\n\n", money);
                    break;
                case 2:
                    System.out.println("Quanto você quer sacar?");
                    withdraw = sc.nextDouble();
                    if (withdraw <= money){
                        money -= withdraw;
                        System.out.printf("Seu novo saldo é %.2f\n\n", money);
                    }else {
                        System.out.println("\nDinheiro insuficiente para saque.\n");
                    }
                    break;
                case 3:
                    System.out.println("Quanto você quer depositar?");
                    deposit = sc.nextDouble();
                    if (deposit > 0){
                        money += deposit;
                        System.out.printf("Seu novo saldo é %.2f\n\n", money);
                    } else {
                        System.out.println("\nEscolha um valor valido para depositar.\n");
                    }
                    break;
                case 4:
                    System.out.println("Volte Sempre");
                    access = false;
                    break;
                default:
                    System.out.println("\nDigite uma opção valida.\n");

            }
        }
    }
}
