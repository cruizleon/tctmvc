package modelo;

import java.io.*; 
import java.util.Arrays;

/**
 *
 * @author Cristhian Ruiz
 */
public class Modelo {
    
    private String contenidoArchivo;

    public String getContenidoArchivo() {
        return contenidoArchivo;
    }

    public void setContenidoArchivo(String contenidoArchivo) {
        this.contenidoArchivo = contenidoArchivo;
    }
    
    ///////////// metodo leer txt
    public String leerTxt(String direccion) // se solicita la dirreccion del archivo
    {
        // empesamos con un try catch por si hay algun eeror no se rompa el codigo
        try
        {
            // BufferedReader nos permite ller el archivo 
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = ""; // variable string para poder guardar los datos del archivo temporalmete 
            String bfRead; // variable para poder tomar dato por dado dentro del archivo
            
            while((bfRead = bf.readLine()) != null)
            { 
                //ciclo while mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }

            this.contenidoArchivo=temp;// tomamos los dartos de la variable temp para poder retornarlos  
            
        }
        catch(Exception e)
        { 
            System.err.println("No se encontro archivo"); // texto de error
        }
        
        //return texto;
        return this.contenidoArchivo; // retornamos los datos para verlos en la vista 
        
    }
    
    /////// Metodo ordenar numeros del txt
    public String ordenar(String direccion) // se solicita la direccion del archivo
    { 
        int n=16;// variable para definir el tamaño del array
        int matrix[] = new int[n]; // array

        String Arch= direccion; // guardamos la dirreccion del archivo en una variable String
        //Quick lecto= new Quick();

        // empesamos con un try catch por si hay algun eeror no se rompa el codigo
        try
        {
           //Hcemos uso de File, FileReaader, y BufferedReader para leer 
           // los datos del archivo uno por uno 
           File archivo=new File (Arch);
           FileReader fr= new FileReader(archivo);
           BufferedReader br = new BufferedReader(fr);
           //BufferedReader bf = new BufferedReader(new FileReader(direccion));
           
            //FileWriter fw = new FileWriter(Arch);
            //BufferedWriter bw = new BufferedWriter(fw);
            //PrintWriter salArch= new PrintWriter (bw);
            String bfRead;
            String temp = "";
            int i=0; // variable para definir la uvicacion del array

            while((bfRead = br.readLine()) != null){ 

                 matrix[i]=Integer.parseInt(bfRead); // guarmos los datos en la matiz
                 //System.out.println(matrix[i]); 
                 i++; 
            }
            //System.out.println("el num en pos 5 es " + matrix[5]);
            Arrays.sort(matrix); // codigo para ordenar los numeros de una matriz
            for(int j=0; j<n;j++)
            {
                //System.out.println(matrix[j]);
                temp = temp +matrix[j]+ ","; // guardamos los datos del array ordnados 
            }
           this.contenidoArchivo=temp;
            
        }
        catch(Exception e)
        { 
            System.err.println("No se encontro archivo");
        }
        
        return this.contenidoArchivo; // rtornamos los datos ordnados para verlos n pantalla
    }
    
}
