package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Double a;
        Double b;
        Double c;
        Double triangulo;
        Double circulo;
        Double trapezio;
        Double quadrado;
        Double retangulo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble();
        triangulo = (a *c)/2;
        circulo = Math.PI * Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = Math.pow(b, 2);
        retangulo = a *b;
        System.out.printf("TRIÂNGULO: %.3f\n", triangulo);
        System.out.printf("CÍRCULO: %.3f\n", circulo);
        System.out.printf("TRAPÉZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETÂNGULO: %.3f\n", retangulo);
        sc.close();
    }
}
