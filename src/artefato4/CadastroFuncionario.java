/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package artefato4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastroFuncionario extends javax.swing.JFrame {
    
   

    /**
     * Creates new form CadastroFuncionario
     */
    public String consisteCampos(java.awt.event.ActionEvent evt) {

        String mensagem = "";

        if (jNomeFuncionario.getText().isEmpty()) {
            mensagem = mensagem + "O Campo nome é necessário ser informado. \n";
        }

        if (jcpfFuncionario.getText().isEmpty()) {
            mensagem = mensagem + "O Campo CPF é necessário ser informado. \n";
        }

        if (CampoNascimentoFuncionario.getText().isEmpty()) {
            mensagem = mensagem + "O Campo data de nascimento é necessário ser informado.  \n";
        }

        return mensagem;
    }

    public CadastroFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setSize(750, 500);
        LayoutPadrao lp = new LayoutPadrao();
        lp.ativarLayoutPadrao();

        capturarCodigo();

//                     jPanel2Senha.setVisible(false);
//                    if( jrbtnUsuarioSist.isSelected()){
//                          jPanel2Senha.setVisible(true);
//                      }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        CadastrarFuncionario = new javax.swing.JButton();
        VoltarFuncionario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1TipoFuncionario = new javax.swing.JComboBox();
        cofFuncionario = new javax.swing.JTextField();
        jNomeFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        codFuncionario = new javax.swing.JLabel();
        jcpfFuncionario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CampoNascimentoFuncionario = new javax.swing.JTextField();
        estCivilFuncionario = new javax.swing.JLabel();
        combFuncionario = new javax.swing.JComboBox();
        rgfunc = new javax.swing.JTextField();
        CampoProfissao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoTel = new javax.swing.JTextField();
        jTelFuncionario = new javax.swing.JLabel();
        Campomail = new javax.swing.JTextField();
        EmailFuncionario = new javax.swing.JLabel();
        jtxtSexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RGFuncionario = new javax.swing.JLabel();
        TextRua = new javax.swing.JTextField();
        ruaFuncionario = new javax.swing.JLabel();
        bairroFuncionario = new javax.swing.JLabel();
        TextN = new javax.swing.JTextField();
        nFuncionario = new javax.swing.JLabel();
        TextBairro = new javax.swing.JTextField();
        TextCidade = new javax.swing.JTextField();
        CidFuncionario = new javax.swing.JLabel();
        TextComplemento = new javax.swing.JTextField();
        complementoFuncionario = new javax.swing.JLabel();
        TextUF = new javax.swing.JTextField();
        TextCep = new javax.swing.JTextField();
        CEPFuncionario = new javax.swing.JLabel();
        ufFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("CADASTRAR FUNCIONÁRIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 20, 260, 40);

        CadastrarFuncionario.setText("Cadastrar");
        CadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(CadastrarFuncionario);
        CadastrarFuncionario.setBounds(520, 440, 90, 30);

        VoltarFuncionario.setText("Voltar");
        VoltarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarFuncionario);
        VoltarFuncionario.setBounds(620, 440, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tipo de Funcionário:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 290, 134, 15);

        jComboBox1TipoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Funcionário Comun" }));
        getContentPane().add(jComboBox1TipoFuncionario);
        jComboBox1TipoFuncionario.setBounds(560, 290, 116, 20);

        cofFuncionario.setEditable(false);
        getContentPane().add(cofFuncionario);
        cofFuncionario.setBounds(30, 90, 46, 30);
        getContentPane().add(jNomeFuncionario);
        jNomeFuncionario.setBounds(30, 140, 320, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 120, 38, 15);

        codFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codFuncionario.setText("Cod:");
        getContentPane().add(codFuncionario);
        codFuncionario.setBounds(30, 70, 40, 15);

        jcpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcpfFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jcpfFuncionario);
        jcpfFuncionario.setBounds(30, 190, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CPF:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 170, 26, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Data Nascimento:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 170, 107, 15);
        getContentPane().add(CampoNascimentoFuncionario);
        CampoNascimentoFuncionario.setBounds(220, 190, 136, 30);

        estCivilFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        estCivilFuncionario.setText("Estado Civil:");
        getContentPane().add(estCivilFuncionario);
        estCivilFuncionario.setBounds(220, 220, 74, 15);

        combFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro (a)", "Casado (a)", "Viúvo (a)", "Separado (a)" }));
        getContentPane().add(combFuncionario);
        combFuncionario.setBounds(220, 250, 140, 30);
        getContentPane().add(rgfunc);
        rgfunc.setBounds(30, 250, 170, 30);
        getContentPane().add(CampoProfissao);
        CampoProfissao.setBounds(30, 300, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Cargo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 280, 40, 15);
        getContentPane().add(campoTel);
        campoTel.setBounds(30, 350, 170, 30);

        jTelFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTelFuncionario.setText("Telefone:");
        getContentPane().add(jTelFuncionario);
        jTelFuncionario.setBounds(30, 330, 56, 15);
        getContentPane().add(Campomail);
        Campomail.setBounds(30, 400, 170, 30);

        EmailFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmailFuncionario.setText("E-mail:");
        getContentPane().add(EmailFuncionario);
        EmailFuncionario.setBounds(30, 380, 40, 15);
        getContentPane().add(jtxtSexo);
        jtxtSexo.setBounds(320, 300, 30, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Sexo M/F:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 300, 62, 15);

        RGFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RGFuncionario.setText("RG:");
        getContentPane().add(RGFuncionario);
        RGFuncionario.setBounds(30, 230, 21, 15);
        getContentPane().add(TextRua);
        TextRua.setBounds(410, 90, 310, 30);

        ruaFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ruaFuncionario.setText("Rua:");
        getContentPane().add(ruaFuncionario);
        ruaFuncionario.setBounds(410, 70, 28, 15);

        bairroFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bairroFuncionario.setText("Bairro:");
        getContentPane().add(bairroFuncionario);
        bairroFuncionario.setBounds(410, 120, 40, 15);
        getContentPane().add(TextN);
        TextN.setBounds(410, 190, 130, 30);

        nFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nFuncionario.setText("Nº");
        getContentPane().add(nFuncionario);
        nFuncionario.setBounds(410, 170, 14, 15);
        getContentPane().add(TextBairro);
        TextBairro.setBounds(410, 140, 132, 30);
        getContentPane().add(TextCidade);
        TextCidade.setBounds(560, 140, 160, 30);

        CidFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CidFuncionario.setText("Cidade:");
        getContentPane().add(CidFuncionario);
        CidFuncionario.setBounds(560, 120, 45, 15);
        getContentPane().add(TextComplemento);
        TextComplemento.setBounds(560, 190, 160, 30);

        complementoFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        complementoFuncionario.setText("Complemento:");
        getContentPane().add(complementoFuncionario);
        complementoFuncionario.setBounds(560, 170, 117, 15);
        getContentPane().add(TextUF);
        TextUF.setBounds(410, 240, 36, 30);
        getContentPane().add(TextCep);
        TextCep.setBounds(560, 240, 160, 30);

        CEPFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CEPFuncionario.setText("CEP:");
        getContentPane().add(CEPFuncionario);
        CEPFuncionario.setBounds(560, 220, 27, 15);

        ufFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ufFuncionario.setText("UF:");
        getContentPane().add(ufFuncionario);
        ufFuncionario.setBounds(410, 220, 18, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cadastrar Senha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 320, 105, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 340, 42, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Confirmar Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 370, 106, 15);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(560, 320, 160, 30);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(560, 360, 160, 30);

        jButton3.setText("Alterar senha");
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 440, 110, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/imagens/zzzz.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 780, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcpfFuncionarioActionPerformed

    private void CadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFuncionarioActionPerformed
