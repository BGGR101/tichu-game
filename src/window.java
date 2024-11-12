import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class window {
    private JPanel panel;
    private JPanel singleplayerPanel;
    private JFrame window;



    public void windowInit(){
        window = new JFrame("Tichu");
        window.setSize(1600, 900);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(60, 63, 65));
        window.add(panel, BorderLayout.CENTER);

        window.setVisible(true);
    }

    public void titleScreen(){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;


        JButton singleplayerButton = new JButton("Single-player");
        singleplayerButton.setPreferredSize(new Dimension(300, 80));
        singleplayerButton.setFont(new Font("Arial", Font.BOLD, 24));
        singleplayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                singleplayerInit();
            }
        });

        panel.add(singleplayerButton,gbc);
        gbc.gridy++;

        JButton multiplayerButton = new JButton("Multi-player");
        multiplayerButton.setPreferredSize(new Dimension(300, 80));
        multiplayerButton.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(multiplayerButton,gbc);
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

public void singleplayerInit(){
        window.remove(panel); //removes Title screen panel

        singleplayerPanel = new JPanel(new GridBagLayout());
        singleplayerPanel.setBackground(new Color(60, 63, 65));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        window.add(singleplayerPanel);

        window.revalidate();
        window.repaint();

        singleplayerGame game = new singleplayerGame();
        game.singleplayerStart();
    }

}
