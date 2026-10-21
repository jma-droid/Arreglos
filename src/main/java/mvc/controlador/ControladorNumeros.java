package mvc.controlador;

import mvc.modelo.Numeros;
import mvc.vista.VistaNumeros;

/**
 *
 * @author johnm
 */
public class ControladorNumeros{
   
    private Numeros modelo;
    private VistaNumeros vista;
    
    
    public ControladorNumeros(Numeros modelo, VistaNumeros vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
   public void menu(){
       int opcion;
       do{
           vista.mostrarMenu();
           opcion = vista.leer_Entero("Ingrese la opcion deseada: ");
            switch(opcion){
                case 1-> llenarAmano();
                case 2-> modelo.llenarAleatorio();
                case 3->vista.mostrar_Suma(modelo.sumarElementos());
                case 4->modelo.modificar(vista.leer_Entero("Ingrese la posicion: "),vista.leer_Entero("Ingrese el valor: "));
                case 5-> vista.mostrarArreglo(modelo.getNumeros());
                case 6-> {
                        int valor = vista.leer_Entero("Valor a buscar: ");
                        int pos = modelo.buscar(valor);
                        vista.mostrarBuscar(valor, pos);
                }
                case 0-> vista.mostrarMensaje("Salio");
                default-> vista.mostrarMensaje("Opción inválida");
                
            
            }
       
       }while(opcion != 0);
   
   }

   public void llenarAmano(){
       vista.mostrarMensaje("Agrege los valores al arreglo: ");
        for(int i=0; i<10; i++){
        int valor = vista.leer_Entero("Numero ["+(i+1)+"]: ");
        modelo.modificar(i, valor);
        }
    }
     
    public void iniciar() {
        vista.mostrarMensaje("-- Arreglo de 10 espacios --");
        modelo = new Numeros(10);
        menu();
        
        
    }
    

}
