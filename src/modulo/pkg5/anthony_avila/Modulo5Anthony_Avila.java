/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.pkg5.anthony_avila;

import Helpers.Circulo;
import Helpers.Cuadrado;
import Helpers.Linea;
import Helpers.Triangulo;

/**
 *
 * @author Anthony Avila.
 */
public class Modulo5Anthony_Avila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Linea linea = new Linea();
        Cuadrado cuadrado= new Cuadrado();
        
        System.out.println("circulo");
        circulo.calcular();
        circulo.impresion();
        System.out.println("");
         System.out.println("Cuadrado");
        cuadrado.calcular();
        cuadrado.impresion();
        System.out.println("");
         System.out.println("Triangulo");
        triangulo.calcular();
        triangulo.impresion();
        System.out.println("");
         System.out.println("Linea");
        linea.dibujar();
        linea.impresion();
        
    }
    
    
}
