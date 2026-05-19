import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if(numero<0){
            System.out.println("NEGATIVO");
        }
        else if(numero>=0){
            System.out.println("NÃO NEGATIVO");
        }
        
    }
}
