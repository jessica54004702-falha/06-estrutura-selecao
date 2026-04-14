import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3;

        System.out.println(" Digite o valor1 -->");
        valor1 = sc.nextDouble();
        System.out.println("Digite o valor2 -->");
        valor2 = sc.nextDouble();
        System.out.println("Digite o valor3 -->");
        valor3 = sc.nextDouble();

        if (valor1 < valor2 + valor3 && valor2 < valor1 + valor3 && valor3 < valor1 + valor2) {
            System.out.println(" os valores formam um trianfulo");
        } else {
            System.out.println("Os valores nao formam um triangulo");

            }
        }
    }