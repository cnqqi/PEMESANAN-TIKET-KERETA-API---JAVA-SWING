/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atrain;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class halamanPemesan extends javax.swing.JFrame {
    private Operasi operasi;
    /**
     * Creates new form halamanPenumpang
     */
    public halamanPemesan() {
        initComponents();
        operasi = new Operasi();
        ubah.setVisible(false);
        hapus.setVisible(false);
        batal.setVisible(false);

//        operasi.BacaCSV(this);
    }

    public JTextField getAlamat() {
        return alamat;
    }

    public JRadioButton getLaki() {
        return laki;
    }

    public JTextField getNamaPemesan() {
        return namaPemesan;
    }

    public JTextField getNomorTelepon() {
        return nomorTelepon;
    }

    public JRadioButton getPerempuan() {
        return perempuan;
    }

    public JComboBox<String> getPesanKereta() {
        return pesanKereta;
    }

    public JTable getTabelDataPemesan() {
        return tabelDataPemesan;
    }

    public ButtonGroup getJenisKelamin() {
        return jenisKelamin;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaPemesan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomorTelepon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pesanKereta = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataPemesan = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        batal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Data Pemesan Tiket");

        namaPemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPemesanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        jLabel2.setText("Nama Pemesan");

        nomorTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorTeleponActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        jLabel3.setText("Nomor Telepon");

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        jLabel5.setText("Jenis Kereta");

        pesanKereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ekonomi Rp150.000/tiket", "Bisnis Rp300.000/tiket", "Eksekutif Rp450.000/tiket", "VIP Rp600.000/tiket" }));
        pesanKereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanKeretaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        jenisKelamin.add(laki);
        laki.setFont(new java.awt.Font("Futura Md BT", 2, 14)); // NOI18N
        laki.setText("Laki-Laki");
        laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiActionPerformed(evt);
            }
        });

        jenisKelamin.add(perempuan);
        perempuan.setFont(new java.awt.Font("Futura Md BT", 2, 14)); // NOI18N
        perempuan.setText("Perempuan");
        perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanActionPerformed(evt);
            }
        });

        tabelDataPemesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Nomor Telepon", "Alamat", "Jenis Kelamin", "Jenis Kereta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelDataPemesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataPemesanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataPemesan);

        simpan.setBackground(new java.awt.Color(0, 0, 51));
        simpan.setFont(new java.awt.Font("Futura Md BT", 3, 14)); // NOI18N
        simpan.setForeground(new java.awt.Color(204, 204, 255));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setBackground(new java.awt.Color(0, 0, 51));
        ubah.setFont(new java.awt.Font("Futura Md BT", 3, 14)); // NOI18N
        ubah.setForeground(new java.awt.Color(204, 204, 255));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(0, 0, 51));
        hapus.setFont(new java.awt.Font("Futura Md BT", 3, 14)); // NOI18N
        hapus.setForeground(new java.awt.Color(204, 204, 255));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        kembali.setBackground(new java.awt.Color(204, 204, 255));
        kembali.setFont(new java.awt.Font("Futura Md BT", 3, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(0, 0, 51));
        kembali.setText("Kembali");
        kembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(0, 0, 51));
        batal.setFont(new java.awt.Font("Futura Md BT", 3, 14)); // NOI18N
        batal.setForeground(new java.awt.Color(204, 204, 255));
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(kembali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(laki)
                                            .addGap(114, 114, 114)
                                            .addComponent(perempuan))
                                        .addComponent(namaPemesan)
                                        .addComponent(nomorTelepon)
                                        .addComponent(alamat)
                                        .addComponent(pesanKereta, 0, 329, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(simpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ubah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hapus)))))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaPemesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pesanKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(laki)
                    .addComponent(perempuan))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    private void namaPemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPemesanActionPerformed

    private void nomorTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorTeleponActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiActionPerformed

    private void perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        operasi.tambahPemesan(this);
    }//GEN-LAST:event_simpanActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        operasi.ubahPemesan(this);
        
        ubah.setVisible(false);
        hapus.setVisible(false);
        batal.setVisible(false);
        simpan.setVisible(true);
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        operasi.hapusPemesan(this);
        
        ubah.setVisible(false);
        hapus.setVisible(false);
        batal.setVisible(false);
        simpan.setVisible(true);
    }//GEN-LAST:event_hapusActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        halamanMenu halamanMenu = new halamanMenu();
        halamanMenu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void tabelDataPemesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataPemesanMouseClicked
        getNamaPemesan().setText(getTabelDataPemesan().getValueAt(getTabelDataPemesan().getSelectedRow(), 0).toString());
        getNomorTelepon().setText(getTabelDataPemesan().getValueAt(getTabelDataPemesan().getSelectedRow(), 1).toString());
        getAlamat().setText(getTabelDataPemesan().getValueAt(getTabelDataPemesan().getSelectedRow(), 2).toString());
        String kelamin = "Laki-Laki";
        if (kelamin.equals (getTabelDataPemesan().getValueAt(getTabelDataPemesan().getSelectedRow(), 3))){
            getLaki().setSelected(true);
            getPerempuan().setSelected(false);

        }
        else{
            getLaki().setSelected(false);
            getPerempuan().setSelected(true);
        }
        getPesanKereta().setSelectedItem(getTabelDataPemesan().getValueAt(getTabelDataPemesan().getSelectedRow(), 4));

        ubah.setVisible(true);
        hapus.setVisible(true);
        batal.setVisible(true);
        simpan.setVisible(false);

    }//GEN-LAST:event_tabelDataPemesanMouseClicked

    private void pesanKeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanKeretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesanKeretaActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        Operasi.clearForm(this);
        
        ubah.setVisible(false);
        hapus.setVisible(false);
        batal.setVisible(false);
        simpan.setVisible(true);
        
    }//GEN-LAST:event_batalActionPerformed

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
            java.util.logging.Logger.getLogger(halamanPemesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanPemesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanPemesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanPemesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new halamanPemesan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton batal;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jenisKelamin;
    private javax.swing.JButton kembali;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField namaPemesan;
    private javax.swing.JTextField nomorTelepon;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JComboBox<String> pesanKereta;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelDataPemesan;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
