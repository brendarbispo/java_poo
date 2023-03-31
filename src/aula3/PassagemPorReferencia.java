package aula3;

public class PassagemPorReferencia {
    public static void main(String[] args) {
        int[]vetorInteiro = {10,20,30,40,50};

        for(int i = 0; i < vetorInteiro.length; i++ ){
            System.out.println(vetorInteiro[i] + " ");
        }

        modificar(vetorInteiro);

        System.out.println("\n");
    }

}
