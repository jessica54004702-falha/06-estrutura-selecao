import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y, x;

        System.out.println("Informe o valor de x-->");
        x = sc.nextInt();

        if (x >= 5 && x <= -5) {
            System.out.println(" A expressao nao pode ser calculada");
        } else {
            y = 8 / Math.sqrt(x * x - 25);
            System.out.println(" y = " + y);
        }
    }
}
