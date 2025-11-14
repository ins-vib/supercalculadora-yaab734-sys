

package org.yourcompany.calculadora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {



      int hola = calcularPotencia(2,3);  
      System.out.println(hola);
        // Exemples de crida per al mètode cinema
        // cinema(8.0, false, true);
        
    
        // Exemples de crida per al mètode caraocreu
        // caraocreu(10); 

        // Exemples de crida per al mètode nombreDigits
        //System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        //System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        //System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        //System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

       
        
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int caraocreu(int h) {
        Random generadorAleatoris = new Random();
        int cara = 0;
        int creu = 0;
        int i = 1;
        while(i<= h) {
           int tirada = generadorAleatoris.nextInt(0,2); // 0 o 1
            if (tirada == 0) {
                cara = cara + 1;
                System.out.println("Ha sortit cara!");
            } else {
                creu = creu + 1;
                System.out.println("Ha sortit creu!");
            }
            i++;
            System.out.println(" Numero de cares: " + cara + " Numero de creus: " + creu);
        }   
        return i;
    }

    public static double cinema (double entrada, boolean capde, boolean CJ) {
        Scanner teclat = new Scanner(System.in);
        
        
        double entradaCap = entrada + entrada*0.1;
        double entradaaux;
 
        System.out.println("Benvingut al cinema de tarragona, per obtenir el preu de la entrada, respongueu les següents preguntes: ");
        System.out.println("És cap de setmana? (s/n)");
        
        
        if (capde == false){System.out.println("El preu de l'entrada en dia laboral es de " + entrada + " EUR");
               entradaaux= entrada;}
        else { System.out.println ("El preu al cap de setmana es de " + entradaCap + "EUR");
               entradaaux= entradaCap;};
        
        System.out.println("");
        System.out.println("Tens carnet jove? (s/n)");
        
        
        
        if (CJ == true){System.out.println("El preu de l'entrada amb carnet jove es: " + (entradaaux - entradaaux*0.15)  + " EUR");}
        else { System.out.println ("El preu de l'entrada sense carnet jove es: " + entradaaux + "EUR");};

        return entradaaux;

    }

    public static int sumaPrimersNumeros(int n) {
        
        int i = 1;
        int suma = 0;
        while (i <= n) {
            suma = i;
            i++;
            System.out.println("Suma dels primers " + n + " números: " + suma);
        }
        return suma;
    }

    public static int calcularFactorial(int n) {

       int resultat = 1;
       int i = 1;
       while (n>=i) {

        resultat = resultat * i;
       //  System.out.println("El factorial es: " + resultat);
        i++;
        
        
       } 
       return resultat;
}

    public static int sumaQuadrats(int n) {
      int resultat = 0;
       int i = 1;
       while (n>=i) {
           resultat = resultat + (i * i);
        //  System.out.println("El factorial es: " + resultat);
        i++;
       }return resultat;
       } 
       

       public static int calcularPotencia(int base, int exponent) {
       

        int resultat = 0;

        resultat = (int) Math.pow(base, exponent);
        return resultat;
       }
    }
    

    

        
    


