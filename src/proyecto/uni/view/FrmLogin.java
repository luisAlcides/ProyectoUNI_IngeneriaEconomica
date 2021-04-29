/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.uni.view;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


/**
 *
 * 
 */
public class FrmLogin extends javax.swing.JFrame implements Runnable{
//declaracion de variables
    
    String hora,minutos, segundos, ampm;
    Calendar calendario;
    //declaracion de un hillo llamado h1
    Thread h1;
    
    public FrmLogin() {
        initComponents();
        //creacion del objeto h1
        h1 = new Thread(this);
        //iniciamos el hilo
        h1.start();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    //implementar el metodo run
    
    public void run(){
        Thread ct = Thread.currentThread();
        while(ct == h1){
            calcula();
            LblHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                
            }
        }
    }
    //Metodo para mostrar la hora y saber si es am o pm
    
    public void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY) -12;
            hora = h > 9 ? "" + h : "0" +h;
        } else{
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? ""
                    + calendario.get(Calendar.HOUR_OF_DAY) : "0"
                    + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? ""
                + calendario.get(Calendar.MINUTE) : "0"
                + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? ""
                + calendario.get(Calendar.SECOND) : "0"
                + calendario.get(Calendar.SECOND);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PIzquierdo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        LblHora = new javax.swing.JLabel();
        LblImagen = new javax.swing.JLabel();
        PDerecho = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LblClave = new javax.swing.JLabel();
        ChbxGuardaS = new javax.swing.JCheckBox();
        BtnIngresar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PIzquierdo.setBackground(new java.awt.Color(95, 210, 195));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        LblHora.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        LblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHora.setText("HORARIO ACTUAL");

        LblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clock.png"))); // NOI18N

        javax.swing.GroupLayout PIzquierdoLayout = new javax.swing.GroupLayout(PIzquierdo);
        PIzquierdo.setLayout(PIzquierdoLayout);
        PIzquierdoLayout.setHorizontalGroup(
            PIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PIzquierdoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(PIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PIzquierdoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(PIzquierdoLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PIzquierdoLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(LblImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PIzquierdoLayout.setVerticalGroup(
            PIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PIzquierdoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblHora)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        PDerecho.setBackground(new java.awt.Color(0, 0, 0));

        LblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo.setText("INICIAR SESION");

        LblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LblUsuario.setText("USUARIO");

        LblClave.setForeground(new java.awt.Color(255, 255, 255));
        LblClave.setText("CONTRASEÑA");

        ChbxGuardaS.setBackground(new java.awt.Color(0, 0, 0));
        ChbxGuardaS.setForeground(new java.awt.Color(255, 255, 255));
        ChbxGuardaS.setText("GUARDAR SESIÓN");

        BtnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PDerechoLayout = new javax.swing.GroupLayout(PDerecho);
        PDerecho.setLayout(PDerechoLayout);
        PDerechoLayout.setHorizontalGroup(
            PDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtUsuario)
                    .addComponent(TxtClave)
                    .addGroup(PDerechoLayout.createSequentialGroup()
                        .addGroup(PDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChbxGuardaS)
                            .addComponent(LblTitulo)
                            .addComponent(LblUsuario)
                            .addComponent(LblClave)
                            .addGroup(PDerechoLayout.createSequentialGroup()
                                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PDerechoLayout.setVerticalGroup(
            PDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDerechoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LblTitulo)
                .addGap(18, 18, 18)
                .addComponent(LblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChbxGuardaS)
                .addGap(18, 18, 18)
                .addGroup(PDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PDerecho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        char Clave[] = TxtClave.getPassword();
        String Clavef = new String(Clave);
        
        if(TxtUsuario.getText().equals("Admin") && Clavef.equals("123")){
            this.dispose();
            FrmMenu Menu = new FrmMenu();
            Menu.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Acceso denegado \n"
            +"Ingrese un usuario y/o contraseña correcta",
                    "Acceso denegado",
                    JOptionPane.ERROR_MESSAGE);
            TxtUsuario.setText("");
            TxtClave.setText("");
            TxtUsuario.requestFocus();
        }
    }//GEN-LAST:event_BtnIngresarActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JCheckBox ChbxGuardaS;
    private javax.swing.JLabel LblClave;
    public javax.swing.JLabel LblHora;
    private javax.swing.JLabel LblImagen;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPanel PDerecho;
    private javax.swing.JPanel PIzquierdo;
    private javax.swing.JPasswordField TxtClave;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

   
}