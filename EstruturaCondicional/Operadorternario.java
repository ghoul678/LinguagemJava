public class Operadorternario {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.printf("O preço do produto é: R$ %.2f", +desconto);
    }
}
