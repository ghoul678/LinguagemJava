package  EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){
        int numFuncionario;
        int horasTrabalhadas;
        Double valorhora;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número do funcionário: ");
        numFuncionario = sc.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        valorhora = sc.nextDouble();
        sc.nextLine();
        Double salario = horasTrabalhadas * valorhora;
        System.out.printf("Número do funcionário: %d\n", numFuncionario);
        System.out.printf("Salário: R$ %.2f", salario);
    }
}
