import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in); 
    int numero1;
    int numero2;
    int suma, resta, residuo, multiplicacion, division;
    System.out.println("Ingrese en primer valor");
    numero1 = teclado.nextInt();
    System.out.println("Ingrese en primer valor");
    numero2 = teclado.nextInt();
    //operar
    suma = numero1 + numero2;
    resta = numero1 - numero2;
    multiplicacion = numero1 * numero2;
    division = numero1 / numero2;
    residuo = numero1 % numero2;
    System.out.println("LOS RESULTADOS");
    System.out.println("La suma de 2 números es: " + suma);
    System.out.println("La resta de 2 números es: " + resta);
    System.out.println("La multiplicacion de 2 números es: " + multiplicacion);
    System.out.println("La division de 2 números es: " + division);
    System.out.println("La residuo de 2 números es: " + residuo);

  }
}