package mvc;

import mvc.controlador.ControladorNumeros;
import mvc.modelo.Numeros;
import mvc.vista.VistaNumeros;

/**
 *
 * @author johnm
 */
public class MvcArray {
    
public static void main(String[] args) {

    Numeros modelo = new Numeros(10);
    VistaNumeros vista = new VistaNumeros();
    ControladorNumeros controlador = new ControladorNumeros(modelo, vista);
    
    controlador.iniciar();
    
}

}

