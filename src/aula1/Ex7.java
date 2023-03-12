package aula1;

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        //Fazer um programa que lê o numero inteiro maior que 1 e imprima na
        // tela a sequencia de numeros que vai do num 1 até o num ligo

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();

        //while(num >= 0){
        //  System.out.print( ", " + num );
        //num--;
        // }

        for(int i = num; i >= 0; i-- ){

            System.out.print( ", " + i );

        }
    }
}
