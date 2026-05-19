import java.util.Scanner;

public class Exercido02 {
    public static void main(String[] args){
        int numero =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if(numero%2==0){
            System.out.println("PAR");
        }
        else if(numero%2!=0){
            System.out.println("IMPAR");
        }
        
    }
    
}
