package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args){
        int cod_peca1;
        int num_peca1;
        Double valor_peca1;
        int cod_peca2;
        int num_peca2;
        Double valor_peca2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 1:");
        cod_peca1 = sc.nextInt();
        System.out.println("Digite o número de peças 1:");
        num_peca1 = sc.nextInt();
        System.out.println("Digite o valor da peça 1:");
        valor_peca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2:");
        cod_peca2 = sc.nextInt();
        System.out.println("Digite o número de peças 2:");
        num_peca2 = sc.nextInt();
        System.out.println("Digite o valor da peça 2:");
        valor_peca2 = sc.nextDouble();
        Double valor_total = ((num_peca1 * valor_peca1) + (num_peca2 * valor_peca2)); 
        System.out.printf("Valor a pagar: R$ %.2f", valor_total);
    }

    
}
