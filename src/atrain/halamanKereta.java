/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atrain;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class halamanKereta extends javax.swing.JFrame {
    /**
     * Creates new form halamanKereta
     */
    private int jumlahReguler;
    private double totalDiskonLansia;
    private double totalDiskonAnak;
    private double totalDiskonTiket;
    private double diskonAwal;
    private double totalHarga;
    private double totalBiaya;
    
    private void inisialisasiVariabel() {
     jumlahReguler = 0;
     totalDiskonLansia = 0.0;
     totalDiskonAnak = 0.0;
     totalDiskonTiket = 0.0;
     diskonAwal = 0.0;
     totalHarga = 0.0;
     totalBiaya = 0.0;
 }
    
    private halamanNota halamanNota;
//    String globalKereta;
    
    public halamanKereta() {
        halamanNota = new halamanNota();
        initComponents();
    }
    
    
    
    public JComboBox<String> getJenisKereta() {
        return jenisKereta;
    }

    public JTextField getJumlahTiket() {
        return jumlahTiket;
    }

    public JTextField getJumlahLansia() {
        return jumlahLansia;
    }

    public JTextField getJumlahAnak() {
        return jumlahAnak;
    }

    public JCheckBox getWifi() {
        return wifi;
    }

    public JCheckBox getMakan() {
        return makan;
    }

    public JCheckBox getBagasi() {
        return bagasi;
    }

    public JTextField getPromo() {
        return promo;
    }
    
    public String getJumlahReguler(){
        String reguler = Integer.toString(this.jumlahReguler);
        return reguler;
    }
    
    public String setDiskonLansia(double totDisLan){
        this.totalDiskonLansia = totDisLan;
        String lansia = Double.toString(this.totalDiskonLansia);
        return lansia;
    }
    public String getDiskonLansia(){
        String lansia = Double.toString(this.totalDiskonLansia);
        System.out.println("jumlah diskon Lansia " + lansia);
        return lansia;
    }
    
    public String getDiskonAnak(){
        String anak = Double.toString(this.totalDiskonAnak);
        System.out.println("jumlah diskon anak" + anak);
        return anak;
    }
    
    public String getTotalDiskonTiket(){
        String diskonTiket = Double.toString(this.totalDiskonTiket);
        return diskonTiket;
    }
    
    public String getDiskonAwal(){
        String diskonAwal = Double.toString(this.diskonAwal);
        return diskonAwal;
    }
    
    public String getTotalBiaya(){
        String totalBiaya = Double.toString(this.totalBiaya);
        return totalBiaya;
    }
    
    public String getTotalHarga(){
        String totalHarga = Double.toString(this.totalHarga);
        return totalHarga;
    }
    
    
    public void kalkulasi(){
        inisialisasiVariabel();
        // Harga tiket per jenis kereta
        int hargaEkonomi = 150000;
        int hargaBisnis = 300000;
        int hargaEksekutif = 450000;
        int hargaVIP = 600000;
        
        // Biaya layanan dan tambahan
        int biayaLayanan = 15000;
        int biayaWifi = 20000;
        int biayaMakan = 50000;
        int biayaBagasi = 30000;
        double pajak = 0.10;
        
        // Input jenis kereta   
        int hargaDasar = 0;
        String jenisKereta = getJenisKereta().getSelectedItem().toString();
        
        if (jenisKereta.equals("Ekonomi Rp150.000/tiket")){
            hargaDasar = hargaEkonomi; 
        }
        else if (jenisKereta.equals("Bisnis Rp300.000/tiket")){
            hargaDasar = hargaBisnis;
        }
        else if (jenisKereta.equals("Eksekutif Rp450.000/tiket")){
            hargaDasar = hargaEksekutif;
        }
        else if (jenisKereta.equals("VIP Rp600.000/tiket")){
            hargaDasar = hargaVIP;
        }

//        Input Jumlah Tiket Keseluruhan
        String jmlTiket = getJumlahTiket().getText();
        int jumlahTiket = Integer.parseInt(jmlTiket.trim());
        
//        Input Jumlah Tiket Lansia
        int jumlahLansia = 0;
        String jmlLansia = getJumlahLansia().getText();
        jumlahLansia = Integer.parseInt(jmlLansia.trim());

        
//        Input Jumlah Tiket Anak
        int jumlahAnak = 0;
        String jmlAnak = getJumlahAnak().getText();
        jumlahAnak = Integer.parseInt(jmlAnak.trim());

        
//        Jumlah Tiket Reguler
        this.jumlahReguler = jumlahTiket - jumlahLansia - jumlahAnak;
        if (jumlahReguler < 0){
            JOptionPane.showMessageDialog(null, "Jumlah Tiket Tidak Sesuai, Jumlah Tiket Lansia dan Tiket Anak Melebihi Jumlah Total Tiket");
        }
        else{
            halamanNota halamanNota = new halamanNota();
            halamanNota.setVisible(true);
            halamanNota.tampilkanNota(this);
            this.dispose();
        }
        
//        Fasilitas Tambahan
        int totalBiayaTambahan = 0;
        if (getWifi().isSelected()){
            totalBiayaTambahan += biayaWifi * jumlahTiket;
        }
        if (getMakan().isSelected()){
            totalBiayaTambahan += biayaMakan * jumlahTiket;
        }
        if (getBagasi().isSelected()){
            totalBiayaTambahan += biayaBagasi * jumlahTiket;
        }
        
        // Hitung total harga tiket sebelum diskon
        int totalHargaTiket = hargaDasar * jumlahTiket;

//      Diskon Jumlah Tiket
        double diskon = 0;
        if (jumlahTiket >= 10){
            diskon = 0.15;
        }
        else if (jumlahTiket >= 5){
            diskon = 0.10;
        }
        else if (jumlahTiket >= 3){
            diskon = 0.05;
        }
        
        this.diskonAwal = totalHargaTiket * diskon;
        
//       Diskon Kode Promo
        String kode = "VIPRIDE";
        String promo = getPromo().getText();
        if (promo.equals(kode)){
            diskon += 0.10;
        }
        else {
            diskon += 0;
        }
        
//        Diskon Lansia dan Anak
        double diskonLansia = 0.20;
        double diskonAnak = 0.25;
        double hitungTotalDiskonLansia = hargaDasar * jumlahLansia * diskonLansia;
        setDiskonLansia(hitungTotalDiskonLansia);
        this.totalDiskonAnak = hargaDasar * jumlahAnak * diskonAnak;
        
//        Total Harga Tiket Setelah Diskon
        this.totalDiskonTiket = totalHargaTiket * diskon;
        double hargaSetelahDiskon = totalHargaTiket - totalDiskonTiket - totalDiskonLansia - totalDiskonAnak;
        
        this.totalHarga = totalHargaTiket + totalBiayaTambahan + biayaLayanan;
//        Hitung Total Harga Dikenakan Pajak & Biaya Layanan
        double totalSebelumPajak = hargaSetelahDiskon + totalBiayaTambahan + biayaLayanan;
        double totalPajak = totalSebelumPajak * pajak;
        this.totalBiaya = totalSebelumPajak + totalPajak;
        
        halamanNota.updateDiskonLansia(totalDiskonLansia);
        System.out.println("Diskon Lansia: " + getDiskonLansia());
        System.out.println("Diskon Anak: " + getDiskonAnak());
        System.out.println("Total Diskon Tiket: " + getTotalDiskonTiket());
        System.out.println("Total Harga: " + getTotalHarga());
        System.out.println("Total Biaya: " + getTotalBiaya());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jenisKereta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jumlahTiket = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jumlahAnak = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        wifi = new javax.swing.JCheckBox();
        makan = new javax.swing.JCheckBox();
        bagasi = new javax.swing.JCheckBox();
        pesanKereta = new javax.swing.JButton();
        batalKereta = new javax.swing.JButton();
        jumlahLansia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        promo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Pesan Kereta & Fasilitas");

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Jenis Kereta");

        jenisKereta.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        jenisKereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ekonomi Rp150.000/tiket", "Bisnis Rp300.000/tiket", "Eksekutif Rp450.000/tiket", "VIP Rp600.000/tiket" }));
        jenisKereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisKeretaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Jumlah Tiket:");

        jumlahTiket.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        jumlahTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahTiketActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Jumlah Lansia");

        jLabel7.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("(diatas 60 tahun)");

        jumlahAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahAnakActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("(dibawah 12 tahun)");

        jLabel9.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Jumlah Anak");

        wifi.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        wifi.setForeground(new java.awt.Color(0, 0, 51));
        wifi.setText("Wi-fi Rp20.000/tiket");

        makan.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        makan.setForeground(new java.awt.Color(0, 0, 51));
        makan.setText("Makan Rp50.000/tiket");
        makan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makanActionPerformed(evt);
            }
        });

        bagasi.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        bagasi.setForeground(new java.awt.Color(0, 0, 51));
        bagasi.setText("Bagasi Tambahan Rp30.000/tiket");
        bagasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagasiActionPerformed(evt);
            }
        });

        pesanKereta.setBackground(new java.awt.Color(0, 0, 51));
        pesanKereta.setFont(new java.awt.Font("Futura Md BT", 3, 18)); // NOI18N
        pesanKereta.setForeground(new java.awt.Color(204, 204, 255));
        pesanKereta.setText("Pesan");
        pesanKereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanKeretaActionPerformed(evt);
            }
        });

        batalKereta.setBackground(new java.awt.Color(0, 0, 51));
        batalKereta.setFont(new java.awt.Font("Futura Md BT", 3, 18)); // NOI18N
        batalKereta.setForeground(new java.awt.Color(204, 204, 255));
        batalKereta.setText("Batal");
        batalKereta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalKeretaActionPerformed(evt);
            }
        });

        jumlahLansia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahLansiaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Kode Promo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(jumlahLansia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jumlahAnak, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jenisKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(batalKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                                .addComponent(pesanKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(wifi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(makan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bagasi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(promo)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jumlahTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahLansia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(wifi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(makan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bagasi)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(promo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesanKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batalKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
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

    private void jenisKeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisKeretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKeretaActionPerformed

    private void jumlahTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahTiketActionPerformed

    private void jumlahAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahAnakActionPerformed

    private void makanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makanActionPerformed

    private void bagasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagasiActionPerformed

    private void pesanKeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanKeretaActionPerformed
        kalkulasi();
    }//GEN-LAST:event_pesanKeretaActionPerformed

    private void batalKeretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalKeretaActionPerformed
        halamanMenu halamanMenu = new halamanMenu();
        halamanMenu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_batalKeretaActionPerformed

    private void jumlahLansiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahLansiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahLansiaActionPerformed

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
            java.util.logging.Logger.getLogger(halamanKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanKereta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanKereta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bagasi;
    private javax.swing.JButton batalKereta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenisKereta;
    private javax.swing.JTextField jumlahAnak;
    private javax.swing.JTextField jumlahLansia;
    private javax.swing.JTextField jumlahTiket;
    private javax.swing.JCheckBox makan;
    private javax.swing.JButton pesanKereta;
    private javax.swing.JTextField promo;
    private javax.swing.JCheckBox wifi;
    // End of variables declaration//GEN-END:variables
}
