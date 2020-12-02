package com.mycompany.practica9.diu;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class InterfazBD extends javax.swing.JFrame {

    private BaseDatos baseDatos;
    DefaultListModel modeloTabla = new DefaultListModel();
    DefaultListModel modeloCampo = new DefaultListModel();
    
    public InterfazBD(BaseDatos bd) {
        baseDatos = bd;
        initComponents();
        listaTablas.setModel(modeloTabla);
        listaCamposTabla.setModel(modeloCampo);
        mostrarTablas();
    }
    
    public InterfazBD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionModeButtons = new javax.swing.ButtonGroup();
        panelTablas = new javax.swing.JPanel();
        panelModoSeleccion = new javax.swing.JPanel();
        multipleIntervalojTB = new javax.swing.JToggleButton();
        intervalojTB = new javax.swing.JToggleButton();
        simplejTB = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablas = new javax.swing.JList<>();
        deseleccionarButton = new javax.swing.JButton();
        panelCamposTablas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCamposTabla = new javax.swing.JList<>();
        tituloLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuApp = new javax.swing.JMenu();
        itemCerrar = new javax.swing.JMenuItem();
        manuDescripcion = new javax.swing.JMenu();
        menu = new javax.swing.JMenu();
        itemDescripción = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemMSimple = new javax.swing.JMenuItem();
        itemMIntervalo = new javax.swing.JMenuItem();
        itemMMultiple = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información Base de Datos");
        setResizable(false);

        panelTablas.setBackground(new java.awt.Color(153, 251, 163));
        panelTablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de la Base de Datos"));

        panelModoSeleccion.setBackground(new java.awt.Color(204, 255, 204));
        panelModoSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo Selección:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        selectionModeButtons.add(multipleIntervalojTB);
        multipleIntervalojTB.setSelected(true);
        multipleIntervalojTB.setText("Múltiple");
        multipleIntervalojTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleIntervalojTBActionPerformed(evt);
            }
        });

        selectionModeButtons.add(intervalojTB);
        intervalojTB.setText("Por intervalo");
        intervalojTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalojTBActionPerformed(evt);
            }
        });

        selectionModeButtons.add(simplejTB);
        simplejTB.setText("Simple");
        simplejTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplejTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModoSeleccionLayout = new javax.swing.GroupLayout(panelModoSeleccion);
        panelModoSeleccion.setLayout(panelModoSeleccionLayout);
        panelModoSeleccionLayout.setHorizontalGroup(
            panelModoSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModoSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(multipleIntervalojTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(intervalojTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(simplejTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelModoSeleccionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {intervalojTB, multipleIntervalojTB, simplejTB});

        panelModoSeleccionLayout.setVerticalGroup(
            panelModoSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simplejTB)
                .addGap(35, 35, 35)
                .addComponent(intervalojTB)
                .addGap(35, 35, 35)
                .addComponent(multipleIntervalojTB)
                .addContainerGap())
        );

        panelModoSeleccionLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {intervalojTB, multipleIntervalojTB, simplejTB});

        listaTablas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTablasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTablas);

        deseleccionarButton.setText("Deseleccionar elementos");
        deseleccionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deseleccionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablasLayout = new javax.swing.GroupLayout(panelTablas);
        panelTablas.setLayout(panelTablasLayout);
        panelTablasLayout.setHorizontalGroup(
            panelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablasLayout.createSequentialGroup()
                        .addComponent(panelModoSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablasLayout.createSequentialGroup()
                        .addGap(0, 250, Short.MAX_VALUE)
                        .addComponent(deseleccionarButton)
                        .addGap(10, 10, 10))))
        );
        panelTablasLayout.setVerticalGroup(
            panelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(17, 17, 17)
                        .addComponent(deseleccionarButton)
                        .addContainerGap())
                    .addGroup(panelTablasLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(panelModoSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );

        panelCamposTablas.setBackground(new java.awt.Color(153, 251, 163));
        panelCamposTablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos de la tabla seleccionada"));

        jScrollPane2.setViewportView(listaCamposTabla);

        javax.swing.GroupLayout panelCamposTablasLayout = new javax.swing.GroupLayout(panelCamposTablas);
        panelCamposTablas.setLayout(panelCamposTablasLayout);
        panelCamposTablasLayout.setHorizontalGroup(
            panelCamposTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCamposTablasLayout.setVerticalGroup(
            panelCamposTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamposTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(51, 51, 51))
        );

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("BASE DE DATOS DIU");

        menuApp.setText("Base de datos DIU");

        itemCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemCerrar.setText("Cerrar conexión");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        menuApp.add(itemCerrar);

        jMenuBar1.add(menuApp);

        manuDescripcion.setText("Ayuda");

        menu.setText("Acerca de");

        itemDescripción.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemDescripción.setText("Descripción");
        itemDescripción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDescripciónActionPerformed(evt);
            }
        });
        menu.add(itemDescripción);
        menu.add(jSeparator1);

        itemMSimple.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMSimple.setText("Modo simple");
        itemMSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMSimpleActionPerformed(evt);
            }
        });
        menu.add(itemMSimple);

        itemMIntervalo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMIntervalo.setText("Modo por intervalo");
        itemMIntervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMIntervaloActionPerformed(evt);
            }
        });
        menu.add(itemMIntervalo);

        itemMMultiple.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMMultiple.setText("Modo múltiple");
        itemMMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMMultipleActionPerformed(evt);
            }
        });
        menu.add(itemMMultiple);

        manuDescripcion.add(menu);

        jMenuBar1.add(manuDescripcion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCamposTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCamposTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simplejTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplejTBActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_simplejTBActionPerformed

    private void intervalojTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalojTBActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_intervalojTBActionPerformed

    private void multipleIntervalojTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleIntervalojTBActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_multipleIntervalojTBActionPerformed

    private void deseleccionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deseleccionarButtonActionPerformed
        listaTablas.clearSelection();
        modeloCampo.removeAllElements();
    }//GEN-LAST:event_deseleccionarButtonActionPerformed

    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "¿Quiere cerrar la "
                + "conexión a la base de datos?", "Salir", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            baseDatos.cerrarConexion();
            this.dispose();
            IniciarSesion newSesion = new IniciarSesion();
            newSesion.setVisible(true);
        }
    }//GEN-LAST:event_itemCerrarActionPerformed

    private void itemMSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMSimpleActionPerformed
        JOptionPane.showMessageDialog(this, "El modo de seleccion simple solo "
                + "permite seleccionar una tabla.", "Ayuda: Modo simple", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemMSimpleActionPerformed

    private void itemMIntervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMIntervaloActionPerformed
        JOptionPane.showMessageDialog(this, "El modo de seleccion por intervalo,"
                + " o intervalo único, solo permite seleccionar una tabla inicial y otra final"
                + "(Shift + RMB (Botón derecho del mouse)), marcando automáticamente"
                + " las que estén entre ellas.", "Ayuda: Modo por intervalo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemMIntervaloActionPerformed

    private void itemMMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMMultipleActionPerformed
        JOptionPane.showMessageDialog(this, "El modo de seleccion múltiple, "
                + "o por múltiples intervalos, permite seleccionar varias tablas"
                + "(Ctrl + RMB (Botón derecho del mouse)).", 
                "Ayuda: Modo múltiple", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemMMultipleActionPerformed

    private void listaTablasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTablasValueChanged
        if(evt.getValueIsAdjusting()){
            int[] selectedIndices = listaTablas.getSelectedIndices();
            modeloCampo.removeAllElements();
            for (int index : selectedIndices) {
                String tabla = modeloTabla.getElementAt(index).toString();
                mostrarCamposTabla(tabla);
            }
        } 
    }//GEN-LAST:event_listaTablasValueChanged

    private void itemDescripciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDescripciónActionPerformed
        JOptionPane.showMessageDialog(this, "La aplicación permite ver las tablas que"
                + " componen la base de datos y ver los distintos campos de cada uno de ellas."
                + "\nRealizado por: Borja Álvarez Medina y Esther Zurita Curbelo",
                "Ayuda: Descripción", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemDescripciónActionPerformed
  
    private void mostrarTablas() {
        try {
            List tablas = baseDatos.readTables();
            for (Object tabla : tablas) {
                modeloTabla.addElement(tabla);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(InterfazBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se ha podido leer las tablas de la base de datos\n"
                    + "Error: " + ex.toString(), "Error Mostrar Tablas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void mostrarCamposTabla(String tabla) {
        try {
            List readColumnas = baseDatos.readColumnas(tabla);
            for (Object campo : readColumnas) {
                modeloCampo.addElement(tabla+"."+campo);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(InterfazBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se ha podido leer los campos de la tabla '"+ tabla+ "' \n"
                    + "Error: " + ex.toString(), "Error Mostrar Campos de la Tabla", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deseleccionarButton;
    private javax.swing.JToggleButton intervalojTB;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemDescripción;
    private javax.swing.JMenuItem itemMIntervalo;
    private javax.swing.JMenuItem itemMMultiple;
    private javax.swing.JMenuItem itemMSimple;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> listaCamposTabla;
    private javax.swing.JList<String> listaTablas;
    private javax.swing.JMenu manuDescripcion;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu menuApp;
    private javax.swing.JToggleButton multipleIntervalojTB;
    private javax.swing.JPanel panelCamposTablas;
    private javax.swing.JPanel panelModoSeleccion;
    private javax.swing.JPanel panelTablas;
    private javax.swing.ButtonGroup selectionModeButtons;
    private javax.swing.JToggleButton simplejTB;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

}
