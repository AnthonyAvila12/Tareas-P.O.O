/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.pkg4_anthony_avila;
import Helpers.Futbolista;
import Helpers.Honduras;
import Helpers.Suecia;
import Helpers.TrinidayTobago;


/**
 *
 * @author Anthony Avila
 */
public class MODULO4_Anthony_Avila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pirmera parte 1
        
        Futbolista futbolista = new Futbolista();
        
        System.out.println("Encapsulamiento");
        
         futbolista.establecerNombre("Anthony Avila");
        System.out.println("Nombre:  "+ futbolista.obtenerNombre());
        
        futbolista.establecerEdad(19);
        System.out.println("Edad:  "+futbolista.obtenerEdad());
        
        futbolista.establecerEquipo("JUVENTUS");
        System.out.println("Equipo Actual: "+ futbolista.obtenerequipo());
        
       
        System.out.println(" ");
        System.out.println(" ");
        
        //segunda parte del codigo
        //Abstraccion
        System.out.println("Abstraccion");
        Honduras honduras= new Honduras();
        TrinidayTobago trinidaytobago= new TrinidayTobago();
        Suecia suecia = new Suecia();
        
        System.out.println("Pais: "+honduras.getpais());
        System.out.println("presindete del club : "+honduras.getPresidente());
        System.out.println("Equipo: "+honduras.getEquipo());
        System.out.println("Capitan: "+honduras.getcaptain());
        System.out.println(" ");
        
         System.out.println("Pais: "+suecia.getpais());
        System.out.println("presindetedel club : "+suecia.getPresidente());
        System.out.println("Equipo: "+suecia.getEquipo());
        System.out.println("Capitan: "+suecia.getcaptain());
        System.out.println(" ");
        
        System.out.println("Pais: "+trinidaytobago.getpais());
        System.out.println("presindete del club : "+trinidaytobago.getPresidente());
        System.out.println("Equipo: "+trinidaytobago.getEquipo());
        System.out.println("Capitan: "+trinidaytobago.getcaptain());
    }

    
    
}
