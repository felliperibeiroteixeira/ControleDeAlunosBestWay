/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package formularios;

import conexao.ConexaoDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Fellipe Ribeiro Teixeira
 */
public class FrmAlunos extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form FrmOperaçoes
     */
    public FrmAlunos() {
        initComponents();
        conexao = ConexaoDAO.conector();
        System.out.println(conexao);
    }

    String forma;

    private void LimparCampos() {
        txtIDAluno.setText(null);
        txtNome.setText(null);
        txtTelefone.setText(null);
        txtDVencimento.setText(null);
        cdsOutro.setSelected(true);
        txtEmail.setText(null);
        txtIDBCurso.setText(null);
        txtCurso.setText(null);
        txtObs.setText(null);
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
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        txtDVencimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIDBCurso = new javax.swing.JTextField();
        lblIDBCurso = new javax.swing.JLabel();
        btnBCurso = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        cdsCartao = new javax.swing.JCheckBox();
        cdsBoleto = new javax.swing.JCheckBox();
        cdsOutro = new javax.swing.JCheckBox();
        lblIDAluno = new javax.swing.JLabel();
        txtIDAluno = new javax.swing.JTextField();
        txtBAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Alunos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setText("Aluno:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("E-mail:");

        txtCurso.setEnabled(false);

        jLabel5.setText("Dia de vencimento:");

        lblIDBCurso.setText("ID do curso:");

        btnBCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit-find.png"))); // NOI18N
        btnBCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBCursoActionPerformed(evt);
            }
        });

        jLabel8.setText("Forma de pagamento:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/media-floppy.png"))); // NOI18N
        btnCadastrar.setText("Salvar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/view-refresh.png"))); // NOI18N
        btnAlterar.setText("Atualizar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/process-stop.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        buttonGroup1.add(cdsCartao);
        cdsCartao.setText("Cartão");
        cdsCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdsCartaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(cdsBoleto);
        cdsBoleto.setText("Boleto");
        cdsBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdsBoletoActionPerformed(evt);
            }
        });

        buttonGroup1.add(cdsOutro);
        cdsOutro.setText("Outro");

        lblIDAluno.setText("ID do aluno:");

        txtBAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/edit-find.png"))); // NOI18N
        txtBAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBAlunoActionPerformed(evt);
            }
        });

        jLabel1.setText("Observação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIDAluno)
                    .addComponent(lblNome)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIDAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBAluno)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblIDBCurso)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIDBCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBCurso)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cdsCartao)
                                        .addGap(18, 18, 18)
                                        .addComponent(cdsBoleto)
                                        .addGap(18, 18, 18)
                                        .addComponent(cdsOutro))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrar))))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDAluno)
                    .addComponent(txtIDAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBAluno)
                    .addComponent(txtDVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(cdsCartao)
                    .addComponent(cdsBoleto)
                    .addComponent(cdsOutro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIDBCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDBCurso)
                            .addComponent(btnBCurso)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlterar)
                        .addComponent(btnCadastrar)
                        .addComponent(btnLimpar)))
                .addGap(447, 447, 447))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(500, 300, 927, 230);
    }// </editor-fold>//GEN-END:initComponents

    private void cdsCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdsCartaoActionPerformed
        // TODO add your handling code here:
        forma = "Cartão";
    }//GEN-LAST:event_cdsCartaoActionPerformed

    private void cdsBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdsBoletoActionPerformed
        // TODO add your handling code here:
        forma = "Boleto";
    }//GEN-LAST:event_cdsBoletoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        cdsOutro.setSelected(true);
        forma = "";
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnBCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBCursoActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDBCurso.getText().isEmpty()) {
                lblIDBCurso.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Digite a ID do curso", "Atenção", JOptionPane.ERROR_MESSAGE);
            } else {
                lblIDBCurso.setForeground(Color.black);
                String sql = "select * from cursos where id = ?";
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtIDBCurso.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    txtCurso.setText(rs.getString(2));
                } else {
                    JOptionPane.showMessageDialog(null, "Curso não existente", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Dados não encontrados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBCursoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            if ((txtNome.getText().isEmpty()) || (txtIDBCurso.getText().isEmpty())) {
                if (txtNome.getText().isEmpty()) {
                    lblNome.setForeground(Color.red);
                } else {
                    lblNome.setForeground(Color.black);
                }
                if (txtIDBCurso.getText().isEmpty()) {
                    lblIDBCurso.setForeground(Color.red);
                } else {
                    lblIDBCurso.setForeground(Color.black);
                }
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios", "Atenção", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "insert into alunos(aluno, fone, email, id_curso, curso, dia_vencimento, forma_pagamento, obs) values(?, ?, ?, ?, ?, ?, ?, ?)";
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtNome.getText());
                pst.setString(2, txtTelefone.getText());
                pst.setString(3, txtEmail.getText());
                pst.setString(4, txtIDBCurso.getText());
                pst.setString(5, txtCurso.getText());
                pst.setString(6, txtDVencimento.getText());
                pst.setString(7, forma.toString());
                pst.setString(8, txtObs.getText());
                int cadastrado = pst.executeUpdate();
                System.out.println(cadastrado);
                if (cadastrado > 0) {
                    LimparCampos();
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro au cadastar", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtBAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBAlunoActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDAluno.getText().isEmpty()) {
                lblIDAluno.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Digite a ID do aluno", "Atenção", JOptionPane.ERROR_MESSAGE);
            } else {
                lblIDAluno.setForeground(Color.black);
                String sql = "select * from alunos where id = ?";
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txtIDAluno.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    txtNome.setText(rs.getString(2));
                    txtTelefone.setText(rs.getString(3));
                    txtEmail.setText(rs.getString(4));
                    txtIDBCurso.setText(rs.getString(5));                    
                    txtCurso.setText(rs.getString(6));
                    txtDVencimento.setText(rs.getString(7));                                        
                    String forma = rs.getString(8);
                    switch (forma) {
                        case "Cartão":
                            cdsCartao.setSelected(true);
                            cdsBoleto.setSelected(false);
                            cdsOutro.setSelected(false);
                            break;
                        case "Boleto":
                            cdsCartao.setSelected(false);
                            cdsBoleto.setSelected(true);
                            cdsOutro.setSelected(false);
                            break;
                        case "":
                            cdsCartao.setSelected(false);
                            cdsBoleto.setSelected(false);
                            cdsOutro.setSelected(true);
                            break;
                    }                                        
                    txtObs.setText(rs.getString(9));
                } else {
                    JOptionPane.showMessageDialog(null, "Aluno não cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Dados não encontrados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtBAlunoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        try {
            if ((txtNome.getText().isEmpty()) || (txtIDBCurso.getText().isEmpty())) {
                if (txtNome.getText().isEmpty()) {
                    lblNome.setForeground(Color.red);
                } else {
                    lblNome.setForeground(Color.black);
                }
                if (txtIDBCurso.getText().isEmpty()) {
                    lblIDBCurso.setForeground(Color.red);
                } else {
                    lblIDBCurso.setForeground(Color.black);
                }
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios", "Atenção", JOptionPane.ERROR_MESSAGE);
            } else {
                int confirma = JOptionPane.showConfirmDialog(null, "As informações deste aluno serão alteradas, deseja prosseguir?", "Atenção", JOptionPane.YES_NO_OPTION);
                if (confirma == JOptionPane.YES_OPTION) {
                    String sql = "update alunos set aluno = ?, fone = ?, email = ?, id_curso = ?, curso = ?, dia_vencimento = ?, forma_pagamento = ?, obs = ? where id = ?";
                    pst = conexao.prepareStatement(sql);
                    pst.setString(1, txtNome.getText());
                    pst.setString(2, txtTelefone.getText());
                    pst.setString(3, txtEmail.getText());
                    pst.setString(4, txtIDBCurso.getText());
                    pst.setString(5, txtCurso.getText());
                    pst.setString(6, txtDVencimento.getText());
                    pst.setString(7, forma.toString());
                    pst.setString(8, txtObs.getText());
                    pst.setString(9, txtIDAluno.getText());
                    int auterar = pst.executeUpdate();
                    System.out.println(auterar);
                    if (auterar > 0) {
                        JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBCurso;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cdsBoleto;
    private javax.swing.JCheckBox cdsCartao;
    private javax.swing.JCheckBox cdsOutro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIDAluno;
    private javax.swing.JLabel lblIDBCurso;
    private javax.swing.JLabel lblNome;
    private javax.swing.JButton txtBAluno;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDVencimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDAluno;
    private javax.swing.JTextField txtIDBCurso;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}