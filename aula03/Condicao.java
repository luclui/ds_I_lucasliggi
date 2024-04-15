package aula03;

public class Condicao {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;

        String resultado;

        resultado = (x > y) ? "É maior que y": "É menor que y";
        System.out.println(resultado);
        
        /*if (x > y) {
            System.out.println("É maior que y");
        } else if (x == y) {
            System.out.println("É igual a y");
        } else {
            System.out.println("É menor que y");
        }*/
        
    }
}
