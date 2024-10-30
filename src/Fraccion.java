/**
 * Maneja fracciones en la forma a/b.
 * @author Araceli Mercado
 * @version 0.1
 */
public class Fraccion {
    private int num;
    private int den;

    /**
     * Calcula el cociente de <code>this</code> entre la fracción que se pasa
     * como parámetro.
     * @param f El divisor.
     * @return El cociente.
     */
    public Fraccion divide(Fraccion f) throws OtroErrorAritmeticoException {
        if (f.num == 0) {
            throw new OtroErrorAritmeticoException("No se puede dividir entre cero.");
        }
        return multiplica(f.inversoMultiplicativo());
    }

    /**
     * Regresa el inverso multiplicativo de <code>this</code>.
     * @return el recíproco.
     */
    public Fraccion inversoMultiplicativo() {
        if (num == 0) {
            System.out.println("El cero no tiene inverso multiplicativo");
            return null; //TODO Manejar bien el error
        }
        return new Fraccion(den, num);
    }
    /**
     * Multiplica <code>this</code> por la fracción que se pasa como parámetro.
     * @param f el segundo factor.
     * @return el producto de las dos fracciones.
     */
    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.num * f.num, this.den * f.den);
    }
    /**
     * Resta la fracción que se pasa como parámetro a <code>this</code>.
     * Es decir, <code>this</code> es el minuendo.
     * @param f sustraendo
     * @return La diferencia entre las dos fracciones
     */
    public Fraccion resta(Fraccion f) {
        return suma(f.inversoAditivo());
    }

    /**
     * Calcula el inverso aditivo de esta fracción.
     * @return el inverso aditivo.
     */
    public Fraccion inversoAditivo() {
        return new Fraccion(-1 * num, den);
    }

    /**
     * Suma esta fracción con la que se pasa como parámetro.
     * @param f La fracción que se va a sumar a <code>this</code>.
     * @return La suma de las dos fracciones.
     */
    public Fraccion suma(Fraccion f) {
        int comunDenominador;
        int numerador;

        comunDenominador = this.den * f.den / mcd(this.den, f.den);
        numerador = this.num * comunDenominador / this.den
                    + f.num * comunDenominador / f.den;
        
        return new Fraccion(numerador, comunDenominador);
    }

    /**
     * Reduce la fracción a su mínima expresión y le pone el signo
     * al numerador.
     */
    public void simplifica() {
        int dcm = mcd(num,den);
        num = signo() * Math.abs(num) / dcm;
        den = Math.abs(den) / dcm;
    }

    /**
     * Determina si esta fracción es mayor que la que se pasa como parámetro.
     * @param f La fracción con la que comparo esta fracción.
     * @return <code>true</code> si esta fracción es mayor que el parámetro, <code>false</code> en otro caso.
     */
    public boolean esMayor(Fraccion f) {
        return (this.num + 0.0) / (this.den + 0.0) > (f.num + 0.0) / (f.den + 0.0);
    }
    
    // Calcula el máximo común divisor de dos enteros.
    private int mcd(int n, int m) {
        int r;
        if (m == 0 && n == 0) {
            System.out.println("No existe el mcd de cero y cero.");
            return 0; //TODO Manejar bien el error
        }
        if (m == 0 && n != 0) {
            return Math.abs(n);
        }
        if (n == 0 && m != 0) {
            return Math.abs(m);
        }
        do {
            r = m % n;
            m = n;
            n = r;
        } while (r != 0);
        return Math.abs(m);
    }

    /*
     * Regresa -1 si la fracción es negativa y 1 si es positiva
     */
    private int signo() {
        int salida;
        //TODO Considerar cuando la fracción es nula.
        salida = (num * den) < 0 ? -1 : 1;
        return salida;
    }

    /**********U T I L E R I A*************/

    public String toString() {
        String salida;

        if (num == 0) {
            return "" + 0;
        }

        salida = "" + num;

        if (den != 1) { 
            salida += "/" + den;
        } 
        return salida;
    }

    public boolean equals(Fraccion f) {
        return this.num * f.den == this.den * f.num;
    }
    /**********U T I L E R I A*************/

    /**********C O N S T R U C T O R E S*************/
    public Fraccion(int n, int d) {
        super();
        if (d == 0) {
            throw new ErrorAritmeticoException("El denominador no puede ser cero.");
        }
        setNum(n);;
        setDen(d);;
        simplifica();
    }
    /**
     * Genera una fracción que representa a un entero
     * @param n el entero a representar
     */
    public Fraccion(int n) {
        super();
        num = n;
        den = 1;
    }
    /**********C O N S T R U C T O R E S*************/

    /**********A C C E S O  *************/
    public void setNum(int n) {
        num = n;
    }
    public int getNum() {
        return num;
    }
    public void setDen(int d) {
        if (d == 0) {
            throw new ErrorAritmeticoException("El denominador no puede ser nulo.");
        }
        den = d;
    }
    public int getDen() {
        return den;
    }
    /**********A C C E S O  *************/

}
