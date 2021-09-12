
package tortoproversion;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



public class SolucionarTorto extends javax.swing.JFrame {
    static ArrayList<EstruturaNo> nos;
    protected String Caminho;
    private String reposta;
    Alfabeto alfabeto = new Alfabeto();
    public SolucionarTorto() {
        initComponents();
        Total.setEditable(false);
        Respostas.setEditable(false);
        reposta = "Palavras aceitas: ";
    }
    public void IniciarNos(){
        nos = new ArrayList();
        EstruturaNo no0 = new EstruturaNo(0 , NoFrame0.getText() , 3 , false);
        no0.setNoLigacoes(1);
        no0.setNoLigacoes(3);
        no0.setNoLigacoes(4);
        nos.add(no0);
        
        EstruturaNo no1 = new EstruturaNo(1 , NoFrame1.getText() , 5 , false);
        no1.setNoLigacoes(0);
        no1.setNoLigacoes(2);
        no1.setNoLigacoes(3);
        no1.setNoLigacoes(4);
        no1.setNoLigacoes(5);
        nos.add(no1);
        
        EstruturaNo no2 = new EstruturaNo(2 , NoFrame2.getText() , 3 , false);
        no2.setNoLigacoes(1);
        no2.setNoLigacoes(4);
        no2.setNoLigacoes(5);
        nos.add(no2);
        
        EstruturaNo no3 = new EstruturaNo(3 , NoFrame3.getText() , 5 , false);
        no3.setNoLigacoes(0);
        no3.setNoLigacoes(1);
        no3.setNoLigacoes(4);
        no3.setNoLigacoes(7);
        no3.setNoLigacoes(6);
        nos.add(no3);
        
        EstruturaNo no4 = new EstruturaNo(4 , NoFrame4.getText() , 8 , false);
        no4.setNoLigacoes(0);
        no4.setNoLigacoes(1);
        no4.setNoLigacoes(2);
        no4.setNoLigacoes(3);
        no4.setNoLigacoes(5);
        no4.setNoLigacoes(6);
        no4.setNoLigacoes(7);
        no4.setNoLigacoes(8);
        nos.add(no4);
        
        EstruturaNo no5 = new EstruturaNo(5 , NoFrame5.getText() , 5 , false);
        no5.setNoLigacoes(1);
        no5.setNoLigacoes(2);
        no5.setNoLigacoes(4);
        no5.setNoLigacoes(7);
        no5.setNoLigacoes(8);
        nos.add(no5);
        
        EstruturaNo no6 = new EstruturaNo(6 , NoFrame6.getText() , 5 , false);
        no6.setNoLigacoes(3);
        no6.setNoLigacoes(4);
        no6.setNoLigacoes(7);
        no6.setNoLigacoes(9);
        no6.setNoLigacoes(10);
        nos.add(no6);
        
        EstruturaNo no7 = new EstruturaNo(7 , NoFrame7.getText() , 8 , false);
        no7.setNoLigacoes(3);
        no7.setNoLigacoes(4);
        no7.setNoLigacoes(5);
        no7.setNoLigacoes(6);
        no7.setNoLigacoes(8);
        no7.setNoLigacoes(9);
        no7.setNoLigacoes(10);
        no7.setNoLigacoes(11);
        nos.add(no7);
       
        EstruturaNo no8 = new EstruturaNo(8 , NoFrame8.getText() , 5 , false);
        no8.setNoLigacoes(4);
        no8.setNoLigacoes(5);
        no8.setNoLigacoes(7);
        no8.setNoLigacoes(10);
        no8.setNoLigacoes(11);
        nos.add(no8);
       
        EstruturaNo no9 = new EstruturaNo(9 , NoFrame9.getText() , 5 , false);
        no9.setNoLigacoes(6);
        no9.setNoLigacoes(7);
        no9.setNoLigacoes(10);
        no9.setNoLigacoes(12);
        no9.setNoLigacoes(13);
        nos.add(no9);
        
        EstruturaNo no10 = new EstruturaNo(10 , NoFrame10.getText() , 8 , false);
        no10.setNoLigacoes(6);
        no10.setNoLigacoes(7);
        no10.setNoLigacoes(8);
        no10.setNoLigacoes(9);
        no10.setNoLigacoes(11);
        no10.setNoLigacoes(12);
        no10.setNoLigacoes(13);
        no10.setNoLigacoes(14);
        nos.add(no10);
        
        EstruturaNo no11 = new EstruturaNo(11 , NoFrame11.getText() , 5 , false);
        no11.setNoLigacoes(7);
        no11.setNoLigacoes(8);
        no11.setNoLigacoes(10);
        no11.setNoLigacoes(13);
        no11.setNoLigacoes(14);
        nos.add(no11);
        
        EstruturaNo no12 = new EstruturaNo(12 , NoFrame12.getText() , 5 , false);
        no12.setNoLigacoes(9);
        no12.setNoLigacoes(10);
        no12.setNoLigacoes(13);
        no12.setNoLigacoes(15);
        no12.setNoLigacoes(16);
        nos.add(no12);
        
        EstruturaNo no13 = new EstruturaNo(13 , NoFrame13.getText() , 8 , false);
        no13.setNoLigacoes(9);
        no13.setNoLigacoes(10);
        no13.setNoLigacoes(11);
        no13.setNoLigacoes(12);
        no13.setNoLigacoes(14);
        no13.setNoLigacoes(15);
        no13.setNoLigacoes(16);
        no13.setNoLigacoes(17);
        nos.add(no13);
        
        EstruturaNo no14 = new EstruturaNo(14 , NoFrame14.getText() , 5 , false);
        no14.setNoLigacoes(10);
        no14.setNoLigacoes(11);
        no14.setNoLigacoes(13);
        no14.setNoLigacoes(16);
        no14.setNoLigacoes(17);
        nos.add(no14);
        
        EstruturaNo no15 = new EstruturaNo(15 , NoFrame15.getText() , 3 , false);
        no15.setNoLigacoes(12);
        no15.setNoLigacoes(13);
        no15.setNoLigacoes(16);
        nos.add(no15);
        
        EstruturaNo no16 = new EstruturaNo(16 , NoFrame16.getText() , 5 , false);
        no16.setNoLigacoes(12);
        no16.setNoLigacoes(13);
        no16.setNoLigacoes(14);
        no16.setNoLigacoes(15);
        no16.setNoLigacoes(17);
        nos.add(no16);
        
        EstruturaNo no17 = new EstruturaNo(17 , NoFrame17.getText() , 3 , false);
        no17.setNoLigacoes(13);
        no17.setNoLigacoes(14);
        no17.setNoLigacoes(16);
        nos.add(no17);
        
    }
    public void Limpar(){
        Respostas.setText(null);
        NoFrame0.setText(null);
        NoFrame1.setText(null);
        NoFrame2.setText(null);
        NoFrame3.setText(null);
        NoFrame4.setText(null);
        NoFrame5.setText(null);
        NoFrame6.setText(null);
        NoFrame7.setText(null);
        NoFrame8.setText(null);
        NoFrame9.setText(null);
        NoFrame10.setText(null);
        NoFrame11.setText(null);
        NoFrame12.setText(null);
        NoFrame13.setText(null);
        NoFrame14.setText(null);
        NoFrame15.setText(null);
        NoFrame16.setText(null);
        NoFrame17.setText(null);
        Total.setText("Total: ");
        reposta = "Palavras aceitas: ";
    }
    public void Iniciar(){
        IniciarNos();
        IniciarTorto();
    }
    public void IniciarTorto(){
        int PalavrasPercorridas = 0, possibilidades = 0, indice = 0, noAtual = 0, percorrendo = 0, percorrendo1 = 0,
            caminho = 0, indicePalavra = 0, temporario = 0, possibilidadesSegundo = 0, contadorDePalavras = 0;
        boolean noStop = true, processada = false;
        int guardaPercorrendo[];
        guardaPercorrendo = new int[99];
        int guardaPossibilidade[][];
        guardaPossibilidade = new int[99][99];
        int guardaPossibilidadep[];
        guardaPossibilidadep = new int[99];
        while(PalavrasPercorridas < alfabeto.getTamanhoAlfabeto() && alfabeto.getAlfabeto(PalavrasPercorridas) != null){
        char[] palavra = alfabeto.getAlfabeto(PalavrasPercorridas).toCharArray();
        for(int visitaNos = 0; visitaNos < nos.size(); visitaNos++){
            if((nos.get(visitaNos).getConteudo().equals(Character.toString(palavra[indicePalavra]))) && (nos.get(visitaNos).getVisitado() == false)){
                guardaPossibilidade[indice][possibilidades] = visitaNos;
                possibilidades++;
            }
        }
        while(processada == false){
        indicePalavra++;
        noAtual = guardaPossibilidade[indice][percorrendo1];
        guardaPercorrendo[indice] = percorrendo1;
        guardaPossibilidadep[indice] = possibilidades;
        nos.get(noAtual).setVisitado(true);
        indice++;
        caminho++;
        while(noStop == true && possibilidades > 0){
        if(alfabeto.getAlfabeto(PalavrasPercorridas).length() < 4 || indicePalavra >= palavra.length){
            nos.get(caminho).setVisitado(false);
            processada = true;
            break;
        }
        for(int visitaLigacoes = 0; visitaLigacoes < nos.get(noAtual).getQtdLigacoes(); visitaLigacoes++){
            temporario = nos.get(noAtual).getNoligacoes(visitaLigacoes);
            if((nos.get(temporario).getConteudo().equals(Character.toString(palavra[indicePalavra]))) && (nos.get(temporario).getVisitado() == false)){
                guardaPossibilidade[indice][possibilidadesSegundo] = temporario;
                possibilidadesSegundo++;
            }
        }
        guardaPossibilidadep[indice] = possibilidadesSegundo;
        if(possibilidadesSegundo > 0){
        indicePalavra++;
        noAtual = guardaPossibilidade[indice][percorrendo];
        nos.get(noAtual).setVisitado(true);
        guardaPercorrendo[indice] = percorrendo;
        if((indicePalavra == palavra.length) && (palavra.length > 3)){
            reposta = reposta + "\n" + alfabeto.getAlfabeto(PalavrasPercorridas);
            processada = true;
            contadorDePalavras++;
            break;
        }
        indice++;
        caminho++;
        }
        else{
        while(guardaPossibilidadep[indice] <= 1){
        indice--;
        caminho--;
        indicePalavra--;
        nos.get(caminho).setVisitado(false);
        if(indice <= 0){  
            break;
        }
        }
        guardaPercorrendo[indice] = guardaPercorrendo[indice] + 1;
        if(guardaPercorrendo[indice] >= guardaPossibilidadep[indice]){
            break;
        }
        noAtual = guardaPossibilidade[indice][guardaPercorrendo[indice]];
        nos.get(noAtual).setVisitado(true);    
        if(caminho <= 0){
            indicePalavra = 0;
            break;
        }
        indicePalavra++;
        }
        possibilidadesSegundo = 0;
        }
        percorrendo1++;
        if(percorrendo1 >= guardaPossibilidadep[indice]){
            processada = true;
            break;
        }
                for(int i = 0; i < nos.size(); i++){
            nos.get(i).setVisitado(false);
        }
        }

        for(int i = 0; i < nos.size(); i++){
            nos.get(i).setVisitado(false);
        }
        percorrendo1 = 0;
        percorrendo = 0;
        indice = 0;
        caminho = 0;
        indicePalavra = 0;
        possibilidades = 0;
        percorrendo = 0;
        possibilidadesSegundo = 0;
        processada = false;
        PalavrasPercorridas++;
        }
            Total.setText("Total: " + contadorDePalavras);
            Respostas.setText(reposta);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ColetorDeCaminho = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        NoFrame0 = new javax.swing.JTextField();
        NoFrame1 = new javax.swing.JTextField();
        NoFrame2 = new javax.swing.JTextField();
        NoFrame3 = new javax.swing.JTextField();
        NoFrame6 = new javax.swing.JTextField();
        NoFrame9 = new javax.swing.JTextField();
        NoFrame12 = new javax.swing.JTextField();
        NoFrame15 = new javax.swing.JTextField();
        NoFrame4 = new javax.swing.JTextField();
        NoFrame5 = new javax.swing.JTextField();
        NoFrame7 = new javax.swing.JTextField();
        NoFrame8 = new javax.swing.JTextField();
        NoFrame10 = new javax.swing.JTextField();
        NoFrame11 = new javax.swing.JTextField();
        NoFrame13 = new javax.swing.JTextField();
        NoFrame14 = new javax.swing.JTextField();
        NoFrame17 = new javax.swing.JTextField();
        NoFrame16 = new javax.swing.JTextField();
        Resolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Respostas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Resolver.setText("Solve");
        Resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverActionPerformed(evt);
            }
        });

        Respostas.setColumns(20);
        Respostas.setRows(5);
        jScrollPane1.setViewportView(Respostas);

        jButton1.setText("Clean");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Total.setText("Total: ");

        jButton2.setText("Alphabet Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(NoFrame15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NoFrame16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(NoFrame12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(NoFrame9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(NoFrame6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(NoFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(NoFrame0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(NoFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Resolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrame0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrame6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrame9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrame12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrame15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrame16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Resolver)
                            .addComponent(jButton1))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverActionPerformed
        if(Caminho == null){
            JOptionPane.showMessageDialog(null, "Please, select the alphabet!");
        }
        
        else{
        Iniciar();
        }
    }//GEN-LAST:event_ResolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AboutMenu().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooserArquivo = new JFileChooser();
        int escolha = chooserArquivo.showOpenDialog(getParent());
        Caminho = chooserArquivo.getSelectedFile().getAbsolutePath();  
        alfabeto.setCaminho(Caminho);
        alfabeto.Inicializar();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SolucionarTorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolucionarTorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolucionarTorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolucionarTorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ColetorDeCaminho;
    private javax.swing.JTextField NoFrame0;
    private javax.swing.JTextField NoFrame1;
    private javax.swing.JTextField NoFrame10;
    private javax.swing.JTextField NoFrame11;
    private javax.swing.JTextField NoFrame12;
    private javax.swing.JTextField NoFrame13;
    private javax.swing.JTextField NoFrame14;
    private javax.swing.JTextField NoFrame15;
    private javax.swing.JTextField NoFrame16;
    private javax.swing.JTextField NoFrame17;
    private javax.swing.JTextField NoFrame2;
    private javax.swing.JTextField NoFrame3;
    private javax.swing.JTextField NoFrame4;
    private javax.swing.JTextField NoFrame5;
    private javax.swing.JTextField NoFrame6;
    private javax.swing.JTextField NoFrame7;
    private javax.swing.JTextField NoFrame8;
    private javax.swing.JTextField NoFrame9;
    private javax.swing.JButton Resolver;
    private javax.swing.JTextArea Respostas;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
