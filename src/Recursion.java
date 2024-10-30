import java.util.Scanner;
/**
 * Ejercicios de recursión
 */
public class Recursion {

    public int fibIter(int n) throws OtroErrorAritmeticoException {
        int tmp = 1;
        int actual = 1;
        int ultimo = 1;
        System.out.println("Adentro");
        if (n < 0) {
            throw new OtroErrorAritmeticoException("Esta función sólo está definida para números naturales.");
        }
        if (n < 2) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            tmp = actual;
            actual += ultimo;
            ultimo = tmp;
        }
        return actual;
    }

    public int fibRec(int n) throws OtroErrorAritmeticoException {
        //System.out.println("Adentro");
        if (n < 0) {
            throw new OtroErrorAritmeticoException("Esta función sólo está definida para números naturales.");
        }
        if (n < 2) {
            return 1;
        }
        return fibRec(n - 2) + fibRec(n - 1);
    }

    public int h(int n) throws OtroErrorAritmeticoException {
        System.out.println("Adentro");
        if (n < 0) {
            throw new OtroErrorAritmeticoException("Esta función sólo está definida para números naturales.");
        }
        if (n == 0 || n > 4) {
            return n;
        }
        return h(2 + h(2 * n));
    }

    public void voltea() {
        //Scanner teclado = new Scanner(System.in);
        char c = '|';

        try {
            c = (char) System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //teclado.close();
        }
        if ((c != '\n')) { 
            voltea();
            System.out.print(c);
        }
    }


    public int pot2Rec(int n) throws OtroErrorAritmeticoException {
        if (n < 0) {
            throw new OtroErrorAritmeticoException("Esta función sólo está definida para números naturales.");
        }
        if (n == 0) {
            return 1;
        }
        return 2 * pot2Rec(n - 1);
    }

    public int pot2Iter(int n) throws OtroErrorAritmeticoException {
        int salida = 1;
        if (n < 0) {
            throw new OtroErrorAritmeticoException("Esta función sólo está definida para números naturales.");
        }
        for (int i = 0; i < n; i++) {
            salida *= 2;
        }
        return salida;
    }

    public int factRec(int n) throws OtroErrorAritmeticoException {
        if (n < 0) {
            throw new OtroErrorAritmeticoException("No existe el factorial de números negativos.");
        }
        if (n < 2) {
            return 1;
        } 
        return n * factRec(n - 1);        
    }

    public int factIter(int n) throws OtroErrorAritmeticoException {
        int salida = 1;
        if (n < 0) {
            throw new OtroErrorAritmeticoException("No existe el factorial de números negativos.");
        }
        for(int i = n; i > 1; i--) {
            salida *= i;
            System.out.println(i);
        }
        return salida;
    } 
}
