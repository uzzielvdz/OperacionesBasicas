
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    
    float suma, resta, multiplicación, division;

  

    public void Suma(int  valor1, int valor2){
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
    }
    
    public void Resta(int  valor1, int valor2){
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }
    
    public void Multiplicación(int  valor1, int valor2){
        multiplicación= valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);
    }
    
    public void División(int  valor1, int valor2){
       division = valor1 / valor2;
        System.out.println("La división  es: " + division);
    }
    
    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.Suma(7,9);
        operaciones.Resta(12, 12);
        operaciones.Multiplicación(11, 13);
        operaciones.División(11, 16);
    }
    
}
