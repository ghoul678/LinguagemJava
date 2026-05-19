import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if(a%b==0){
            System.out.println("SAO MULTIPLOS");
        }
        else if(a%b!=0){
            System.out.println("NAO SAO MULTIPLOS");
        }
    }    
}
