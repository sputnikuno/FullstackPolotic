/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeControl;

public class ArreglosYMatrices {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6};
        int matriz[][] = {{1,2,6},{3},{4},{5}};
        
        //con .length obtenemos el largo del arreglo para recorrerlo
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
            System.out.println(matriz[i][j]);
            }
        }
        
    }
}