//        LimparTodosCampos lp = new LimparTodosCampos();
//        lp.limpar(rootPane);
        String mensagem = "";
        mensagem = consisteCampos(evt);

        if (mensagem.length() > 0) {
            JOptionPane.showMessageDialog(this, mensagem);
            jNomeFuncionario.requestFocus();
        } else {
            PreparedStatement ps = null;
            try {
                Conexao.conectar();
                String SqlInsertPessoa = "INSERT INTO tabela_pessoa( pes_CPF,pes_Nome, pes_data_nascimento, "
                        + " pes_RG, pes_Telefone,pes_log_rua,pes_complemento,pes_log_UF,"
                        + "pes_log_bairro,pes_log_CEP,pes_cidade,pes_EstadoCivil,pes_sexo)VALUES"
                        + "('" + jcpfFuncionario.getText()
                        + "','" + jNomeFuncionario.getText()
                        + "','" + CampoNascimentoFuncionario.getText()
                        + "','" + rgfunc.getText()
                        + "','" + campoTel.getText()
                        + "','" + TextRua.getText()
                        + "','" + TextComplemento.getText()
                        + "','" + TextUF.getText()
                        + "','" + TextBairro.getText()
                        + "','" + TextCep.getText()
                        + "','" + TextCidade.getText()
                        + "','" + combFuncionario.getSelectedItem()
                        + "','" + jtxtSexo.getText() + "')";

                String SqlInsertSocio = "INSERT INTO tabela_funcionario(pes_CPF, cargo, tipo, senha )VALUES"
                        + "('" + jcpfFuncionario.getText()
                        + "','" + CampoProfissao.getText()
                        + "','" + jComboBox1TipoFuncionario.getSelectedItem()
                        + "','" + jPasswordField1.getText()
                        + "')";

                ps = Conexao.con.prepareStatement(SqlInsertPessoa);
                ps.executeUpdate();

                ps = Conexao.con.prepareStatement(SqlInsertSocio);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                limpar.limpar(rootPane);
                capturarCodigo();

//                new CadastroDependentes().codSocio = Integer.parseInt(CampoCod.getText());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            } finally {
                try {
                    Conexao.con.close();
                    ps.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_CadastrarFuncionarioActionPerformed

    private void VoltarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarFuncionarioActionPerformed
        new jfrmLogin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_VoltarFuncionarioActionPerformed

    // Método que captura o código que é auto_increment no banco
    public void capturarCodigo() {
        PreparedStatement ps = null;
        int cod = 0;
        try {
            Conexao.conectar();
            String sql = "SELECT Max(codFuncionario) FROM tabela_funcionario;";
            ps = Conexao.con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery(sql);
            if (rs.next()) {
                if ((rs.getString("Max(codFuncionario)")) == null) {
                    cofFuncionario.setText("1");
                } else {
                    cod = Integer.parseInt(rs.getString("Max(codFuncionario)")) + 1;
                    cofFuncionario.setText(String.valueOf(cod));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } finally {
            try {
                Conexao.con.close();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }// fim do método capturaCodigo
    }

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEPFuncionario;
    private javax.swing.JButton CadastrarFuncionario;
    private javax.swing.JTextField CampoNascimentoFuncionario;
    private javax.swing.JTextField CampoProfissao;
    private javax.swing.JTextField Campomail;
    private javax.swing.JLabel CidFuncionario;
    private javax.swing.JLabel EmailFuncionario;
    private javax.swing.JLabel RGFuncionario;
    private javax.swing.JTextField TextBairro;
    private javax.swing.JTextField TextCep;
    private javax.swing.JTextField TextCidade;
    private javax.swing.JTextField TextComplemento;
    private javax.swing.JTextField TextN;
    private javax.swing.JTextField TextRua;
    private javax.swing.JTextField TextUF;
    private javax.swing.JButton VoltarFuncionario;
    private javax.swing.JLabel bairroFuncionario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campoTel;
    private javax.swing.JLabel codFuncionario;
    private javax.swing.JTextField cofFuncionario;
    private javax.swing.JComboBox combFuncionario;
    private javax.swing.JLabel complementoFuncionario;
    private javax.swing.JLabel estCivilFuncionario;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1TipoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeFuncionario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel jTelFuncionario;
    private javax.swing.JTextField jcpfFuncionario;
    private javax.swing.JTextField jtxtSexo;
    private javax.swing.JLabel nFuncionario;
    private javax.swing.JTextField rgfunc;
    private javax.swing.JLabel ruaFuncionario;
    private javax.swing.JLabel ufFuncionario;
    // End of variables declaration//GEN-END:variables

    LimparTodosCampos limpar = new LimparTodosCampos();
}
