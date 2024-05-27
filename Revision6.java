//Ejercicio Elaborado por Sandra Riverol
//Calificación 5 de 5 por parte de Selene Rojas

package com.revision6;
import java.util.Scanner;
public class Revision6 {

	public static void main(String[] args) {
		System.out.println("\n¿Qué números quiere resaltar? "); //Se arregla system out
	    System.out.println("(1 – los múltiplos de 5, \n 2 – los múltiplos de 7): ");
	    Scanner scan = new Scanner(System.in); //Recibo opcion de consola.
	    int decision = scan.nextInt(); //Switch
		
	    
	    //Coloco el new para crear mi array random
	    int[] numbers = new int[20];
		    for (int i = 0; i < 20; i++) //Se arregla ++
		    {
		      numbers[i] = (int)(Math.random() * 381);
		      System.out.println(+  numbers[i] + ","); //Separaciones y formato
		    }
	    
		    
		    //Creo switch para decision de multiplos e imprimo esos para resaltarlos
		    switch (decision) {
            case 1:
                System.out.println(" \n Multiplos de 5:");
                for (int num : numbers) {
                    if (num % 5 == 0) {
                        System.out.println("**" +num + "**");
                    }
                }
                break;

                
            case 2:
                System.out.println(" \n Multiplos de 7:");
                for (int num : numbers) {
                    if (num % 7 == 0) {
                        System.out.println("**" +num + "**");
                    }
                }
                break; 
                
            default: { //Para opciones incorrectas
		    	System.out.println("Esa no es una opción, intenta de nuevo");
		}
		    }
			} 
				}
