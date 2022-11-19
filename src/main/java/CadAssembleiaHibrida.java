// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadAssembleiaHibrida extends javax.swing.JFrame {
    
    // para uso nos botões
    private Hibrida hibrida;
    private static GerAssembleiaHibrida gerAssembleia = new GerAssembleiaHibrida();
    
    private static CadAssembleiaHibrida cadAssembleiaHibridaUnico;

    public CadAssembleiaHibrida() {
        initComponents();
    }
    
    public static CadAssembleiaHibrida getCadAssembleiaHibrida() {
        if (cadAssembleiaHibridaUnico == null) {
            cadAssembleiaHibridaUnico = new CadAssembleiaHibrida();
        }
        return cadAssembleiaHibridaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        labelTitulo = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNomeDaEmpresa = new javax.swing.JLabel();
        labelNomeDoOperador = new javax.swing.JLabel();
        labelCodHibrida = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelLinkAcesso = new javax.swing.JLabel();
        textfieldId = new javax.swing.JTextField();
        textfieldNomeDaEmpresa = new javax.swing.JTextField();
        textfieldNomeDoOperador = new javax.swing.JTextField();
        textfieldCodHibrida = new javax.swing.JTextField();
        textfieldEndereco = new javax.swing.JTextField();
        textfieldLinkAcesso = new javax.swing.JTextField();
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
        labelTitulo.setText("CADASTRO DE ASSEMBLEIAS HÍBRIDAS");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelId.setText("ID:");

        labelNomeDaEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDaEmpresa.setText("NOME DA EMPRESA:");

        labelNomeDoOperador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDoOperador.setText("NOME DO OPERADOR:");

        labelCodHibrida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCodHibrida.setText("CÓDIGO HÍBRIDA:");

        labelEndereco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEndereco.setText("ENDEREÇO:");

        labelLinkAcesso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLinkAcesso.setText("LINK DE ACESSO:");

        textfieldNomeDaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDaEmpresaActionPerformed(evt);
            }
        });

        textfieldCodHibrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCodHibridaActionPerformed(evt);
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

        buttonAlterar.setText("Alterar pelo ID");
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
                "ID", "EMPRESA", "OPERADOR", "CODIGO", "ENDEREÇO", "LINK"
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonConsultar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonAlterar))
                                    .addComponent(labelId)
                                    .addComponent(labelCodHibrida)
                                    .addComponent(labelEndereco)
                                    .addComponent(labelLinkAcesso)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNomeDoOperador, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelNomeDaEmpresa)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonExcluir)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textfieldLinkAcesso)
                                            .addComponent(textfieldNomeDaEmpresa)
                                            .addComponent(textfieldNomeDoOperador)
                                            .addComponent(textfieldId)
                                            .addComponent(textfieldCodHibrida)
                                            .addComponent(textfieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonLimpar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonSair))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))))
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
                    .addComponent(labelCodHibrida)
                    .addComponent(textfieldCodHibrida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textfieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLinkAcesso)
                    .addComponent(textfieldLinkAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void textfieldCodHibridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCodHibridaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCodHibridaActionPerformed

    public void excluirAssembleia() {
        hibrida = new Hibrida();
        
        try {
            hibrida.setId(Integer.parseInt(textfieldId.getText()));
            
            hibrida = gerAssembleia.consAssembleiaById(hibrida);
        
            if (hibrida != null) {
                textfieldId.setText(Integer.toString(hibrida.getId()));
                textfieldNomeDaEmpresa.setText(hibrida.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(hibrida.getNomeDoOperador());
                textfieldCodHibrida.setText(Integer.toString(hibrida.getCodHibrida()));
                textfieldEndereco.setText(hibrida.getEndereco());
                textfieldLinkAcesso.setText(hibrida.getLinkAcesso());

                int opcao = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir essa assembleia?",
                    "Confirmação de exclusão",
                    JOptionPane.YES_NO_CANCEL_OPTION
                );
                
                if (opcao == 0) {
                    gerAssembleia.removeAssembleiaById(hibrida);
                    
                    JOptionPane.showMessageDialog(
                        null,
                        "Assembleia híbrida excluida com sucesso",
                        "Exclusão de assembleia híbrida",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    limparTextfield();
                }
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia híbrida com esse ID",
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
        hibrida = new Hibrida();
        
        try {
            hibrida.setId(Integer.parseInt(textfieldId.getText()));
            
            hibrida = gerAssembleia.atualizaAssembleiaById(hibrida);
        
            if (hibrida != null) {
                textfieldId.setText(Integer.toString(hibrida.getId()));
                textfieldNomeDaEmpresa.setText(hibrida.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(hibrida.getNomeDoOperador());
                textfieldCodHibrida.setText(Integer.toString(hibrida.getCodHibrida()));
                textfieldEndereco.setText(hibrida.getEndereco());
                textfieldLinkAcesso.setText(hibrida.getLinkAcesso());

                JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados atualizados da assembleia híbrida",
                    "Atualização de assembleia híbrida",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia híbrida com esse ID",
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
        for (Hibrida hibrida : gerAssembleia.getBdAssembleia()) {
            modelo.insertRow(posicaoLinha, new Object [] {
                hibrida.getId(),
                hibrida.getNomeDaEmpresa(),
                hibrida.getNomeDoOperador(),
                hibrida.getCodHibrida(),
                hibrida.getEndereco(),
                hibrida.getLinkAcesso()
            });
            posicaoLinha++;
        }
    } 
            
    public void consultarAssembleia() {
        hibrida = new Hibrida();
        
        try {
            hibrida.setId(Integer.parseInt(textfieldId.getText()));
            
            hibrida = gerAssembleia.consAssembleiaById(hibrida);
        
            if (hibrida != null) {
                textfieldId.setText(Integer.toString(hibrida.getId()));
                textfieldNomeDaEmpresa.setText(hibrida.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(hibrida.getNomeDoOperador());
                textfieldCodHibrida.setText(Integer.toString(hibrida.getCodHibrida()));
                textfieldEndereco.setText(hibrida.getEndereco());
                textfieldLinkAcesso.setText(hibrida.getLinkAcesso());

                JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados da assembleia híbrida",
                    "Confirmação de dados",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia híbrida com esse ID",
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
        hibrida = new Hibrida();
        
        try {
            hibrida.setId(Integer.parseInt(textfieldId.getText()));
            hibrida.setNomeDaEmpresa(textfieldNomeDaEmpresa.getText());
            hibrida.setNomeDoOperador(textfieldNomeDoOperador.getText());
            hibrida.setCodHibrida(Integer.parseInt(textfieldCodHibrida.getText()));
            hibrida.setEndereco(textfieldEndereco.getText());
            hibrida.setLinkAcesso(textfieldLinkAcesso.getText());
            
            // faz cadastro no gerenciador
            hibrida = gerAssembleia.cadAssembleia(hibrida);
            
            if (hibrida != null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Assembleia híbrida cadastrada com sucesso",
                    "Cadastro feito",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Já existe uma assembleia híbrida com esse ID",
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
        textfieldCodHibrida.setText("");
        textfieldEndereco.setText("");
        textfieldLinkAcesso.setText("");
        
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
                new CadAssembleiaHibrida().setVisible(true);
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
    private javax.swing.JLabel labelCodHibrida;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLinkAcesso;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelNomeDoOperador;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableAssembleia;
    private javax.swing.JTextField textfieldCodHibrida;
    private javax.swing.JTextField textfieldEndereco;
    private javax.swing.JTextField textfieldId;
    private javax.swing.JTextField textfieldLinkAcesso;
    private javax.swing.JTextField textfieldNomeDaEmpresa;
    private javax.swing.JTextField textfieldNomeDoOperador;
    // End of variables declaration//GEN-END:variables
}
