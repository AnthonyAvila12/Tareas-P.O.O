/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
       

        // TODO code application logic here
        

      //Insiso #1
        System.out.println("Imprimiendo insiso #1");
        System.out.println("");
        System.out.println("Hola soy Anthony Avila");
        
        System.out.println(""); 
     //Insisiso #2
        double numero1,numero2, suma,resta, multiplicacion, division;
        System.out.println("Imprimiendo insiso #2");
        System.out.println("Ingrese un numero:");
        numero1=sc.nextInt();
        System.out.println("Ingrese un segundo numero:");
        numero2=sc.nextInt();
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division: "+division);
        
        //Insiso #3
        System.out.println("Imprimiendo insiso #3");
        int M = 6;
        int T = 1;
        int K = -10;
  
if(M>T)
{
    System.out.println("M > T  es Verdadero");
}
if((T/K)==-5)
{

    System.out.println("T / K == -5  es Verdadero");
}
if((M+T)==7||(M-T)==5)
{
    System.out.println("(M+T == 7) || (M-T == 5) es Verdadero");
}

        System.out.println("");
//Insisiso #4

 String[ ]   Nombre_Companeros = new  String[10];
 int contador=1;
 Nombre_Companeros[0]=" LUZ MARIA ESPINOZA IZAGUIRRE ";
 Nombre_Companeros[1]=" WALTER YAFETH SANCHEZ FUNEZ ";
 Nombre_Companeros[2]=" AYLIN MARELI FUNEZ MALDONADO ";
 Nombre_Companeros[3]=" DUNIA MARICELA HERNANDEZ ORELLANA ";
 Nombre_Companeros[4]=" DELBERT ALEXANDER LIRA TINOCO ";
 Nombre_Companeros[5]=" JESUS ARTURO ACOSTA CERRATO ";
 Nombre_Companeros[6]=" CRISTIAN ALEXANDER MENJIVAR AYALA";
 Nombre_Companeros[7]=" KEVIN ANTONIO ARCHAGA ALFARO";
 Nombre_Companeros[8]=" JEFFREE HELI REYES QUINTERO";
 Nombre_Companeros[9]=" JOB ELIACSAR RAMOS CANALES";
 System.out.println("Imprimiendo insiso #4");
 
        System.out.println("Mis compañeros son: ");
        for(int i=0; i<=9; i++)
        {
            System.out.println(contador+") "+Nombre_Companeros[i]);
            contador++;
        }
        

//Insiso #5
System.out.println("");
        System.out.println("Imprimiendo insisiso #5");
        String Informacion[][];
        Informacion= new String[5][6];
        //nombre
        Informacion[0][0]="LUZ";
        Informacion[1][0]="WALTER";
        Informacion[2][0]="AYLIN";
        Informacion[3][0]="DUNIA";
        Informacion[4][0]="DELBERT";
        
        //apellido
        Informacion[0][1]="ESPINOZA";
        Informacion[1][1]="SANCHEZ";
        Informacion[2][1]="FUNEZ";
        Informacion[3][1]="HERNANDEZ";
        Informacion[4][1]="LIRA";
        
        //carrera
        Informacion[0][2]="INDUSTRIAL";
        Informacion[1][2]="INDUSTRIAL";
        Informacion[2][2]="INDUSTRIAL";
        Informacion[3][2]="COMPUTAICON";
        Informacion[4][2]="INDUSTRIAL";
        
        //trabajo
        Informacion[0][3]="No Dice";
        Informacion[1][3]="No Dice";
        Informacion[2][3]="No Dice";
        Informacion[3][3]="No Dice";
        Informacion[4][3]="No Dice";
        
       
     
       
 
        
        for(int j=0; j<=4;j++)
        {
           
        for(int i=0;i<=3;i++)
        {
            System.out.print (Informacion[j] [i]+"      ");
         
        }
            
            System.out.println(""); 
        }
        
        
        //Insiso #6
        System.out.println("");
        
        System.out.println("Imprimiendo insiso #6");
        String nom;
        double calificacion;
        
        nom="Anthony Avila";
        System.out.println("Ingrese la calificacion del estudiante: ");
        calificacion=sc.nextDouble();
        if(calificacion<70)
        {
            System.out.println("Usted reprobo la clase");
        }
        if(calificacion>=70)
        {
            System.out.println("Usted aprobo la clase");
        }

                
        //Insiso #7
        System.out.println("");
        System.out.println("Imprimiendo insiso 7");
        System.out.println("Numeros impares del 2 al 100: ");
        int par=2;
        for(int q=1; q<=50; q++)
        {
            System.out.println(par);
            par=par+2;
        
        }

}
}

