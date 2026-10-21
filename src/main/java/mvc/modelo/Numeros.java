package mvc.modelo;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author johnm
 */
public class Numeros {
    
    
    private int[] numeros = new int[10];
    private int tamano;
    Random aleatorio = new Random();
    
    public Numeros(int tamano){
        numeros = new int[tamano];
    }
    
    public void crear(){
    } 
    
    public int getTamano(){
    return tamano;
    }
     
    
    public void llenarAleatorio(){
        for(int i=0;i<10;i++){
            int max =100;
            int min =0;
            int na = aleatorio.nextInt(30);
            numeros[i] = na;
        } 
    }
    
    public void modificar(int posicion, int nuevoValor){
        if(posicion < 0 || posicion >= numeros.length){
        throw new IllegalArgumentException("Posicion "+posicion+" fuera de rango [0-"+(numeros.length-1)+"]");
    }
    numeros[posicion] = nuevoValor;
    }
    
    public void eliminar(){
        numeros = null;
    }
    
    public int[] getNumeros(){
    return numeros;
    }
    
    public int sumarElementos(){
    int sum = 0;
    for(int num : numeros)
        sum += num;
        
    return sum;
    }
    
    public int buscar(int valorBuscado){
    for(int i = 0; i < numeros.length; i++){
        if(numeros[i] == valorBuscado){
            return i;
        }
    }
    return 0;
    }
    
}