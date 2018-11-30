/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Samuelson
 */
public class Gelaflix extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public static AcessoBD acessoBD;
    public static ResultSet rs = null;
    public static String pedidoSQL1, nome;
    public int userId, codigo;
    String tituloOriginal = null, tituloPortugues = null, classificacao = null, sinopse = null, duracao = null, path = null;
    boolean comparator = false;
    
    public Gelaflix(int userId) {
        initComponents();
        codigo = userId;
        pedidoSQL1 = "SELECT SUBSTRING_INDEX(nome, ' ', 1) AS nome FROM usuario where codigo =  "+userId;//recebe somente primeiro nome do usuário
        System.out.println(pedidoSQL1);
        acessoBD = new AcessoBD();
        acessoBD.conecta();
        acessoBD.executa(pedidoSQL1);
        rs = acessoBD.consulta(pedidoSQL1);
        try{
            while(rs.next()){
                welcomeText.setText("Seja bem vindo(a), "+(nome = rs.getString("nome"))+".");}
        }
        catch(SQLException e){
            System.out.println("Exceção: " + e.toString());
        }
        acessoBD.fechaConexao();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Filme5 = new javax.swing.JButton(new ImageIcon("C:/Users/danie/Documents/GitHub/gelaflix/gelaflix/src/images/Poster/Bruce.jpg"));
        Filme3 = new javax.swing.JButton(new ImageIcon("C:/Users/danie/Documents/GitHub/gelaflix/gelaflix/src/images/Poster/Inglorious.jpg"));
        Filme2 = new javax.swing.JButton(new ImageIcon("C:/Users/danie/Documents/GitHub/gelaflix/gelaflix/src/images/Poster/Forest.jpg"));
        Filme4 = new javax.swing.JButton(new ImageIcon("C:/Users/danie/Documents/GitHub/gelaflix/gelaflix/src/images/Poster/Titanic.jpg"));
        Filme1 = new javax.swing.JButton(new ImageIcon("../gelaflix/src/images/Poster/Matrix.jpg"));
        ExitButton = new javax.swing.JButton();
        welcomeText = new javax.swing.JLabel();
        goBackButton = new javax.swing.JToggleButton();
        Filme7 = new javax.swing.JButton(new ImageIcon("C:/Users/danie/Documents/GitHub/gelaflix/gelaflix/src/images/Poster/TheExorcist.jpg"));
        Filme6 = new javax.swing.JButton(new ImageIcon("C:/Users/danie/Documents/GitHub/gelaflix/gelaflix/src/images/Poster/Finding.jpg"));
        userProfileButton = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setForeground(java.awt.Color.white);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(253, 41, 123));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 41, 123));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gelaflix");

        Filme5.setBackground(new java.awt.Color(255, 255, 255));
        Filme5.setText(null);
        Filme5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Filme5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme5ActionPerformed(evt);
            }
        });

        Filme3.setBackground(new java.awt.Color(255, 255, 255));
        Filme3.setText(null);
        Filme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme3ActionPerformed(evt);
            }
        });

        Filme2.setBackground(new java.awt.Color(255, 255, 255));
        Filme2.setText(null);
        Filme2.setToolTipText("");
        Filme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme2ActionPerformed(evt);
            }
        });

        Filme4.setBackground(new java.awt.Color(255, 255, 255));
        Filme4.setText(null);
        Filme4.setIconTextGap(0);
        Filme4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Filme4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme4ActionPerformed(evt);
            }
        });

        Filme1.setBackground(new java.awt.Color(255, 255, 255));
        Filme1.setText(null);
        Filme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme1ActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(250, 40, 120));
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Desconectar");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        welcomeText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(255, 88, 100));
        welcomeText.setText("[welcome-text]");

        goBackButton.setBackground(new java.awt.Color(255, 88, 100));
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setText("Sair");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        Filme7.setBackground(new java.awt.Color(255, 255, 255));
        Filme7.setText(null);
        Filme7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme7ActionPerformed(evt);
            }
        });

        Filme6.setBackground(new java.awt.Color(255, 255, 255));
        Filme6.setText(null);
        Filme6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filme6ActionPerformed(evt);
            }
        });

        userProfileButton.setText("Perfil");
        userProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(welcomeText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userProfileButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Filme1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(goBackButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ExitButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filme2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filme3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filme4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filme5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filme6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filme7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeText)
                    .addComponent(userProfileButton))
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filme1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filme4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filme5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filme6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filme7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filme2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filme3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(goBackButton))
                .addContainerGap())
        );

        Filme5.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Filme5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme5ActionPerformed
        int ano = 0, cod = 5;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            try{
                while(rs.next()){
                System.out.println("Procurando dados");
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                ano = Integer.parseInt(rs.getString("ano"));
                System.out.println("tituloOriginal: " + tituloOriginal);
                System.out.println("tituloPortugues: " + tituloPortugues);
                System.out.println("classificacao: " + classificacao);
                System.out.println("sinopse: " + sinopse);
                System.out.println("duracao: " + duracao);
                System.out.println("ano: " + ano);
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, null).setVisible(true);
                comparator = false;
            }else{
                System.out.println("Nenhum dado foi encontrado");
            }
            acessoBD.fechaConexao();
    }//GEN-LAST:event_Filme5ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Log out request");
        this.dispose();
        new TelaLoginModal(this, false).setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void Filme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme3ActionPerformed
        int ano = 0, cod = 3;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            
            try{
                while(rs.next()){
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                ano = Integer.parseInt(rs.getString("ano"));
                //path = rs.getString("destino");
                System.out.println("tituloOriginal: " + tituloOriginal);
                System.out.println("tituloPortugues: " + tituloPortugues);
                System.out.println("classificacao: " + classificacao);
                System.out.println("sinopse: " + sinopse);
                System.out.println("duracao: " + duracao);
                System.out.println("ano: " + ano);
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, null).setVisible(true);
                comparator = false;
            }else{
                System.out.println("Nenhum dado foi encontrado");
            }
            acessoBD.fechaConexao();
    }//GEN-LAST:event_Filme3ActionPerformed

    private void Filme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme1ActionPerformed
        // TODO add your handling code here:
        
        int ano = 0, cod = 1;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            
            try{
                while(rs.next()){
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                path = rs.getString("poster");
                ano = Integer.parseInt(rs.getString("ano"));
                System.out.println("tituloOriginal: " + tituloOriginal);
                System.out.println("tituloPortugues: " + tituloPortugues);
                System.out.println("classificacao: " + classificacao);
                System.out.println("sinopse: " + sinopse);
                System.out.println("duracao: " + duracao);
                System.out.println("ano: " + ano);
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, path).setVisible(true);
                comparator = false;
            }else{
                System.out.println("Nenhum dado foi encontrado");
            }
            acessoBD.fechaConexao(); 
    }//GEN-LAST:event_Filme1ActionPerformed

    private void Filme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme2ActionPerformed
        int ano = 0, cod = 2;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            try{
                while(rs.next()){
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                ano = Integer.parseInt(rs.getString("ano"));
                System.out.println("tituloOriginal: " + tituloOriginal);
                System.out.println("tituloPortugues: " + tituloPortugues);
                System.out.println("classificacao: " + classificacao);
                System.out.println("sinopse: " + sinopse);
                System.out.println("duracao: " + duracao);
                System.out.println("ano: " + ano);
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, null).setVisible(true);
                comparator = false;
            }else{
                System.out.println("Nenhum dado foi encontrado");
            }
            acessoBD.fechaConexao();
    }//GEN-LAST:event_Filme2ActionPerformed

    private void Filme4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme4ActionPerformed
        int ano = 0, cod = 4;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            
            try{
                while(rs.next()){
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                ano = Integer.parseInt(rs.getString("ano"));
                System.out.println("tituloOriginal: " + tituloOriginal);
                System.out.println("tituloPortugues: " + tituloPortugues);
                System.out.println("classificacao: " + classificacao);
                System.out.println("sinopse: " + sinopse);
                System.out.println("duracao: " + duracao);
                System.out.println("ano: " + ano);
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, null).setVisible(true);
                comparator = false;
            }else{
                System.out.println("Nenhum dado foi encontrado");
            }
            acessoBD.fechaConexao();
    }//GEN-LAST:event_Filme4ActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        System.out.println("Closing the application");
        System.exit(0);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void Filme6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme6ActionPerformed
        // TODO add your handling code here:
        int ano = 0, cod = 6;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            
            try{
                while(rs.next()){
                System.out.println("Procurando dados");
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                ano = Integer.parseInt(rs.getString("ano"));
                System.out.println("tituloOriginal: " + tituloOriginal);
                System.out.println("tituloPortugues: " + tituloPortugues);
                System.out.println("classificacao: " + classificacao);
                System.out.println("sinopse: " + sinopse);
                System.out.println("duracao: " + duracao);
                System.out.println("ano: " + ano);
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, null).setVisible(true);
                comparator = false;
            }else{
                System.out.println("Nenhum dado foi encontrado");
            }
            acessoBD.fechaConexao();
    }//GEN-LAST:event_Filme6ActionPerformed

    private void Filme7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filme7ActionPerformed
        // TODO add your handling code here:
        int ano = 0, cod = 7;
            pedidoSQL1 = "SELECT * FROM filme WHERE codigo = '"+cod+"'";
            acessoBD = new AcessoBD();
            acessoBD.conecta();
            rs = acessoBD.consulta(pedidoSQL1);
            
            try{
                while(rs.next()){
                System.out.println("Search movie data");
                tituloOriginal = rs.getString("tituloOriginal");
                tituloPortugues = rs.getString("tituloPortugues");
                classificacao = rs.getString("classificacao");
                sinopse = rs.getString("sinopse");
                duracao = rs.getString("duracao");
                ano = Integer.parseInt(rs.getString("ano"));
                comparator = true;}
            }
            catch(SQLException e){
                System.out.println("Exceção: " + e.toString());
            }
            if(comparator == true){
                new Filme(tituloOriginal, tituloPortugues, classificacao, sinopse, duracao, ano, null).setVisible(true);
                comparator = false;
            }else{
                System.out.println("No data found");
            }
            acessoBD.fechaConexao();
    }//GEN-LAST:event_Filme7ActionPerformed

    private void userProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileButtonActionPerformed
        // TODO add your handling code here:
        new Profile(codigo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userProfileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gelaflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gelaflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gelaflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gelaflix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Filme1;
    private javax.swing.JButton Filme2;
    private javax.swing.JButton Filme3;
    private javax.swing.JButton Filme4;
    private javax.swing.JButton Filme5;
    private javax.swing.JButton Filme6;
    private javax.swing.JButton Filme7;
    private javax.swing.JToggleButton goBackButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton userProfileButton;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}