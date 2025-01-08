package com.mycompany.jogodamemoria;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaIA extends javax.swing.JFrame {
    ArrayList<ImageIcon> imgsCartas = new ArrayList<>();
    ArrayList<JButton> cartasJogadorVirou = new ArrayList<>();
    Map<JButton, ImageIcon> memoria = new HashMap<>();
    Map<JButton, ImageIcon> cartas = new HashMap<>();
    
    int vezDoJogador = 0;
    int pontosJogador1;
    int pontosJogador2;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        nomeJogador1 = new javax.swing.JTextField();
        jogador1Pontos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nomeJogador2 = new javax.swing.JTextField();
        jogador2Pontos = new javax.swing.JLabel();
        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        carta5 = new javax.swing.JButton();
        carta6 = new javax.swing.JButton();
        carta7 = new javax.swing.JButton();
        carta8 = new javax.swing.JButton();
        carta9 = new javax.swing.JButton();
        carta10 = new javax.swing.JButton();
        carta11 = new javax.swing.JButton();
        carta12 = new javax.swing.JButton();
        carta13 = new javax.swing.JButton();
        carta14 = new javax.swing.JButton();
        carta15 = new javax.swing.JButton();
        carta16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Memória");

        jDesktopPane1.setBackground(java.awt.Color.darkGray);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        nomeJogador1.setBackground(new java.awt.Color(51, 51, 51));
        nomeJogador1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        nomeJogador1.setForeground(new java.awt.Color(255, 255, 255));
        nomeJogador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeJogador1.setText("Jogador 1");

        jogador1Pontos.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jogador1Pontos.setForeground(new java.awt.Color(255, 255, 255));
        jogador1Pontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador1Pontos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jogador1Pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeJogador1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogador1Pontos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        nomeJogador2.setBackground(new java.awt.Color(51, 51, 51));
        nomeJogador2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        nomeJogador2.setForeground(new java.awt.Color(255, 255, 255));
        nomeJogador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeJogador2.setText("Computador");
        nomeJogador2.setEnabled(false);

        jogador2Pontos.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jogador2Pontos.setForeground(new java.awt.Color(255, 255, 255));
        jogador2Pontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogador2Pontos.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeJogador2)
                    .addComponent(jogador2Pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jogador2Pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        carta1.setBackground(new java.awt.Color(102, 102, 102));
        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta1.setPreferredSize(new java.awt.Dimension(64, 64));
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });

        carta2.setBackground(new java.awt.Color(102, 102, 102));
        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta2.setPreferredSize(new java.awt.Dimension(64, 64));
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });

        carta3.setBackground(new java.awt.Color(102, 102, 102));
        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta3.setPreferredSize(new java.awt.Dimension(64, 64));
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });

        carta4.setBackground(new java.awt.Color(102, 102, 102));
        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta4.setPreferredSize(new java.awt.Dimension(64, 64));
        carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta4ActionPerformed(evt);
            }
        });

        carta5.setBackground(new java.awt.Color(102, 102, 102));
        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta5.setPreferredSize(new java.awt.Dimension(64, 64));
        carta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta5ActionPerformed(evt);
            }
        });

        carta6.setBackground(new java.awt.Color(102, 102, 102));
        carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta6.setPreferredSize(new java.awt.Dimension(64, 64));
        carta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta6ActionPerformed(evt);
            }
        });

        carta7.setBackground(new java.awt.Color(102, 102, 102));
        carta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta7.setPreferredSize(new java.awt.Dimension(64, 64));
        carta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta7ActionPerformed(evt);
            }
        });

        carta8.setBackground(new java.awt.Color(102, 102, 102));
        carta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta8.setPreferredSize(new java.awt.Dimension(64, 64));
        carta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta8ActionPerformed(evt);
            }
        });

        carta9.setBackground(new java.awt.Color(102, 102, 102));
        carta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta9.setPreferredSize(new java.awt.Dimension(64, 64));
        carta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta9ActionPerformed(evt);
            }
        });

        carta10.setBackground(new java.awt.Color(102, 102, 102));
        carta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta10.setPreferredSize(new java.awt.Dimension(64, 64));
        carta10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta10ActionPerformed(evt);
            }
        });

        carta11.setBackground(new java.awt.Color(102, 102, 102));
        carta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta11.setPreferredSize(new java.awt.Dimension(64, 64));
        carta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta11ActionPerformed(evt);
            }
        });

        carta12.setBackground(new java.awt.Color(102, 102, 102));
        carta12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta12.setPreferredSize(new java.awt.Dimension(64, 64));
        carta12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta12ActionPerformed(evt);
            }
        });

        carta13.setBackground(new java.awt.Color(102, 102, 102));
        carta13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta13.setPreferredSize(new java.awt.Dimension(64, 64));
        carta13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta13ActionPerformed(evt);
            }
        });

        carta14.setBackground(new java.awt.Color(102, 102, 102));
        carta14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta14.setPreferredSize(new java.awt.Dimension(64, 64));
        carta14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta14ActionPerformed(evt);
            }
        });

        carta15.setBackground(new java.awt.Color(102, 102, 102));
        carta15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta15.setPreferredSize(new java.awt.Dimension(64, 64));
        carta15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta15ActionPerformed(evt);
            }
        });

        carta16.setBackground(new java.awt.Color(102, 102, 102));
        carta16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caixao.png"))); // NOI18N
        carta16.setPreferredSize(new java.awt.Dimension(64, 64));
        carta16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta16ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jogo da Memória");

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(carta16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(carta13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carta16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carta13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public TelaIA() {
        initComponents();
        
        inicializarCartas();
        
        jogador1Pontos.setForeground(Color.GREEN);
        nomeJogador1.setForeground(Color.GREEN);
    }
    
    public void inicializarCartas() {
        for (int i = 1; i <= 8; i++) {
            imgsCartas.add(new ImageIcon(getClass().getResource("/imagens/00" + i + ".png")));
            imgsCartas.add(new ImageIcon(getClass().getResource("/imagens/00" + i + ".png")));
        }
        Collections.shuffle(imgsCartas);
        
        cartas.put(carta1, imgsCartas.get(0));
        cartas.put(carta2, imgsCartas.get(1));
        cartas.put(carta3, imgsCartas.get(2));
        cartas.put(carta4, imgsCartas.get(3));
        cartas.put(carta5, imgsCartas.get(4));
        cartas.put(carta6, imgsCartas.get(5));
        cartas.put(carta7, imgsCartas.get(6));
        cartas.put(carta8, imgsCartas.get(7));
        cartas.put(carta9, imgsCartas.get(8));
        cartas.put(carta10, imgsCartas.get(9));
        cartas.put(carta11, imgsCartas.get(10));
        cartas.put(carta12, imgsCartas.get(11));
        cartas.put(carta13, imgsCartas.get(12));
        cartas.put(carta14, imgsCartas.get(13));
        cartas.put(carta15, imgsCartas.get(14));
        cartas.put(carta16, imgsCartas.get(15));
    }
    
    public void desvirarCarta() {
        for (JButton carta : cartasJogadorVirou) {
            carta.setIcon(new ImageIcon(getClass().getResource("/imagens/caixao.png")));
            carta.setEnabled(true);
        }
    }
    
    public void virarCarta(JButton carta, int index) {
        if (!cartasJogadorVirou.contains(carta)) {
            carta.setIcon(imgsCartas.get(index));
        
            memoria.put(carta, imgsCartas.get(index));
            cartasJogadorVirou.add(carta);
        
            if (cartasJogadorVirou.size() == 2) {
                SwingUtilities.invokeLater(() -> {
                    verificaCartasIguais();
                });
            }
        }
    }
    
    public void virarCartaIA(JButton carta, ImageIcon img) {
        carta.setIcon(img);
        
        memoria.put(carta, img);
        cartasJogadorVirou.add(carta);
        
        if (cartasJogadorVirou.size() == 2) {
            SwingUtilities.invokeLater(() -> {
                verificaCartasIguais();
            });
        }
    }
    
    public void verificaCartasIguais() {
        String imagemCarta1 = cartasJogadorVirou.get(0).getIcon().toString();
        String imagemCarta2 = cartasJogadorVirou.get(1).getIcon().toString();
        
        if (imagemCarta1.equals(imagemCarta2)) {
            memoria.remove(cartasJogadorVirou.get(0));
            memoria.remove(cartasJogadorVirou.get(1));
            cartas.remove(cartasJogadorVirou.get(0));
            cartas.remove(cartasJogadorVirou.get(1));
            cartasJogadorVirou.clear();
            
            if (vezDoJogador == 0) {
                pontosJogador1++;
                jogador1Pontos.setText(String.valueOf(pontosJogador1));
                verificarVencedor();
            } else {
                pontosJogador2++;
                jogador2Pontos.setText(String.valueOf(pontosJogador2));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }     
                verificarVencedor();       
                fazerJogadaIA();
            } 
        } else {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            desvirarCarta();
            cartasJogadorVirou.clear();
            alternarJogador();
        }
    }
    
    public void alternarJogador() {
        if (vezDoJogador == 0) {
            vezDoJogador = 1;
            jogador1Pontos.setForeground(Color.WHITE);
            nomeJogador1.setForeground(Color.WHITE);
            jogador2Pontos.setForeground(Color.GREEN);
            nomeJogador2.setForeground(Color.GREEN);
            fazerJogadaIA();
        } else {
            vezDoJogador = 0;
            jogador1Pontos.setForeground(Color.GREEN);
            nomeJogador1.setForeground(Color.GREEN);
            jogador2Pontos.setForeground(Color.WHITE);
            nomeJogador2.setForeground(Color.WHITE);
        }
    }

    public void verificarVencedor() {
        int totalPontos = pontosJogador1 + pontosJogador2;
        if (totalPontos == 8) {
            if (pontosJogador1 > pontosJogador2) {
                JOptionPane.showMessageDialog(this, nomeJogador1.getText() + " venceu!");
            } else if (pontosJogador1 < pontosJogador2) {
                JOptionPane.showMessageDialog(this, nomeJogador2.getText() + " venceu!");
            } else {
                JOptionPane.showMessageDialog(this, "Empate!");
            }
            dispose();
            new TelaPrincipal().setVisible(true);
        }
    }
    
    public void fazerJogadaIA() {
        Map.Entry<JButton, ImageIcon>[] entradas = memoria.entrySet().toArray(new Map.Entry[0]);
        
        for (int i = 0; i < memoria.size(); i++) {
            for (int j = 0; j < memoria.size(); j++) {
                if (i != j && entradas[i].getValue().toString().equals(entradas[j].getValue().toString())) {
                    virarCartaIA(entradas[i].getKey(), entradas[i].getValue());
                    virarCartaIA(entradas[j].getKey(), entradas[j].getValue());
                    return;
                }
            }
        }
        
        escolherCartasAleatorias();
    }
    
    public void escolherCartasAleatorias() {
        Random random = new Random();
        
        int index1;
        int index2;
        
        Map.Entry<JButton, ImageIcon>[] entradas = cartas.entrySet().toArray(new Map.Entry[0]);

        do {            
            index1 = random.nextInt(cartas.size());
            index2 = random.nextInt(cartas.size());
        } while (index1 == index2);
        
        JButton c1 = entradas[index1].getKey();
        JButton c2 = entradas[index2].getKey();
        
        virarCartaIA(c1, entradas[index1].getValue());
        virarCartaIA(c2, entradas[index2].getValue());
    }
    
    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        virarCarta(carta1, 0);
    }//GEN-LAST:event_carta1ActionPerformed

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed
        virarCarta(carta2, 1);
    }//GEN-LAST:event_carta2ActionPerformed

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed
        virarCarta(carta3, 2);
    }//GEN-LAST:event_carta3ActionPerformed

    private void carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta4ActionPerformed
        virarCarta(carta4, 3);
    }//GEN-LAST:event_carta4ActionPerformed

    private void carta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta8ActionPerformed
        virarCarta(carta8, 7);
    }//GEN-LAST:event_carta8ActionPerformed

    private void carta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta5ActionPerformed
        virarCarta(carta5, 4);
    }//GEN-LAST:event_carta5ActionPerformed

    private void carta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta6ActionPerformed
        virarCarta(carta6, 5);
    }//GEN-LAST:event_carta6ActionPerformed

    private void carta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta7ActionPerformed
        virarCarta(carta7, 6);
    }//GEN-LAST:event_carta7ActionPerformed

    private void carta12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta12ActionPerformed
        virarCarta(carta12, 11);
    }//GEN-LAST:event_carta12ActionPerformed

    private void carta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta9ActionPerformed
        virarCarta(carta9, 8);
    }//GEN-LAST:event_carta9ActionPerformed

    private void carta10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta10ActionPerformed
        virarCarta(carta10, 9);
    }//GEN-LAST:event_carta10ActionPerformed

    private void carta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta11ActionPerformed
        virarCarta(carta11, 10);
    }//GEN-LAST:event_carta11ActionPerformed

    private void carta16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta16ActionPerformed
        virarCarta(carta16, 15);
    }//GEN-LAST:event_carta16ActionPerformed

    private void carta13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta13ActionPerformed
        virarCarta(carta13, 12);
    }//GEN-LAST:event_carta13ActionPerformed

    private void carta14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta14ActionPerformed
        virarCarta(carta14, 13);
    }//GEN-LAST:event_carta14ActionPerformed

    private void carta15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta15ActionPerformed
        virarCarta(carta15, 14);
    }//GEN-LAST:event_carta15ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta10;
    private javax.swing.JButton carta11;
    private javax.swing.JButton carta12;
    private javax.swing.JButton carta13;
    private javax.swing.JButton carta14;
    private javax.swing.JButton carta15;
    private javax.swing.JButton carta16;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JButton carta5;
    private javax.swing.JButton carta6;
    private javax.swing.JButton carta7;
    private javax.swing.JButton carta8;
    private javax.swing.JButton carta9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jogador1Pontos;
    private javax.swing.JLabel jogador2Pontos;
    private javax.swing.JTextField nomeJogador1;
    private javax.swing.JTextField nomeJogador2;
    // End of variables declaration//GEN-END:variables
}
