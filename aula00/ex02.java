import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int numeroDois = scanner.nextInt();

        int numeroFinal = numeroUm += numeroDois;
        System.out.println("O resultado da soma foi " +numeroFinal);
    }
}
