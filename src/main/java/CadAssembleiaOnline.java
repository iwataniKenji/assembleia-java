// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadAssembleiaOnline extends javax.swing.JFrame {
    
    // para uso nos botões
    private Online online;
    private static GerAssembleiaOnline gerAssembleia = new GerAssembleiaOnline();
    
    private static CadAssembleiaOnline cadAssembleiaOnlineUnico;

    public CadAssembleiaOnline() {
        initComponents();
    }
    
    public static CadAssembleiaOnline getCadAssembleiaOnline() {
        if (cadAssembleiaOnlineUnico == null) {
            cadAssembleiaOnlineUnico = new CadAssembleiaOnline();
        }
        return cadAssembleiaOnlineUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        labelTitulo = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNomeDaEmpresa = new javax.swing.JLabel();
        labelNomeDoOperador = new javax.swing.JLabel();
        labelCodOnline = new javax.swing.JLabel();
        labelLinkAcesso = new javax.swing.JLabel();
        labelPlataformaUtilizada = new javax.swing.JLabel();
        textfieldId = new javax.swing.JTextField();
        textfieldNomeDaEmpresa = new javax.swing.JTextField();
        textfieldNomeDoOperador = new javax.swing.JTextField();
        textfieldCodOnline = new javax.swing.JTextField();
        textfieldLinkAcesso = new javax.swing.JTextField();
        textfieldPlataformaUtilizada = new javax.swing.JTextField();
        buttonLimpar = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonConsultar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAssembleia = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Assembleias Híbridas");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        labelTitulo.setText("CADASTRO DE ASSEMBLEIAS ONLINE");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelId.setText("ID:");

        labelNomeDaEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDaEmpresa.setText("NOME DA EMPRESA:");

        labelNomeDoOperador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDoOperador.setText("NOME DO OPERADOR:");

        labelCodOnline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCodOnline.setText("CÓDIGO ONLINE:");

        labelLinkAcesso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLinkAcesso.setText("LINK DE ACESSO:");

        labelPlataformaUtilizada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPlataformaUtilizada.setText("PLATAFORMA UTILIZADA:");

        textfieldNomeDaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDaEmpresaActionPerformed(evt);
            }
        });

        textfieldCodOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCodOnlineActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonConsultar.setText("Consultar por ID");
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Alterar nome da empresa pelo ID");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonExcluir.setText("Excluir pelo ID");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        tableAssembleia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "EMPRESA", "OPERADOR", "CODIGO", "LINK", "PLATAFORMA"
            }
        ));
        jScrollPane1.setViewportView(tableAssembleia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonExcluir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelId)
                                        .addComponent(labelCodOnline)
                                        .addComponent(labelLinkAcesso)
                                        .addComponent(labelPlataformaUtilizada)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNomeDoOperador, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelNomeDaEmpresa)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textfieldPlataformaUtilizada)
                                        .addComponent(textfieldNomeDaEmpresa)
                                        .addComponent(textfieldNomeDoOperador)
                                        .addComponent(textfieldId)
                                        .addComponent(textfieldCodOnline)
                                        .addComponent(textfieldLinkAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonLimpar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonSair))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelId)
                    .addComponent(textfieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDaEmpresa)
                    .addComponent(textfieldNomeDaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDoOperador)
                    .addComponent(textfieldNomeDoOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodOnline)
                    .addComponent(textfieldCodOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLinkAcesso)
                    .addComponent(textfieldLinkAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPlataformaUtilizada)
                    .addComponent(textfieldPlataformaUtilizada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonConsultar)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSair)
                    .addComponent(buttonLimpar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        limparTextfield();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        sair();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void textfieldNomeDaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldNomeDaEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNomeDaEmpresaActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        cadastrarAssembleia();
        listarTabela();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        consultarAssembleia();
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        alterarAssembleia();
        listarTabela();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        excluirAssembleia();
        listarTabela();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void textfieldCodOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCodOnlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCodOnlineActionPerformed

    public void excluirAssembleia() {
        online = new Online();
        
        try {
            online.setId(Integer.parseInt(textfieldId.getText()));
            
            online = gerAssembleia.consAssembleiaById(online);
        
            if (online != null) {
                textfieldId.setText(Integer.toString(online.getId()));
                textfieldNomeDaEmpresa.setText(online.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(online.getNomeDoOperador());
                textfieldCodOnline.setText(Integer.toString(online.getCodOnline()));
                textfieldLinkAcesso.setText(online.getLinkAcesso());
                textfieldPlataformaUtilizada.setText(online.getPlataformaUtilizada());

                int opcao = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir essa assembleia?",
                    "Confirmação de exclusão",
                    JOptionPane.YES_NO_CANCEL_OPTION
                );
                
                if (opcao == 0) {
                    gerAssembleia.removeAssembleiaById(online);
                    
                    JOptionPane.showMessageDialog(
                        null,
                        "Assembleia online excluida com sucesso",
                        "Exclusão de assembleia online",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    limparTextfield();
                }
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia online com esse ID",
                    "ID inexistente",
                    JOptionPane.ERROR_MESSAGE
                );
                limparTextfield();
            }
        } catch (NumberFormatException | NegativeNumberException nfe) {
            JOptionPane.showMessageDialog(
                null,
                "O ID deve ser um número inteiro válido",
                "Erro de cadastro",
                JOptionPane.ERROR_MESSAGE
            );
            textfieldId.setText("");
            textfieldId.requestFocus();
        }
    }
    
    public void alterarAssembleia() {
        online = new Online();
        
        try {
            online.setId(Integer.parseInt(textfieldId.getText()));
            
            online = gerAssembleia.atualizaAssembleiaById(online);
        
            if (online != null) {
                textfieldId.setText(Integer.toString(online.getId()));
                textfieldNomeDaEmpresa.setText(online.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(online.getNomeDoOperador());
                textfieldCodOnline.setText(Integer.toString(online.getCodOnline()));
                textfieldLinkAcesso.setText(online.getLinkAcesso());
                textfieldPlataformaUtilizada.setText(online.getPlataformaUtilizada());

                JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados atualizados da assembleia online",
                    "Atualização de assembleia online",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia online com esse ID",
                    "ID inexistente",
                    JOptionPane.ERROR_MESSAGE
                );
                limparTextfield();
            }
        } catch (NumberFormatException | NegativeNumberException nfe) {
            JOptionPane.showMessageDialog(
                null,
                "O ID deve ser um número inteiro válido",
                "Erro de cadastro",
                JOptionPane.ERROR_MESSAGE
            );
            textfieldId.setText("");
            textfieldId.requestFocus();
        }
    }
    
    public void listarTabela() {
        // estrutura da table
        DefaultTableModel modelo = (DefaultTableModel) tableAssembleia.getModel();
        
        int posicaoLinha = 0;
        
        // setta linha da table
        modelo.setRowCount(posicaoLinha);
        
        // percorre cada pessoa
        for (Online online : gerAssembleia.getBdAssembleia()) {
            modelo.insertRow(posicaoLinha, new Object [] {
                online.getId(),
                online.getNomeDaEmpresa(),
                online.getNomeDoOperador(),
                online.getCodOnline(),
                online.getLinkAcesso(),
                online.getPlataformaUtilizada()
            });
            posicaoLinha++;
        }
    } 
            
    public void consultarAssembleia() {
        online = new Online();
        
        try {
            online.setId(Integer.parseInt(textfieldId.getText()));
            
            online = gerAssembleia.consAssembleiaById(online);
        
            if (online != null) {
                textfieldId.setText(Integer.toString(online.getId()));
                textfieldNomeDaEmpresa.setText(online.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(online.getNomeDoOperador());
                textfieldCodOnline.setText(Integer.toString(online.getCodOnline()));
                textfieldLinkAcesso.setText(online.getLinkAcesso());
                textfieldPlataformaUtilizada.setText(online.getPlataformaUtilizada());

                JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados da assembleia online",
                    "Confirmação de dados",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia online com esse ID",
                    "ID inexistente",
                    JOptionPane.ERROR_MESSAGE
                );
                limparTextfield();
            }
        } catch (NumberFormatException | NegativeNumberException nfe) {
            JOptionPane.showMessageDialog(
                null,
                "O ID deve ser um número inteiro válido",
                "Erro de cadastro",
                JOptionPane.ERROR_MESSAGE
            );
            textfieldId.setText("");
            textfieldId.requestFocus();
        }
    }
    
    public void cadastrarAssembleia() {
        online = new Online();
        
        try {
            online.setId(Integer.parseInt(textfieldId.getText()));
            online.setNomeDaEmpresa(textfieldNomeDaEmpresa.getText());
            online.setNomeDoOperador(textfieldNomeDoOperador.getText());
            online.setCodOnline(Integer.parseInt(textfieldCodOnline.getText()));
            online.setLinkAcesso(textfieldLinkAcesso.getText());
            online.setPlataformaUtilizada(textfieldPlataformaUtilizada.getText());
            
            // faz cadastro no gerenciador
            online = gerAssembleia.cadAssembleia(online);
            
            if (online != null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Assembleia online cadastrada com sucesso",
                    "Cadastro feito",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Já existe uma assembleia online com esse ID",
                    "Erro de ID",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (NumberFormatException | NegativeNumberException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "O ID deve ser um número inteiro válido",
                    "Erro de cadastro",
                    JOptionPane.ERROR_MESSAGE
            );
            textfieldId.setText("");
            textfieldId.requestFocus();
        }
    }
    
    public void limparTextfield() {
        textfieldId.setText("");
        textfieldNomeDaEmpresa.setText("");
        textfieldNomeDoOperador.setText("");
        textfieldCodOnline.setText("");
        textfieldLinkAcesso.setText("");
        textfieldPlataformaUtilizada.setText("");
        
        // recuperar foco na caixa que chamou o método
        textfieldId.requestFocus();
    }
    
    public void sair() {
        int response = JOptionPane.showConfirmDialog(
            null,
            "Deseja fechar o cadastro?",
            "Sair",
            JOptionPane.YES_NO_CANCEL_OPTION
        );
        
        if (response == 0) {
            // this -> próprio botão
            this.dispose();
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadAssembleiaHibrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadAssembleiaHibrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadAssembleiaHibrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadAssembleiaHibrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAssembleiaOnline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodOnline;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLinkAcesso;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelNomeDoOperador;
    private javax.swing.JLabel labelPlataformaUtilizada;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableAssembleia;
    private javax.swing.JTextField textfieldCodOnline;
    private javax.swing.JTextField textfieldId;
    private javax.swing.JTextField textfieldLinkAcesso;
    private javax.swing.JTextField textfieldNomeDaEmpresa;
    private javax.swing.JTextField textfieldNomeDoOperador;
    private javax.swing.JTextField textfieldPlataformaUtilizada;
    // End of variables declaration//GEN-END:variables
}
