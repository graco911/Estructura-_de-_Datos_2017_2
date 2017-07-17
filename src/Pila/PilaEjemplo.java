/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import Interfaces.Estructura;

/**
 *
 * @author Carlos Alberto
 */
public class PilaEjemplo implements Estructura{
    
    int[] PILA;
    int TOPE;
    int MAX;

    public PilaEjemplo(){
        TOPE = 0;
        MAX = 50;
        PILA = new int[MAX+1];
    }
    
    public PilaEjemplo(int max){
        MAX = max;
        TOPE = 0;
        PILA = new int[MAX+1];
    }

    @Override
    public int longitud() {
        return MAX;
    }

    @Override
    public boolean esVacia() {
        if(TOPE == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean esLlena() {
        if(MAX == TOPE){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean ingresar(int item) {
        if(this.esLlena()){
            return false;
        }else{
            TOPE++;
            PILA[TOPE] = item;
            return true;
            }
    }

    @Override
    public boolean Eliminar() {
        if(this.esVacia()){
            return false;
        }else{
            int item = PILA[TOPE];
            TOPE--;
            System.out.println("Elemento eliminado " + item);
            return true;
        }
    }

    @Override
    public boolean Mostrar() {
        if(this.esVacia()){
            return false;
        }else{
            int i; 
            for(i = TOPE; i <= 0; i--){
                 System.out.println("Dato " + i + ": " + PILA[i]);
            }
            return true;
        }
    }
}
