import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args){
    int codigo,quantidade;
    float valor=0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o código do produto: ");
    codigo = sc.nextInt();
    System.out.println("Digite a quantidade do produto: ");
    quantidade = sc.nextInt();

    if(codigo == 1){
        valor = (float) (quantidade * 4.00);
    }
    else if (codigo == 2){
        valor = (float) (quantidade * 4.50);
    }
    else if (codigo == 3){
        valor = (float) (quantidade * 5.00);
    }
    else if (codigo == 4){
        valor = (float) (quantidade * 2.00);
    }
    else if (codigo ==5){
        valor = (float) (quantidade * 1.50);
    }
    else if (codigo >5 || codigo <1){
        System.out.println("Código do produto inválido");
    }
    System.out.println("Valor total: R$ " + valor);
  }  
}
