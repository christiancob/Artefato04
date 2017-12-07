/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artefato4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class jfrmListaSocios extends javax.swing.JFrame {

    /**
     * Creates new form jfrmListaSócios
     */
    public jfrmListaSocios() {
        initComponents();
        //preencherTabelaUsuario();
        this.setSize(750, 500);
        setLocationRelativeTo(null);
        // preencherTabelaUsuario();
        LayoutPadrao lp = new LayoutPadrao();
        lp.ativarLayoutPadrao();
        preencherTabelaProdutosOrdenAlf();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtnVoltar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clube de Campo-Lista de Sócios");
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Fabricante", "Data de Validade", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 710, 167);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Produtos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 180, 22);

        jbtnVoltar.setText("Voltar");
        jbtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnVoltar);
        jbtnVoltar.setBounds(660, 430, 61, 23);

        jButton2.setText("Salvar");
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 430, 63, 23);

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(513, 430, 70, 23);

        jButton3.setText("Cadastrar produto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 270, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
        new jfrmLogin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jbtnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CadastroProdutos().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfrmListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmListaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new jfrmListaSocios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnVoltar;
    // End of variables declaration//GEN-END:variables

    public void preencherTabelaProdutosOrdenAlf() {
        try {
            conexao.Conectar();

            String sqlSelect = "select * from produto order by PRO_NOME";

            PreparedStatement ps = conexao.con.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
            mod.setNumRows(0);
            while (rs.next()) {

                mod.addRow(new Object[]{rs.getString("PRO_ID"), rs.getString("PRO_FABRICANTE"), rs.getString("PRO_DT_VALIDADE"),
                    rs.getString("PRO_NOME")});

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void preencherTabelaProdutos() {
        try {
            conexao.Conectar();

            String sqlSelect = "select * from produto";

            PreparedStatement ps = conexao.con.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel mod = (DefaultTableModel) jTable1.getModel();
            mod.setNumRows(0);
            while (rs.next()) {

                mod.addRow(new Object[]{rs.getString("PRO_ID"), rs.getString("PRO_FABRICANTE"), rs.getString("PRO_DT_VALIDADE"),
                    rs.getString("PRO_NOME")});

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
