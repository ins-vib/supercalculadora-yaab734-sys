package org.yourcompany.calculadora;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {
    
    public static void main(String[] args) {



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

       menu();

    }

    public static void menu(){
        System.out.println("Benvingut a la supercalculadora");
        System.out.println("Selecciona una opció del menú:");
        System.out.println("1. Calcular nombre de dígits d'un número");
        System.out.println("2. Llançar moneda (cara o creu)");
        System.out.println("3. Calcular preu entrada cinema");
        System.out.println("4. Suma dels primers n números enters positius");
        System.out.println("5. Calcular factorial d'un nombre");
        System.out.println("6. Suma dels quadrats dels primers n números enters positius");
        System.out.println("7. Calcular potència d'un nombre");
        System.out.println("0. Sortir");

        try (Scanner teclat = new Scanner(System.in)) {
            System.out.print("Introdueix l'opció: ");
            int opcio = teclat.nextInt();

            // switch con sintaxis clásica (compatible amb versions antigues de Java)
            switch (opcio) {
                case 1: {
                    System.out.print("Introdueix un número per calcular el nombre de dígits: ");
                    int num = teclat.nextInt();
                    System.out.println("Nombre de dígits: " + nombreDigits(num));
                    break;
                }
                case 2: {
                    System.out.print("Introdueix el nombre de llançaments: ");
                    int h = teclat.nextInt();
                    caraocreu(h);
                    System.out.println("Fi del procés de llançaments.");
                    break;
                }
                case 3: {
                    System.out.print("Introdueix el preu base de l'entrada (ex. 8 o 8.5): ");
                    double entrada = teclat.nextDouble();
                    System.out.print("És cap de setmana? (1 per sí, 0 per no): ");
                    int vf = teclat.nextInt();
                    System.out.print("Tens carnet jove? (1 per sí, 0 per no): ");
                    int vf2 = teclat.nextInt();
                    boolean capde = (vf == 1);
                    boolean CJ = (vf2 == 1);
                    double preuFinal = cinema(capde, CJ, entrada);
                    System.out.println("Preu calculat: " + preuFinal + " EUR");
                    break;
                }
                case 4: {
                    System.out.print("Introdueix n: ");
                    int n = teclat.nextInt();
                    System.out.println("Suma dels primers " + n + " números: " + sumaPrimersNumeros(n));
                    break;
                }
                case 5: {
                    System.out.print("Introdueix n per calcular factorial: ");
                    int n = teclat.nextInt();
                    System.out.println("Factorial de " + n + " = " + calcularFactorial(n));
                    break;
                }
                case 6: {
                    System.out.print("Introdueix n per sumar quadrats: ");
                    int n = teclat.nextInt();
                    System.out.println("Suma dels quadrats dels primers " + n + " = " + sumaQuadrats(n));
                    break;
                }
                case 7: {
                    System.out.print("Introdueix la base (enter): ");
                    int base = teclat.nextInt();
                    System.out.print("Introdueix l'exponent (enter): ");
                    int exponent = teclat.nextInt();
                    System.out.println("Resultat: " + calcularPotencia(base, exponent));
                    break;
                }
                case 0:
                    System.out.println("Sortint de la supercalculadora. Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Si us plau, selecciona una opció del menú.");
            }
        }
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
    /**
     * Mètode que simula el llançament d'una moneda
     * @param h Nombre de llançaments
     * @return Nombre total de llançaments
     */
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
    /**
     * Mètode que calcula el preu de l'entrada al cinema segons si es cap de setmana i si es té carnet jove
     * @param entrada Preu base de l'entrada
     * @param capde Indica si és cap de setmana (true) o dia laboral (false)
     * @param CJ Indica si es té carnet jove (true) o no (false)
     * @return Preu final de l'entrada
     */
    public static double cinema (boolean capde, boolean CJ, double entrada ) {
        
        
        
        double entradaCap = entrada + entrada*0.1;
        double entradaaux;
 
        System.out.println("Benvingut al cinema de tarragona, per obtenir el preu de la entrada, respongueu les següents preguntes: ");
        System.out.println("És cap de setmana? (s/n)");
        
        
        if (capde == false){System.out.println("El preu de l'entrada en dia laboral es de " + entrada + " EUR");
               entradaaux= entrada;}
        else { System.out.println ("El preu al cap de setmana es de " + entradaCap + "EUR");
               entradaaux= entradaCap;}
        
        System.out.println("");
        System.out.println("Tens carnet jove? (s/n)");
        
        
        
        if (CJ == true){System.out.println("El preu de l'entrada amb carnet jove es: " + (entradaaux - entradaaux*0.15)  + " EUR");}
        else { System.out.println ("El preu de l'entrada sense carnet jove es: " + entradaaux + "EUR");}

        return entradaaux;

    }
    /**
     * Mètode que calcula la suma dels primers n números enters positius
     * @param n Nombre fins al qual es vol calcular la suma
     * @return Suma dels primers n números enters positius
     */
    public static int sumaPrimersNumeros(int n) {
    int i = 1;
    int suma = 0;
    while (i <= n) {
        suma += i;  
        i++;
        System.out.println("Valor actual: " + i + ", Suma acumulada: " + suma);
    }
    System.out.println("Suma dels primers " + n + " números: " + suma);
    return suma;
}

    /**
     * Mètode que calcula el factorial d'un nombre enter positiu n
     * @param n Nombre del qual es vol calcular el factorial
     * @return Factorial de n
     */
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
    /**
     * Mètode que calcula la suma dels quadrats dels primers n números enters positius
     * @param n Nombre fins al qual es vol calcular la suma dels quadrats
     * @return Suma dels quadrats dels primers n números enters positius
     */
    public static int sumaQuadrats(int n) {
      int resultat = 0;
       int i = 1;
       while (n>=i) {
           resultat = resultat + (i * i);
        i++;
       }return resultat;
       } 
    /**
     * Mètode que calcula la potència d'un nombre base elevat a un exponent
     * @param base Nombre base
     * @param exponent Exponent al qual s'eleva la base
     * @return Resultat de base elevat a exponent
     */
       public static int calcularPotencia(int base, int exponent) {
       

        int resultat;

        resultat = (int) Math.pow(base, exponent);
        return resultat;
       }
    }








