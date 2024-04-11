import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaNota = 0;
        int totalNotas = 0;

        while (nota != -1){
            System.out.println("Puntuación de película: ");
            nota = teclado.nextDouble();

            if(nota != -1){
            mediaNota += nota;
            totalNotas++;

            }
        }
        System.out.println("La media de notas es: " + mediaNota/totalNotas);
    }
}
