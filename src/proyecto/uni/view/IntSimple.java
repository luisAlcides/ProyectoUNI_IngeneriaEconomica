/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.uni.view;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import proyecto.uni.controller.DatosGenerales;
import proyecto.uni.model.Interes;
import proyecto.uni.model.InteresSimple;
import proyecto.uni.model.Validar;

public class IntSimple extends javax.swing.JFrame {

    private List<JRadioButton> radioButtons;
    private List<String> comboBoxSimple;
    private List<JButton> botonesIS;
    private List<JFormattedTextField> textFieldIS;
    private List<JLabel> labelsIS;
    private Validar validar;
    
    DatosGenerales datos = new DatosGenerales();
    double monto = 0;
    double capital = 0;
    double tasa = 0;
    double periodo = 0;

    public IntSimple() {
        initComponents();
        comboBoxSimple = new ArrayList<>();
        radioButtons = new ArrayList<>();
        botonesIS = new ArrayList<>();
        textFieldIS = new ArrayList<>();
        labelsIS = new ArrayList<>();
        validar = new Validar();

        radioButtons.add(RadioMonto);
        radioButtons.add(RadioCapital);
        radioButtons.add(RadioTasa);
        radioButtons.add(RadioPeriodo);

        comboBoxSimple.add(CmbPerido.getItemAt(0));
        comboBoxSimple.add(CmbPerido.getItemAt(1));
        comboBoxSimple.add(CmbPerido.getItemAt(2));
        comboBoxSimple.add(CmbPerido.getItemAt(3));
        comboBoxSimple.add(CmbPerido.getItemAt(4));
        comboBoxSimple.add(CmbPerido.getItemAt(5));
        comboBoxSimple.add(CmbPerido.getItemAt(6));
        comboBoxSimple.add(CmbPerido.getItemAt(7));

        textFieldIS.add(TxtMonto);
        textFieldIS.add(TxtCapital);
        textFieldIS.add(TxtTasa);
        textFieldIS.add(TxtPeriodo);

        botonesIS.add(BtnLimpiar);
        botonesIS.add(BtnCalcular);
        botonesIS.add(BtnSalir);

        //datos.agregarDatos(botonesIS, textFieldIS, radioButtons, labelsIS);

    }

