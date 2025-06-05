
package proyecto3;

import java.util.Scanner;
public class Proyecto3 {
    public static void main(String[] args) {
        //Variables
        double num1,num2,suma,promedio;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar numero 1: ");
        num1=lectura.nextDouble();
        System.out.print("Ingresar numero 2: ");
        num2=lectura.nextDouble();
        //Proceso
        suma=num1+num2;
        promedio=suma/2;
        //Salida
        System.out.println("NOMBRE");
        System.out.println("Suma" +suma);
        System.out.println("Promedio" +promedio);
    }
}
