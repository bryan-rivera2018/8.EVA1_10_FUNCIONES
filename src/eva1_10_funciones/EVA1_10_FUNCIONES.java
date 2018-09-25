/*
 * Se usan las funciones para sacar el area de un triangulo
 */
package eva1_10_funciones;

import java.util.Scanner;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_10_FUNCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        double base, alt;
        System.out.println("Ingresa la base: ");//le pide al usuario ingresar la base
        base=leer.nextDouble();
        System.out.println("ingresa la altura: ");//le pide al usuario ingresar la altura
        alt=leer.nextDouble();
        double area=calculaArea(base, alt);//se calcula el resultado
        System.out.println("el area es: "+area);//imprimimos el resultado de la multiplicacion
    }
    //definiendo una función area
    //modificasdor de acceso || tipo de retorno || nombre (varables de entrada)
    public static double calculaArea(double base, double altura)
    {
        //implementacion de la función
        double area;
        area=(base*altura)/2;
        return area;
    }
    
}
