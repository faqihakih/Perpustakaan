/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import com.alee.laf.WebLookAndFeel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author ASUS
 */
public class HalamanUtama extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public HalamanUtama() {
        initComponents();
        //addComp(new TambahDokter());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInduk = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        miDataDokter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInduk.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelInduk, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        mFile.setText("File");

        miDataDokter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        miDataDokter.setText("Data Buku");
        miDataDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDataDokterActionPerformed(evt);
            }
        });
        mFile.add(miDataDokter);

        jMenuBar1.add(mFile);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miDataDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDataDokterActionPerformed
        addComp(new DataBuku());
    }//GEN-LAST:event_miDataDokterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(() -> {
            new HalamanUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenuItem miDataDokter;
    private static javax.swing.JPanel panelInduk;
    // End of variables declaration//GEN-END:variables

    public static void addComp(JPanel panel){
        if(panelInduk.getComponentCount() > 0){
            panelInduk.removeAll();
        }
        panelInduk.add(panel, BorderLayout.CENTER);
        panelInduk.revalidate();
        panelInduk.repaint();
    }

}
