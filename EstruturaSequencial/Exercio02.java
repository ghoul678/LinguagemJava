package EstruturaSequencial;

import java.util.Scanner;
import java.lang.Math;

public class Exercio02 {
    public static void main(String[] args){
        double raio;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o raio do círculo: ");
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio,2);
        System.out.printf("A área do círculo é: %.4f", area);
    }
}