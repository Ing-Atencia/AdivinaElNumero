import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        // Numero aleatorio entre 1 y 100
        int numeroAleatorio = new Random().nextInt(100) + 1;

        Scanner teclado = new Scanner(System.in);

        while (a > 0) {

            System.out.println("Ingresa un numero entre 1 y 100, tienes " + a + " intentos");

            int numeroUsuario = teclado.nextInt();

            if(numeroUsuario > 0 && numeroUsuario <= 100) {

                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Adivinaste el Numero en " + b + " Intentos");
                    break;
                }

                System.out.println(numeroAleatorio > numeroUsuario ? "El numero es Mayor" : "El numero es Menor");


            } else System.out.println("value incorrect");



            a--;
            b++;

            if (a == 0) {
                System.out.println("El número aleatorio es :" + numeroAleatorio);
            }

        }

        ;
    }
}