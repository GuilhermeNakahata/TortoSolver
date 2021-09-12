package tortoproversion;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static tortoproversion.SolucionarTorto.nos;

public class GerarTortos extends javax.swing.JFrame {
    private String temporario[];
    private String reposta;
    protected String Caminho;
    Random rd = new Random(26);
    Alfabeto alfabeto = new Alfabeto();
    public GerarTortos() {
        initComponents();
        reposta = "Palavras aceitas: ";
        temporario = new String[99];
        Total2.setEditable(false);
        Respostas2.setEditable(false);
    }
    
    public void Limpar(){
        reposta = null;
        NoFrameG1.setText(null);
        NoFrameG2.setText(null);
        NoFrameG3.setText(null);
        NoFrameG4.setText(null);
        NoFrameG5.setText(null);
        NoFrameG6.setText(null);
        NoFrameG7.setText(null);
        NoFrameG8.setText(null);
        NoFrameG9.setText(null);
        NoFrameG10.setText(null);
        NoFrameG11.setText(null);
        NoFrameG12.setText(null);
        NoFrameG13.setText(null);
        NoFrameG14.setText(null);
        NoFrameG15.setText(null);
        NoFrameG16.setText(null);
        NoFrameG17.setText(null);
        NoFrameG18.setText(null);
        Total2.setText("Total: ");
        reposta = "Palavras aceitas: ";
    }
    public void PreencherNos(){
        nos = new ArrayList();
        EstruturaNo no0 = new EstruturaNo(0 , temporario[0] , 3 , false);
        no0.setNoLigacoes(1);
        no0.setNoLigacoes(3);
        no0.setNoLigacoes(4);
        nos.add(no0);
        
        EstruturaNo no1 = new EstruturaNo(1 , temporario[1] , 5 , false);
        no1.setNoLigacoes(0);
        no1.setNoLigacoes(2);
        no1.setNoLigacoes(3);
        no1.setNoLigacoes(4);
        no1.setNoLigacoes(5);
        nos.add(no1);
        
        EstruturaNo no2 = new EstruturaNo(2 , temporario[2] , 3 , false);
        no2.setNoLigacoes(1);
        no2.setNoLigacoes(4);
        no2.setNoLigacoes(5);
        nos.add(no2);
        
        EstruturaNo no3 = new EstruturaNo(3 , temporario[3] , 5 , false);
        no3.setNoLigacoes(0);
        no3.setNoLigacoes(1);
        no3.setNoLigacoes(4);
        no3.setNoLigacoes(7);
        no3.setNoLigacoes(6);
        nos.add(no3);
        
        EstruturaNo no4 = new EstruturaNo(4 , temporario[4] , 8 , false);
        no4.setNoLigacoes(0);
        no4.setNoLigacoes(1);
        no4.setNoLigacoes(2);
        no4.setNoLigacoes(3);
        no4.setNoLigacoes(5);
        no4.setNoLigacoes(6);
        no4.setNoLigacoes(7);
        no4.setNoLigacoes(8);
        nos.add(no4);
        
        EstruturaNo no5 = new EstruturaNo(5 , temporario[5] , 5 , false);
        no5.setNoLigacoes(1);
        no5.setNoLigacoes(2);
        no5.setNoLigacoes(4);
        no5.setNoLigacoes(7);
        no5.setNoLigacoes(8);
        nos.add(no5);
        
        EstruturaNo no6 = new EstruturaNo(6 , temporario[6] , 5 , false);
        no6.setNoLigacoes(3);
        no6.setNoLigacoes(4);
        no6.setNoLigacoes(7);
        no6.setNoLigacoes(9);
        no6.setNoLigacoes(10);
        nos.add(no6);
        
        EstruturaNo no7 = new EstruturaNo(7 , temporario[7] , 8 , false);
        no7.setNoLigacoes(3);
        no7.setNoLigacoes(4);
        no7.setNoLigacoes(5);
        no7.setNoLigacoes(6);
        no7.setNoLigacoes(8);
        no7.setNoLigacoes(9);
        no7.setNoLigacoes(10);
        no7.setNoLigacoes(11);
        nos.add(no7);
       
        EstruturaNo no8 = new EstruturaNo(8 , temporario[8] , 5 , false);
        no8.setNoLigacoes(4);
        no8.setNoLigacoes(5);
        no8.setNoLigacoes(7);
        no8.setNoLigacoes(10);
        no8.setNoLigacoes(11);
        nos.add(no8);
       
        EstruturaNo no9 = new EstruturaNo(9 , temporario[9] , 5 , false);
        no9.setNoLigacoes(6);
        no9.setNoLigacoes(7);
        no9.setNoLigacoes(10);
        no9.setNoLigacoes(12);
        no9.setNoLigacoes(13);
        nos.add(no9);
        
        EstruturaNo no10 = new EstruturaNo(10 , temporario[10] , 8 , false);
        no10.setNoLigacoes(6);
        no10.setNoLigacoes(7);
        no10.setNoLigacoes(8);
        no10.setNoLigacoes(9);
        no10.setNoLigacoes(11);
        no10.setNoLigacoes(12);
        no10.setNoLigacoes(13);
        no10.setNoLigacoes(14);
        nos.add(no10);
        
        EstruturaNo no11 = new EstruturaNo(11 , temporario[11] , 5 , false);
        no11.setNoLigacoes(7);
        no11.setNoLigacoes(8);
        no11.setNoLigacoes(10);
        no11.setNoLigacoes(13);
        no11.setNoLigacoes(14);
        nos.add(no11);
        
        EstruturaNo no12 = new EstruturaNo(12 , temporario[12] , 5 , false);
        no12.setNoLigacoes(9);
        no12.setNoLigacoes(10);
        no12.setNoLigacoes(13);
        no12.setNoLigacoes(15);
        no12.setNoLigacoes(16);
        nos.add(no12);
        
        EstruturaNo no13 = new EstruturaNo(13 , temporario[13] , 8 , false);
        no13.setNoLigacoes(9);
        no13.setNoLigacoes(10);
        no13.setNoLigacoes(11);
        no13.setNoLigacoes(12);
        no13.setNoLigacoes(14);
        no13.setNoLigacoes(15);
        no13.setNoLigacoes(16);
        no13.setNoLigacoes(17);
        nos.add(no13);
        
        EstruturaNo no14 = new EstruturaNo(14 , temporario[14] , 5 , false);
        no14.setNoLigacoes(10);
        no14.setNoLigacoes(11);
        no14.setNoLigacoes(13);
        no14.setNoLigacoes(16);
        no14.setNoLigacoes(17);
        nos.add(no14);
        
        EstruturaNo no15 = new EstruturaNo(15 , temporario[15] , 3 , false);
        no15.setNoLigacoes(12);
        no15.setNoLigacoes(13);
        no15.setNoLigacoes(16);
        nos.add(no15);
        
        EstruturaNo no16 = new EstruturaNo(16 , temporario[16] , 5 , false);
        no16.setNoLigacoes(12);
        no16.setNoLigacoes(13);
        no16.setNoLigacoes(14);
        no16.setNoLigacoes(15);
        no16.setNoLigacoes(17);
        nos.add(no16);
        
        EstruturaNo no17 = new EstruturaNo(17 , temporario[17] , 3 , false);
        no17.setNoLigacoes(13);
        no17.setNoLigacoes(14);
        no17.setNoLigacoes(16);
        nos.add(no17);
        
    }
    
