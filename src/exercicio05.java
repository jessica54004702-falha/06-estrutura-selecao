import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        double valortotal, valorfinal;
        double desconto;

        System.out.println( " Qual valor total das compras -->");
        valortotal = sc.nextDouble();

        if (valortotal > 1000){
            desconto = valortotal * 15/100;

        }
            else {
            desconto = valortotal * 8 / 100;
        }
        valorfinal = valortotal - desconto;
        System.out.println( " valor final a pagar: R$ " + valorfinal);
        System.out.println( " Valor do desconto R$ " + desconto );

    }
}
