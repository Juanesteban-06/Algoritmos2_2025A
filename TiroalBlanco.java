import java.util.Scanner;

public class TiroalBlanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el radio del círculo
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Pedir las coordenadas del disparo (x, y)
        System.out.print("Introduce la coordenada x del disparo: ");
        double disparoX = scanner.nextDouble();

        System.out.print("Introduce la coordenada y del disparo: ");
        double disparoY = scanner.nextDouble();

        // Calcular la distancia del disparo al centro del círculo (0, 0)
        double distancia = Math.sqrt(Math.pow(disparoX, 2) + Math.pow(disparoY, 2));

        // Determinar si el disparo salió del tablero
        if (distancia > radio) {
            System.out.println("El disparo salió del tablero.");
        } else {
            System.out.println("El disparo está dentro del tablero.");
        }

        scanner.close();
    }
}