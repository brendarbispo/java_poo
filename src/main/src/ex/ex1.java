package ex;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        lerVetor(vetor);
        System.out.println("Os numeros digitados são: ");

        for( int i = 0;  i < vetor.length; i++){

            System.out.print(vetor[i] + " ");

        }

        int num = somarNumeros(vetor);
        System.out.println("\n O total dos numeros digitados é " + num);

        int media = calcularMedia(vetor);
        System.out.println("A média é " + media);

    }


        public static void lerVetor(int[] vetor) {

            Scanner entrada = new Scanner(System.in);


            for (int i = 0; i < vetor.length; i++) {


                System.out.println("Digite um numero: ");
                int num = entrada.nextInt();

                vetor[i] += num;


            }

        }

            public static int somarNumeros( int[] vetor)
            {

                int num = 0;

                for(int i = 0; i < vetor.length; i++){

                    num += vetor[i];

                }

                return num;

            }

            public static int calcularMedia(int[] vetor)
            {
                int media = 0;
                int soma = 0;

                for(int i = 0; i < vetor.length; i++)
                {
                    soma = soma + vetor[i];

                }
                media = soma/vetor.length;
                return media;

            }


}






