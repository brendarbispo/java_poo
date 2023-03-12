package aula1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        //Fazer com que o usuario digite seu nome e idade e de um amigo e comparar
        //se os dois tem a mesma idade e nome.

        Scanner buttonString = new Scanner(System.in);
        Scanner buttonInt = new Scanner(System.in);

        String seuNome;
        System.out.print("Digite seu nome: ");

        seuNome = buttonString.nextLine();

        int suaIdade;
        System.out.print(seuNome + ", escreva a sua idade: ");
        suaIdade = buttonInt.nextInt();

        String nomeAmigo;
        System.out.print(seuNome + ", digite o nome de um amigo: ");
        nomeAmigo = buttonString.nextLine();

        int idadeAmigo;
        System.out.print(seuNome + ", digite a idade de " + nomeAmigo + ": ");
        idadeAmigo = buttonInt.nextInt();



        if(suaIdade > idadeAmigo){
            System.out.print(seuNome + ", sua idade é maior do que " + nomeAmigo);
            if(seuNome.equals(nomeAmigo)){
                System.out.println(" e seu nome é igual ao do seu amigo!");

            }else{
                System.out.println(" e seu nome é diferente do que amigo!");
            }
        } else if(suaIdade == idadeAmigo) {
            System.out.print(seuNome + " sua idade é igual a de " + nomeAmigo);
            if(seuNome.equals(nomeAmigo)){
                System.out.println(" e seu nome é igual ao do seu amigo!");
            }else{
                System.out.println(" e seu nome é diferente do que amigo!");
            }
        }else {
            System.out.print(seuNome + ", sua idade é menor do que " +nomeAmigo);
            if(seuNome.equals(nomeAmigo)){
                System.out.println(" e seu nome é igual ao do seu amigo!");

            }else{
                System.out.println(" e seu nome é diferente do que amigo!");
            }

        }

    }
}
