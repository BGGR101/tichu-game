import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private JPanel panel;
    private JPanel hostGamePanel;
    private JPanel joinGamePanel;
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

public void multiplayerInit(){
        window.remove(panel); //removes Title screen panel

        hostGamePanel = new JPanel(new GridBagLayout());
        hostGamePanel.setBackground(new Color(60, 63, 65));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        window.add(hostGamePanel);

        window.revalidate();
        window.repaint();

        //hostGame table = new hostGame;
    }
    public void joinGameInit(){
        window.remove(panel); //removes Title screen panel

        joinGamePanel = new JPanel(new GridBagLayout());
        joinGamePanel.setBackground(new Color(60, 63, 65));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;

        window.add(joinGamePanel);

        window.revalidate();
        window.repaint();

        //hostGame table = new hostGame;
    }
}
