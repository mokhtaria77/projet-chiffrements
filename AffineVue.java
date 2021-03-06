package cryptDecrypt;

 

import cryptDecrypt.AffineCode;

import javax.swing.JOptionPane;


public class AffineVue extends javax.swing.JFrame {

    /**
     * Creates new form AffineVue
     */
    public AffineVue() {
        initComponents();
        this.setTitle("Affine");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        key1 = new javax.swing.JTextField();
        key2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtLeftArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtRightArea = new javax.swing.JTextArea();
        jbCrypt = new javax.swing.JButton();
        jbDecrypt = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        key2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                key2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cl? k1:");

        jLabel2.setText("Cl? k2 :");

        jtxtLeftArea.setColumns(20);
        jtxtLeftArea.setRows(5);
        jScrollPane1.setViewportView(jtxtLeftArea);

        jtxtRightArea.setColumns(20);
        jtxtRightArea.setRows(5);
        jScrollPane2.setViewportView(jtxtRightArea);

        jbCrypt.setText("Crypter >>");
        jbCrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCryptActionPerformed(evt);
            }
        });

        jbDecrypt.setText("<< Decrypter");
        jbDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDecryptActionPerformed(evt);
            }
        });

        quitter.setText("Fermer");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        jLabel3.setText("CRYPTAGE ET DECRYPTAGE PAR LA METHODE AFFINE :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbDecrypt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrypt)
                    .addComponent(jbDecrypt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitter)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void key2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_key2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_key2ActionPerformed

    private void jbCryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCryptActionPerformed
        // TODO add your handling code here:
        
         int k1=Integer.parseInt(key1.getText());
         int k2=Integer.parseInt(key2.getText());
         
         if(AffineCode.pgdc(26,k1)==1){
              String texte=(String)(jtxtLeftArea.getText()).toUpperCase();
            String crypted=AffineCode.affineCrypt(texte, k1, k2);
            jtxtRightArea.setText(crypted);
             
        }
         else JOptionPane.showMessageDialog(null,"La cl? "+k1+" doit etre premier"
                    + " avec 26");
       
        
    }//GEN-LAST:event_jbCryptActionPerformed

    private void jbDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDecryptActionPerformed
        // TODO add your handling code here:
        
         int k1=Integer.parseInt(key1.getText());
         int k2=Integer.parseInt(key2.getText());
         
         if(AffineCode.pgdc(26,k1)==1){
            String texte=(String)(jtxtRightArea.getText()).toUpperCase();
            String decrypted=AffineCode.affineDecrypt(texte, k1, k2);
            jtxtLeftArea.setText(decrypted);
            
        }
         else JOptionPane.showMessageDialog(null,"La cl? "+k1+" doit ?tre premier"
                    + "avec 26");
      
    }//GEN-LAST:event_jbDecryptActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_quitterActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCrypt;
    private javax.swing.JButton jbDecrypt;
    private javax.swing.JTextArea jtxtLeftArea;
    private javax.swing.JTextArea jtxtRightArea;
    private javax.swing.JTextField key1;
    private javax.swing.JTextField key2;
    private javax.swing.JButton quitter;
    // End of variables declaration//GEN-END:variables
}
