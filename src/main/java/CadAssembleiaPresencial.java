// NOME: KLEVERSON KENJI IWATANI
// CURSO: Análise e Desenvolvimento de Sistemas
// RA: 2465205

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadAssembleiaPresencial extends javax.swing.JFrame {
    
    // para uso nos botões
    private Presencial presencial;    
    private static CadAssembleiaPresencial cadAssembleiaPresencialUnico;

    private CadAssembleiaPresencial() {
        initComponents();
    }
    
    public static CadAssembleiaPresencial getCadAssembleiaPresencial() {
        if (cadAssembleiaPresencialUnico == null) {
            cadAssembleiaPresencialUnico = new CadAssembleiaPresencial();
        }
        return cadAssembleiaPresencialUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        labelTitulo = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNomeDaEmpresa = new javax.swing.JLabel();
        labelNomeDoOperador = new javax.swing.JLabel();
        labelCodPresencial = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelCapacidadePessoasSalao = new javax.swing.JLabel();
        textfieldId = new javax.swing.JTextField();
        textfieldNomeDaEmpresa = new javax.swing.JTextField();
        textfieldNomeDoOperador = new javax.swing.JTextField();
        textfieldCodPresencial = new javax.swing.JTextField();
        textfieldEndereco = new javax.swing.JTextField();
        textfieldCapacidadePessoasSalao = new javax.swing.JTextField();
        buttonLimpar = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonConsultar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAssembleia = new javax.swing.JTable();
        comboAssembleia = new javax.swing.JComboBox<>();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Assembleias Híbridas");

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        labelTitulo.setText("CADASTRO DE ASSEMBLEIAS PRESENCIAIS");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelId.setText("ID:");

        labelNomeDaEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDaEmpresa.setText("NOME DA EMPRESA:");

        labelNomeDoOperador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDoOperador.setText("NOME DO OPERADOR:");

        labelCodPresencial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCodPresencial.setText("CÓDIGO PRESENCIAL:");

        labelEndereco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEndereco.setText("ENDEREÇO:");

        labelCapacidadePessoasSalao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCapacidadePessoasSalao.setText("CAPACIDADE DE PESSOAS NO SALÃO:");

        textfieldNomeDaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDaEmpresaActionPerformed(evt);
            }
        });

        textfieldCodPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCodPresencialActionPerformed(evt);
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
                "ID", "EMPRESA", "OPERADOR", "CODIGO", "ENDEREÇO", "CAP. PESSOAS"
            }
        ));
        tableAssembleia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAssembleiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAssembleia);

        comboAssembleia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAssembleiaActionPerformed(evt);
            }
        });

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
                                        .addComponent(labelCodPresencial)
                                        .addComponent(labelEndereco)
                                        .addComponent(labelCapacidadePessoasSalao)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNomeDoOperador, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelNomeDaEmpresa)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textfieldCapacidadePessoasSalao)
                                        .addComponent(textfieldNomeDaEmpresa)
                                        .addComponent(textfieldNomeDoOperador)
                                        .addComponent(textfieldId)
                                        .addComponent(textfieldCodPresencial)
                                        .addComponent(textfieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(comboAssembleia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
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
                    .addComponent(labelCodPresencial)
                    .addComponent(textfieldCodPresencial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textfieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCapacidadePessoasSalao)
                    .addComponent(textfieldCapacidadePessoasSalao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(buttonLimpar)
                    .addComponent(comboAssembleia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        carregaComboAssembleia();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        consultarAssembleia();
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        alterarAssembleia();
        listarTabela();
        carregaComboAssembleia();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        excluirAssembleia();
        listarTabela();
        carregaComboAssembleia();
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void textfieldCodPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCodPresencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCodPresencialActionPerformed

    private void comboAssembleiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAssembleiaActionPerformed
        selectComboAssembleia();
    }//GEN-LAST:event_comboAssembleiaActionPerformed

    private void tableAssembleiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAssembleiaMouseClicked
        selectTableAssembeia();
    }//GEN-LAST:event_tableAssembleiaMouseClicked

    public void listarTabela() {
        // estrutura da table
        DefaultTableModel modelo = (DefaultTableModel) tableAssembleia.getModel();
        
        int posicaoLinha = 0;
        
        // setta linha da table
        modelo.setRowCount(posicaoLinha);
        
        // percorre cada pessoa
         for(Presencial presencial : GerAssembleiaPresencial.getGerAssembleia().getBdAssembleia()){
            modelo.insertRow(posicaoLinha, new Object [] {
                presencial.getId(),
                presencial.getNomeDaEmpresa(),
                presencial.getNomeDoOperador(),
                presencial.getCodPresencial(),
                presencial.getEndereco(),
                presencial.getCapacidadePessoasSalao()
            });
            posicaoLinha++;
        }
    } 

    public void selectTableAssembeia(){
        String valLin = "";
        int posicaoLinha = tableAssembleia.getSelectedRow();
        
        for(int coluna = 0; coluna < tableAssembleia.getColumnCount(); coluna++){
            valLin += tableAssembleia.getModel().getValueAt(posicaoLinha, coluna).toString();
            if(coluna+1 < tableAssembleia.getColumnCount()){
                valLin += " - ";
            }
        }
    
        JOptionPane.showMessageDialog(
            null,
            "Dados selecionados foram \n" + valLin,
            "Seleção em Tabela",
            1
        );
    }

    public void carregaComboAssembleia(){
        comboAssembleia.removeAllItems();
        comboAssembleia.addItem("Escolha uma assembleia");
        
        for (Presencial presencial : GerAssembleiaPresencial.getGerAssembleia().getBdAssembleia()){
            comboAssembleia.addItem("ID: "+presencial.getId()+ " - EMPRESA: "+presencial.getNomeDaEmpresa()+ " - OPERADOR: "+presencial.getNomeDoOperador());
        }
    }

    public void selectComboAssembleia(){
        if(comboAssembleia.getSelectedIndex()>=1){
            String valLin = comboAssembleia.getSelectedItem().toString();
            JOptionPane.showMessageDialog(
                    null,
                    "Assembleia escolhida: \n" + valLin,
                    "Seleção de assembleia",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public void excluirAssembleia() {
        presencial = new Presencial();
        
        try {
            presencial.setId(Integer.parseInt(textfieldId.getText()));
            
            presencial = GerAssembleiaPresencial.getGerAssembleia().consAssembleiaById(presencial);
        
            if (presencial != null) {
                textfieldId.setText(Integer.toString(presencial.getId()));
                textfieldNomeDaEmpresa.setText(presencial.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(presencial.getNomeDoOperador());
                textfieldCodPresencial.setText(Integer.toString(presencial.getCodPresencial()));
                textfieldEndereco.setText(presencial.getEndereco());
                textfieldCapacidadePessoasSalao.setText(Integer.toString(presencial.getCapacidadePessoasSalao()));

                int opcao = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir essa assembleia?",
                    "Confirmação de exclusão",
                    JOptionPane.YES_NO_CANCEL_OPTION
                );
                
                if (opcao == 0) {
                    GerAssembleiaPresencial.getGerAssembleia().removeAssembleiaById(presencial);
                    
                    JOptionPane.showMessageDialog(
                        null,
                        "Assembleia presencial excluida com sucesso",
                        "Exclusão de assembleia presencial",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    limparTextfield();
                }
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia presencial com esse ID",
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
        presencial = new Presencial();
        
        try {
            presencial.setId(Integer.parseInt(textfieldId.getText()));
            
            presencial = GerAssembleiaPresencial.getGerAssembleia().atualizaAssembleiaById(presencial);
        
            if (presencial != null) {
                textfieldId.setText(Integer.toString(presencial.getId()));
                textfieldNomeDaEmpresa.setText(presencial.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(presencial.getNomeDoOperador());
                textfieldCodPresencial.setText(Integer.toString(presencial.getCodPresencial()));
                textfieldEndereco.setText(presencial.getEndereco());
                textfieldCapacidadePessoasSalao.setText(Integer.toString(presencial.getCapacidadePessoasSalao()));

                JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados atualizados da assembleia presencial",
                    "Atualização de assembleia presencial",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia presencial com esse ID",
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
            
    public void consultarAssembleia() {
        presencial = new Presencial();
        
        try {
            presencial.setId(Integer.parseInt(textfieldId.getText()));
            
            presencial = GerAssembleiaPresencial.getGerAssembleia().consAssembleiaById(presencial);
        
            if (presencial != null) {
                textfieldId.setText(Integer.toString(presencial.getId()));
                textfieldNomeDaEmpresa.setText(presencial.getNomeDaEmpresa());
                textfieldNomeDoOperador.setText(presencial.getNomeDoOperador());
                textfieldCodPresencial.setText(Integer.toString(presencial.getCodPresencial()));
                textfieldEndereco.setText(presencial.getEndereco());
                textfieldCapacidadePessoasSalao.setText(Integer.toString(presencial.getCapacidadePessoasSalao()));

                JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados da assembleia presencial",
                    "Confirmação de dados",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Não existe assembleia presencial com esse ID",
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
        presencial = new Presencial();
        
        try {
            presencial.setId(Integer.parseInt(textfieldId.getText()));
            presencial.setNomeDaEmpresa(textfieldNomeDaEmpresa.getText());
            presencial.setNomeDoOperador(textfieldNomeDoOperador.getText());
            presencial.setCodPresencial(Integer.parseInt(textfieldCodPresencial.getText()));
            presencial.setEndereco(textfieldEndereco.getText());
            presencial.setCapacidadePessoasSalao(Integer.parseInt(textfieldCapacidadePessoasSalao.getText()));
            
            // faz cadastro no gerenciador
            presencial = GerAssembleiaPresencial.getGerAssembleia().cadAssembleia(presencial);
            
            if (presencial != null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Assembleia presencial cadastrada com sucesso",
                    "Cadastro feito",
                    JOptionPane.INFORMATION_MESSAGE
                );
                limparTextfield();
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Já existe uma assembleia presencial com esse ID",
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
        textfieldCodPresencial.setText("");
        textfieldEndereco.setText("");
        textfieldCapacidadePessoasSalao.setText("");
        
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
                new CadAssembleiaPresencial().setVisible(true);
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
    private javax.swing.JComboBox<String> comboAssembleia;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCapacidadePessoasSalao;
    private javax.swing.JLabel labelCodPresencial;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNomeDaEmpresa;
    private javax.swing.JLabel labelNomeDoOperador;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableAssembleia;
    private javax.swing.JTextField textfieldCapacidadePessoasSalao;
    private javax.swing.JTextField textfieldCodPresencial;
    private javax.swing.JTextField textfieldEndereco;
    private javax.swing.JTextField textfieldId;
    private javax.swing.JTextField textfieldNomeDaEmpresa;
    private javax.swing.JTextField textfieldNomeDoOperador;
    // End of variables declaration//GEN-END:variables
}
