import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        float salario,imposto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextFloat();
        if(salario>=0 && salario<=2000){
            System.out.println("Isento de imposto");
        }
        else if(salario>2000 && salario<=3000){
            System.out.println("Imposto devido: R$ " + (salario - 2000)*0.08);
        }
        else if(salario>3000 && salario<=4500){
            System.out.println("Imposto devido: R$ " + ((salario - 3000)* 0.18)+(1000 * 0.08));
        }
        else if(salario>4500){
            System.out.println("Imposto devido: R$ " + ((salario - 4500)*0.28)+((salario - 3000)*0.08)+(1000 * 0.18));
        }
    }
}
