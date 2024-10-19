//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int anoDeLancamento  = 2000;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento no mais curtidos:");
        } else {
            System.out.println("Curtindo mais filme retro");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("filme liberado");
        } else {
            System.out.println("Me pague o aluguel");
        }

        char operador = '-'; //Mude para testar
        double x = 2.0, y = 3.0, res;

        switch (operador){
            case '+' :
                res = x + y;
                break;
            case '-' :
                res = x - y;
                break;
            default:
                res = 0.0;
        }
        System.out.println(res);

    }
}