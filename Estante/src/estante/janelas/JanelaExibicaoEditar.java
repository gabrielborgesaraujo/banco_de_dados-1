/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estante.janelas;

import estante.classes.Artigo;
import estante.classes.Autor;
import estante.classes.Editora;
import estante.classes.Revista;
import estante.persistencia.Persistencia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Flavia
 */
public class JanelaExibicaoEditar extends javax.swing.JFrame {
    JanelaPrincipal janelaPrincipal;
    LinkedList listaLigada = new LinkedList();
    int[] indexAtual;
    int aux,indexAtual2=0;
    
    /**
     * Creates new form JanelaExibicao
     */
    public JanelaExibicaoEditar(JanelaPrincipal janelaPrincipal,int[] indexNovo,int aux) {
        initComponents();
        this.indexAtual = indexNovo;
        this.janelaPrincipal = janelaPrincipal;
        this.aux = aux;
        exibirListaLigadaDeRevistas();
        
        
    }
    
    public void exibirListaLigadaDeRevistas(){
        int count,indexAtual = 0;
        Revista r;
        for(count = 0;count < aux ; count++)
        {
            r = this.janelaPrincipal.estante.getRevitas().get(this.indexAtual[count]);
            listaLigada.add(r);
        }
        r = (Revista) this.listaLigada.get(indexAtual);
        this.jTextFieldNomeDaRevista.setText(r.getNome());
        this.jTextFieldMancheteDaRevista.setText(r.getManchete());
        this.jTextFieldDiaDaPublicacao.setText(String.valueOf(r.getData().getDayOfMonth()));
        this.jTextFieldMesDaPublicacao.setText(String.valueOf(r.getData().getMonthValue()));
        this.jTextFieldAnoDaPublicacao.setText(String.valueOf(r.getData().getYear()));
        this.jTextFieldNumeroDaEdicao.setText(String.valueOf(r.getEdicao()));
        this.jTextFieldNomeDaEditora.setText(r.getEditora().getNome());
        this.jTextFieldEditorial.setText(r.getEditorial());
        //Modelo da Tabela
        DefaultTableModel modeloDaLinha = (DefaultTableModel) this.jTableArtigosDaRevista.getModel();
        for(Artigo a : r.getArtigos()){
            StringBuilder autores = new StringBuilder();
            StringBuilder palavras = new StringBuilder();
            for(Autor aut : a.getAutores()) autores.append(aut.getNome()).append(", ");
            for(String pal : a.getPalavrasChave()) palavras.append(pal).append(", ");
            modeloDaLinha.addRow(new Object[]{a.getTitulo(), autores, palavras});
        }
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeDaRevista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMancheteDaRevista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDiaDaPublicacao = new javax.swing.JTextField();
        jTextFieldMesDaPublicacao = new javax.swing.JTextField();
        jTextFieldAnoDaPublicacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumeroDaEdicao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNomeDaEditora = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldEditorial = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArtigosDaRevista = new javax.swing.JTable();
        jButtonProximaRevista = new javax.swing.JButton();
        jButtonAnteriorRevista = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Dados da Revista");

        jLabel2.setText("Nome");

        jLabel3.setText("Manchete");

        jLabel4.setText("Data de Publicação");

        jTextFieldAnoDaPublicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoDaPublicacaoActionPerformed(evt);
            }
        });

        jLabel5.setText("/");

        jLabel6.setText("/");

        jLabel7.setText("Nº Edição");

        jLabel8.setText("Editora");

        jLabel9.setText("Linha Editorial");

        jLabel10.setText("Artigos Favoritos");

        jTableArtigosDaRevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título do artigo", "Autores", "Palavras-chave"
            }
        ));
        jScrollPane1.setViewportView(jTableArtigosDaRevista);

        jButtonProximaRevista.setText("Próxima");
        jButtonProximaRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximaRevistaActionPerformed(evt);
            }
        });

        jButtonAnteriorRevista.setText("Anterior");
        jButtonAnteriorRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorRevistaActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeDaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMancheteDaRevista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNomeDaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDiaDaPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMesDaPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAnoDaPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNumeroDaEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldEditorial)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAnteriorRevista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonSalvar)
                        .addGap(190, 190, 190)
                        .addComponent(jButtonProximaRevista)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeDaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldMancheteDaRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDiaDaPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAnoDaPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldMesDaPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNumeroDaEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNomeDaEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 107, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAnteriorRevista)
                            .addComponent(jButtonProximaRevista)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonCancelar))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAnoDaPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoDaPublicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoDaPublicacaoActionPerformed

    private void jButtonProximaRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximaRevistaActionPerformed
        // TODO add your handling code here:
            if(this.indexAtual2 < this.listaLigada.size()-1){
                this.indexAtual2++;
                Revista r = (Revista) this.listaLigada.get(this.indexAtual2);
                this.jTextFieldNomeDaRevista.setText(r.getNome());
                this.jTextFieldMancheteDaRevista.setText(r.getManchete());
                this.jTextFieldDiaDaPublicacao.setText(String.valueOf(r.getData().getDayOfMonth()));
                this.jTextFieldMesDaPublicacao.setText(String.valueOf(r.getData().getMonthValue()));
                this.jTextFieldAnoDaPublicacao.setText(String.valueOf(r.getData().getYear()));
                this.jTextFieldNumeroDaEdicao.setText(String.valueOf(r.getEdicao()));
                this.jTextFieldNomeDaEditora.setText(r.getEditora().getNome());
                this.jTextFieldEditorial.setText(r.getEditorial());
                //Modelo da Tabela
                DefaultTableModel modeloDaLinha = (DefaultTableModel) this.jTableArtigosDaRevista.getModel();
                while (this.jTableArtigosDaRevista.getModel().getRowCount() > 0)
                    modeloDaLinha.removeRow(0);
                for(Artigo a : r.getArtigos()){
                    StringBuilder autores = new StringBuilder();
                    StringBuilder palavras = new StringBuilder();
                    for(Autor aut : a.getAutores()) autores.append(aut.getNome()).append(", ");
                    for(String pal : a.getPalavrasChave()) palavras.append(pal).append(", ");
                    modeloDaLinha.addRow(new Object[]{a.getTitulo(), autores, palavras});
                }
            }
        

    }//GEN-LAST:event_jButtonProximaRevistaActionPerformed

    private void jButtonAnteriorRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorRevistaActionPerformed
        // TODO add your handling code here:
            if(this.indexAtual2 > 0){
                this.indexAtual2--;
                Revista r = (Revista) this.listaLigada.get(this.indexAtual2);
                this.jTextFieldNomeDaRevista.setText(r.getNome());
                this.jTextFieldMancheteDaRevista.setText(r.getManchete());
                this.jTextFieldDiaDaPublicacao.setText(String.valueOf(r.getData().getDayOfMonth()));
                this.jTextFieldMesDaPublicacao.setText(String.valueOf(r.getData().getMonthValue()));
                this.jTextFieldAnoDaPublicacao.setText(String.valueOf(r.getData().getYear()));
                this.jTextFieldNumeroDaEdicao.setText(String.valueOf(r.getEdicao()));
                this.jTextFieldNomeDaEditora.setText(r.getEditora().getNome());
                this.jTextFieldEditorial.setText(r.getEditorial());
                //Modelo da Tabela
                DefaultTableModel modeloDaLinha = (DefaultTableModel) this.jTableArtigosDaRevista.getModel();
                while (this.jTableArtigosDaRevista.getModel().getRowCount() > 0)
                modeloDaLinha.removeRow(0);
                for(Artigo a : r.getArtigos()){
                    StringBuilder autores = new StringBuilder();
                    StringBuilder palavras = new StringBuilder();
                    for(Autor aut : a.getAutores()) autores.append(aut.getNome()).append(", ");
                    for(String pal : a.getPalavrasChave()) palavras.append(pal).append(", ");
                    modeloDaLinha.addRow(new Object[]{a.getTitulo(), autores, palavras});
                }
            }
        
    }//GEN-LAST:event_jButtonAnteriorRevistaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        int count;
        for(count = 0 ; count < this.janelaPrincipal.estante.getTotalDeRevistas(); count++){
            if(this.janelaPrincipal.estante.getRevitas().get(count) == listaLigada.get(this.indexAtual2))
            {
                if(this.jTextFieldNomeDaRevista.getText().isEmpty() 
                    || this.jTextFieldMancheteDaRevista.getText().isEmpty()
                    || this.jTextFieldNumeroDaEdicao.getText().isEmpty()
                    || this.jTextFieldNomeDaEditora.getText().isEmpty()
                    || this.jTextFieldEditorial.getText().isEmpty()
                    || this.jTextFieldAnoDaPublicacao.getText().isEmpty()
                    || this.jTextFieldMesDaPublicacao.getText().isEmpty()
                    || this.jTextFieldDiaDaPublicacao.getText().isEmpty()){
            // show a joptionpane dialog using showMessageDialog
                    JFrame frame = new JFrame("Edição");
                    JOptionPane.showMessageDialog(frame,
                    "Existem campos em branco na janela de cadastro",
                    "Edição",
                    JOptionPane.ERROR_MESSAGE);
            //this.setVisible(false);
                
                }else
                {
                    int x;
                    List <Artigo> artigos = new ArrayList<Artigo>();
                    Artigo artigo = new Artigo();
                    for(x = 0 ; x<this.jTableArtigosDaRevista.getRowCount(); x++){
                        artigo = editaArtigo(x);
                        artigos.add(artigo);
                    }
                    Revista revistaTemp = this.janelaPrincipal.estante.editarRevistaDaEstante(this.jTextFieldNomeDaRevista.getText(),
                    this.jTextFieldMancheteDaRevista.getText(),
                    Integer.parseInt(this.jTextFieldNumeroDaEdicao.getText()),
                    new Editora(this.jTextFieldNomeDaEditora.getText()),
                    this.jTextFieldEditorial.getText(),
                    LocalDate.of(Integer.parseInt(this.jTextFieldAnoDaPublicacao.getText()),
                        Integer.parseInt(this.jTextFieldMesDaPublicacao.getText()),
                        Integer.parseInt(this.jTextFieldDiaDaPublicacao.getText())),artigos);
                    this.janelaPrincipal.estante.getRevitas().set(count, revistaTemp);
                    
                    
                }
            }
        }
        Persistencia persistencia = new Persistencia();
        persistencia.gravacaoESerializacaoDaInstancia(this.janelaPrincipal.estante, "src\\estante\\persistencia\\estante.json");
        this.dispose();
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    public Artigo editaArtigo(int x)
    {
        
        Artigo artigo = new Artigo();
            
            artigo.setTitulo(this.jTableArtigosDaRevista.getValueAt(x, 0).toString());
            String[] splitAutores = String.valueOf(this.jTableArtigosDaRevista.getValueAt(x, 1)).split(Pattern.quote(", "));
            for(String nome : splitAutores){
                artigo.getAutores().add(new Autor(nome));
            }

            String[] splitPalavrasChave = String.valueOf(this.jTableArtigosDaRevista.getValueAt(x, 2)).split(Pattern.quote(", "));
            for(String palavra : splitPalavrasChave){
                artigo.getPalavrasChave().add(palavra);
            }
            return artigo;
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnteriorRevista;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonProximaRevista;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableArtigosDaRevista;
    private javax.swing.JTextField jTextFieldAnoDaPublicacao;
    private javax.swing.JTextField jTextFieldDiaDaPublicacao;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldMancheteDaRevista;
    private javax.swing.JTextField jTextFieldMesDaPublicacao;
    private javax.swing.JTextField jTextFieldNomeDaEditora;
    private javax.swing.JTextField jTextFieldNomeDaRevista;
    private javax.swing.JTextField jTextFieldNumeroDaEdicao;
    // End of variables declaration//GEN-END:variables
}