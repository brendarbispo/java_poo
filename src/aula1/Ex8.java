package aula1;

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        //Faça um programa que receba a idade, a altura e o peso
        //de 25 pessoas, calcule e mostra:
        // -A quantidade de pessoas com idade +50
        // -A media das alturas das pessoas com idade 10 a 20
        // -A porcentagem de pessoas com peso inferior a 40kg entre todas pessoas;

        //1 -
        int qtdPessoas = 2;
        Scanner button = new Scanner(System.in);
        int mais50 = 0;
        int somaAltura = 0;
        int qtdPessoasAltura = 0;
        int qtdPessoasPeso = 0;

        for(int i = 1 ; i <= qtdPessoas; i++){
            System.out.println(" *** Pessoa " + i );

            System.out.print("Escreva a idade: ");
            int idade = button.nextInt();

            System.out.print("Escreva a altura em cm: ");
            int altura = button.nextInt();

            System.out.print("Escreva a peso: ");
            float peso = button.nextFloat();

            //quantidade de pesoas +50
            if(idade > 50){
                mais50++;
            }
            // -A media das alturas das pessoas com idade 10 a 20
            if(idade >= 10 && idade <= 20){
                somaAltura += altura;
                qtdPessoasAltura++;
            }
            // -A porcentagem de pessoas com peso inferior a 40kg entre todas pessoas;
            if(peso < 40){
                qtdPessoasPeso++;

            }

        }

        System.out.println("Quantidade de pessoas que tem mais de 50anos é " + mais50);
        if (qtdPessoasAltura > 0) {
            System.out.println("A média das alturas das pessoas entre 10 e 20 anos é " + (somaAltura / qtdPessoasAltura));
        }else{
            System.out.println("Não é possivel calcular a média");
        }
        System.out.println("A porcentagem de pessoas com peso inferior a 40kg é " + (qtdPessoasPeso * 100 / qtdPessoas ) + "%");


    }
}
