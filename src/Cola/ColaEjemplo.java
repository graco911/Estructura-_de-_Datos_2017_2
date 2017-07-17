/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import Interfaces.Estructura;

/**
 *
 * @author Carlos Alberto
 */
public class ColaEjemplo implements Estructura{
    
    int MAX;
    private final int[] COLA;
    private final int FRENTE;
    private int FINAL;
    
    public ColaEjemplo(){
        MAX = 50;
        FRENTE = 0;
        FINAL = 0;
        COLA = new int[MAX +1];
    }
    public ColaEjemplo(int max){
        MAX = max;
        FRENTE = 0;
        FINAL = 0;
        COLA = new int[MAX + 1];
    }    

    @Override
    public int longitud() {
    return MAX;
    }

    @Override
    public boolean esVacia() {
        if (FRENTE == FINAL){
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
           FINAL++;
           COLA[FINAL] = item;
           return true;
       }
    }

    @Override
    public boolean Eliminar() {
        if(FRENTE == FINAL){
            return false;
        }else{
            for(int i = FRENTE; i < FINAL - 1; i++){
                COLA[i] = COLA[i+1];
            }
            FINAL--;
            return true;
        } 
    }

    @Override
    public boolean Mostrar() {  
        if(this.esVacia()){
            return false;
        }else{
            for(int i = FRENTE+1; i <= FINAL; i++){
                System.out.println("Dato " + i + ": " + COLA[i]);
            }
            return true;   
        }
    }

    @Override
    public boolean esLlena() {
        if(FINAL == this.MAX){
            return true;
        }else
        {
            return false;
        }
    }
}
