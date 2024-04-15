package aula03;

public class ExFibonacci {

    public static void main(String[] args) {
        int b;
       
        for (int i = 0; i < 9; i++) {
         b = 0;
         b = i+ (i - b)    ;
        System.out.println(b);
            
        }

    }
}
