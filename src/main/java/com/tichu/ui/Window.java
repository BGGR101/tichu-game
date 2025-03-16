package com.tichu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private JPanel panel;
    private JPanel hostGamePanel;
    private JPanel joinGamePanel;
    private JFrame mainWindowFrame;

    public Window() {
        windowInit();
    }


    public void windowInit(){
        mainWindowFrame = new JFrame("Tichu");
        mainWindowFrame.setIconImage(new ImageIcon ("Textures/logo.png").getImage());
        mainWindowFrame.setSize(1600, 900);
        mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindowFrame.setLocationRelativeTo(null);
        mainWindowFrame.setResizable(false);

        panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(60, 63, 65));
        mainWindowFrame.add(panel, BorderLayout.CENTER);

        mainWindowFrame.setVisible(true);
        titleScreen();
    }

    public void titleScreen(){
        panel.removeAll();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;


        JButton hostGameButton = new JButton("Host A Game");
        hostGameButton.setPreferredSize(new Dimension(300, 80));
        hostGameButton.setFont(new Font("Arial", Font.BOLD, 24));
        hostGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplayerInit();
            }
        });

        panel.add(hostGameButton,gbc);
        gbc.gridy++;

        JButton joinGameButton = new JButton("Join A Game");
        joinGameButton.setPreferredSize(new Dimension(300, 80));
        joinGameButton.setFont(new Font("Arial", Font.BOLD, 24));
        joinGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                joinGameInit();
            }
        });

        panel.add(joinGameButton,gbc);
        gbc.gridy++;

        JButton exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(300, 80));
        exitButton.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(exitButton,gbc);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.revalidate();
        panel.repaint();
    }

private void multiplayerInit(){
        mainWindowFrame.remove(panel); //removes Title screen panel

        //Host panel initialization
        hostGamePanel = new JPanel(new GridBagLayout());
        hostGamePanel.setBackground(new Color(60, 63, 65));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;

        //Back button initialization
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(180, 50));
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            mainWindowFrame.remove(hostGamePanel);
            mainWindowFrame.add(panel);
            titleScreen();
        });

        hostGamePanel.add(backButton, gbc);

        gbc.anchor = GridBagConstraints.CENTER; // Center alignment for other components
        gbc.fill = GridBagConstraints.NONE; // Prevent components from stretching
        gbc.weightx = 1.0; // Allow horizontal expansion
        gbc.weighty = 0; // Reset weighty (will adjust for last component)

        gbc.gridy++;

        //Host player initialization
        JLabel hostNameLabel = new JLabel("Enter host name:");
        hostNameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        hostNameLabel.setForeground(Color.WHITE);
        hostGamePanel.add(hostNameLabel, gbc);
        gbc.gridy++;

        final JTextField hostName = new JTextField();
        hostName.setPreferredSize(new Dimension(180, 50));
        hostName.setFont(new Font("Arial", Font.BOLD, 24));
        hostGamePanel.add(hostName, gbc);
        mainWindowFrame.add(hostGamePanel);

        gbc.gridy++;
        gbc.weighty = 1.0;
        //Host button initialization
        JButton hostButton = new JButton("Host Game");
        hostButton.setPreferredSize(new Dimension(180, 50));
        hostButton.setFont(new Font("Arial", Font.BOLD, 24));
        hostGamePanel.add(hostButton, gbc);

        mainWindowFrame.revalidate();
        mainWindowFrame.repaint();

        hostButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = hostName.getText();
                hostGame(name);
            }
        });
    }
    private void joinGameInit() {
        mainWindowFrame.remove(panel); // Removes Title screen panel

        // Join panel initialization
        joinGamePanel = new JPanel(new GridBagLayout());
        joinGamePanel.setBackground(new Color(60, 63, 65));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START; // For Back button

        // Back button initialization
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(180, 50));
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            mainWindowFrame.remove(joinGamePanel);
            mainWindowFrame.add(panel);
            titleScreen();
        });
        joinGamePanel.add(backButton, gbc);

        // Reset constraints for centered components
        gbc.anchor = GridBagConstraints.CENTER; // Center alignment for other components
        gbc.fill = GridBagConstraints.NONE; // Prevent components from stretching
        gbc.weightx = 1.0; // Allow horizontal expansion
        gbc.weighty = 0; // Reset weighty (will adjust for last component)

        gbc.gridy++;

        // Join player initialization
        JLabel joinNameLabel = new JLabel("Enter your name:");
        joinNameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        joinNameLabel.setForeground(Color.WHITE);
        joinGamePanel.add(joinNameLabel, gbc);

        gbc.gridy++;
        final JTextField joinName = new JTextField();
        joinName.setPreferredSize(new Dimension(180, 50));
        joinName.setFont(new Font("Arial", Font.BOLD, 24));
        joinGamePanel.add(joinName, gbc);

        gbc.gridy++;
        JLabel joinIPLabel = new JLabel("Enter host IP:");
        joinIPLabel.setFont(new Font("Arial", Font.BOLD, 24));
        joinIPLabel.setForeground(Color.WHITE);
        joinGamePanel.add(joinIPLabel, gbc);

        gbc.gridy++;
        final JTextField joinIP = new JTextField();
        joinIP.setPreferredSize(new Dimension(180, 50));
        joinIP.setFont(new Font("Arial", Font.BOLD, 24));
        joinGamePanel.add(joinIP, gbc);

        gbc.gridy++;
        JButton joinButton = new JButton("Join Game");
        joinButton.setPreferredSize(new Dimension(180, 50));
        joinButton.setFont(new Font("Arial", Font.BOLD, 24));
        joinButton.addActionListener(e -> {
            String name = joinName.getText();
            String ip = joinIP.getText();
            tableJoin(name, ip);
        });

        // Allow the last component to take remaining vertical space
        gbc.weighty = 1.0;
        joinGamePanel.add(joinButton, gbc);

        mainWindowFrame.add(joinGamePanel);
        mainWindowFrame.revalidate();
        mainWindowFrame.repaint();
    }

    private void hostGame(String name){
        new GameWindow(this, name);
    }

    private void tableJoin(String name, String ip){
        //TODO: Implement tableJoin
    }

    public JFrame getWindowFrame() {
        return mainWindowFrame;
    }

    public JPanel getMainPanel() {
        return panel;
    }
}