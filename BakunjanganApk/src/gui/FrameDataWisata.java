/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import crud.koneksi;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ACER
 */
public class FrameDataWisata extends javax.swing.JFrame {

    private koneksi crud;
    /**
     * Creates new form FrameDataWisata
     */
    public FrameDataWisata() {
        
        crud = new koneksi();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid_wisata = new javax.swing.JTextField();
        txtnama_wisata = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtwilayah = new javax.swing.JTextField();
        txtfasilitas = new javax.swing.JTextField();
        txttipe_wisata = new javax.swing.JTextField();
        txtdetail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM DATA WISATA");

        jLabel1.setText("ID WISATA");

        jLabel2.setText("NAMA WISATA");

        jLabel3.setText("ALAMAT");

        jLabel4.setText("WILAYAH");

        jLabel5.setText("FASILITAS");

        jLabel6.setText("TIPE WISATA");

        jLabel7.setText("DETAIL");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("DATA WISATA");

        txtnama_wisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnama_wisataActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("HAPUS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("CARI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtnama_wisata, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtalamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtwilayah, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfasilitas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttipe_wisata, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdetail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(txtid_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel8)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel8)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtwilayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttipe_wisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnama_wisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnama_wisataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnama_wisataActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String idWisata = txtid_wisata.getText();
        try {
            // Cek apakah ID Wisata tidak kosong
            if (!idWisata.equals("")) {
                // Panggil metode caridatawisata dari objek koneksi
                ResultSet rs = crud.caridatawisata(idWisata);
                // Periksa apakah hasil pencarian tidak kosong
                if (rs.next()) {
                    // Jika ada hasil, tampilkan informasi dari hasil pencarian
                    String namaWisata = rs.getString("nama_wisata");
                    String alamat = rs.getString("alamat");
                    String wilayah = rs.getString("wilayah");
                    String fasilitas = rs.getString("fasilitas");
                    String tipe_wisata = rs.getString("tipe_wisata");
                    String detail = rs.getString("detail");
                    // Tampilkan informasi pada antarmuka pengguna
                    txtnama_wisata.setText(namaWisata);
                    txtalamat.setText(alamat);
                    txtwilayah.setText(wilayah);
                    txtfasilitas.setText(fasilitas);
                    txttipe_wisata.setText(tipe_wisata);
                    txtdetail.setText(detail);
                    JOptionPane.showMessageDialog(this, "Yay, Data Wisata ditemukan");
                } else {
                    // Jika tidak ada hasil, tampilkan pesan bahwa data tidak ditemukan
                    JOptionPane.showMessageDialog(this, "Yah, Data Wisata tidak ditemukan");
                }
            } else {
                // Jika ID Wisata kosong, minta pengguna untuk mengisi ID Wisata terlebih dahulu
                JOptionPane.showMessageDialog(this, "Masukkan ID Kota terlebih dahulu");
            }
        } catch (Exception e) {
            // Tangani jika terjadi kesalahan saat mencari data
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
//  simpan Data Wisata
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if(txtid_wisata.getText().equals("")){
                JOptionPane.showMessageDialog(this, "ID WISATA Belum di Isi");
                txtid_wisata.requestFocus();
            } else if(txtnama_wisata.getText().equals("")){
                JOptionPane.showMessageDialog(this, "NAMA WISATA Belum di Isi");
                txtnama_wisata.requestFocus();
            } else if(txtalamat.getText().equals("")){
                JOptionPane.showMessageDialog(this, "ALAMAT Belum di Isi");
                txtalamat.requestFocus();
            } else if(txtwilayah.getText().equals("")){
                JOptionPane.showMessageDialog(this, "WILAYAH Belum di Isi");
                txtwilayah.requestFocus();
            } else if(txtfasilitas.getText().equals("")){
                JOptionPane.showMessageDialog(this, "FASILITAS Belum di Isi");
                txtfasilitas.requestFocus();
            } else if(txttipe_wisata.getText().equals("")){
                JOptionPane.showMessageDialog(this, "TIPE WISATA Belum di Isi");
                txttipe_wisata.requestFocus();
            } else if(txtdetail.getText().equals("")){
                JOptionPane.showMessageDialog(this, "DETAIL Belum di Isi");
                txtdetail.requestFocus();
            } else {
                crud.simpandatawisata(txtid_wisata.getText(), txtnama_wisata.getText(), txtalamat.getText(), txtwilayah.getText(), txtfasilitas.getText(), txttipe_wisata.getText(), txtdetail.getText());
                JOptionPane.showMessageDialog(this, "Yay, DATA WISATA Berhasil Di Simpan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//  ubah Data Wisata
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if (txtid_wisata.getText().equals("") &&
                txtnama_wisata.getText().equals("") &&
                txtalamat.getText().equals("") &&
                txtwilayah.getText().equals("") &&
                txtfasilitas.getText().equals("") &&
                txttipe_wisata.getText().equals("") &&
                txtdetail.getText().equals("")) 
            {    
                JOptionPane.showMessageDialog(this, "Silahkan Cari Data Wisata Terlebih Dahulu");
                txtid_wisata.requestFocus();
            } else {
                crud.ubahdatawisata(txtid_wisata.getText(), txtnama_wisata.getText(), txtalamat.getText(), txtwilayah.getText(), txtfasilitas.getText(), txttipe_wisata.getText(), txtdetail.getText());
                JOptionPane.showMessageDialog(this, "Yay, DATA WISATA Berhasil Di Ubah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
// hapus Data Wisata
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (
                 txtid_wisata.getText().equals("") &&
                 txtnama_wisata.getText().equals("") &&
                 txtalamat.getText().equals("") &&
                 txtwilayah.getText().equals("") &&
                 txtfasilitas.getText().equals("") &&
                 txttipe_wisata.getText().equals("") &&
                 txtdetail.getText().equals("")
                )
            {
                JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
                txtid_wisata.requestFocus();
            } else {
                crud.hapusdatawisata(txtid_wisata.getText());
                JOptionPane.showMessageDialog(this, "Yay, DATA WISATA Berhasil berhasil dihapus");
                txtid_wisata.getText();
                txtnama_wisata.getText();
                txtalamat.getText();
                txtwilayah.getText();
                txtfasilitas.getText();
                txttipe_wisata.getText();
                txtdetail.getText();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDataWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDataWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDataWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDataWisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDataWisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtdetail;
    private javax.swing.JTextField txtfasilitas;
    private javax.swing.JTextField txtid_wisata;
    private javax.swing.JTextField txtnama_wisata;
    private javax.swing.JTextField txttipe_wisata;
    private javax.swing.JTextField txtwilayah;
    // End of variables declaration//GEN-END:variables
}