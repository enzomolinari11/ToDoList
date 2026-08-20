package Tela;

import javax.swing.JOptionPane;



public class MinhaPrimeiraTelinha extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MinhaPrimeiraTelinha.class.getName());

    public MinhaPrimeiraTelinha() {
        initComponents();
        
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonPreencher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1Nome.addActionListener(this::jTextField1NomeActionPerformed);

        jLabel1.setText("Nome:");

        jTextFieldEndereco.addActionListener(this::jTextFieldEnderecoActionPerformed);

        jLabel2.setText("Endereço");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(this::jButtonSalvarActionPerformed);

        jButtonPreencher.setText("Preencher");
        jButtonPreencher.addActionListener(this::jButtonPreencherActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1Nome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPreencher)))
                        .addGap(0, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonPreencher))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NomeActionPerformed
         
    }//GEN-LAST:event_jTextField1NomeActionPerformed

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
       
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        JOptionPane.showMessageDialog (null, "Salvo");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreencherActionPerformed
        jTextField1Nome.setText("Enzo Konoski Molinari");
        jTextFieldEndereco.setText("Rua. Lourival Borba. 247");
        JOptionPane.showMessageDialog (null, "Preenchido");
    }//GEN-LAST:event_jButtonPreencherActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new MinhaPrimeiraTelinha().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPreencher;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1Nome;
    private javax.swing.JTextField jTextFieldEndereco;
    // End of variables declaration//GEN-END:variables
}