package aula02;

public class Metodos {
    static void meuMetodo() {
        System.out.println("Assim que funciona o metodo");
}
//static define que esse metodo pertence a classe main/ nao é objeto
//void significa que nao vai ter retorno

    static void meuMetodoComParametros(String nome, int idade){
        System.out.println(nome + " tem " + idade);
    }
    public static void main(String[] args) {
        meuMetodo();
        meuMetodoComParametros("Lucas" , 16 );
    }
 }