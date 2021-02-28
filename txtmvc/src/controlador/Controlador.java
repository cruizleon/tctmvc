package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Ventana;

/**
 *
 * @author cristhian Ruiz
 */
public class Controlador implements ActionListener 
{
    private Ventana view;
    private Modelo model;
    
    //metodo para llamar las clases
    public Controlador (Ventana view, Modelo model)
    {
        this.view = view;
        this.model = model;
        this.view.btnLeer.addActionListener(this);
        this.view.btnOrdenar.addActionListener(this);
    }
    
    //Metodo para iniciar el programa
    public void iniciar ()
    {
        view.setTitle("Ordenar Numeros");
        view.setLocationRelativeTo(null);
    }
    
    // metodo para conectar los botones de la vista con los metodos del modelo
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == view.btnLeer)
        {
            model.leerTxt("numeros.txt");
            view.contenidoArchivo.setText(model.getContenidoArchivo());
        }
        else
        {
            model.ordenar("numeros.txt");
            view.contenidoArchivo.setText(model.getContenidoArchivo());
        }
        
        
    }
}
