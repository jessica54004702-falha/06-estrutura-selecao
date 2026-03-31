import java.sql.SQLOutput;
import java.util.Scanner;

public class exemplo06 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        double nota1, nota2;
        double media;

        System.out.print(" Primeira nota -->");
        nota1 = sc.nextDouble();
        System.out.printf("Segunda nota -->");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) /2;
        System.out.println(" media =" + media);
        if (media >= 6) {
            System.out.println( " Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
