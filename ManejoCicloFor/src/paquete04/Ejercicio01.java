/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author Pole
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        int valor1;
        int valor2;
        int valor3;
        int valor4;

        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        String reporte = "";

        /* el ciclo inicia con el numero 30, donde ira decreciendo 
        con 1 hasta q sea igual a 10.*/
        for (int i = 30; i >= 10; i--) {

            // Se calcular la multiplicacion de las vaiables
            valor1 = i;
            valor2 = i * 2;
            valor3 = i * 3;
            valor4 = i * 4;

            /* Se suma cada valor al acumulador correspondiente,
            se acumulan los totales */
            suma1 = suma1 + valor1;
            suma2 = suma2 + valor2;
            suma3 = suma3 + valor3;
            suma4 = suma4 + valor4;

            // se va acumulando en mensaje final con los valores
            reporte = String.format("%s%d-%d-%d-%d\n",
                    reporte, valor1, valor2, valor3, valor4);
        }

        /* por ultimo se hace el mensaje final donde imprima los numeros totales*/
        reporte = String.format("%s\nTotales = %d-%d-%d-%d",
                reporte, suma1, suma2, suma3, suma4);

        // Aqui se imprime todo.
        System.out.printf("%s\n", reporte);
    }
}


