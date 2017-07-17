/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Interfaz para las estructuras de datos (Pila, cola y lista)
 */
public interface Estructura {
    public int longitud();
    public boolean esVacia();
    public boolean esLlena();
    public boolean ingresar(int item);
    public boolean Eliminar();
    public boolean Mostrar();
}
