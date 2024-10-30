public class App {
    public static void main(String[] args) throws Exception {
        Recursion rec = new Recursion();
        int n = 57;

        System.out.println();

        /* try {
            for (int i = 0; i < 11; i++) {
                System.out.println("2^" + i +" = " + rec.pot2Iter(i));
            }
        } catch (OtroErrorAritmeticoException oeae) {
            System.out.println("\n¡Charros! Ocurrió una excepción de aritmética:");
            oeae.printStackTrace();
        } catch (ErrorAritmeticoException eae) {
            System.out.println("Estoy en el otro error");
        } catch (Exception e) {
            System.out.println("¡Ouch!");
            return;
        }  
    
        System.out.println("Escribe algo.");
        rec.voltea();*/

        System.out.println("fib(" + n + ") = " + rec.fibIter(n));
        
        System.out.println();
    }
}
