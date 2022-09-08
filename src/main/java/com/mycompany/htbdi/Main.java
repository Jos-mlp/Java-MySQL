
package com.mycompany.htbdi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {


    Conexion conexion = new Conexion();
    
    public Main() {
        initComponents();
        
        buttonGroup1.add(Consuta);
        buttonGroup1.add(Insertar);
        Desab();
        Cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablet = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Insertar = new javax.swing.JRadioButton();
        Consuta = new javax.swing.JRadioButton();
        Nom = new javax.swing.JTextField();
        txtNom = new javax.swing.JLabel();
        txtNIT = new javax.swing.JLabel();
        NIT = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ViewSesion = new javax.swing.JMenuItem();
        ChangeSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.red);

        jPanel1.setBackground(java.awt.Color.red);

        Tablet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "NIT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tablet);
        if (Tablet.getColumnModel().getColumnCount() > 0) {
            Tablet.getColumnModel().getColumn(0).setResizable(false);
            Tablet.getColumnModel().getColumn(1).setResizable(false);
            Tablet.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        Consuta.setText("Consulta");
        Consuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsutaActionPerformed(evt);
            }
        });

        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });

        txtNom.setText("Nombre");

        txtNIT.setText("NIT");

        NIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NITActionPerformed(evt);
            }
        });

        txtID.setText("ID");

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDKeyPressed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jButton1.setText("Refrescar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.setToolTipText("");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtNIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Actualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Consuta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(txtID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insertar)
                        .addComponent(Consuta)
                        .addComponent(txtID)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom)
                    .addComponent(txtNIT)
                    .addComponent(NIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aceptar)
                    .addComponent(Actualizar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Sesion");

        ViewSesion.setText("Tipo Sesion");
        ViewSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSesionActionPerformed(evt);
            }
        });
        jMenu1.add(ViewSesion);

        ChangeSesion.setText("Cambiar Sesion");
        ChangeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeSesionActionPerformed(evt);
            }
        });
        jMenu1.add(ChangeSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaTabla()
    {
     DefaultTableModel model = (DefaultTableModel) Tablet.getModel(); 
     model.setRowCount(0);
    }
    private void Cargar()
    {
        nuevaTabla();
        DefaultTableModel model = (DefaultTableModel) Tablet.getModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cn = conexion.getConnection()){
            String query = "SELECT * FROM `trans`.`Cliente`";
            ps = cn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]
                {rs.getInt("ID"), rs.getString("Nombre"), rs.getString("NIT")});
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }
    private void Busqueda()
    {
        nuevaTabla();
        DefaultTableModel model = (DefaultTableModel) Tablet.getModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection cn = conexion.getConnection()){
            String query = "SELECT * FROM `trans`.`Cliente` where id="+ID.getText();
            ps = cn.prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]
                {rs.getInt("ID"), rs.getString("Nombre"), rs.getString("NIT")});
            }
        } catch(Exception e){
            System.out.println(e);
        }

    }
    
    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:
       txtID.setVisible(false);
       ID.setVisible(false);
       Buscar.setVisible(false);
       //////////////////////////////////
       txtNom.setVisible(true);
        txtNIT.setVisible(true);
        Nom.setVisible(true);
        NIT.setVisible(true);
        Aceptar.setVisible(true);
        Actualizar.setVisible(true);
        
    }//GEN-LAST:event_InsertarActionPerformed
    private void Desab()
    {
        Buscar.setVisible(false);
        Aceptar.setVisible(false);
        Actualizar.setVisible(false);
        txtNom.setVisible(false);
        txtNIT.setVisible(false);
        Nom.setVisible(false);
        NIT.setVisible(false);
        txtID.setVisible(false);
        ID.setVisible(false);
    }
    private void ConsutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsutaActionPerformed
        // TODO add your handling code here:
        txtNom.setVisible(false);
        txtNIT.setVisible(false);
        Nom.setVisible(false);
        NIT.setVisible(false);
        Aceptar.setVisible(false);
        ////////////////////////////////
        txtID.setVisible(true);
        ID.setVisible(true);
        Buscar.setVisible(true);
    }//GEN-LAST:event_ConsutaActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps = null;
        try (Connection cnx = conexion.getConnection()){
            cnx.setAutoCommit(false);
            String query = "INSERT INTO `trans`.`Cliente` (Nombre,NIT) VALUES (?,?)";
            ps = cnx.prepareStatement(query);
            ps.setString(1,Nom.getText());
            ps.setString(2,NIT.getText());
            ps.executeUpdate();
            System.out.println("Cliente creado");
            ////////////////////////
            nuevaTabla();
        DefaultTableModel model = (DefaultTableModel) Tablet.getModel();
        PreparedStatement ps1 = null;
        ResultSet rs = null;
            query = "SELECT * FROM `trans`.`Cliente`";
            ps1 = cnx.prepareStatement(query);
            rs=ps1.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]
                {rs.getInt("ID"), rs.getString("Nombre"), rs.getString("NIT")});
            }
        
            ///////////////////////
            int resp =JOptionPane.showConfirmDialog(this, "¿Sus datos estan correctos?\nNombre: "+Nom.getText()+"   NIT: "+NIT.getText(),"Por favor", JOptionPane.YES_NO_OPTION);
            switch (resp){
                    case 0:
                        cnx.commit();
                        break;
                    case 1:
                        cnx.rollback();
                        break;
            }
            Cargar();
        } catch(Exception e){
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_AceptarActionPerformed

    private void ChangeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeSesionActionPerformed
        try {
            // TODO add your handling code here:
            String[] Tipos = {
                "READ-UNCOMMITTED",
                "READ-COMMITTED",
                "REPEATABLE-READ",
                "SERIALIZABLE"
            };
            String resp=(String) JOptionPane.showInputDialog(null, "Seleccione el tipo de Sesion", "Secion", JOptionPane.DEFAULT_OPTION, null, Tipos, Tipos[0]);
            switch (resp)
            {
                case "READ-UNCOMMITTED":
                    conexion.Sesion(1);
                    break;
                case "READ-COMMITTED":
                    conexion.Sesion(2);
                    break;
                case "REPEATABLE-READ":
                    conexion.Sesion(4);
                    break;
                case "SERIALIZABLE":
                    conexion.Sesion(8);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Cargar();
    }//GEN-LAST:event_ChangeSesionActionPerformed

    private void ViewSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSesionActionPerformed
        
           conexion.VSesion();
           Cargar();
        
    }//GEN-LAST:event_ViewSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        Busqueda();
    }//GEN-LAST:event_BuscarActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
        Busqueda();
    }//GEN-LAST:event_IDActionPerformed

    private void IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_IDKeyPressed

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void NITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NITActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
                // TODO add your handling code here:
        PreparedStatement ps = null;
        try (Connection cnx = conexion.getConnection()){
            cnx.setAutoCommit(false);
            String query = "UPDATE `trans`.`Cliente` SET (Nombre,NIT) VALUES (?,?) WHERE id="+ID.getText();
            ps = cnx.prepareStatement(query);
            ps.setString(1,Nom.getText());
            ps.setString(2,NIT.getText());
            ps.executeUpdate();
            System.out.println("Cliente ACTUALIZADO");
            ////////////////////////
            nuevaTabla();
        DefaultTableModel model = (DefaultTableModel) Tablet.getModel();
        PreparedStatement ps1 = null;
        ResultSet rs = null;
            query = "SELECT * FROM `trans`.`Cliente`";
            ps1 = cnx.prepareStatement(query);
            rs=ps1.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]
                {rs.getInt("ID"), rs.getString("Nombre"), rs.getString("NIT")});
            }
        
            ///////////////////////
            int resp =JOptionPane.showConfirmDialog(this, "¿Sus nuevos datos estan correctos?\nNombre: "+Nom.getText()+"   NIT: "+NIT.getText(),"Por favor", JOptionPane.YES_NO_OPTION);
            switch (resp){
                    case 0:
                        cnx.commit();
                        break;
                    case 1:
                        cnx.rollback();
                        break;
            }
            Cargar();
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JMenuItem ChangeSesion;
    private javax.swing.JRadioButton Consuta;
    private javax.swing.JTextField ID;
    private javax.swing.JRadioButton Insertar;
    private javax.swing.JTextField NIT;
    private javax.swing.JTextField Nom;
    private javax.swing.JTable Tablet;
    private javax.swing.JMenuItem ViewSesion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtNIT;
    private javax.swing.JLabel txtNom;
    // End of variables declaration//GEN-END:variables
}
