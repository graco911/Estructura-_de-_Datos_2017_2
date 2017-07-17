/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import Interfaces.Estructura;
import java.util.ArrayList;

/**
 *
 * @author Carlos Alberto
 */
public class ListaEjemplo implements Estructura {
    
    ArrayList LISTA = new ArrayList();
    
    public ListaEjemplo(){
    }

    @Override
    public int longitud() {
        return LISTA.size();
    }

    @Override
    public boolean esVacia() {
        if(LISTA.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean ingresar(int item) {
        if(LISTA.add(item)){
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean Eliminar() {
        if(LISTA.size() == 0){
            return false;
        }else{
            int ultimapos = LISTA.size() - 1;
            LISTA.remove(ultimapos);
            return false;
        }
    }

    @Override
    public boolean Mostrar() {
        if(this.esVacia()){
            return true;
        }else{
            for(int i = 0; i < LISTA.size(); i++){
                System.out.println("Dato " + i + ": " + LISTA.get(i));
            }
            return false;   
        }
    }

    @Override
    public boolean esLlena() {
        return false;
    }

    public boolean Eliminar(int position) {
            if(LISTA.size() == 0){
            return false;
        }else{
            LISTA.remove(position);
            return true;
        }}
    
}