    public void Gerar(){
        Limpar();
        
        EmbaralharLetras();

        PreencherNos();
        
        PreencherNosVisual();
        
        IniciarTorto();
    }
    public void EmbaralharLetras(){
        for(int i = 0; i < 18; i++){
        int temp = rd.nextInt(26);
            switch (temp) {
                case 0:
                    temporario[i] = "A";
                    break;
                case 1:
                    temporario[i] = "A";
                    break;
                case 2:
                    temporario[i] = "B";
                    break;
                case 3:
                    temporario[i] = "C";
                    break;
                case 4:
                    temporario[i] = "D";
                    break;
                case 5:
                    temporario[i] = "E";
                    break;
                case 6:
                    temporario[i] = "F";
                    break;
                case 7:
                    temporario[i] = "G";
                    break;
                case 8:
                    temporario[i] = "H";
                    break;
                case 9:
                    temporario[i] = "I";
                    break;
                case 10:
                    temporario[i] = "J";
                    break;
                case 11:
                    temporario[i] = "K";
                    break;
                case 12:
                    temporario[i] = "L";
                    break;
                case 13:
                    temporario[i] = "M";
                    break;
                case 14:
                    temporario[i] = "N";
                    break;
                case 15:
                    temporario[i] = "O";
                    break;
                case 16:
                    temporario[i] = "P";
                    break;
                case 17:
                    temporario[i] = "Q";
                    break;
                case 18:
                    temporario[i] = "R";
                    break;
                case 19:
                    temporario[i] = "S";
                    break;
                case 20:
                    temporario[i] = "T";
                    break;
                case 21:
                    temporario[i] = "U";
                    break;
                case 22:
                    temporario[i] = "V";
                    break;
                case 23:
                    temporario[i] = "W";
                    break;
                case 24:
                    temporario[i] = "X";
                    break;
                case 25:
                    temporario[i] = "Y";
                    break;
                case 26:
                    temporario[i] = "Z";
                    break;
                default:
                    break;
            }
        }
    }
    
