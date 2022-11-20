// NOME: KLEVERSON KENJI IWATANI
// RA: 2465205
// NETBEANS: versão 15
// JDK: versão 19.0.1.0

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPrincipal = new javax.swing.JLabel();
        menubarPrincipal = new javax.swing.JMenuBar();
        menuCadAssembleia = new javax.swing.JMenu();
        submenuCadAssembleia = new javax.swing.JMenu();
        menuItemAbrirCadPresencial = new javax.swing.JMenuItem();
        menuItemAbrirCadOnline = new javax.swing.JMenuItem();
        menuItemAbrirCadHibrida = new javax.swing.JMenuItem();
        menuFechar = new javax.swing.JMenu();
        menuItemFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        labelPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelPrincipal.setText("Sistema de Gestão de Assembleias");

        menuCadAssembleia.setText("Cadastro");

        submenuCadAssembleia.setText("Abrir Cadastro de Assembleia...");

        menuItemAbrirCadPresencial.setText("Presencial");
        menuItemAbrirCadPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirCadPresencialActionPerformed(evt);
            }
        });
        submenuCadAssembleia.add(menuItemAbrirCadPresencial);

        menuItemAbrirCadOnline.setText("Online");
        submenuCadAssembleia.add(menuItemAbrirCadOnline);

        menuItemAbrirCadHibrida.setText("Híbrida");
        menuItemAbrirCadHibrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirCadHibridaActionPerformed(evt);
            }
        });
        submenuCadAssembleia.add(menuItemAbrirCadHibrida);

        menuCadAssembleia.add(submenuCadAssembleia);

        menubarPrincipal.add(menuCadAssembleia);

        menuFechar.setText("Fechar");

        menuItemFechar.setText("Fechar");
        menuItemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFecharActionPerformed(evt);
            }
        });
        menuFechar.add(menuItemFechar);

        menubarPrincipal.add(menuFechar);

        setJMenuBar(menubarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(labelPrincipal)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(labelPrincipal)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAbrirCadHibridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirCadHibridaActionPerformed
        // retorna formulário em instância única
        CadAssembleiaHibrida.getCadAssembleiaHibrida().setVisible(true);
    }//GEN-LAST:event_menuItemAbrirCadHibridaActionPerformed

    private void menuItemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFecharActionPerformed
        sair();
    }//GEN-LAST:event_menuItemFecharActionPerformed

    private void menuItemAbrirCadPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirCadPresencialActionPerformed
        CadAssembleiaPresencial.getCadAssembleiaPresencial().setVisible(true);
    }//GEN-LAST:event_menuItemAbrirCadPresencialActionPerformed

    public void sair() {
        int response = JOptionPane.showConfirmDialog(
            null,
            "Deseja sair da aplicação?",
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JMenu menuCadAssembleia;
    private javax.swing.JMenu menuFechar;
    private javax.swing.JMenuItem menuItemAbrirCadHibrida;
    private javax.swing.JMenuItem menuItemAbrirCadOnline;
    private javax.swing.JMenuItem menuItemAbrirCadPresencial;
    private javax.swing.JMenuItem menuItemFechar;
    private javax.swing.JMenuBar menubarPrincipal;
    private javax.swing.JMenu submenuCadAssembleia;
    // End of variables declaration//GEN-END:variables
}
