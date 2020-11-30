package com.mycompany.practica9.diu;

import javax.swing.ListSelectionModel;

public class InterfazBD extends javax.swing.JFrame {

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
        intervaloJTB = new javax.swing.JToggleButton();
        simpleTButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTablas = new javax.swing.JList<>();
        deseleccionarButton = new javax.swing.JButton();
        panelCamposTablas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCamposTabla = new javax.swing.JList<>();
        tituloLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información Base de Datos");

        panelTablas.setBorder(javax.swing.BorderFactory.createTitledBorder("Tablas de la Base de Datos"));

        panelModoSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo Selección:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        selectionModeButtons.add(multipleIntervalojTB);
        multipleIntervalojTB.setSelected(true);
        multipleIntervalojTB.setText("Múltiple");
        multipleIntervalojTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleIntervalojTBActionPerformed(evt);
            }
        });

        selectionModeButtons.add(intervaloJTB);
        intervaloJTB.setText("Por intervalo");
        intervaloJTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervaloJTBActionPerformed(evt);
            }
        });

        selectionModeButtons.add(simpleTButton);
        simpleTButton.setText("Simple");
        simpleTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleTButtonActionPerformed(evt);
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
                    .addComponent(intervaloJTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(simpleTButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelModoSeleccionLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {intervaloJTB, multipleIntervalojTB, simpleTButton});

        panelModoSeleccionLayout.setVerticalGroup(
            panelModoSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModoSeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simpleTButton)
                .addGap(35, 35, 35)
                .addComponent(intervaloJTB)
                .addGap(35, 35, 35)
                .addComponent(multipleIntervalojTB)
                .addContainerGap())
        );

        panelModoSeleccionLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {intervaloJTB, multipleIntervalojTB, simpleTButton});

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
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deseleccionarButton)
                        .addGap(10, 10, 10))))
        );
        panelTablasLayout.setVerticalGroup(
            panelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deseleccionarButton))
                    .addGroup(panelTablasLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(panelModoSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("BASE DE DATOS DIU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCamposTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCamposTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpleTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleTButtonActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }//GEN-LAST:event_simpleTButtonActionPerformed

    private void intervaloJTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervaloJTBActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_intervaloJTBActionPerformed

    private void multipleIntervalojTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleIntervalojTBActionPerformed
        listaTablas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }//GEN-LAST:event_multipleIntervalojTBActionPerformed

    private void deseleccionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deseleccionarButtonActionPerformed
        listaTablas.clearSelection();
    }//GEN-LAST:event_deseleccionarButtonActionPerformed

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
    private javax.swing.JToggleButton intervaloJTB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaCamposTabla;
    private javax.swing.JList<String> listaTablas;
    private javax.swing.JToggleButton multipleIntervalojTB;
    private javax.swing.JPanel panelCamposTablas;
    private javax.swing.JPanel panelModoSeleccion;
    private javax.swing.JPanel panelTablas;
    private javax.swing.ButtonGroup selectionModeButtons;
    private javax.swing.JToggleButton simpleTButton;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
