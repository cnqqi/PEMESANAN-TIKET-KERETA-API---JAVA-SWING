/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atrain;

import java.awt.Point;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Operasi extends javax.swing.JFrame{
    
    public boolean cekDuplikatNomor(halamanPemesan halamanPemesan, String nomor){
        DefaultTableModel model = (DefaultTableModel) halamanPemesan.getTabelDataPemesan().getModel();       
        for (int i = 0; i < model.getRowCount(); i++){
            if (model.getValueAt(i, 1).equals(nomor)){
                return true;
            }
        }
      return false;
    }
    
    public void tambahPemesan(halamanPemesan halamanPemesan){
        DefaultTableModel model = (DefaultTableModel) halamanPemesan.getTabelDataPemesan().getModel();
        
        String nama = halamanPemesan.getNamaPemesan().getText();
        String nomor = halamanPemesan.getNomorTelepon().getText();
        String alamat = halamanPemesan.getAlamat().getText();
        String jenisKelamin = "";
        String kereta = halamanPemesan.getPesanKereta().getSelectedItem().toString();
        if (halamanPemesan.getLaki().isSelected()){
            jenisKelamin = "Laki-Laki";
        }
        else if (halamanPemesan.getPerempuan().isSelected()){
            jenisKelamin = "Perempuan";
        }

        if (nomor.trim().isEmpty() || nama.trim().isEmpty() || alamat.trim().isEmpty() || kereta.trim().isEmpty() || jenisKelamin.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }
        else if (cekDuplikatNomor(halamanPemesan, nomor)) {
            JOptionPane.showMessageDialog(this, "Nomor Telepon Sudah Terdaftar");
        }
        else {
            Object[] row = {nama, nomor, alamat, jenisKelamin, kereta};
            model.addRow(row);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        }
        
        SaveCSV(halamanPemesan);
        clearForm(halamanPemesan);
    }
    
    public void SaveCSV(halamanPemesan halamanPemesan){
        DefaultTableModel model = (DefaultTableModel) halamanPemesan.getTabelDataPemesan().getModel();
        try (FileWriter writer = new FileWriter("data.csv")){
            for (int i = 0; i < model.getRowCount(); i++){
                for (int j = 0; j < model.getColumnCount(); j++){
                    writer.append(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1){
                        writer.append(", ");
                    }
                    else {
                        writer.append("\n");
                    }
                }
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void clearForm(halamanPemesan halamanPemesan){
        halamanPemesan.getNamaPemesan().setText("");
        halamanPemesan.getNomorTelepon().setText("");
        halamanPemesan.getAlamat().setText("");
    }
    
    public void ubahPemesan(halamanPemesan halamanPemesan){
        DefaultTableModel model = (DefaultTableModel) halamanPemesan.getTabelDataPemesan().getModel();
        int pilihBaris = halamanPemesan.getTabelDataPemesan().getSelectedRow();
        
        String nama = halamanPemesan.getNamaPemesan().getText();
        String nomor = halamanPemesan.getNomorTelepon().getText();
        String alamat = halamanPemesan.getAlamat().getText();
        String jenisKelamin = halamanPemesan.getLaki().isSelected() ? "Laki-Laki" : "Perempuan";
        String kereta = halamanPemesan.getPesanKereta().getSelectedItem().toString();
   
        if (nomor.trim().isEmpty() || nama.trim().isEmpty() || alamat.trim().isEmpty() || kereta.trim().isEmpty() || jenisKelamin.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }
        else {
            model.setValueAt(nama, pilihBaris, 0);
            model.setValueAt(nomor, pilihBaris, 1);
            model.setValueAt(alamat, pilihBaris, 2);
            model.setValueAt(jenisKelamin, pilihBaris, 3);
            model.setValueAt(kereta, pilihBaris, 4);
            
            SaveCSV(halamanPemesan);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
            clearForm(halamanPemesan);
        }
    }
    
    public void hapusPemesan(halamanPemesan halamanPemesan){
        DefaultTableModel model = (DefaultTableModel) halamanPemesan.getTabelDataPemesan().getModel();
        model.removeRow(halamanPemesan.getTabelDataPemesan().getSelectedRow());
        
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        SaveCSV(halamanPemesan);
        clearForm(halamanPemesan);
    }
}
