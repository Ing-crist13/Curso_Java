// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double precoOriginal = 200.00;
        double percentualDesconto = 30;
        double desconto = (percentualDesconto/100) *precoOriginal;
        double precoDesconto = precoOriginal - desconto;

        System.out.println(String.format("Seu valor com desconto é %.2f", precoDesconto));
    }
}