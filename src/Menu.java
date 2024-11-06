import java.util.Scanner;

/**
 * Presenta el menú principal. Hola, bola, ratón sin cola.
 * @author Araceli Mercado
 * @version 1.0
 */
public class Menu {

    private Scanner teclado = new Scanner(System.in);

    /**
     * Maneja el flujo del menú.
     */
    public void manejaOpcion() {
        byte opcion;

        System.out.println(toString());
        opcion = teclado.nextByte();

        System.out.println("Elegiste: " + opcion);
    }

    /**
     * Genera una cadena que se va a desplegar como menú.
     * @return una cadena que se va a desplegar como menú.
     */
    public String toString() {
        String salida = "Elige una opción: \n"
                      + "1. Escribir una fracción como a/b.\n"
                      + "2. Simplificar una fracción.\n"
                      + "3. Determinar la mayor de dos fracciones.\n"
                      + "4. Sumar dos fracciones.\n"
                      + "5. Hallar el inverso aditivo de una fracción."
                      + "6. Restar una fracción de otra.\n"
                      + "7. Multiplicar dos fracciones.\n"
                      + "8. Hallar el inverso multiplicativo de una fracción.\n"
                      + "9. Dividir una fracción entre otra.\n"
                      + "S. Salir\n";
             
        return salida;
    }

    public void tomaAccion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Elegiste el 1.");
                break;
            case 2:
                System.out.println("Elegiste el 2.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

}