    public void PreencherNosVisual(){
        NoFrameG1.setText(temporario[0]);
        NoFrameG2.setText(temporario[1]);
        NoFrameG3.setText(temporario[2]);
        NoFrameG4.setText(temporario[3]);
        NoFrameG5.setText(temporario[4]);
        NoFrameG6.setText(temporario[5]);
        NoFrameG7.setText(temporario[6]);
        NoFrameG8.setText(temporario[7]);
        NoFrameG9.setText(temporario[8]);
        NoFrameG10.setText(temporario[9]);
        NoFrameG11.setText(temporario[10]);
        NoFrameG12.setText(temporario[11]);
        NoFrameG13.setText(temporario[12]);
        NoFrameG14.setText(temporario[13]);
        NoFrameG15.setText(temporario[14]);
        NoFrameG16.setText(temporario[15]);
        NoFrameG17.setText(temporario[16]);
        NoFrameG18.setText(temporario[17]);
              
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
            Total2.setText("Total: " + contadorDePalavras);
            Respostas2.setText(reposta);
            if(Nivel.getSelectedItem().equals("Hard")){
                if(contadorDePalavras > 15 || contadorDePalavras < 10){
                Gerar();
                }
            }
            else if(Nivel.getSelectedItem().equals("Medium")){
                if(contadorDePalavras > 30 || contadorDePalavras < 15){
                Gerar();
                }
            }
            else if(Nivel.getSelectedItem().equals("Easy")){
                if(contadorDePalavras < 30){
                Gerar();
                }
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        NoFrameG1 = new javax.swing.JTextField();
        NoFrameG2 = new javax.swing.JTextField();
        NoFrameG3 = new javax.swing.JTextField();
        NoFrameG4 = new javax.swing.JTextField();
        NoFrameG7 = new javax.swing.JTextField();
        NoFrameG10 = new javax.swing.JTextField();
        NoFrameG13 = new javax.swing.JTextField();
        NoFrameG16 = new javax.swing.JTextField();
        NoFrameG5 = new javax.swing.JTextField();
        NoFrameG6 = new javax.swing.JTextField();
        NoFrameG8 = new javax.swing.JTextField();
        NoFrameG9 = new javax.swing.JTextField();
        NoFrameG11 = new javax.swing.JTextField();
        NoFrameG12 = new javax.swing.JTextField();
        NoFrameG14 = new javax.swing.JTextField();
        NoFrameG15 = new javax.swing.JTextField();
        NoFrameG18 = new javax.swing.JTextField();
        NoFrameG17 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Respostas2 = new javax.swing.JTextArea();
        Total2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Nivel = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        NoFrameG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoFrameG1ActionPerformed(evt);
            }
        });

        NoFrameG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoFrameG4ActionPerformed(evt);
            }
        });

        NoFrameG10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoFrameG10ActionPerformed(evt);
            }
        });

        NoFrameG11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoFrameG11ActionPerformed(evt);
            }
        });

        NoFrameG17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoFrameG17ActionPerformed(evt);
            }
        });

        Respostas2.setColumns(20);
        Respostas2.setRows(5);
        jScrollPane3.setViewportView(Respostas2);

        Total2.setText("Total: ");

        jButton5.setText("Generate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Alphabet Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Clean");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoFrameG13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoFrameG10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoFrameG7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoFrameG4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoFrameG1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(NoFrameG16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoFrameG17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NoFrameG18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Total2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrameG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrameG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrameG7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrameG10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrameG13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoFrameG16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoFrameG17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoFrameG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoFrameG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoFrameG1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(Caminho == null){
            JOptionPane.showMessageDialog(null, "Please, select the alphabet!");
        }
        else{
        Gerar();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AboutMenu().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void NoFrameG17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoFrameG17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoFrameG17ActionPerformed

    private void NoFrameG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoFrameG4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoFrameG4ActionPerformed

    private void NoFrameG10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoFrameG10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoFrameG10ActionPerformed

    private void NoFrameG11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoFrameG11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoFrameG11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser chooserArquivo = new JFileChooser();
        int escolha = chooserArquivo.showOpenDialog(getParent());
        Caminho = chooserArquivo.getSelectedFile().getAbsolutePath();  
        alfabeto.setCaminho(Caminho);
        alfabeto.Inicializar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Limpar();
    }//GEN-LAST:event_jButton7ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarTortos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Nivel;
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
    private javax.swing.JTextField NoFrame18;
    private javax.swing.JTextField NoFrame19;
    private javax.swing.JTextField NoFrame2;
    private javax.swing.JTextField NoFrame20;
    private javax.swing.JTextField NoFrame21;
    private javax.swing.JTextField NoFrame22;
    private javax.swing.JTextField NoFrame23;
    private javax.swing.JTextField NoFrame24;
    private javax.swing.JTextField NoFrame25;
    private javax.swing.JTextField NoFrame26;
    private javax.swing.JTextField NoFrame27;
    private javax.swing.JTextField NoFrame28;
    private javax.swing.JTextField NoFrame29;
    private javax.swing.JTextField NoFrame3;
    private javax.swing.JTextField NoFrame30;
    private javax.swing.JTextField NoFrame31;
    private javax.swing.JTextField NoFrame32;
    private javax.swing.JTextField NoFrame33;
    private javax.swing.JTextField NoFrame34;
    private javax.swing.JTextField NoFrame35;
    private javax.swing.JTextField NoFrame4;
    private javax.swing.JTextField NoFrame5;
    private javax.swing.JTextField NoFrame6;
    private javax.swing.JTextField NoFrame7;
    private javax.swing.JTextField NoFrame8;
    private javax.swing.JTextField NoFrame9;
    private javax.swing.JTextField NoFrameG1;
    private javax.swing.JTextField NoFrameG10;
    private javax.swing.JTextField NoFrameG11;
    private javax.swing.JTextField NoFrameG12;
    private javax.swing.JTextField NoFrameG13;
    private javax.swing.JTextField NoFrameG14;
    private javax.swing.JTextField NoFrameG15;
    private javax.swing.JTextField NoFrameG16;
    private javax.swing.JTextField NoFrameG17;
    private javax.swing.JTextField NoFrameG18;
    private javax.swing.JTextField NoFrameG2;
    private javax.swing.JTextField NoFrameG3;
    private javax.swing.JTextField NoFrameG4;
    private javax.swing.JTextField NoFrameG5;
    private javax.swing.JTextField NoFrameG6;
    private javax.swing.JTextField NoFrameG7;
    private javax.swing.JTextField NoFrameG8;
    private javax.swing.JTextField NoFrameG9;
    private javax.swing.JButton Resolver;
    private javax.swing.JButton Resolver1;
    private javax.swing.JTextArea Respostas;
    private javax.swing.JTextArea Respostas1;
    private javax.swing.JTextArea Respostas2;
    private javax.swing.JTextField Total;
    private javax.swing.JTextField Total1;
    private javax.swing.JTextField Total2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
