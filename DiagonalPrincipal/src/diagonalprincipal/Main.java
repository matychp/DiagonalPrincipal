/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalprincipal;

import java.util.Scanner;

/**
 *
 * @author matychp
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos: (matriz cuadrada)");
        int n = in.nextInt();
        MatrizCuadrada unaMC = new MatrizCuadrada(n);
        unaMC.cargar();
        System.out.println("Suma de la diagonal principal: " + unaMC.sumarDiagonalPrincipal());     
    }    
}
