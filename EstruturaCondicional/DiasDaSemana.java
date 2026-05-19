

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args){
        
        int diaSemana_1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        diaSemana_1 = sc.nextInt();

        switch (diaSemana_1) {
            case 1:
                System.out.println("Domingo");
                break;
        
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
