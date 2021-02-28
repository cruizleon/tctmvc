package vista;

/**
 *
 * @author crithian Ruiz
 */
public class Ventana extends javax.swing.JFrame {

    //clase publica para podr llamar la vntana
    public Ventana() 
    {
        initComponents();
    }

    // clas para definir los componnts de la ventana 
    private void initComponents() 
    {

        btnLeer = new javax.swing.JButton(); // boton para leer el arvhivo
        btnOrdenar = new javax.swing.JButton(); // boton para ordenar los numeros del archivo
        jScrollPane1 = new javax.swing.JScrollPane(); // panel que contiene los botones y el area de texto
        contenidoArchivo = new javax.swing.JTextArea(); // areade texto para mostrar lo que se esta haciendo

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 

        btnLeer.setText("Leer txt"); // texto que aparece dentro del boton

        btnOrdenar.setText("Ordenar numero"); // texto que aparece dentro del boton

        // se define el tamaño y ubicacion del area del texto
        contenidoArchivo.setColumns(20); 
        contenidoArchivo.setRows(5);
        contenidoArchivo.setText("aqui se mostrara el contenido del archivo");
        jScrollPane1.setViewportView(contenidoArchivo);

        // definir componentes del panel 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLeer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btnOrdenar)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLeer)
                    .addComponent(btnOrdenar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }


    // declaramos las variable puclicas 
    public javax.swing.JButton btnLeer;
    public javax.swing.JButton btnOrdenar;
    public javax.swing.JTextArea contenidoArchivo;
    private javax.swing.JScrollPane jScrollPane1;

}
