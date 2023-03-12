package aula1;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        // Fazer com que o usuario digite as informacoes::

        Scanner button = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = button.nextLine();

        System.out.println("Digite sua idade :");
        int idade = button.nextInt();

        System.out.println("Digite seu peso :");
        double peso = button.nextDouble();

        System.out.println("Digite o sexo : ");
        char sexo = button.next().charAt(0);

    }
}
