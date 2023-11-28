package c_menubar;

import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class c_menu extends javax.swing.JFrame {
    public c_menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGif = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVentana = new javax.swing.JMenu();
        menuColores = new javax.swing.JMenu();
        itemMenuColorVentana1 = new javax.swing.JMenuItem();
        itemMenuColorVentana2 = new javax.swing.JMenuItem();
        itemMenuSalir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuLabel = new javax.swing.JMenu();
        menuColoresLabel = new javax.swing.JMenu();
        itemMenuColorLabel1 = new javax.swing.JMenuItem();
        itemMenuColorLabel2 = new javax.swing.JMenuItem();
        menuImagen = new javax.swing.JMenu();
        itemMenuImagen1 = new javax.swing.JMenuItem();
        itemMenuImagen2 = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        itemMenuCreador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGif.setBackground(new java.awt.Color(255, 255, 255));
        lblGif.setOpaque(true);

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setOpaque(true);

        lblColor.setBackground(new java.awt.Color(255, 255, 255));
        lblColor.setOpaque(true);

        menuVentana.setText("Ventana");
        menuVentana.setToolTipText("");

        menuColores.setForeground(new java.awt.Color(0, 0, 0));
        menuColores.setText("Colores");

        itemMenuColorVentana1.setText("Color 1");
        itemMenuColorVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorVentana1ActionPerformed(evt);
            }
        });
        menuColores.add(itemMenuColorVentana1);

        itemMenuColorVentana2.setText("Color 2");
        itemMenuColorVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorVentana2ActionPerformed(evt);
            }
        });
        menuColores.add(itemMenuColorVentana2);

        menuVentana.add(menuColores);

        itemMenuSalir.setText("Salir");
        itemMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSalirActionPerformed(evt);
            }
        });
        menuVentana.add(itemMenuSalir);
        menuVentana.add(jSeparator1);

        jMenuBar1.add(menuVentana);

        menuLabel.setText("Label");

        menuColoresLabel.setText("Colores");

        itemMenuColorLabel1.setText("Color 1");
        itemMenuColorLabel1.setToolTipText("");
        itemMenuColorLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorLabel1ActionPerformed(evt);
            }
        });
        menuColoresLabel.add(itemMenuColorLabel1);

        itemMenuColorLabel2.setText("Color 2");
        itemMenuColorLabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuColorLabel2ActionPerformed(evt);
            }
        });
        menuColoresLabel.add(itemMenuColorLabel2);

        menuLabel.add(menuColoresLabel);

        menuImagen.setText("Imagenes");

        itemMenuImagen1.setText("Imagen 1");
        itemMenuImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuImagen1ActionPerformed(evt);
            }
        });
        menuImagen.add(itemMenuImagen1);

        itemMenuImagen2.setText("Imagen 2");
        itemMenuImagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuImagen2ActionPerformed(evt);
            }
        });
        menuImagen.add(itemMenuImagen2);

        menuLabel.add(menuImagen);

        jMenuBar1.add(menuLabel);

        menuAbout.setText("About");

        itemMenuCreador.setText("Creador");
        itemMenuCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCreadorActionPerformed(evt);
            }
        });
        menuAbout.add(itemMenuCreador);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGif, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(lblGif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuColorVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorVentana1ActionPerformed
        this.getContentPane().setBackground(Color.decode("#D71245"));
    }//GEN-LAST:event_itemMenuColorVentana1ActionPerformed

    private void itemMenuColorVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorVentana2ActionPerformed
        this.getContentPane().setBackground(Color.decode("#AE579F"));
    }//GEN-LAST:event_itemMenuColorVentana2ActionPerformed

    private void itemMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemMenuSalirActionPerformed

    private void itemMenuColorLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorLabel1ActionPerformed
        lblColor.setOpaque(true);
        lblColor.setBackground(Color.decode("#F37715"));
    }//GEN-LAST:event_itemMenuColorLabel1ActionPerformed

    private void itemMenuColorLabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuColorLabel2ActionPerformed
        lblColor.setOpaque(true);
        lblColor.setBackground(Color.decode("#15F3EC"));
    }//GEN-LAST:event_itemMenuColorLabel2ActionPerformed

    private void itemMenuImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuImagen1ActionPerformed
        ImageIcon img = new ImageIcon("src/img/limon.jpg");        
        lblImagen.setIcon(img);
    }//GEN-LAST:event_itemMenuImagen1ActionPerformed

    private void itemMenuImagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuImagen2ActionPerformed
        ImageIcon gif = new ImageIcon("src/img/puntos.gif");
        lblGif.setIcon(gif);
    }//GEN-LAST:event_itemMenuImagen2ActionPerformed

    private void itemMenuCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCreadorActionPerformed
        JOptionPane.showMessageDialog(null, "Abril Camila Ortega");
    }//GEN-LAST:event_itemMenuCreadorActionPerformed

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
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new c_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuColorLabel1;
    private javax.swing.JMenuItem itemMenuColorLabel2;
    private javax.swing.JMenuItem itemMenuColorVentana1;
    private javax.swing.JMenuItem itemMenuColorVentana2;
    private javax.swing.JMenuItem itemMenuCreador;
    private javax.swing.JMenuItem itemMenuImagen1;
    private javax.swing.JMenuItem itemMenuImagen2;
    private javax.swing.JMenuItem itemMenuSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblGif;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuColores;
    private javax.swing.JMenu menuColoresLabel;
    private javax.swing.JMenu menuImagen;
    private javax.swing.JMenu menuLabel;
    private javax.swing.JMenu menuVentana;
    // End of variables declaration//GEN-END:variables
}
