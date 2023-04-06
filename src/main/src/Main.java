import jdk.dynalink.beans.StaticClass;

public class Main {

        public static void main(String[] args) {
            int[]vetorInteiro = {10,20,30,40,50};

            for(int i = 0; i < vetorInteiro.length; i++ ){
                System.out.println(vetorInteiro[i] + " ");
            }

            modificar(vetorInteiro);

            System.out.println("\n=== Vetor após chamada do metodo ===");

            for(int i = 0; i < vetorInteiro.length; i++){

                System.out.println(vetorInteiro[i] + " ");
            }

        }//fim do main
        static void modificar(int []vetor){
            for(int i = 0; i < vetor.length; i++){
                vetor[i] = vetor [i] / 2;
            }

        }

}