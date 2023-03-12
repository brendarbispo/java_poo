package aula1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Fazer com que o usuario digite sua idade e mostrar se ele é maior de idade ou nao

        Scanner button = new Scanner(System.in);

        System.out.println("Bem vindo, digite sua idade:");
        int idade = button.nextInt();

        if(idade >= 18){
            System.out.println("Você tem " +idade + " anos, e é maior de idade!");
        }else{
            System.out.println("Voce tem apenas " +idade+ " anos, e nao é maior de idade!" );
        }
    }
}
