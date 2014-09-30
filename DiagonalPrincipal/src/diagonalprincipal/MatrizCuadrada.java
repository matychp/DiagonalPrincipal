/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonalprincipal;

/**
 *
 * @author matychp
 */
public class MatrizCuadrada {

    private int unaMatriz[][];

    public MatrizCuadrada() {

    }

    public MatrizCuadrada(int unTamaño) {
        unaMatriz = new int[unTamaño][unTamaño];
    }

    public void cargar() {
        for (int[] arrayHorizontal: unaMatriz) {
            for (int j = 0; j < arrayHorizontal.length; j++) {
                arrayHorizontal[j] = (int)(Math.random() * 100);
            }
        }
    }

    public int sumarDiagonalPrincipal() {
        int unaSuma = 0;
        for (int i = 0; i < unaMatriz.length; i++) {
            if (unaMatriz[i][i] > 0) {
                unaSuma += unaMatriz[i][i];
            }
        }
        return unaSuma;
    }
}
