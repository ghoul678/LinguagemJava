package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        int entrada1;
        int entrada2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        entrada1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        entrada2 = sc.nextInt();
        
        int soma = entrada1 + entrada2;

        System.out.printf("A soma é : %d", soma);
    }
}