    /**
     * Creates new form IntSimple
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupSimple = new javax.swing.ButtonGroup();
        btGroupInteresSimple = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanel = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        LblSelecione = new javax.swing.JLabel();
        RadioMonto = new javax.swing.JRadioButton();
        RadioCapital = new javax.swing.JRadioButton();
        RadioTasa = new javax.swing.JRadioButton();
        LblCap??talizacion = new javax.swing.JLabel();
        RadioPeriodo = new javax.swing.JRadioButton();
        BtnSalir = new javax.swing.JButton();
        BtnCalcular = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        CmbPerido = new javax.swing.JComboBox<>();
        TxtMonto = new javax.swing.JFormattedTextField();
        TxtCapital = new javax.swing.JFormattedTextField();
        TxtPeriodo = new javax.swing.JFormattedTextField();
        TxtTasa = new javax.swing.JFormattedTextField();
        tasaPorFinal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(238, 238, 238));
        JPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JPanel.setForeground(new java.awt.Color(238, 238, 238));

        LblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        LblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(0, 173, 181));
        LblTitulo.setText("Interes Simple");

        LblSelecione.setForeground(new java.awt.Color(0, 173, 181));
        LblSelecione.setText("Seleccione que variable a calcular.");

        BtnGroupSimple.add(RadioMonto);
        RadioMonto.setForeground(new java.awt.Color(0, 173, 181));
        RadioMonto.setText("Monto");
        RadioMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMontoActionPerformed(evt);
            }
        });

        BtnGroupSimple.add(RadioCapital);
        RadioCapital.setForeground(new java.awt.Color(0, 173, 181));
        RadioCapital.setText("Capital");
        RadioCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCapitalActionPerformed(evt);
            }
        });

        BtnGroupSimple.add(RadioTasa);
        RadioTasa.setForeground(new java.awt.Color(0, 173, 181));
        RadioTasa.setText("Tasa");
        RadioTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioTasaActionPerformed(evt);
            }
        });

        LblCap??talizacion.setBackground(new java.awt.Color(0, 0, 0));
        LblCap??talizacion.setForeground(new java.awt.Color(0, 173, 181));
        LblCap??talizacion.setText("Capitalizable");

        BtnGroupSimple.add(RadioPeriodo);
        RadioPeriodo.setForeground(new java.awt.Color(0, 173, 181));
        RadioPeriodo.setText("Per??odo");
        RadioPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioPeriodoActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setForeground(new java.awt.Color(0, 173, 181));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnCalcular.setBackground(new java.awt.Color(255, 255, 255));
        BtnCalcular.setForeground(new java.awt.Color(0, 173, 181));
        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        BtnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BtnLimpiar.setForeground(new java.awt.Color(0, 173, 181));
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        CmbPerido.setForeground(new java.awt.Color(0, 0, 0));
        CmbPerido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Mensual", "Semestral ", "Trimestral", "Cuatrimestral", "Bimestrestral ", "Dias 360", "Dias 365" }));
        CmbPerido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbPeridoActionPerformed(evt);
            }
        });

        TxtMonto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        TxtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMontoKeyTyped(evt);
            }
        });

        TxtCapital.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        TxtCapital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCapitalKeyTyped(evt);
            }
        });

        TxtPeriodo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        TxtPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPeriodoKeyTyped(evt);
            }
        });

        TxtTasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00%"))));
        TxtTasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TxtTasaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxtTasaMouseExited(evt);
            }
        });
        TxtTasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTasaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LblSelecione))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RadioTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RadioCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RadioMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135)
                                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtTasa, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(TxtCapital)
                                            .addComponent(tasaPorFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(37, 37, 37)
                                        .addComponent(CmbPerido, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(RadioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(TxtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblCap??talizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTitulo))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(LblTitulo)
                .addGap(35, 35, 35)
                .addComponent(LblSelecione)
                .addGap(27, 27, 27)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioMonto)
                    .addComponent(TxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioCapital)
                    .addComponent(TxtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioTasa)
                    .addComponent(CmbPerido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tasaPorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioPeriodo)
                    .addComponent(LblCap??talizacion)
                    .addComponent(TxtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("Interes Simple", JPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Convertir Periodo", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RadioMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMontoActionPerformed
        if (radioButtons.get(0).isSelected()) {
            TxtMonto.setEnabled(false);
            TxtPeriodo.setEnabled(true);
            TxtCapital.setEnabled(true);
            TxtTasa.setEnabled(true);
        }
    }//GEN-LAST:event_RadioMontoActionPerformed

    private void RadioCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCapitalActionPerformed
        if (radioButtons.get(1).isSelected()) {
            TxtCapital.setEnabled(false);
            TxtPeriodo.setEnabled(true);
            TxtMonto.setEnabled(true);
            TxtTasa.setEnabled(true);
        }
    }//GEN-LAST:event_RadioCapitalActionPerformed

    private void RadioPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioPeriodoActionPerformed
        if (radioButtons.get(3).isSelected()) {
            TxtPeriodo.setEnabled(false);
            TxtMonto.setEnabled(true);
            TxtCapital.setEnabled(true);
            TxtTasa.setEnabled(true);
        }
    }//GEN-LAST:event_RadioPeriodoActionPerformed


    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed

        if (radioButtons.get(0).isSelected()) {
            capital = Double.parseDouble(TxtCapital.getText());
            tasa = Double.parseDouble(TxtTasa.getText());
            periodo = Double.parseDouble(TxtPeriodo.getText());
            InteresSimple is = new InteresSimple(monto, capital, tasa, periodo, radioButtons, comboBoxSimple);
            is.cISMonto(is.getCapital(), is.getTasa(), is.getPerido());
            TxtMonto.setText(String.valueOf(is.getMonto()));
        }
        
        if (radioButtons.get(1).isSelected()) {
            monto = Double.parseDouble(TxtMonto.getText());
            tasa = Double.parseDouble(TxtTasa.getText());
            periodo = Double.parseDouble(TxtPeriodo.getText());
            InteresSimple is = new InteresSimple(monto, capital, tasa, periodo, radioButtons, comboBoxSimple);
            is.cISCapital(is.getMonto(), is.getTasa(), is.getPerido());
            TxtCapital.setText(String.valueOf(is.getCapital()));
        }
        
         if (radioButtons.get(2).isSelected()) {
            monto = Double.parseDouble(TxtMonto.getText());
            capital = Double.parseDouble(TxtCapital.getText());
            periodo = Double.parseDouble(TxtPeriodo.getText());
            InteresSimple is = new InteresSimple(monto, capital, tasa, periodo, radioButtons, comboBoxSimple);
            is.cISTasa(is.getMonto(), is.getCapital(), is.getPerido());
            TxtTasa.setText(String.valueOf(is.getTasa()));
        }
         
          if (radioButtons.get(3).isSelected()) {
            monto = Double.parseDouble(TxtMonto.getText());
            capital = Double.parseDouble(TxtCapital.getText());
            tasa = Double.parseDouble(TxtTasa.getText());
            InteresSimple is = new InteresSimple(monto, capital, tasa, periodo, radioButtons, comboBoxSimple);
            is.cISPeriodo(is.getMonto(), is.getCapital(), is.getTasa());
            TxtPeriodo.setText(String.valueOf(is.getPerido()));
        }


    }//GEN-LAST:event_BtnCalcularActionPerformed


    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        dispose();
        FrmMenu r = new FrmMenu();
        r.setVisible(true);    }//GEN-LAST:event_BtnSalirActionPerformed

    private void RadioTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioTasaActionPerformed
        if (radioButtons.get(2).isSelected()) {
            TxtTasa.setEnabled(false);
            TxtMonto.setEnabled(true);
            TxtCapital.setEnabled(true);
            TxtPeriodo.setEnabled(true);
        }
    }//GEN-LAST:event_RadioTasaActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        Interes interesSimple = new InteresSimple();
        interesSimple.limpiar(datos.getTextFieldsIS());

    }//GEN-LAST:event_BtnLimpiarActionPerformed


    private void TxtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMontoKeyTyped
        validar.numberDecimalKeyPress(evt, TxtMonto);
    }//GEN-LAST:event_TxtMontoKeyTyped

    private void TxtCapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCapitalKeyTyped
         validar.numberDecimalKeyPress(evt, TxtCapital);
    }//GEN-LAST:event_TxtCapitalKeyTyped

    private void TxtTasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTasaKeyTyped
        validar.numberKeyTasa(evt, TxtTasa);
    }//GEN-LAST:event_TxtTasaKeyTyped

    private void TxtPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPeriodoKeyTyped
         validar.numberDecimalKeyPress(evt, TxtPeriodo);
    }//GEN-LAST:event_TxtPeriodoKeyTyped

    private void TxtTasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTasaMouseEntered
         tasaPorFinal.setText("Poner al final %");
    }//GEN-LAST:event_TxtTasaMouseEntered

    private void TxtTasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTasaMouseExited
        tasaPorFinal.setText("");
    }//GEN-LAST:event_TxtTasaMouseExited

    
    private void CmbPeridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbPeridoActionPerformed
      // System.out.println(CmbPerido.getSelectedItem().toString());
 
//        
//        if (CmbPerido.getSelectedItem().toString().equals("Anual")) {
//            LblCap??talizacion.setText("Debe ingresar periodo en A??os");
//        }
//        if (CmbPerido.getSelectedItem().toString().equals("Mensual")) {
//            LblCap??talizacion.setText("Debe ingresar periodo en meses");
//        }
//        if (CmbPerido.getSelectedItem().toString().equals(comboBoxSimple.get(3))) {
//            LblCap??talizacion.setText("Debe ingresar periodo en Semestres");
//        }
//        if (comboBoxSimple.get(3).equals(CmbPerido.getSelectedItem().toString())) {
//            LblCap??talizacion.setText("Debe ingresar periodo en Trimestre");
//        }
//        if (comboBoxSimple.get(4).equals(CmbPerido.getItemAt(4))) {
//            LblCap??talizacion.setText("Debe ingresar periodo en Cuatrimestre");
//        }
//        if (comboBoxSimple.get(5).equals(CmbPerido.getItemAt(5))) {
//            LblCap??talizacion.setText("Debe ingresar periodo en Bimestre");
//        }
//        if (comboBoxSimple.get(6).equals(CmbPerido.getItemAt(6))) {
//            LblCap??talizacion.setText("Debe ingresar periodo Dias 360");
//        }
//        if (comboBoxSimple.get(7).equals(CmbPerido.getItemAt(7))) {
//            LblCap??talizacion.setText("Debe ingresar periodo en Dias 365");
    }//GEN-LAST:event_CmbPeridoActionPerformed

    
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
            java.util.logging.Logger.getLogger(IntSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntSimple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnCalcular;
    private javax.swing.ButtonGroup BtnGroupSimple;
    private javax.swing.JButton BtnLimpiar;
    public javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CmbPerido;
    private javax.swing.JPanel JPanel;
    public javax.swing.JLabel LblCap??talizacion;
    private javax.swing.JLabel LblSelecione;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JRadioButton RadioCapital;
    private javax.swing.JRadioButton RadioMonto;
    private javax.swing.JRadioButton RadioPeriodo;
    private javax.swing.JRadioButton RadioTasa;
    private javax.swing.JFormattedTextField TxtCapital;
    private javax.swing.JFormattedTextField TxtMonto;
    private javax.swing.JFormattedTextField TxtPeriodo;
    private javax.swing.JFormattedTextField TxtTasa;
    private javax.swing.ButtonGroup btGroupInteresSimple;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel tasaPorFinal;
    // End of variables declaration//GEN-END:variables
}
