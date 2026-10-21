package mvc.vista;

import java.util.Scanner;

/**
 *
 * @author johnm
 */
public class VistaNumeros{
    
    private Scanner sc = new Scanner(System.in);
    
    public int leer_Entero(String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }
    
    public void mostrar_Suma(int sum){
        System.out.println("Suma de los elementos: "+sum);
    
    }
    
    public void mostrarArreglo(int[] numeros){
        System.out.print("Arreglo: [");
        for(int n : numeros){
            System.out.print(n+"|");
        } 
        System.out.println("]");
    }
        
    public void mostrarMenu(){
        System.out.println("1. Llenar arreglo a mano ");
        System.out.println("2. Llenar arreglo aleatoriamente ");
        System.out.println("3. Sumar los elementos del arreglo");
        System.out.println("4. Modificar valor del arreglo");
        System.out.println("5. Mostrar arreglo");
        System.out.println("6. Buscar valor en el arreglo");        
        System.out.println("0. Salir");
    
    }
    
    public void mostrarMensaje(String msg){
        System.out.println(msg);
    }
    
    public void mostrarBuscar(int valor, int posicion){
    if(posicion == 0){
        System.out.println("El valor " + valor + " no se encuentra en el arreglo.");
    } else {
        System.out.println("El valor " + valor + " está en la posicion " + posicion);
    }
}
}
