
package txtmvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Ventana;

/**
 *
 * @author Cristhian Ruiz
 */
public class Txtmvc {

    // clase pricipal para correr el programa 
    public static void main(String[] args) {
        // llamamos las clases necesarias
        Modelo mod = new Modelo();
        Ventana view = new Ventana();
        Controlador ctrl = new Controlador(view, mod);

        // indicamos los metodos a utilizar 
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
