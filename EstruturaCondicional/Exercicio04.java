import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        int h_inicial,h_final;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial do jogo: ");
        h_inicial = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        h_final = sc.nextInt();

        if(h_inicial < h_final){
            System.out.println("O jogo durou " + (h_final - h_inicial) + " horas");
        }
        else if (h_final < h_inicial){
            System.out.println("O jogo durou " +((24 - h_inicial) + h_final)+ " horas");
        }
    }
}
