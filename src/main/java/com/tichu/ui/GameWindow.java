package com.tichu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow {
    private com.tichu.ui.Window window;
    private JFrame frame;
    private boolean gameStart = false;
    private String name;
    private JPanel cardPanel;
    private JPanel northPlayerPanel;
    private JPanel southPlayerPanel;
    private JPanel eastPlayerPanel;
    private JPanel westPlayerPanel;
    private JLabel team1ScoreLabel;
    private JLabel team2ScoreLabel;
    private int team1Score = 0;
    private int team2Score = 0;

    public GameWindow(Window window, String name) {
        this.window = window;
        this.frame = window.getWindowFrame();
        this.name = name;
        setupGameUI();
    }

    private void setupGameUI() {
        frame.getContentPane().removeAll();
        frame.setLayout(new BorderLayout());

        // Initialize player panels
        northPlayerPanel = createPlayerPanel("");
        eastPlayerPanel = createPlayerPanel("");
        westPlayerPanel = createPlayerPanel("");
        southPlayerPanel = createPlayerPanel(name);

        // Back button and score panel
        JButton backButton = setupBackButton();
        JPanel scorePanel = createScorePanel();

        // Control panel for back button and scores
        JPanel controlPanel = new JPanel(new BorderLayout());
        controlPanel.add(backButton, BorderLayout.WEST);
        controlPanel.add(scorePanel, BorderLayout.EAST);
        controlPanel.setBackground(new Color(60, 63, 65));

        // North container to hold northPlayerPanel and controlPanel
        JPanel northContainer = new JPanel(new BorderLayout());
        northContainer.add(northPlayerPanel, BorderLayout.CENTER);
        northContainer.add(controlPanel, BorderLayout.SOUTH);

        // Bottom panel for southPlayerPanel and Tichu buttons
        JPanel bottomPanel = new JPanel(new BorderLayout());
        JButton tichuButton = setupTichuButton();
        JButton grandTichuButton = setupGrandTichuButton();

        JPanel specialButtonsPanel = new JPanel();
        specialButtonsPanel.setLayout(new BoxLayout(specialButtonsPanel, BoxLayout.Y_AXIS));
        specialButtonsPanel.setBackground(new Color(60, 63, 65));
        specialButtonsPanel.add(tichuButton);
        specialButtonsPanel.add(grandTichuButton);

        bottomPanel.add(specialButtonsPanel, BorderLayout.WEST);
        bottomPanel.add(southPlayerPanel, BorderLayout.CENTER);

        // Card panel setup
        cardPanel = new JPanel();
        cardPanel.setBackground(new Color(80, 80, 80));

        // Add panels to the frame
        frame.add(northContainer, BorderLayout.NORTH);
        frame.add(eastPlayerPanel, BorderLayout.EAST);
        frame.add(westPlayerPanel, BorderLayout.WEST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(cardPanel, BorderLayout.CENTER);

        frame.revalidate();
        frame.repaint();
    }

    private JPanel createPlayerPanel(String playerLabel) {
        JPanel playerPanel = new JPanel();
        playerPanel.setBackground(new Color(60, 63, 65));
        playerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        return playerPanel;
    }

    private JPanel createScorePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(60, 63, 65));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        team1ScoreLabel = new JLabel("Team 1: " + team1Score);
        team2ScoreLabel = new JLabel("Team 2: " + team2Score);
        team1ScoreLabel.setForeground(Color.WHITE);
        team2ScoreLabel.setForeground(Color.WHITE);
        team1ScoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        team2ScoreLabel.setFont(new Font("Arial", Font.BOLD, 16));

        panel.add(team1ScoreLabel);
        panel.add(Box.createVerticalStrut(5));
        panel.add(team2ScoreLabel);

        return panel;
    }

    private JButton setupBackButton() {
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(180, 50));
        backButton.setFont(new Font("Arial", Font.BOLD, 24));
        backButton.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.add(window.getMainPanel(), BorderLayout.CENTER);
            window.titleScreen();
            frame.revalidate();
            frame.repaint();
        });
        return backButton;
    }

    private JButton setupTichuButton() {
        JButton tichuButton = new JButton("Tichu");
        Dimension size = new Dimension(200, 50);
        tichuButton.setPreferredSize(size);
        tichuButton.setMaximumSize(size);
        tichuButton.setFont(new Font("Arial", Font.BOLD, 24));
        tichuButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tichuButton.setEnabled(false);
                // Implement Tichu call
            }
        });
        return tichuButton;
    }

    private JButton setupGrandTichuButton() {
        JButton grandTichuButton = new JButton("Grand Tichu");
        Dimension size = new Dimension(200, 50);
        grandTichuButton.setPreferredSize(size);
        grandTichuButton.setMaximumSize(size);
        grandTichuButton.setFont(new Font("Arial", Font.BOLD, 24));
        grandTichuButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                grandTichuButton.setEnabled(false);
                // Implement Grand Tichu call
            }
        });
        return grandTichuButton;
    }
}