import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double mediaPositivos = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 1; i <= 6; i++) {
            double valor = leitor.nextDouble();
            if (valor > 0) {
                cont++;
                mediaPositivos += valor;
            }
        }

        if (cont > 0) {
            mediaPositivos = mediaPositivos / cont;
        }


        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", mediaPositivos));
    }

}