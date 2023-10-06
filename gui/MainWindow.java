/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ateliers.gui;
import Ateliers.domain.FruitBasketController;
import Ateliers.domain.FruitBasketController.FruitModes;
import java.awt.FlowLayout;
import java.awt.Point;

public class MainWindow extends javax.swing.JFrame
{
    public FruitBasketController controller;
    public FruitModes selectedFruitCreationMode;
    public MainWindow()
    {
        controller = new FruitBasketController();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFruitButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        buttonTopPanel = new javax.swing.JPanel(new FlowLayout(FlowLayout.LEFT));
        pommeButton = new javax.swing.JToggleButton();
        orangeButton = new javax.swing.JToggleButton();
        mainScrollPane = new javax.swing.JScrollPane();
        drawingPanel = new Ateliers.gui.DrawingPanel(this);
        topMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        createFruitButtonGroup.add(pommeButton);
        createFruitButtonGroup.add(orangeButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mes Ateliers");

        mainPanel.setLayout(new java.awt.BorderLayout());

        buttonTopPanel.setPreferredSize(new java.awt.Dimension(400, 35));

        pommeButton.setText("Pomme");
        pommeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pommeButtonActionPerformed(evt);
            }
        });
        buttonTopPanel.add(pommeButton);

        orangeButton.setText("Orange");
        orangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeButtonActionPerformed(evt);
            }
        });
        buttonTopPanel.add(orangeButton);

        mainPanel.add(buttonTopPanel, java.awt.BorderLayout.NORTH);

        drawingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        mainScrollPane.setViewportView(drawingPanel);

        mainPanel.add(mainScrollPane, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        topMenuBar.add(fileMenu);

        editMenu.setText("Edit");
        topMenuBar.add(editMenu);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pommeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pommeButtonActionPerformed
        this.setMode(FruitModes.APPLE);
    }//GEN-LAST:event_pommeButtonActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void orangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeButtonActionPerformed
        this.setMode(FruitModes.ORANGE);
    }//GEN-LAST:event_orangeButtonActionPerformed

    private void drawingPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMousePressed
        Point mousePoint = evt.getPoint();
        FruitBasketController.FruitModes actualMode = this.selectedFruitCreationMode;
        this.controller.addFruit(actualMode,mousePoint);
        drawingPanel.repaint();
    }//GEN-LAST:event_drawingPanelMousePressed

    public void setMode(FruitModes newMode) {
        this.selectedFruitCreationMode = newMode;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonTopPanel;
    private javax.swing.ButtonGroup createFruitButtonGroup;
    private Ateliers.gui.DrawingPanel drawingPanel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JToggleButton orangeButton;
    private javax.swing.JToggleButton pommeButton;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuBar topMenuBar;
    // End of variables declaration//GEN-END:variables
}

