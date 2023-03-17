/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.util.Scanner;

/**
 *
 * @author tojhe
 */
public class ConcesionarioAutos {
    
    public static void main(String[] args) {
        
        //Primer comentario en Apache netBeans
        //System.out.println("Hello Word");
        
        //Variables
        //se utiliza opc para guardar la opcion ingresada por el usuario
        int opc = 0;
        //para escojer la gama de vehiculos que se desee
        int seleccionAuto = 0;
        String error = "Error, ingrese una valiable correcta";        
        
        //Declarar la entrada
        Scanner tc = new Scanner(System.in);
        
      do{
        
        System.out.println(" -----------------------------------------");
        System.out.println("|          CONCECIONARIA DE AUTOS         |");
        System.out.println("|             -MENU PRINCIPAL-            |");
        System.out.println(" -----------------------------------------");    
        System.out.println("");
        System.out.println("1. - Seleccione un Automovil");
        System.out.println("2. - Salir");
        System.out.println("");
        System.out.print("Ingrese la opción que desea ejecutar:");
    
        //se utiliza opc para guardar la opcion ingresada por el usuario
        opc = tc.nextInt();
        
        switch(opc){//inicio de switch
            
            case 1:
                
            System.out.println(" -----------------------------------------");
            System.out.println("|          CONCECIONARIA DE AUTOS         |");
            System.out.println("|   -SELECCIONE LA GAMA DEL VEHICULO-     |");
            System.out.println(" -----------------------------------------");    
            System.out.println("");
            System.out.println("1. - Sedan Economico");
            System.out.println("2. - Sedan");
            System.out.println("3. - Deportivo");
            System.out.println("4. - Hibrido");
            System.out.println("");
            System.out.print("Ingrese la gama de vehiculo deseado:");
            seleccionAuto = tc.nextInt();
                break;
                
            case 2:
                opc = 2;
                break;
                
            case 3:
                
                break;
                
            default:
                System.out.println(error);
                                
        
        }//fin switch
      }while (opc !=2); //fin del do
    }
}

/*do{

codigo que persiste

}while(OPC !=2)<- se especifica mediante cu*/