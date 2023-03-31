package aula3;

public class aula3 {
    public static void main(String[] args) {
        int a = 50;

        modificar (a);
        System.out.println("(main): Valor de a:" + a);

    }

    static void modificar(int a){

        a = 200;
        System.out.println("(metodo): Valor de a:" + a);
    }
}


