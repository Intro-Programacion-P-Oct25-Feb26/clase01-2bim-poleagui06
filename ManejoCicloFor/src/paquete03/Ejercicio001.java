/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Ejercicio001 {
    public static void main(String[] args) {
        String mensaje = "Hola Ecuador";
        System.out.printf("Primera posición %s\n", 
                mensaje.substring(0, 1));
        
        for (int i = 0; i < mensaje.length(); i++) {
            String posicion = mensaje.substring(i, i+1);
            System.out.printf("%s\n", posicion);
        }
        
    }
}
