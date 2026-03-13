package EstruturaSequencial;

import java.util.Scanner;

public class Exercio03 {
    public static void main(String[] args){
        
        int a;
        int b;
        int c;
        int d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        d = sc.nextInt();
        int diferenca = a*b - c*d;
        System.out.printf("A diferença é : %d", diferenca);
    }
}
