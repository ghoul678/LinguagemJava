

import java.util.Scanner;

public class OperardoraTelefonica {
    
    public static void main(String[] args){
        int minutosconsumidos;
        Double valorplano;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite a quantidade de minutos consumidos: ");
        minutosconsumidos = sc.nextInt();

        if(minutosconsumidos <= 100){
             valorplano = 50.00;
             System.out.printf("O valor do plano é: R$ %.2f", valorplano);

        }
        else if(minutosconsumidos > 100 ){
            int minutosexcedentes = minutosconsumidos -100;
            valorplano = 50.00 + (minutosexcedentes * 2.00);
            System.out.printf("O valor do plano é: R$ %.2f", valorplano);
        }
    }
}
