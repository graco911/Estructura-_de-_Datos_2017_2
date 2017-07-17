
import Cola.ColaEjemplo;
import Lista.ListaEjemplo;
import Pila.PilaEjemplo;
import java.util.Scanner;

/*
Actividad 2. Aplicación de las estructuras de datos pila, cola y lista
1. Analiza los planteamientos y determina el problema a resolver. 

2. Utilizando como herramienta el IDE de NetBeans, desarrolla una clase para cada estructura de datos (pila, cola y lista) e incluye el código necesario para implementar los métodos aplicables a cada estructura: 
• Ingresar un elemento 
• Eliminar un elemento 
• Verificar si la estructura está vacía 
• Mostrar el contenido 
*/

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Ing en Desarrollo de Software
 * ES1611301058
 * gacc911002@nube.unadmexico.mx
 */
public class EstructuraDeDatos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaracion del variables     
        //leer datos de teclado
        Scanner sc = new Scanner(System.in);
        //variables globales
        int opcion;
        int tamanio;
        
        //Menu
        System.out.println("*************************************************");
        System.out.println("****            Estructura de Datos          ****");
        System.out.println("****Actividad 2 - Aplicacion de las estructur****");
        System.out.println("****as de datos, pilas, cola y lista         ****");
        System.out.println("****      Carlos Alberto Graniel Córdova     ****");
        System.out.println("****              ES1611301058               ****");
        System.out.println("*************************************************");
        System.out.println("****                   MENU                  ****");        
        System.out.println("*************************************************");
        
        //menu con filtrado de opcion elegida por el usuario
        do{
        System.out.println("*************************************************");
        System.out.println("Elige el tipo de estructura");
        System.out.println("*************************************************");
        System.out.println("1 - Colas");
        System.out.println("2 - Pilas");
        System.out.println("3 - Listas");
        System.out.println("Cualquier tecla - Salir");
        
        opcion = sc.nextInt();
        
        //switch de opciones
            switch(opcion){
                case 1:
                    
                System.out.println("Que tamaño tendra la cola");
                tamanio = sc.nextInt();
                //creacion de un objeto de la clase ColaEjemplo
                ColaEjemplo cola = new ColaEjemplo(tamanio);
                EstructuraDeDatos.realizarOperaciones(cola);
                    break;
                case 2:
                System.out.println("Que tamaño tendra la Pila");
                tamanio = sc.nextInt();
                //creacion de un objeto de la clase PilaEjemplo
                PilaEjemplo pila = new PilaEjemplo(tamanio);
                EstructuraDeDatos.realizarOperaciones(pila);
                    break;
                case 3:
                //Creacion de un objeto de la clase ListaEjemplo
                ListaEjemplo lista = new ListaEjemplo();
                EstructuraDeDatos.realizarOperaciones(lista);
                    break;
            }
        }
        while(opcion != 3);
        System.out.println("Programa terminado.");
    }
        //Operaciones con el Objeto ColaEjemplo
    public static void realizarOperaciones(ColaEjemplo cola) {
        Scanner scan = new Scanner(System.in);
        int item;
        int op;
        do{
        System.out.println("*************************************************");
        System.out.println("Elige que deseas hacer:");
        System.out.println("*************************************************");
        System.out.println("1 - Ingresar un elemento");
        System.out.println("2 - Eliminar un elementos");
        System.out.println("3 - Verificar si esta vacia");
        System.out.println("4 - Mostrar el contenido");
        System.out.println("5 - Salir");
        op = scan.nextInt();
        
        switch(op)
        {
        case 1:
        System.out.println("Ingrese el elemento:");
        item = scan.nextInt();
        if(cola.ingresar(item)){
            System.out.println("Elemento ingresado");
        }else{
            System.out.println("No es posible agregar mas elementos, cola llena");
        }
        
            break;
        case 2:
        if(cola.Eliminar()){
            System.out.println("Elemento Eliminado");
        }else{
            System.out.println("No hay elementos para eliminar");
        }
            break;
        case 3:
        if(cola.esVacia()){
            System.out.println("Cola Vacia");
        }   else{
            System.out.println("Cola no Vacia");
        } 
            break;
        case 4:
            System.out.println("Elementos de la Cola");
        if(cola.Mostrar()){
        }else{
            System.out.println("La Cola Esta vacia");
        }
            break;  
        }
        
        }
        while(op != 5);
        System.out.println("Programa terminado");
    }
    
        //Operaciones con el Objeto PilaEjemplo
    public static void realizarOperaciones(PilaEjemplo pila) {
        Scanner scan = new Scanner(System.in);
        int item;
        int op;
        do{
        System.out.println("*************************************************");
        System.out.println("Elige que deseas hacer:");
        System.out.println("*************************************************");
        System.out.println("1 - Ingresar un elemento");
        System.out.println("2 - Eliminar un elementos");
        System.out.println("3 - Verificar si esta vacia");
        System.out.println("4 - Mostrar el contenido");
        System.out.println("5 - Salir");
        op = scan.nextInt();
        
        switch(op)
        {
        case 1:
        System.out.println("Ingrese el elemento:");
        item = scan.nextInt();
        if(pila.ingresar(item)){
            System.out.println("Elemento ingresado");
        }else{
            System.out.println("No es posible agregar mas elementos, pila llena");
        }
        
            break;
        case 2:
        if(!pila.Eliminar()){
            System.out.println("Elemento Eliminado");
        }else{
            System.out.println("No hay elementos para eliminar");
        }
            break;
        case 3:
        if(pila.esVacia()){
            System.out.println("Pila Vacia");
        }   else{
            System.out.println("Pila no Vacia");
        } 
            break;
        case 4:
            System.out.println("Elementos de la Pila");
        if(pila.Mostrar()){
        }else{
            System.out.println("La pila Esta vacia");
        }
            break;  
        }
        
        }
        while(op != 5);
        System.out.println("Programa terminado");
    }
    
        //Operaciones con el Objeto ListaEjemplo
    public static void realizarOperaciones(ListaEjemplo lista) {
        Scanner scan = new Scanner(System.in);
        int item;
        int op;
        do{
        System.out.println("*************************************************");
        System.out.println("Elige que deseas hacer:");
        System.out.println("*************************************************");
        System.out.println("1 - Ingresar un elemento");
        System.out.println("2 - Eliminar un elementos");
        System.out.println("3 - Verificar si esta vacia");
        System.out.println("4 - Mostrar el contenido");
        System.out.println("Cualquier tecla - Salir");
        op = scan.nextInt();
        
        switch(op)
        {
        case 1:
        System.out.println("Ingrese el elemento:");
        item = scan.nextInt();
        if(lista.ingresar(item)){
            System.out.println("Elemento ingresado");
        }else{
            System.out.println("No es posible agregar mas elementos");
        }
        
            break;
        case 2:
        if(!lista.Eliminar()){
            System.out.println("Elemento Eliminado");
        }else{
            System.out.println("No hay elementos para eliminar");
        }
            break;
        case 3:
        if(lista.esVacia()){
            System.out.println("Lista Vacia");
        }   else{
            System.out.println("Lista no Vacia");
        } 
            break;
        case 4:
        if(lista.Mostrar()){
            System.out.println("La Lista Esta vacia");
        }else{
            System.out.println("Elementos de la Lista");
        }
            break;  
        }
        
        }
        while(op != 5);
        System.out.println("Programa terminado");
    }
          
}
