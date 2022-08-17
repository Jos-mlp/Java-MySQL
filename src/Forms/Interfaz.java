
package Forms;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Interfaz extends javax.swing.JFrame {
    
    int xMouse,yMouse;
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    //Cuando entra el mouse se cambia el color del boton panel
    private void EnteredMouse(JPanel panel){
        panel.setBackground(new Color(255,153,102));
    }
    
    //Cambie el color cuando el mouse sale del boton panel
    private void ExitMouse(JPanel panel){
        panel.setBackground(new Color(255,153,51));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SalirPanel = new javax.swing.JPanel();
        SalirTxt = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        NuevaVentaBtn = new javax.swing.JPanel();
        NuevaVentaTxt = new javax.swing.JLabel();
        InventarioBtn = new javax.swing.JPanel();
        InventarioTxt = new javax.swing.JLabel();
        ProveedoresBtn = new javax.swing.JPanel();
        ProveedoresTxt = new javax.swing.JLabel();
        ComprasBtn = new javax.swing.JPanel();
        ComprasTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ConfiBtn = new javax.swing.JPanel();
        Configuracion = new javax.swing.JLabel();
        UsuariosBtn = new javax.swing.JPanel();
        UsuariosTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SalirPanel.setBackground(new java.awt.Color(255, 255, 255));
        SalirPanel.setName(""); // NOI18N

        SalirTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        SalirTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SalirTxt.setText("X");
        SalirTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalirPanelLayout = new javax.swing.GroupLayout(SalirPanel);
        SalirPanel.setLayout(SalirPanelLayout);
        SalirPanelLayout.setHorizontalGroup(
            SalirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        SalirPanelLayout.setVerticalGroup(
            SalirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SalirTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(SalirPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab4", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("tab6", jPanel16);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 1060, 620));

        NuevaVentaBtn.setBackground(new java.awt.Color(255, 153, 51));

        NuevaVentaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevaVentaTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NuevaVenta.png"))); // NOI18N
        NuevaVentaTxt.setText("NUEVA VENTA");
        NuevaVentaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevaVentaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaVentaTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevaVentaTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevaVentaTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout NuevaVentaBtnLayout = new javax.swing.GroupLayout(NuevaVentaBtn);
        NuevaVentaBtn.setLayout(NuevaVentaBtnLayout);
        NuevaVentaBtnLayout.setHorizontalGroup(
            NuevaVentaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevaVentaBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NuevaVentaBtnLayout.setVerticalGroup(
            NuevaVentaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NuevaVentaBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevaVentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(NuevaVentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 70));

        InventarioBtn.setBackground(new java.awt.Color(255, 153, 51));

        InventarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InventarioTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inventario.png"))); // NOI18N
        InventarioTxt.setText("INVENTARIO");
        InventarioTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventarioTxt.setMaximumSize(new java.awt.Dimension(136, 64));
        InventarioTxt.setMinimumSize(new java.awt.Dimension(136, 64));
        InventarioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventarioTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventarioTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout InventarioBtnLayout = new javax.swing.GroupLayout(InventarioBtn);
        InventarioBtn.setLayout(InventarioBtnLayout);
        InventarioBtnLayout.setHorizontalGroup(
            InventarioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InventarioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        InventarioBtnLayout.setVerticalGroup(
            InventarioBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InventarioTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(InventarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        ProveedoresBtn.setBackground(new java.awt.Color(255, 153, 51));

        ProveedoresTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProveedoresTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Proveedores.png"))); // NOI18N
        ProveedoresTxt.setText("PROVEEDORES");
        ProveedoresTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProveedoresTxt.setMaximumSize(new java.awt.Dimension(136, 64));
        ProveedoresTxt.setMinimumSize(new java.awt.Dimension(136, 64));
        ProveedoresTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProveedoresTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProveedoresTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ProveedoresBtnLayout = new javax.swing.GroupLayout(ProveedoresBtn);
        ProveedoresBtn.setLayout(ProveedoresBtnLayout);
        ProveedoresBtnLayout.setHorizontalGroup(
            ProveedoresBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProveedoresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        ProveedoresBtnLayout.setVerticalGroup(
            ProveedoresBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProveedoresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(ProveedoresBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        ComprasBtn.setBackground(new java.awt.Color(255, 153, 51));

        ComprasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ComprasTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Compras.png"))); // NOI18N
        ComprasTxt.setText("COMPRAS");
        ComprasTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComprasTxt.setMaximumSize(new java.awt.Dimension(136, 64));
        ComprasTxt.setMinimumSize(new java.awt.Dimension(136, 64));
        ComprasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprasTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ComprasTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ComprasTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ComprasBtnLayout = new javax.swing.GroupLayout(ComprasBtn);
        ComprasBtn.setLayout(ComprasBtnLayout);
        ComprasBtnLayout.setHorizontalGroup(
            ComprasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ComprasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        ComprasBtnLayout.setVerticalGroup(
            ComprasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ComprasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel1.add(ComprasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("A");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel2.setText("LIBRERIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("C");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("H");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("I");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("N");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("I");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 72)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("T");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        ConfiBtn.setBackground(new java.awt.Color(255, 153, 51));

        Configuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Configuracion.png"))); // NOI18N
        Configuracion.setText("CONFIGURACION");
        Configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfiguracionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ConfiBtnLayout = new javax.swing.GroupLayout(ConfiBtn);
        ConfiBtn.setLayout(ConfiBtnLayout);
        ConfiBtnLayout.setHorizontalGroup(
            ConfiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfiBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ConfiBtnLayout.setVerticalGroup(
            ConfiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfiBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(ConfiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, -1, -1));

        UsuariosBtn.setBackground(new java.awt.Color(255, 153, 51));

        UsuariosTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        UsuariosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuariosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N
        UsuariosTxt.setText("USUARIOS");
        UsuariosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsuariosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuariosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsuariosTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout UsuariosBtnLayout = new javax.swing.GroupLayout(UsuariosBtn);
        UsuariosBtn.setLayout(UsuariosBtnLayout);
        UsuariosBtnLayout.setHorizontalGroup(
            UsuariosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsuariosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        UsuariosBtnLayout.setVerticalGroup(
            UsuariosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsuariosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPanel1.add(UsuariosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirTxtMouseClicked

    private void SalirTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTxtMouseEntered
        SalirPanel.setBackground(Color.red);
        SalirTxt.setForeground(Color.white);
    }//GEN-LAST:event_SalirTxtMouseEntered

    private void SalirTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirTxtMouseExited
        SalirPanel.setBackground(Color.white);
        SalirTxt.setForeground(Color.black);
    }//GEN-LAST:event_SalirTxtMouseExited

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);

    }//GEN-LAST:event_BarraMouseDragged

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void NuevaVentaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaVentaTxtMouseClicked
       jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_NuevaVentaTxtMouseClicked

    private void InventarioTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioTxtMouseClicked
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_InventarioTxtMouseClicked

    private void ProveedoresTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresTxtMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_ProveedoresTxtMouseClicked

    private void ComprasTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasTxtMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_ComprasTxtMouseClicked

    private void ConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_ConfiguracionMouseClicked

    private void NuevaVentaTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaVentaTxtMouseEntered
        EnteredMouse(NuevaVentaBtn);
    }//GEN-LAST:event_NuevaVentaTxtMouseEntered

    private void NuevaVentaTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaVentaTxtMouseExited
        ExitMouse(NuevaVentaBtn);
    }//GEN-LAST:event_NuevaVentaTxtMouseExited

    private void InventarioTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioTxtMouseEntered
        EnteredMouse(InventarioBtn);
    }//GEN-LAST:event_InventarioTxtMouseEntered

    private void ProveedoresTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresTxtMouseEntered
        EnteredMouse(ProveedoresBtn);
    }//GEN-LAST:event_ProveedoresTxtMouseEntered

    private void ComprasTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasTxtMouseEntered
        EnteredMouse(ComprasBtn);
    }//GEN-LAST:event_ComprasTxtMouseEntered

    private void ConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionMouseEntered
        EnteredMouse(ConfiBtn);
    }//GEN-LAST:event_ConfiguracionMouseEntered

    private void InventarioTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioTxtMouseExited
        ExitMouse(InventarioBtn);
    }//GEN-LAST:event_InventarioTxtMouseExited

    private void ProveedoresTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresTxtMouseExited
        ExitMouse(ProveedoresBtn);
    }//GEN-LAST:event_ProveedoresTxtMouseExited

    private void ComprasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasTxtMouseExited
        ExitMouse(ComprasBtn);
    }//GEN-LAST:event_ComprasTxtMouseExited

    private void ConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfiguracionMouseExited
        ExitMouse(ConfiBtn);
    }//GEN-LAST:event_ConfiguracionMouseExited

    private void UsuariosTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosTxtMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_UsuariosTxtMouseClicked

    private void UsuariosTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosTxtMouseEntered
        EnteredMouse(UsuariosBtn);
    }//GEN-LAST:event_UsuariosTxtMouseEntered

    private void UsuariosTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosTxtMouseExited
        ExitMouse(UsuariosBtn);
    }//GEN-LAST:event_UsuariosTxtMouseExited

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel ComprasBtn;
    private javax.swing.JLabel ComprasTxt;
    private javax.swing.JPanel ConfiBtn;
    private javax.swing.JLabel Configuracion;
    private javax.swing.JPanel InventarioBtn;
    private javax.swing.JLabel InventarioTxt;
    private javax.swing.JPanel NuevaVentaBtn;
    private javax.swing.JLabel NuevaVentaTxt;
    private javax.swing.JPanel ProveedoresBtn;
    private javax.swing.JLabel ProveedoresTxt;
    private javax.swing.JPanel SalirPanel;
    private javax.swing.JLabel SalirTxt;
    private javax.swing.JPanel UsuariosBtn;
    private javax.swing.JLabel UsuariosTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
