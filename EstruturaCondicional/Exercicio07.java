import java.util.Scanner;

public class Exercicio07 {
    public static void main (String[] args){
        float x,y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada x: ");
        x = sc.nextFloat();
        System.out.println("Digite a coordenada y: ");
        y = sc.nextFloat();

        if(x>0 && y>0){
            System.out.println("Q1");
        }
        else if(x<0 && y>0){
            System.out.println("Q2");
        }
        else if(x<0 && y<0){
            System.out.println("Q3");
        }
        else if(x>0 && y<0){
            System.out.println("Q4");
        }
        else if(x==0 && y==0){
            System.out.println("Origem");
        }
    }    
}
