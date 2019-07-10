package clases;

import java.util.Scanner;

public class Principal {

    public static void main (String [] ar)
    {
    	
    	// Declaración y creación de objeto de la clase ArbolBinario
        ArbolBinario abo = new ArbolBinario ();
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        
        
        do{
        	
        	// Despliega menú de opciones
        	System.out.println("Opciones: \r\n1. Agregar Nodo"
        			+ "\r\n2. Recorrido Preorden"
        			+ "\r\n3. Recorrido Inorden"
        			+ "\r\n4. Recorrido Postorden"
        			+ "\r\n5. Salir");
        	
        	System.out.println("?: ");
        	
        	// Captura desde el teclado la opción del menú
        	opcion = lector.nextInt();
        	
        	// Estructura condicional múltple para la ejecución 
        	switch(opcion){
        		case 1:
        			
        			System.out.println("Valor: ");
        			abo.insertar(lector.nextInt());
        			
        			break;
        		
        		
        		case 2:
        			
        			System.out.println("Recorrido Preorden");
        			abo.imprimirPre();
        			
        			break;
        		
        		case 3:
        			
        			System.out.println("Recorrido Inorden");
        			abo.imprimirEntre();
        			
        			break;
        		
        		case 4:
 
        			System.out.println("Recorrido Postorden");
        			abo.imprimirPost();
        			
        			break;
        		
        		case 5:
        			
        			System.out.println("Bye");
        			
        			break;

        		default:
        		
        			System.out.println("Opción no válida");
        			
        			
        	}
        	
        	
        }while(opcion != 5);
        

    }
}
