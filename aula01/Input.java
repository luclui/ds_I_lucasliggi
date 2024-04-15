package aula01;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String msg;
        System.out.println("Insira sua mensagem ");
        msg = myObj.nextLine();

        System.out.println(msg);
    }
}