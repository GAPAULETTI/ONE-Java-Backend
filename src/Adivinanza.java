import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);

        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        while (intentos < 5){
            System.out.println("Ingrese un número entre 1 y 100: ");
            int numeroUsuario = sc.nextInt();
                intentos++;

            if(numeroUsuario > numeroAleatorio){
                System.out.println("El número ingresado es mayor");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número ingresado es menor");
            } else  {
                System.out.println("Felicidades!! Adivinaste el número");
                break;
            }
        if(intentos == 5){
            System.out.println("Perdiste!!");
        }
        }

    }
}
