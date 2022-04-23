
package Principal;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JDialog {
    conexion.ConexionBD con=new ConexionBD();
    Connection cn=con.conectar();
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        txtconfirmar = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Nuevos Usuarios");

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Usuario")));

        txtnombre.setText("Nombre:");
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreMouseClicked(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtapellidos.setText("Apellidos:");
        txtapellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtapellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidosMouseClicked(evt);
            }
        });

        txtcorreo.setText("Correo:");
        txtcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcorreoMouseClicked(evt);
            }
        });

        txttelefono.setBackground(new java.awt.Color(240, 240, 240));
        txttelefono.setText("Teléfono:");
        txttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txttelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttelefonoMouseClicked(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txtusuario.setText("Nombre de Usuario:");
        txtusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtcontraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Contraseña"));

        txtconfirmar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Confirmar contraseña"));
        txtconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("REGISTRAR USUARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clase de usuario:", "Gestor", "Invitado" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 55)); // NOI18N
        jLabel1.setText("Registro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(246, 246, 246))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtconfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        txtconfirmar.getAccessibleContext().setAccessibleName("Confirma contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int id=0;
        String Usuario=txtusuario.getText();
        String Nombre=txtnombre.getText();
        String Apellidos=txtapellidos.getText();
        String Email=txtcorreo.getText();
        String Telefono=txttelefono.getText();
        String Contraseña=txtcontraseña.getText();
        String Confirmar=txtconfirmar.getText();  
        List Datosquefaltan = new ArrayList();
        

       
       if(Usuario.isEmpty()){Datosquefaltan.add("Usuario" + "\n");};
       if(Nombre.isEmpty()){Datosquefaltan.add("Nombre" +  "\n");};
       if(Apellidos.isEmpty()){Datosquefaltan.add("Apellido" + "\n");};
       if(Email.isEmpty()){Datosquefaltan.add("Email" + "\n");};
       if(Telefono.isEmpty()){Datosquefaltan.add("Telefono" + "\n");};
       if(Contraseña.isEmpty()){Datosquefaltan.add("Contraseña" + "\n");};
       if(Confirmar.isEmpty()){Datosquefaltan.add("Confirmar contraseña" + "\n");};
       
       
           String Cincompleto="";
          //int Tel = Integer.parseInt(txttelefono.getText());
      
       
        
           
            
             if(Datosquefaltan.size()>0){
           
         for(int i=0;i<Datosquefaltan.size();i++){
           
           
       Cincompleto+=Datosquefaltan.get(i);
       
       }
         JOptionPane.showMessageDialog(null,("Debe de completar: " + "\n" + Cincompleto ));
         
       
       }else if(!Contraseña.equals(Confirmar)){
       JOptionPane.showMessageDialog(null,"La contraseña no coincide o es incorrecta.");
       }
        else{
              //Comprobando que el usuario o el correo no esté registrado   
            try {
                
                PreparedStatement Comprobar_usuario_existente=cn.prepareStatement("SELECT * FROM usuarios WHERE Usuario='"+Usuario+"'");
                PreparedStatement Comprobar_correo_existente=cn.prepareStatement("SELECT * FROM usuarios WHERE Email='"+Email+"'");
                ResultSet Comprobacion_usuario = Comprobar_usuario_existente.executeQuery();
                ResultSet Comprobacion_Correo = Comprobar_correo_existente.executeQuery();
                Comprobacion_usuario.next();
                Comprobacion_Correo.next();
                if(Comprobacion_usuario.getRow()> 0 || Comprobacion_Correo.getRow()> 0){
                
                    if(Comprobacion_usuario.getRow()> 0){JOptionPane.showMessageDialog(null,"Este usuario ya existe en nustras bases de datos.");}
                    if(Comprobacion_Correo.getRow()> 0){JOptionPane.showMessageDialog(null,"Este correo ya existe en nuestras bases de datos.");}
                    
  
                
                }else{
                
                
                    
                    try {
                        
                        
                    String consulta="INSERT INTO usuarios (id,Nombre,Apellidos,Usuario,Email,Contraseña,Confirmar,Telefono) VALUES('"+id+"','"+Nombre+"','"+Apellidos+"','"+Usuario+"','"+Email+"','"+Contraseña+"','"+Confirmar+"','"+Telefono+"')";
                    PreparedStatement Declaracion=cn.prepareStatement(consulta);
                    Declaracion.executeUpdate();
                    limpiar();
                    JOptionPane.showMessageDialog(null,"Los datos han sido guardados con éxito.");
                    
                    
                }catch (Exception e){
                    
                    
                    JOptionPane.showConfirmDialog(null, "No se pudo guardar Usuario"+ e);
                }
                    
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }

          
                        
//----------------

          
                        
//----------------
                
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmarActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        // TODO add your handling code here:
        
         int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
    
     if (!numeros)
    {
        evt.consume();
    }

    if (txttelefono.getText().trim().length() == 10) {
        evt.consume();
    }
        
        
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        // TODO add your handling code here:
        
        txtusuario.setText("");
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtcorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMouseClicked
        txtcorreo.setText("");
        
    }//GEN-LAST:event_txtcorreoMouseClicked

    private void txtapellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidosMouseClicked
        txtapellidos.setText("");
    }//GEN-LAST:event_txtapellidosMouseClicked

    private void txttelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttelefonoMouseClicked
        txttelefono.setText("");
    }//GEN-LAST:event_txttelefonoMouseClicked

    private void txtnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseClicked
     txtnombre.setText("");
    }//GEN-LAST:event_txtnombreMouseClicked

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed
        void limpiar (){
            txtusuario.setText("");
            txtnombre.setText("");
            txtapellidos.setText("");
            txtcorreo.setText("");
            txttelefono.setText("");
            txtcontraseña.setText("");
            txtconfirmar.setText("");
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
