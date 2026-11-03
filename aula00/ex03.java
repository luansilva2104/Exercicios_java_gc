import java.sql.SQLOutput;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroUm = input.nextInt();
        int numeroDois = input.nextInt();
        int numeroTres = input.nextInt();

        int numeroMaior;
        int numeroMenor;
        double numeroMedia;

        if(numeroUm > numeroDois){
            numeroMaior = numeroUm;
            numeroMenor = numeroDois;
        } else{
            numeroMaior = numeroDois;
            numeroMenor = numeroUm;
        }

        if(numeroTres > numeroMaior){
            numeroMaior = numeroTres;
        }else{
            numeroMenor = numeroTres;
        }
        System.out.println("numero maior: " +numeroMaior);
        System.out.println("numero menor: " +numeroMenor);
    }
}
